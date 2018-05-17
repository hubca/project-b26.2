
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

object tabContent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<div class="tab-content">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</div>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 16 23:27:28 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26_container-test/modules/admin/app/views/generic/tabContent.scala.html
                  HASH: 9639b9bfe281c3fd168bd44ab51c7b4eef130d21
                  MATRIX: 740->1|850->16|880->20|937->52|964->59|992->61
                  LINES: 21->1|26->1|28->3|29->4|29->4|30->5
                  -- GENERATED --
              */
          