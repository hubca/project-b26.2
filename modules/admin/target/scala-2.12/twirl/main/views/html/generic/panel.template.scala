
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

object panel extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(panelClass: String, panelHeading: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<div class="panel """),_display_(/*3.20*/panelClass),format.raw/*3.30*/("""">
    """),_display_(/*4.6*/panelHeader(panelHeading)),format.raw/*4.31*/("""
    """),_display_(/*5.6*/panelBody(content)),format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""</div>"""))
      }
    }
  }

  def render(panelClass:String,panelHeading:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(panelClass,panelHeading)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (panelClass,panelHeading) => (content) => apply(panelClass,panelHeading)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/panel.scala.html
                  HASH: 7f545b8315a82bb015432b7587aa2b9f591cde05
                  MATRIX: 749->1|901->58|931->62|976->81|1006->91|1040->100|1085->125|1117->132|1155->150|1183->152
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|30->5|30->5|31->6
                  -- GENERATED --
              */
          