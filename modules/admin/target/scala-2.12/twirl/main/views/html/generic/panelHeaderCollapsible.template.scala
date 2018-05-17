
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

object panelHeaderCollapsible extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(panelHeading: String, collapseId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*3.1*/("""<div class="panel-heading" data-toggle="collapse" data-target="#"""),_display_(/*3.66*/collapseId),format.raw/*3.76*/("""">
    """),_display_(/*4.6*/panelHeading),format.raw/*4.18*/("""
"""),format.raw/*5.1*/("""</div>
"""))
      }
    }
  }

  def render(panelHeading:String,collapseId:String): play.twirl.api.HtmlFormat.Appendable = apply(panelHeading,collapseId)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (panelHeading,collapseId) => apply(panelHeading,collapseId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/panelHeaderCollapsible.scala.html
                  HASH: 000bcc02caaf0362eedfb1c27327e42b9163e5db
                  MATRIX: 761->1|898->43|928->47|1019->112|1049->122|1083->131|1115->143|1143->145
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|30->5
                  -- GENERATED --
              */
          