
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

object panelHeader extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(panelHeading: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<div class="panel-heading">
    """),_display_(/*4.6*/panelHeading),format.raw/*4.18*/("""

"""),format.raw/*6.1*/("""</div>"""))
      }
    }
  }

  def render(panelHeading:String): play.twirl.api.HtmlFormat.Appendable = apply(panelHeading)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (panelHeading) => apply(panelHeading)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:51 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/panelHeader.scala.html
                  HASH: 27f50ba747f972bd489397995e00bb8cc4ddd880
                  MATRIX: 743->1|860->23|890->27|949->61|981->73|1011->77
                  LINES: 21->1|26->1|28->3|29->4|29->4|31->6
                  -- GENERATED --
              */
          