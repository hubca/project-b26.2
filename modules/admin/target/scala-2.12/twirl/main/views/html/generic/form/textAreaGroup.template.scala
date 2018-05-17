
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

object textAreaGroup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(labelName: String, rows: String, cols: String, inputClass: String, idName: String, value: String, placeholder: String, required: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.139*/("""

"""),format.raw/*3.1*/("""<div class="form-group">
    <label>"""),_display_(/*4.13*/labelName),format.raw/*4.22*/("""</label>
    <textarea rows=""""),_display_(/*5.22*/rows),format.raw/*5.26*/("""" cols=""""),_display_(/*5.35*/cols),format.raw/*5.39*/("""" class=""""),_display_(/*5.49*/inputClass),format.raw/*5.59*/("""" id=""""),_display_(/*5.66*/idName),format.raw/*5.72*/("""" name=""""),_display_(/*5.81*/idName),format.raw/*5.87*/("""" placeholder="e.g. """),_display_(/*5.108*/placeholder),format.raw/*5.119*/("""" """),_display_(/*5.122*/required),format.raw/*5.130*/(""">"""),_display_(/*5.132*/value),format.raw/*5.137*/("""</textarea>
</div>"""))
      }
    }
  }

  def render(labelName:String,rows:String,cols:String,inputClass:String,idName:String,value:String,placeholder:String,required:String): play.twirl.api.HtmlFormat.Appendable = apply(labelName,rows,cols,inputClass,idName,value,placeholder,required)

  def f:((String,String,String,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (labelName,rows,cols,inputClass,idName,value,placeholder,required) => apply(labelName,rows,cols,inputClass,idName,value,placeholder,required)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 16 23:27:28 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26_container-test/modules/admin/app/views/generic/form/textAreaGroup.scala.html
                  HASH: 52606873fc072527b3fc08e32cb02c0d24e52082
                  MATRIX: 799->1|1032->138|1062->142|1126->180|1155->189|1212->220|1236->224|1271->233|1295->237|1331->247|1361->257|1394->264|1420->270|1455->279|1481->285|1529->306|1561->317|1591->320|1620->328|1649->330|1675->335
                  LINES: 21->1|26->1|28->3|29->4|29->4|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5|30->5
                  -- GENERATED --
              */
          