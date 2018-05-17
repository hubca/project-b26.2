
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
/*1.2*/import helper._

object radioWithInputTextGroup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[play.api.data.Field,Seq[scala.Tuple2[String, String]],String,Map[String, String],Html,RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(formElement: play.api.data.Field, opts: Seq[(String, String)], defaultValue: String)(attrMap: Map[String, String])(accompanyingInputsHtml: Html)(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.216*/("""

"""),format.raw/*4.1*/("""<div class="radioSelectWithPartners">

    """),_display_(/*6.6*/inputRadioGroup(
        formElement.copy(
            value=formElement.value.map{Some(_)}.getOrElse(Some(defaultValue))
        ),
        options = opts,
        'class -> "form-control form-control-radio",
        '_label -> attrMap("_label"),
        'id -> attrMap("name"),
        'name -> attrMap("name"),
        'size -> 20
    )),format.raw/*16.6*/("""

    """),format.raw/*18.5*/("""<div class="partnerInputBoxes">
        """),_display_(/*19.10*/accompanyingInputsHtml),format.raw/*19.32*/("""
    """),format.raw/*20.5*/("""</div>
</div>"""))
      }
    }
  }

  def render(formElement:play.api.data.Field,opts:Seq[scala.Tuple2[String, String]],defaultValue:String,attrMap:Map[String, String],accompanyingInputsHtml:Html,request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(formElement,opts,defaultValue)(attrMap)(accompanyingInputsHtml)(request,messagesProvider)

  def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],String) => (Map[String, String]) => (Html) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (formElement,opts,defaultValue) => (attrMap) => (accompanyingInputsHtml) => (request,messagesProvider) => apply(formElement,opts,defaultValue)(attrMap)(accompanyingInputsHtml)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:51 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/generic/form/radioWithInputTextGroup.scala.html
                  HASH: f0131a5ae648117eca3f9d85c77b001604b88e08
                  MATRIX: 445->1|893->19|1203->233|1233->237|1304->283|1673->632|1708->640|1777->682|1820->704|1853->710
                  LINES: 17->1|22->2|27->2|29->4|31->6|41->16|43->18|44->19|44->19|45->20
                  -- GENERATED --
              */
          