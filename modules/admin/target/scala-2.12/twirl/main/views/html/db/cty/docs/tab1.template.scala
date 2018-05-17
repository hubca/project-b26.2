
package views.html.db.cty.docs

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

object tab1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Option[Seq[models.db.CtyM]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(collName: String, oDocs: Option[Seq[models.db.CtyM]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*3.1*/("""<table class="table datatable table-striped table-bordered table-hover cell-border display table-collection" id="dataTable">
    <thead>
    <tr role="row">
        <th>id</th>
        <th>country name</th>
        <th>country code</th>
        <th>continent</th>
        <th>hemisphere</th>
        <th>language arr</th>
        <th>currency code</th>
        <th class="no-sort"></th>
        <th class="no-sort"></th>
    </tr>
    </thead>
    <tbody>
        """),_display_(/*18.10*/for(docs <- oDocs) yield /*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""
            """),_display_(/*19.14*/for((doc, idx) <- docs.zipWithIndex) yield /*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                """),format.raw/*20.17*/("""<tr class=""""),_display_(/*20.29*/doc/*20.32*/.oddOrEvenTableRow(idx)),format.raw/*20.55*/("""" role="row">
                    <td class="text-center">"""),_display_(/*21.46*/doc/*21.49*/.idAsStringLast6(doc.oAdminAsObj._id)),format.raw/*21.86*/("""</td>
                    <td>"""),_display_(/*22.26*/doc/*22.29*/.countryName),format.raw/*22.41*/("""</td>
                    <td class="text-center">"""),_display_(/*23.46*/doc/*23.49*/.oCountryCodeAsString),format.raw/*23.70*/("""</td>
                    <td>"""),_display_(/*24.26*/doc/*24.29*/.oContinentAsString),format.raw/*24.48*/("""</td>
                    <td class="text-center">"""),_display_(/*25.46*/doc/*25.49*/.oHemisphereAsString),format.raw/*25.69*/("""</td>
                    <td>"""),_display_(/*26.26*/doc/*26.29*/.oLanguagesArrAsString),format.raw/*26.51*/("""</td>
                    <td class="text-center">"""),_display_(/*27.46*/doc/*27.49*/.oCurrencyCodeAsString),format.raw/*27.71*/("""</td>

                    """),_display_(/*29.22*/views/*29.27*/.html.db.actionColumns(collName, doc.oAdminAsObj._id)/*29.80*/(Some(1))),format.raw/*29.89*/("""

                """),format.raw/*31.17*/("""</tr>
            """)))}),format.raw/*32.14*/("""
        """)))}),format.raw/*33.10*/("""
    """),format.raw/*34.5*/("""</tbody>
</table>"""))
      }
    }
  }

  def render(collName:String,oDocs:Option[Seq[models.db.CtyM]]): play.twirl.api.HtmlFormat.Appendable = apply(collName,oDocs)

  def f:((String,Option[Seq[models.db.CtyM]]) => play.twirl.api.HtmlFormat.Appendable) = (collName,oDocs) => apply(collName,oDocs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/cty/docs/tab1.scala.html
                  HASH: a2b5c9c5d959bceee3159b954c291d5d5d707a82
                  MATRIX: 768->1|917->55|947->59|1454->539|1488->557|1528->559|1570->574|1622->610|1662->612|1708->630|1747->642|1759->645|1803->668|1890->728|1902->731|1960->768|2019->800|2031->803|2064->815|2143->867|2155->870|2197->891|2256->923|2268->926|2308->945|2387->997|2399->1000|2440->1020|2499->1052|2511->1055|2554->1077|2633->1129|2645->1132|2688->1154|2745->1184|2759->1189|2821->1242|2851->1251|2899->1271|2950->1291|2992->1302|3025->1308
                  LINES: 21->1|26->1|28->3|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|54->29|54->29|54->29|54->29|56->31|57->32|58->33|59->34
                  -- GENERATED --
              */
          