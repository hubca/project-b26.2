
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

object panelCollapsible extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(panelClass: String, panelHeading: String, collapseId: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*3.1*/("""<div class="panel """),_display_(/*3.20*/panelClass),format.raw/*3.30*/("""">
    """),_display_(/*4.6*/panelHeaderCollapsible(panelHeading, collapseId)),format.raw/*4.54*/("""
    """),format.raw/*5.5*/("""<div id=""""),_display_(/*5.15*/collapseId),format.raw/*5.25*/("""" class="panel-collapse collapse in">
        """),_display_(/*6.10*/panelBody(content)),format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(panelClass:String,panelHeading:String,collapseId:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(panelClass,panelHeading,collapseId)(content)

  def f:((String,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (panelClass,panelHeading,collapseId) => (content) => apply(panelClass,panelHeading,collapseId)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/panelCollapsible.scala.html
                  HASH: ea0c445909535c5a595fface7c21286f3168fcf9
                  MATRIX: 767->1|939->78|969->82|1014->101|1044->111|1078->120|1146->168|1178->174|1214->184|1244->194|1318->242|1356->260|1388->266
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|30->5|30->5|30->5|31->6|31->6|32->7
                  -- GENERATED --
              */
          