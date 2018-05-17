package services.dbClient

import javax.inject.{Inject, Singleton}

import akka.stream.Materializer
import play.api.libs.json._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.api.{Cursor, ReadPreference}
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait WidgetRepo {
  def find(collName: String): Future[List[JsObject]]

  def select(collName: String)(selector: JsObject): Future[Option[JsObject]]

  def update(collName: String)(selector: JsObject, update: JsObject): Future[WriteResult]

  def remove(collName: String)(document: JsObject): Future[WriteResult]

  def save(collName: String)(document: JsObject): Future[WriteResult]
}

class WidgetRepoImpl @Inject()(cc: ControllerComponents)(val reactiveMongoApi: ReactiveMongoApi)(implicit mat: Materializer) extends AbstractController(cc)
  with MongoController with ReactiveMongoComponents with play.api.i18n.I18nSupport with WidgetRepo {

  override lazy val parse: PlayBodyParsers = cc.parsers

  protected def getCollection(collName: String): Future[JSONCollection] = database.map(_.collection[JSONCollection](collName))

  override def find(collName: String): Future[List[JsObject]] = {

    getCollection(collName).flatMap(
      _.find(Json.obj()) // find all
        .cursor[JsObject](ReadPreference.primary) // perform the query and get a cursor of JsObject
        .collect[List](Int.MaxValue, Cursor.FailOnError[List[JsObject]]()) // Collect the results as a list
    )

  }

  override def select(collName: String)(selector: JsObject): Future[Option[JsObject]] = {

    getCollection(collName).flatMap {
      _.find(selector)
        .cursor[JsObject](ReadPreference.primary)
        .headOption
    }

  }

  override def update(collName: String)(selector: JsObject, update: JsObject): Future[WriteResult] = {

    getCollection(collName).flatMap(coll =>
      coll.update(selector, Json.obj("$set" -> update))
    )

  }

  override def remove(collName: String)(document: JsObject): Future[WriteResult] = {

    getCollection(collName).flatMap(coll =>
      coll.remove(document)
    )

  }

  override def save(collName: String)(document: JsObject): Future[WriteResult] = {

    val _id: JsValue = if(document.keys.contains("_id")) {
      document.apply("_id")
    } else {
      Json.obj("$oid" -> BSONObjectID.generate.stringify)
    }

    getCollection(collName).flatMap(_.update(Json.obj("_id" -> _id), document, upsert = true))
  }

}