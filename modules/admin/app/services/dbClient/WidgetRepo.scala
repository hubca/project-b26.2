package services.dbClient

import javax.inject.{Inject, Singleton}

import akka.stream.Materializer
import models.db._
import play.api.libs.json._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.api.{Cursor, ReadPreference}
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json.JSONSerializationPack.Writer
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

  //def collection = reactiveMongoApi.db.collection[JSONCollection]("widgets");
  def collection(collName: String): Future[JSONCollection] = database.map(_.collection[JSONCollection](collName))
  //protected def getCollection(collectionName: String): Future[JSONCollection] = database.map(_.collection[JSONCollection](collectionName))

  override def find(collName: String): Future[List[JsObject]] = {
    //val genericQueryBuilder = collection.find(Json.obj());
    //val cursor = genericQueryBuilder.cursor[JsObject](ReadPreference.Primary);
    //cursor.collect[List]()

    collection(collName).flatMap(
      // find all
      _.find(Json.obj())
        // perform the query and get a cursor of JsObject
        .cursor[JsObject](ReadPreference.primary)
        // Collect the results as a list
        .collect[List](Int.MaxValue, Cursor.FailOnError[List[JsObject]]())
    )
  }

  override def select(collName: String)(selector: JsObject): Future[Option[JsObject]] = {
    //collection.find(selector).one[JsObject]

    collection(collName).flatMap {
      _.find(selector)
        .cursor[JsObject](ReadPreference.primary)
        .headOption
    }

  }

  override def update(collName: String)(selector: JsObject, update: JsObject): Future[WriteResult] = {
    //collection.update(selector, update)

    collection(collName).flatMap(coll =>
      coll.update(selector, Json.obj("$set" -> update))
    )

  }

  override def remove(collName: String)(document: JsObject): Future[WriteResult] = {
    //collection.remove(document)

    collection(collName).flatMap(coll =>
      coll.remove(document)
    )

  }

  //override def save(collName: String)(document: JsObject): Future[WriteResult] = {
  override def save(collName: String)(document: JsObject): Future[WriteResult] = {

    val _id: JsValue = if(document.keys.contains("_id")) {
      document.apply("_id")
    } else {
      Json.obj("$oid" -> BSONObjectID.generate.stringify)
    }

    collection(collName).flatMap(_.update(Json.obj("_id" -> _id), document, upsert = true))
    //collection.update(Json.obj("_id" -> document.get("_id").getOrElse(BSONObjectID.generate)), document, upsert = true)
  }

}