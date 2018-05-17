
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

object tabPane extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(divClass: String, idName: String, active: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*3.1*/("""<div class="tab-pane """),_display_(/*3.23*/active),format.raw/*3.29*/(""" """),_display_(/*3.31*/divClass),format.raw/*3.39*/("""" id=""""),_display_(/*3.46*/idName),format.raw/*3.52*/("""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</div>
"""))
      }
    }
  }

  def render(divClass:String,idName:String,active:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(divClass,idName,active)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (divClass,idName,active) => (content) => apply(divClass,idName,active)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:51 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/tabPane.scala.html
                  HASH: 568f16d9616b1f2419752f9b8ec6e13781165cc0
                  MATRIX: 758->1|923->71|953->75|1001->97|1027->103|1055->105|1083->113|1116->120|1142->126|1176->135|1203->142|1231->144
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|28->3|28->3|28->3|29->4|29->4|30->5
                  -- GENERATED --
              */
          