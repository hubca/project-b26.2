package controllers.admin

import javax.inject._
import akka.actor.ActorSystem
import akka.stream.Materializer
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import play.api.libs.json.{Format, Json, _}
import play.api.libs.json.Reads._
import play.api.libs.ws.WSResponse
import play.api.libs.functional.syntax._
import play.api.Configuration
import reactivemongo.bson.BSONObjectID
import reactivemongo.play.json._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import db.Widgets
import models.db._
import services.CallClient


class ApiC @Inject()(parser: BodyParsers.Default)(cc: ControllerComponents, actorSystem: ActorSystem)
                    (configuration: Configuration)(val reactiveMongoApi: ReactiveMongoApi)
                    (widgets: Widgets, callClient: CallClient)
                    (implicit mat: Materializer) extends AbstractController(cc) with ReadAndWriteTrait with MongoController with ReactiveMongoComponents with play.api.i18n.I18nSupport {

  override lazy val parse: PlayBodyParsers = cc.parsers


  def getJsResultSeq(collName: String)(jsValue: JsValue) = {

    collName match {
      case "cty" => Json.fromJson[List[CtyM]](jsValue)
      case _ => Json.fromJson[List[CtyM]](jsValue)
      // todo - add exhaustions
    }

  }

  def getJsResultOne(collName: String)(jsValue: JsValue) = {

    collName match {
      case "cty" => Json.fromJson[CtyM](jsValue)
      case _ => Json.fromJson[CtyM](jsValue)
      // todo - add exhaustions
    }

  }

  def getJsResult(collName: String, oId: Option[BSONObjectID])(wsResponse: WSResponse) = {

    val jsVal = wsResponse.json

    oId match {
      case Some(_) => getJsResultOne(collName)(jsVal)
      case None => getJsResultSeq(collName)(jsVal)
    }

  }

  def getJsResultAsJsValList(collName: String, oId: Option[BSONObjectID])(wsResponse: WSResponse) = {

    val jsVal = wsResponse.json

    oId match {
      case Some(_) => Json.fromJson[List[JsValue]](jsVal)
      case None => Json.fromJson[List[JsValue]](jsVal)
    }

  }

  def getJsResultAsCollectionL(collName: String)(dataAsJsVal: JsValue) = {

    collName match {
      case "cty" => Json.fromJson[List[CtyM]](dataAsJsVal)
      case _ => Json.fromJson[List[CtyM]](dataAsJsVal)
      // todo - add exhaustions
    }

  }


  def tryTransformerAsJsObj(obj: JsValue, transformer: Reads[JsObject]) = {

    obj.transform(transformer) match {
      case JsSuccess(r: JsObject, _) => r
      case e: JsError => JsError.toJson(e)
    }

  }

  def getDataFromResponse(wsResponse: WSResponse): JsValue = {

    val db2ModelTransformer =
      ((__).json.copyFrom( (__ \ 'varData_e).json.pick ) and
        (__ \ 'admin_e).json.copyFrom( (__).json.pick ) reduce ) andThen
        (__ \ 'admin_e \ 'varData_e).json.prune

    val jsRes = Json.fromJson[List[JsObject]](wsResponse.json) // todo change to enable single

    jsRes match {
      case JsSuccess(jsoL: List[JsObject], path: JsPath) => Json.toJson( jsoL.map(jso => tryTransformerAsJsObj(jso, db2ModelTransformer)) )
      case e: JsError => JsError.toJson(e)
    }

  }

  def updateJsResultAsCollectionL(collName: String)(dataAsJsVal: JsValue) = {

    collName match {
      case "cty" => Json.fromJson[List[CtyM]](dataAsJsVal)
      case _ => Json.fromJson[List[CtyM]](dataAsJsVal)
      // todo - add exhaustions
    }

  }

  def buildUrl(queryType: String, collName: String, oId: Option[BSONObjectID])(admin: Boolean = false): String = {

    // todo move to non-admin part of the site ??
    val baseUrl = configuration.get[String]("application.baseUrl")
    val apiVersion = "1.1"

    val adminStr = if(admin) {
      "/admin"
    } else {
      "/"
    }

    val query = oId match {
      case Some(_) => s"?oId=${oId.get.stringify}"
      case None => ""
    }

    List(adminStr, "api", apiVersion, queryType, collName)
      .filterNot(x => x.isEmpty)
      .mkString(baseUrl, "/", query)

  }

  def getJsResultF(collName: String, queryType: String, oId: Option[BSONObjectID], admin: Boolean): Future[JsResult[Seq[SuperVarT]]] = {

    val urlQuery = buildUrl("r", collName, oId)(admin = true)
    callClient.makeCallGet(urlQuery).map { response =>
      getJsResultAsCollectionL(collName)(getDataFromResponse(response))
    }

  }

  def cc2MongoCreateTrans: Reads[JsObject] = (__ \ 'varData_e).json.copyFrom( (__).json.pick )

  def cc2MongoUpdateTrans: Reads[JsObject] =
    (__ \ 'varData_e).json.copyFrom( (__).json.pick ) andThen
      (__ \ 'varData_e).read[JsObject].flatMap(
        _.fields.foldLeft((__ \ 'varData_e).json.prune) {
          case (acc, (k, v)) => acc andThen __.json.update(
            Reads.of[JsObject].map(_ + (s"varData_e.$k" -> v))
          )
        }
      )

  def getCreatedFieldValues[T <: SuperVarT](newFormM: T): Option[JsObject] = {
    val newFormJSO = Json.toJsObject(newFormM)
    Some(AdminM.getAdminAsJSO("c").++(tryTransformerAsJsObj(newFormJSO("data"), cc2MongoCreateTrans)))
  }

  def filterSameValues(newJSO: JsObject, prevJSO: JsObject): Map[String, JsValue] = {
    newJSO.fields
      .filterNot(x => x._2.equals(prevJSO.apply(x._1)))
      .toMap
  }

  def getUpdatedFieldValues[T <: SuperVarT](newFormM: T, oPrevDataStr: Option[String]): Option[JsObject] = {

    // prepare form data (varData_e)
    val newFormJSO = Json.toJsObject(newFormM)
    val newVarDataJSO = tryTransformerAsJsObj(newFormJSO("data"), cc2MongoUpdateTrans) // can get js error here

    // prepare previous form data including admin_e
    val prevFormDataJSO =
      Json.parse(oPrevDataStr.getOrElse(""))
      .asInstanceOf[JsObject]

    val cc2MongoVarDataTrans = (__ \ 'admin_e).json.prune andThen cc2MongoUpdateTrans // todo - add (__ \ 'admin_e).json.prune to cc2MongoUpdateTrans
    val prevVarDataJSO = tryTransformerAsJsObj(prevFormDataJSO, cc2MongoVarDataTrans) // can get js error here

    val filteredVarDataMap = filterSameValues(newVarDataJSO, prevVarDataJSO)

    if(filteredVarDataMap.isEmpty) {
      None
    } else {
      val getAdminTrans = (__).json.copyFrom( (__ \ 'admin_e).json.pick )
      val prevAdminDataJSO = tryTransformerAsJsObj(prevFormDataJSO, getAdminTrans) // can get js error here
      val filteredAdminMap = filterSameValues(AdminM.getAdminAsJSO("u"), prevAdminDataJSO)

      Some(
        JsObject(filteredAdminMap).++(JsObject(filteredVarDataMap))
      )
    }

  }

  def buildAndCall(queryType: String, collName: String, oId: Option[BSONObjectID], oNewFieldsJSO: Option[JsObject])
            (redirectRes: Result) = Action.async { implicit request: Request[AnyContent] =>

    val urlQuery = buildUrl(queryType, collName, oId)(admin = true)
    callClient.makeCall(queryType, urlQuery, oNewFieldsJSO).map(x =>
      redirectRes
    )

  }

  def callAndRedirect(queryType: String, collName: String, oId: Option[BSONObjectID], oNewFieldsJSO: Option[JsObject])
                      (redirectRes: Result) = Action.async { implicit request: Request[AnyContent] =>

    oNewFieldsJSO match {
      case Some(_) => buildAndCall(queryType, collName, oId, oNewFieldsJSO)(redirectRes)(request)
      case None => queryType match {
        case q if(q == "u" || q == "c") => Future(redirectRes)
        case _ => buildAndCall(queryType, collName, oId, oNewFieldsJSO)(redirectRes)(request)
      }
    }

  }

}