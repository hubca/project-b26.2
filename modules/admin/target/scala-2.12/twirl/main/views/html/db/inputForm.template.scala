
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

object inputForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[String,String,Option[reactivemongo.bson.BSONObjectID],Option[Map[String, Seq[scala.Tuple2[String, String]]]],Seq[Html],Option[Int],Option[String],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(collName: String, queryType: String)(oId: Option[reactivemongo.bson.BSONObjectID], oOptsMap: Option[Map[String, Seq[(String, String)]]] = None)(formTabList: Seq[Html], oActiveTabIdx: Option[Int] = Some(1))(thisFormDataJsStr: Option[String])(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/getFormNameId/*5.15*/ = {{
    collName + "-form"
}};def /*9.2*/formPanelLabel/*9.16*/ = {{
    views.generic.form.FormHelper.getFormActionLabel(queryType) + " document"
}};
Seq[Any](format.raw/*3.312*/("""

"""),format.raw/*7.2*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/form(action = admin.db.routes.IndexC.submitForm(queryType, collName, oId, thisFormDataJsStr, oActiveTabIdx), 'name -> getFormNameId, 'id -> getFormNameId, 'class -> "admin-db-form")/*13.183*/ {_display_(Seq[Any](format.raw/*13.185*/("""
    """),_display_(/*14.6*/CSRF/*14.10*/.formField),format.raw/*14.20*/("""

    """),_display_(/*16.6*/views/*16.11*/.html.generic.panelCollapsible("panel-action", formPanelLabel, "collapse-form")/*16.90*/ {_display_(Seq[Any](format.raw/*16.92*/("""
        """),_display_(/*17.10*/views/*17.15*/.html.generic.tabContent/*17.39*/ {_display_(Seq[Any](format.raw/*17.41*/("""
            """),_display_(/*18.14*/for((thisTab, idx) <- formTabList.zipWithIndex) yield /*18.61*/ {_display_(Seq[Any](format.raw/*18.63*/("""
                """),_display_(/*19.18*/views/*19.23*/.html.generic.tabPane("panel-group form-fields fade", "tab" + (idx+1), views.generic.GenericHelper.isActive(idx, oActiveTabIdx, " in"))/*19.158*/ {_display_(Seq[Any](format.raw/*19.160*/("""
                    """),_display_(/*20.22*/thisTab),format.raw/*20.29*/("""
                """)))}),format.raw/*21.18*/("""
            """)))}),format.raw/*22.14*/("""
        """)))}),format.raw/*23.10*/("""
    """)))}),format.raw/*24.6*/("""
""")))}))
      }
    }
  }

  def render(collName:String,queryType:String,oId:Option[reactivemongo.bson.BSONObjectID],oOptsMap:Option[Map[String, Seq[scala.Tuple2[String, String]]]],formTabList:Seq[Html],oActiveTabIdx:Option[Int],thisFormDataJsStr:Option[String],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(collName,queryType)(oId,oOptsMap)(formTabList,oActiveTabIdx)(thisFormDataJsStr)(request,messagesProvider)

  def f:((String,String) => (Option[reactivemongo.bson.BSONObjectID],Option[Map[String, Seq[scala.Tuple2[String, String]]]]) => (Seq[Html],Option[Int]) => (Option[String]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (collName,queryType) => (oId,oOptsMap) => (formTabList,oActiveTabIdx) => (thisFormDataJsStr) => (request,messagesProvider) => apply(collName,queryType)(oId,oOptsMap)(formTabList,oActiveTabIdx)(thisFormDataJsStr)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/inputForm.scala.html
                  HASH: de35f5101a0c697b93f72427f4b4ea83a79eafd0
                  MATRIX: 435->1|929->21|1317->336|1338->349|1383->386|1405->400|1523->331|1553->381|1584->487|1615->492|1806->673|1847->675|1880->682|1893->686|1924->696|1959->705|1973->710|2061->789|2101->791|2139->802|2153->807|2186->831|2226->833|2268->848|2331->895|2371->897|2417->916|2431->921|2576->1056|2617->1058|2667->1081|2695->1088|2745->1107|2791->1122|2833->1133|2870->1140
                  LINES: 17->1|22->3|26->5|26->5|28->9|28->9|31->3|33->7|35->11|37->13|37->13|37->13|38->14|38->14|38->14|40->16|40->16|40->16|40->16|41->17|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|43->19|44->20|44->20|45->21|46->22|47->23|48->24
                  -- GENERATED --
              */
          