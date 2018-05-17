
package views.html.generic.form

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

object fieldset extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(colNum: String, divClass: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<fieldset class="col-lg-"""),_display_(/*3.26*/colNum),format.raw/*3.32*/("""">
    """),_display_(/*4.6*/views/*4.11*/.html.generic.div("well")/*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""
        """),_display_(/*5.10*/content),format.raw/*5.17*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</fieldset>"""))
      }
    }
  }

  def render(colNum:String,divClass:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(colNum,divClass)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (colNum,divClass) => (content) => apply(colNum,divClass)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:51 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/form/fieldset.scala.html
                  HASH: 17cc8121cfceea4f66285a36e3484d3a083cf6f7
                  MATRIX: 757->1|901->50|931->54|982->79|1008->85|1042->94|1055->99|1088->124|1127->126|1164->137|1191->144|1227->151|1255->153
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|31->6|32->7
                  -- GENERATED --
              */
          