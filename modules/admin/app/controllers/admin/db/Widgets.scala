package controllers.admin.db

import javax.inject._

import akka.actor.ActorSystem
import akka.stream.Materializer
import play.api.libs.json.{JsObject, JsValue, Json}
//import models.db.AdminForm.{ctyFormData, rgnFormData}
import models.db._
import play.api.libs.json.OFormat
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.bson.BSONObjectID
import services.dbClient.{_}
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.json.Reads._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class Widgets @Inject()(parser: BodyParsers.Default)(cc: ControllerComponents, actorSystem: ActorSystem)
                       (val reactiveMongoApi: ReactiveMongoApi)(implicit mat: Materializer)
  extends AbstractController(cc) with MongoController with ReactiveMongoComponents with play.api.i18n.I18nSupport {


    override lazy val parse: PlayBodyParsers = cc.parsers


    def widgetRepo = new WidgetRepoImpl(cc)(reactiveMongoApi)

    def index(collName: String) = Action.async { implicit request: Request[AnyContent] =>
        widgetRepo.find(collName).map(widgets => Ok(Json.toJson(widgets)))
    }

    def create(collName: String) = Action.async(parse.json) { implicit request: Request[JsValue] =>

        val doc = request.body.as[JsObject]
        //val doc = Json.toJsObject(request.body)
        //widgetRepo.save(collName)(request.body).map(result => Created)
        widgetRepo.save(collName)(doc).map(result => Created)

    }

    def read(collName: String, oId: Option[BSONObjectID]) = Action.async { implicit request: Request[AnyContent] =>
        widgetRepo.select(collName)(Json.obj("_id" -> oId)).map(widget => Ok(Json.toJson(widget)))
    }

    def update(collName: String, oId: Option[BSONObjectID], dataJso: JsObject) = Action.async { implicit request: Request[AnyContent] => //Action.async(parse.tolerantJson) { implicit request =>

        //val document = Json.toJson(request.body)//.asInstanceOf[JsObject]
        //Future(Ok(data.toString()))
        widgetRepo.update(collName)(Json.obj("_id" -> oId), dataJso).map(result => Accepted)

    }

    def delete(collName: String, oId: Option[BSONObjectID]) = Action.async {

        widgetRepo.remove(collName)(Json.obj("_id" -> oId))
        .map(result => Accepted)
    }

    def updateFromRequest(collName: String, oId: Option[BSONObjectID]) = Action.async(parse.json) { implicit request: Request[JsValue] => //Action.async(parse.tolerantJson) { implicit request =>

        val doc = request.body.as[JsObject]
        //widgetRepo.update(collName)(Json.obj("_id" -> oId), request.body).map(result => {
        widgetRepo.update(collName)(Json.obj("_id" -> oId), doc).map(result => Accepted)

    }

}
