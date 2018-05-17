
package views.html.db

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

object collection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Seq[Html],Option[Int],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(collName: String)(docsTabList: Seq[Html], oActiveTabIdx: Option[Int] = None)(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.148*/("""


"""),_display_(/*5.2*/views/*5.7*/.html.generic.panelCollapsible("panel-data", collName + " collection", "collapse-documents")/*5.99*/ {_display_(Seq[Any](format.raw/*5.101*/("""

    """),_display_(/*7.6*/views/*7.11*/.html.generic.panelBody/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""

        """),_display_(/*9.10*/views/*9.15*/.html.generic.tabContent/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
            """),_display_(/*10.14*/for((thisTab, idx) <- docsTabList.zipWithIndex) yield /*10.61*/ {_display_(Seq[Any](format.raw/*10.63*/("""

                """),_display_(/*12.18*/views/*12.23*/.html.generic.tabPane("panel-group docs fade", "dtab" + (idx+1), views.generic.GenericHelper.isActive(idx, oActiveTabIdx, " in"))/*12.152*/ {_display_(Seq[Any](format.raw/*12.154*/("""
                    """),_display_(/*13.22*/thisTab),format.raw/*13.29*/("""
                """)))}),format.raw/*14.18*/("""

            """)))}),format.raw/*16.14*/("""
        """)))}),format.raw/*17.10*/("""

    """)))}),format.raw/*19.6*/("""

""")))}))
      }
    }
  }

  def render(collName:String,docsTabList:Seq[Html],oActiveTabIdx:Option[Int],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(collName)(docsTabList,oActiveTabIdx)(request,messagesProvider)

  def f:((String) => (Seq[Html],Option[Int]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (collName) => (docsTabList,oActiveTabIdx) => (request,messagesProvider) => apply(collName)(docsTabList,oActiveTabIdx)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/collection.scala.html
                  HASH: c1a42178ccffdab57a360044c9c347d128bdb17f
                  MATRIX: 435->1|813->19|1055->165|1087->172|1099->177|1199->269|1239->271|1273->280|1286->285|1317->308|1356->310|1395->323|1408->328|1440->352|1479->354|1521->369|1584->416|1624->418|1672->439|1686->444|1825->573|1866->575|1916->598|1944->605|1994->624|2042->641|2084->652|2123->661
                  LINES: 17->1|22->2|27->2|30->5|30->5|30->5|30->5|32->7|32->7|32->7|32->7|34->9|34->9|34->9|34->9|35->10|35->10|35->10|37->12|37->12|37->12|37->12|38->13|38->13|39->14|41->16|42->17|44->19
                  -- GENERATED --
              */
          