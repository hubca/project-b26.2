
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

object inputGroup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(labelName: String, inputClass: String, idName: String, value: String, placeholder: String, required: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.111*/("""

"""),format.raw/*3.1*/("""<div class="form-group">
    <label>"""),_display_(/*4.13*/labelName),format.raw/*4.22*/("""</label>
    <input type="text" class=""""),_display_(/*5.32*/inputClass),format.raw/*5.42*/("""" id=""""),_display_(/*5.49*/idName),format.raw/*5.55*/("""" name=""""),_display_(/*5.64*/idName),format.raw/*5.70*/("""" value=""""),_display_(/*5.80*/value),format.raw/*5.85*/("""" placeholder="e.g. """),_display_(/*5.106*/placeholder),format.raw/*5.117*/("""" """),_display_(/*5.120*/required),format.raw/*5.128*/(""">
</div>"""))
      }
    }
  }

  def render(labelName:String,inputClass:String,idName:String,value:String,placeholder:String,required:String): play.twirl.api.HtmlFormat.Appendable = apply(labelName,inputClass,idName,value,placeholder,required)

  def f:((String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (labelName,inputClass,idName,value,placeholder,required) => apply(labelName,inputClass,idName,value,placeholder,required)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:51 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/form/inputGroup.scala.html
                  HASH: 0da9789ac4dca55ff157affb16549acbf54eec22
                  MATRIX: 782->1|987->110|1017->114|1081->152|1110->161|1177->202|1207->212|1240->219|1266->225|1301->234|1327->240|1363->250|1388->255|1436->276|1468->287|1498->290|1527->298
                  LINES: 21->1|26->1|28->3|29->4|29->4|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5
                  -- GENERATED --
              */
          