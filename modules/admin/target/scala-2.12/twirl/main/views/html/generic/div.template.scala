
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

object div extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(divClass: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<div class=""""),_display_(/*3.14*/divClass),format.raw/*3.22*/("""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</div>
"""))
      }
    }
  }

  def render(divClass:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(divClass)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (divClass) => (content) => apply(divClass)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 16 23:27:28 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26_container-test/modules/admin/app/views/generic/div.scala.html
                  HASH: 11344443e444883e79d6dd9c63b19024fef8d4ee
                  MATRIX: 740->1|868->34|898->38|937->51|965->59|999->68|1026->75|1054->77
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|30->5
                  -- GENERATED --
              */
          