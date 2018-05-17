
package views.html.db.cty

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
/*1.2*/import helper._

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[String,String,Form[models.db.CtyM],Option[String],Option[reactivemongo.bson.BSONObjectID],Option[Map[String, Seq[scala.Tuple2[String, String]]]],Option[Int],Option[Seq[String]],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(collName: String, queryType: String)(thisForm: Form[models.db.CtyM], thisFormDataJsStr: Option[String], oId: Option[reactivemongo.bson.BSONObjectID])(oOptsMap: Option[Map[String, Seq[(String, String)]]] = None)(oActiveTabIdx: Option[Int], oTabNames: Option[Seq[String]])(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/getFormTabList/*4.16*/ = {{
    List(formFields.tab1(queryType, thisForm, oOptsMap), views.html.db.adminFormTab(queryType, thisForm, oOptsMap))
}};
Seq[Any](format.raw/*2.342*/("""

"""),format.raw/*6.2*/("""

"""),_display_(/*8.2*/views/*8.7*/.html.generic.navTabs(oTabNames, oActiveTabIdx)),format.raw/*8.54*/("""

"""),_display_(/*10.2*/views/*10.7*/.html.db.inputForm(collName, queryType)/*10.46*/(oId, oOptsMap)/*10.61*/(getFormTabList, oActiveTabIdx)/*10.92*/(thisFormDataJsStr)))
      }
    }
  }

  def render(collName:String,queryType:String,thisForm:Form[models.db.CtyM],thisFormDataJsStr:Option[String],oId:Option[reactivemongo.bson.BSONObjectID],oOptsMap:Option[Map[String, Seq[scala.Tuple2[String, String]]]],oActiveTabIdx:Option[Int],oTabNames:Option[Seq[String]],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(collName,queryType)(thisForm,thisFormDataJsStr,oId)(oOptsMap)(oActiveTabIdx,oTabNames)(request,messagesProvider)

  def f:((String,String) => (Form[models.db.CtyM],Option[String],Option[reactivemongo.bson.BSONObjectID]) => (Option[Map[String, Seq[scala.Tuple2[String, String]]]]) => (Option[Int],Option[Seq[String]]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (collName,queryType) => (thisForm,thisFormDataJsStr,oId) => (oOptsMap) => (oActiveTabIdx,oTabNames) => (request,messagesProvider) => apply(collName,queryType)(thisForm,thisFormDataJsStr,oId)(oOptsMap)(oActiveTabIdx,oTabNames)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/cty/form.scala.html
                  HASH: 4ba3782d71e02a5669e86b3f35cdd5ddfebc5683
                  MATRIX: 439->1|960->19|1378->364|1400->378|1556->359|1586->503|1616->508|1628->513|1695->560|1726->565|1739->570|1787->609|1811->624|1851->655
                  LINES: 17->1|22->2|26->4|26->4|29->2|31->6|33->8|33->8|33->8|35->10|35->10|35->10|35->10|35->10
                  -- GENERATED --
              */
          