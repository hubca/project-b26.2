
package views.html.db.cty.formFields

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

object tab1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,Form[models.db.CtyM],Option[Map[String, Seq[scala.Tuple2[String, String]]]],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(queryType: String, thisForm: Form[models.db.CtyM], oOptsMap: Option[Map[String, Seq[(String, String)]]])(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.176*/("""


"""),_display_(/*6.2*/views/*6.7*/.html.generic.form.fieldset("3", "well")/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""

    """),_display_(/*8.6*/inputText(thisForm("countryName"), '_label -> "country name", 'class -> "form-control", 'id -> "countryName", 'name -> "countryName", 'size -> 30, 'placeholder -> "e.g. France", 'required -> "required")),format.raw/*8.208*/("""
    """),_display_(/*9.6*/inputText(thisForm("countryCode"), '_label -> "country code", 'class -> "form-control", 'id -> "countryCode", 'name -> "countryCode", 'size -> 10, 'placeholder -> "e.g. FR", 'required -> "required")),format.raw/*9.204*/("""

""")))}),format.raw/*11.2*/("""

"""),_display_(/*13.2*/views/*13.7*/.html.generic.form.fieldset("3", "well")/*13.47*/ {_display_(Seq[Any](format.raw/*13.49*/("""

    """),_display_(/*15.6*/for(optsMap <- oOptsMap) yield /*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""
        """),_display_(/*16.10*/select(thisForm("continent"), options = optsMap("continents"), '_label -> "continent", 'class -> "form-control", 'id -> "continent", 'name -> "continent")),format.raw/*16.164*/("""
        """),_display_(/*17.10*/select(thisForm("hemisphere"), options = optsMap("hemispheres"), '_label -> "hemisphere", 'class -> "form-control", 'id -> "hemisphere", 'name -> "hemisphere")),format.raw/*17.169*/("""
    """)))}),format.raw/*18.6*/("""

""")))}),format.raw/*20.2*/("""

"""),_display_(/*22.2*/views/*22.7*/.html.generic.form.fieldset("3", "well")/*22.47*/ {_display_(Seq[Any](format.raw/*22.49*/("""

    """),_display_(/*24.6*/repeatWithIndex(thisForm("languagesArr"), min = 2)/*24.56*/ { (language, idx) =>_display_(Seq[Any](format.raw/*24.77*/("""
        """),_display_(/*25.10*/inputText(language, '_label -> ("language #" + (idx +1)), 'class -> "form-control", 'placeholder -> "e.g. French")),format.raw/*25.124*/("""
    """)))}),format.raw/*26.6*/("""

""")))}),format.raw/*28.2*/("""

"""),_display_(/*30.2*/views/*30.7*/.html.generic.form.fieldset("3", "well")/*30.47*/ {_display_(Seq[Any](format.raw/*30.49*/("""

    """),_display_(/*32.6*/inputText(thisForm("currencyCode"), '_label -> "currency code", 'class -> "form-control", 'id -> "currencyCode", 'name -> "currencyCode", 'size -> 10, 'placeholder -> "e.g. EUR", 'required -> "required")),format.raw/*32.209*/("""

""")))}),format.raw/*34.2*/("""

"""),_display_(/*36.2*/views/*36.7*/.html.generic.form.formAction("btn-action", "1", queryType)))
      }
    }
  }

  def render(queryType:String,thisForm:Form[models.db.CtyM],oOptsMap:Option[Map[String, Seq[scala.Tuple2[String, String]]]],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(queryType,thisForm,oOptsMap)(request,messagesProvider)

  def f:((String,Form[models.db.CtyM],Option[Map[String, Seq[scala.Tuple2[String, String]]]]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (queryType,thisForm,oOptsMap) => (request,messagesProvider) => apply(queryType,thisForm,oOptsMap)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/cty/formFields/tab1.scala.html
                  HASH: aed3093a72ff5b07053ccca7a9b57c2d34d76d38
                  MATRIX: 450->1|876->21|1146->195|1178->202|1190->207|1238->247|1277->249|1311->258|1534->460|1566->467|1785->665|1820->670|1851->675|1864->680|1913->720|1953->722|1988->731|2028->755|2068->757|2106->768|2282->922|2320->933|2501->1092|2538->1099|2573->1104|2604->1109|2617->1114|2666->1154|2706->1156|2741->1165|2800->1215|2859->1236|2897->1247|3033->1361|3070->1368|3105->1373|3136->1378|3149->1383|3198->1423|3238->1425|3273->1434|3498->1637|3533->1642|3564->1647|3577->1652
                  LINES: 17->1|22->3|27->3|30->6|30->6|30->6|30->6|32->8|32->8|33->9|33->9|35->11|37->13|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|41->17|41->17|42->18|44->20|46->22|46->22|46->22|46->22|48->24|48->24|48->24|49->25|49->25|50->26|52->28|54->30|54->30|54->30|54->30|56->32|56->32|58->34|60->36|60->36
                  -- GENERATED --
              */
          