
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

object collection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Option[Seq[models.db.CtyM]],Option[Int],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(collName: String, oDocs: Option[Seq[models.db.CtyM]])(oActiveTabIdx: Option[Int] = None)(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/getDocsTabList/*4.16*/ = {{
    List(docs.tab1(collName, oDocs), views.html.db.adminCollectionTab(collName, oDocs)(oActiveTabIdx))
}};
Seq[Any](format.raw/*2.160*/("""

"""),format.raw/*6.2*/("""

"""),_display_(/*8.2*/views/*8.7*/.html.db.collection(collName)/*8.36*/(getDocsTabList, oActiveTabIdx)))
      }
    }
  }

  def render(collName:String,oDocs:Option[Seq[models.db.CtyM]],oActiveTabIdx:Option[Int],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(collName,oDocs)(oActiveTabIdx)(request,messagesProvider)

  def f:((String,Option[Seq[models.db.CtyM]]) => (Option[Int]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (collName,oDocs) => (oActiveTabIdx) => (request,messagesProvider) => apply(collName,oDocs)(oActiveTabIdx)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 11:37:46 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26_container-test/modules/admin/app/views/db/cty/collection.scala.html
                  HASH: 357e3638c795788570b02cc697241f1b725bf8f9
                  MATRIX: 439->1|835->19|1071->182|1093->196|1236->177|1266->308|1296->313|1308->318|1345->347
                  LINES: 17->1|22->2|26->4|26->4|29->2|31->6|33->8|33->8|33->8
                  -- GENERATED --
              */
          