package controllers.admin.db

import javax.inject._
import akka.actor.ActorSystem
import akka.stream.Materializer
import play.api.Configuration
import play.api.libs.json._
import play.api.data.Form
import play.api.libs.json.OFormat
import play.api.mvc._
import reactivemongo.bson.BSONObjectID
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

import controllers.admin.ApiC
import data.Pagelet
import models.db._

@Singleton
class IndexC @Inject()(parser: BodyParsers.Default)(cc: ControllerComponents, actorSystem: ActorSystem)(configuration: Configuration)
                      (apiC: ApiC)(implicit mat: Materializer)
  extends AbstractController(cc) with play.api.i18n.I18nSupport {

  override lazy val parse: PlayBodyParsers = cc.parsers


  def index(collName: String, queryType: String, oId: Option[BSONObjectID], oActiveTabIdx: Option[Int] = Some(1)) = Action.async { implicit request: Request[AnyContent] =>

    val allDocsJsResultF = apiC.getJsResultF(collName, queryType, oId, admin = true)
    val collectionPanelF = allDocsJsResultF.map(jsRes => showCollection(collName, jsRes)(oActiveTabIdx))
    val formPanelF = allDocsJsResultF.map(jsRes => showForm(collName, queryType, jsRes, oId)(oActiveTabIdx)(request))

    for {

      collectionPanel <- collectionPanelF
      formPanel <- formPanelF

      collectionHtml <- Pagelet.readBody(collectionPanel)
      formHtml <- Pagelet.readBody(formPanel)

    } yield {
      Ok(views.html.db.index(collName)(formHtml, collectionHtml))
    }

  }

  def showForm(collName: String, queryType: String, jsResult: JsResult[Seq[SuperVarT]], oId: Option[BSONObjectID])(oActiveTabIdx: Option[Int])(implicit request: Request[AnyContent]) = {

    jsResult match {
      case JsSuccess(data: List[SuperVarT], path: JsPath) => {

        collName match {
          case "cty" => {
            val (thisForm, thisData) = CtyM.getMyFormAndData_tup(queryType, Some(data.asInstanceOf[List[CtyM]]), oId)
            Ok(views.html.db.cty.form(collName, queryType)(thisForm, thisData, oId)(CtyM.getOpts)(oActiveTabIdx, CtyM.tabNames))
          }
        }

      }

      // todo - add more collections here after creating new collection models
      case e: JsError => Ok(JsError.toJson(e))
    }

  }

  def showCollection(collName: String, jsResult: JsResult[Seq[SuperVarT]])(oActiveTabIdx: Option[Int])(implicit request: Request[AnyContent]) = {

    val defaultMessage = s"No collections named <strong>$collName</strong> were found"

    jsResult match {

      case JsSuccess(data: List[SuperVarT], path: JsPath) => collName match {
        case "cty" => Ok(views.html.db.cty.collection(collName, Some(data.asInstanceOf[List[CtyM]]))(oActiveTabIdx))
        case _ => Ok(defaultMessage)
      }
      case e: JsError => Ok(JsError.toJson(e))
    }

  }

  def submitForm(queryType: String, collName: String, oId: Option[BSONObjectID], oDocStr: Option[String],
                     oActiveTabIdx: Option[Int]) = Action.async { implicit request: Request[AnyContent] =>

    val myForm = collName match {
      case "cty" => CtyM.form
      case _ => CtyM.form
    }

    myForm.bindFromRequest.fold(
      errorForm => Future.successful(Ok("todo")),

      formData => {

        val oNewFieldsJSO = queryType match {
          case "u" => apiC.getUpdatedFieldValues(formData, oDocStr)
          case _ => apiC.getCreatedFieldValues(formData)
        }

        val redirectRes = Redirect(routes.IndexC.index(collName, queryType, oId, oActiveTabIdx))
        apiC.callAndRedirect(queryType, collName, oId, oNewFieldsJSO)(redirectRes)(request)

      }
    )

  }

  def deleteDoc(collName: String, oId: Option[BSONObjectID], oActiveTabIdx: Option[Int]) = Action.async { implicit request: Request[AnyContent] =>

    val redirectRes = Redirect(routes.IndexC.index(collName, "c", oId, oActiveTabIdx))
    apiC.callAndRedirect("d", collName, oId, None)(redirectRes)(request)

  }

}


