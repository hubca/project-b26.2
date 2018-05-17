
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

object formAction extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(btnClass: String, value: String, action: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/queryLabel/*3.12*/ = {{
    views.generic.form.FormHelper.getFormActionLabel(action)
}};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*7.1*/("""<div class="form-actions">
    <button type="submit" name="submit" class="btn """),_display_(/*8.53*/btnClass),format.raw/*8.61*/("""" value=""""),_display_(/*8.71*/value),format.raw/*8.76*/("""">"""),_display_(/*8.79*/queryLabel),format.raw/*8.89*/("""</button>
</div>"""))
      }
    }
  }

  def render(btnClass:String,value:String,action:String): play.twirl.api.HtmlFormat.Appendable = apply(btnClass,value,action)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (btnClass,value,action) => apply(btnClass,value,action)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:46 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/form/formAction.scala.html
                  HASH: c102d5da10b450a22cc1ea8a6c5109bd964ffb00
                  MATRIX: 761->1|888->55|906->65|1006->50|1036->135|1066->139|1172->219|1200->227|1236->237|1261->242|1290->245|1320->255
                  LINES: 21->1|25->3|25->3|28->1|30->5|32->7|33->8|33->8|33->8|33->8|33->8|33->8
                  -- GENERATED --
              */
          