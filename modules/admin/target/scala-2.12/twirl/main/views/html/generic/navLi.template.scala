
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

object navLi extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, label: String, active: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<li class=""""),_display_(/*3.13*/active),format.raw/*3.19*/(""""><a href="#"""),_display_(/*3.32*/id),format.raw/*3.34*/("""" data-toggle="tab">"""),_display_(/*3.55*/label),format.raw/*3.60*/("""</a></li>"""))
      }
    }
  }

  def render(id:String,label:String,active:String): play.twirl.api.HtmlFormat.Appendable = apply(id,label,active)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (id,label,active) => apply(id,label,active)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/navLi.scala.html
                  HASH: bcc278e9765099c8cf4659862d4d4b43c3e5f0e4
                  MATRIX: 751->1|894->49|924->53|962->65|988->71|1027->84|1049->86|1096->107|1121->112
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|28->3|28->3|28->3
                  -- GENERATED --
              */
          