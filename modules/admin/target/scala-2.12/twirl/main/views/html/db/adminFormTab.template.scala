
package views.html.db

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
/*1.2*/import helper._

object adminFormTab extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Option[Map[String, Seq[scala.Tuple2[String, String]]]],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(queryType: String, thisForm: Form[_], oOptsMap: Option[Map[String, Seq[(String, String)]]])(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.163*/("""


"""),_display_(/*6.2*/views/*6.7*/.html.generic.form.fieldset("3", "well")/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
    """),_display_(/*7.6*/inputText(thisForm("admin_e.adminCreatedId"), '_label -> "created by admin id", 'class -> "form-control", 'id -> "adminModifiedId", 'name -> "adminModifiedId", 'size -> 5, 'placeholder -> "e.g. 1", 'disabled -> "disabled")),format.raw/*7.228*/("""
""")))}),format.raw/*8.2*/("""

"""),_display_(/*10.2*/views/*10.7*/.html.generic.form.fieldset("3", "well")/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
    """),_display_(/*11.6*/inputText(thisForm("admin_e.dateCreated"), '_label -> "date created", 'class -> "form-control", 'id -> "dateCreated", 'name -> "dateCreated", 'size -> 5, 'placeholder -> "e.g. 2017-11-22", 'disabled -> "disabled")),format.raw/*11.219*/("""
""")))}),format.raw/*12.2*/("""

"""),_display_(/*14.2*/views/*14.7*/.html.generic.form.fieldset("3", "well")/*14.47*/ {_display_(Seq[Any](format.raw/*14.49*/("""
    """),_display_(/*15.6*/inputText(thisForm("admin_e.adminModifiedId"), '_label -> "modified by admin id", 'class -> "form-control", 'id -> "adminModifiedId", 'name -> "adminModifiedId", 'size -> 5, 'placeholder -> "e.g. 1", 'disabled -> "disabled")),format.raw/*15.230*/("""
""")))}),format.raw/*16.2*/("""

"""),_display_(/*18.2*/views/*18.7*/.html.generic.form.fieldset("3", "well")/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
    """),_display_(/*19.6*/inputText(thisForm("admin_e.lastModified"), '_label -> "last modified", 'class -> "form-control", 'id -> "lastModified", 'name -> "lastModified", 'size -> 5, 'placeholder -> "e.g. 2017-11-28", 'disabled -> "disabled")),format.raw/*19.223*/("""
""")))}),format.raw/*20.2*/("""

"""),_display_(/*22.2*/views/*22.7*/.html.generic.form.formAction("btn-action", "1", queryType)))
      }
    }
  }

  def render(queryType:String,thisForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},oOptsMap:Option[Map[String, Seq[scala.Tuple2[String, String]]]],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(queryType,thisForm,oOptsMap)(request,messagesProvider)

  def f:((String,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Option[Map[String, Seq[scala.Tuple2[String, String]]]]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (queryType,thisForm,oOptsMap) => (request,messagesProvider) => apply(queryType,thisForm,oOptsMap)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/adminFormTab.scala.html
                  HASH: 1d5e4f46167c858784c281a1e5fcb5ba9ccc875e
                  MATRIX: 435->1|929->21|1186->182|1218->189|1230->194|1278->234|1317->236|1349->243|1592->465|1624->468|1655->473|1668->478|1717->518|1757->520|1790->527|2025->740|2058->743|2089->748|2102->753|2151->793|2191->795|2224->802|2470->1026|2503->1029|2534->1034|2547->1039|2596->1079|2636->1081|2669->1088|2908->1305|2941->1308|2972->1313|2985->1318
                  LINES: 17->1|24->3|29->3|32->6|32->6|32->6|32->6|33->7|33->7|34->8|36->10|36->10|36->10|36->10|37->11|37->11|38->12|40->14|40->14|40->14|40->14|41->15|41->15|42->16|44->18|44->18|44->18|44->18|45->19|45->19|46->20|48->22|48->22
                  -- GENERATED --
              */
          