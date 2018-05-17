
package views.html.generic

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

object navTabs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Option[Seq[String]],Option[Int],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(oNames: Option[Seq[String]], oActiveTabIdx: Option[Int]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<ul class="nav nav-tabs">

    """),_display_(/*5.6*/for(names <- oNames) yield /*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

        """),_display_(/*7.10*/for((tab, idx) <- names.zipWithIndex) yield /*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
            """),_display_(/*8.14*/views/*8.19*/.html.generic.navLi("tab" + (idx + 1).toString, tab, views.generic.GenericHelper.isActive(idx, oActiveTabIdx))),format.raw/*8.129*/("""
        """)))}),format.raw/*9.10*/("""

    """)))}),format.raw/*11.6*/("""

"""),format.raw/*13.1*/("""</ul>"""))
      }
    }
  }

  def render(oNames:Option[Seq[String]],oActiveTabIdx:Option[Int]): play.twirl.api.HtmlFormat.Appendable = apply(oNames,oActiveTabIdx)

  def f:((Option[Seq[String]],Option[Int]) => play.twirl.api.HtmlFormat.Appendable) = (oNames,oActiveTabIdx) => apply(oNames,oActiveTabIdx)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/navTabs.scala.html
                  HASH: cf1e4fbbc438586839ffcf0631ecddcc18ade726
                  MATRIX: 764->1|916->58|946->62|1005->96|1040->116|1079->118|1118->131|1170->168|1209->170|1250->185|1263->190|1394->300|1435->311|1474->320|1505->324
                  LINES: 21->1|26->1|28->3|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|36->11|38->13
                  -- GENERATED --
              */
          