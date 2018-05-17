
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

object pageHeader extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageHeader: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header"><i class="fa fa-table fa-fw"></i>"""),_display_(/*5.67*/pageHeader),format.raw/*5.77*/("""</h1>
    </div>
</div>"""))
      }
    }
  }

  def render(pageHeader:String): play.twirl.api.HtmlFormat.Appendable = apply(pageHeader)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (pageHeader) => apply(pageHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/pageHeader.scala.html
                  HASH: dc4d5e7eb6915aac789928303be71fd06eed4a27
                  MATRIX: 742->1|857->21|887->25|1027->139|1057->149
                  LINES: 21->1|26->1|28->3|30->5|30->5
                  -- GENERATED --
              */
          