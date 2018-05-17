
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

object adminCollectionTab extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Option[Seq[models.db.SuperVarT]],Option[Int],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(collName: String, oDocs: Option[Seq[models.db.SuperVarT]])(oActiveTabIdx: Option[Int] = None):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*3.1*/("""<table class="table datatable table-striped table-bordered table-hover cell-border display table-collection admin" id="dataTable">
    """),_display_(/*4.6*/for(docs <- oDocs) yield /*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""

        """),format.raw/*6.9*/("""<thead>
            <tr role="row">
                <th>id</th>
                <th>"""),_display_(/*9.22*/docs/*9.26*/.head.vTuple._1),format.raw/*9.41*/("""</th>
                <th>admin created id</th>
                <th>date created</th>
                <th>admin modified id</th>
                <th>last modified</th>
                <th class="no-sort"></th>
                <th class="no-sort"></th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*19.14*/for((doc, idx) <- docs.zipWithIndex) yield /*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                """),format.raw/*20.17*/("""<tr class=""""),_display_(/*20.29*/doc/*20.32*/.oddOrEvenTableRow(idx)),format.raw/*20.55*/("""" role="row">
                    <td>"""),_display_(/*21.26*/doc/*21.29*/.oAdminAsObj.idAsStringLast6(doc.oAdminAsObj._id)),format.raw/*21.78*/("""</td>
                    <td>"""),_display_(/*22.26*/doc/*22.29*/.vTuple._2),format.raw/*22.39*/("""</td>
                    <td class="text-center">"""),_display_(/*23.46*/doc/*23.49*/.oAdminAsObj.adminCreatedIdAsString),format.raw/*23.84*/("""</td>
                    <td>"""),_display_(/*24.26*/doc/*24.29*/.oAdminAsObj.dateCreatedAsString),format.raw/*24.61*/("""</td>
                    <td class="text-center">"""),_display_(/*25.46*/doc/*25.49*/.oAdminAsObj.adminModifiedIdAsString),format.raw/*25.85*/("""</td>
                    <td>"""),_display_(/*26.26*/doc/*26.29*/.oAdminAsObj.lastModifiedAsString),format.raw/*26.62*/("""</td>

                    """),_display_(/*28.22*/actionColumns(collName, doc.oAdminAsObj._id)/*28.66*/(oActiveTabIdx)),format.raw/*28.81*/("""
                """),format.raw/*29.17*/("""</tr>
            """)))}),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</tbody>
    """)))}),format.raw/*32.6*/("""
"""),format.raw/*33.1*/("""</table>"""))
      }
    }
  }

  def render(collName:String,oDocs:Option[Seq[models.db.SuperVarT]],oActiveTabIdx:Option[Int]): play.twirl.api.HtmlFormat.Appendable = apply(collName,oDocs)(oActiveTabIdx)

  def f:((String,Option[Seq[models.db.SuperVarT]]) => (Option[Int]) => play.twirl.api.HtmlFormat.Appendable) = (collName,oDocs) => (oActiveTabIdx) => apply(collName,oDocs)(oActiveTabIdx)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 11:37:46 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26_container-test/modules/admin/app/views/db/adminCollectionTab.scala.html
                  HASH: e720831444eea3c3e7b5f74f6ec502d42fc3b240
                  MATRIX: 790->1|979->95|1009->99|1171->236|1204->254|1243->256|1281->268|1395->356|1407->360|1442->375|1795->701|1847->737|1887->739|1933->757|1972->769|1984->772|2028->795|2095->835|2107->838|2177->887|2236->919|2248->922|2279->932|2358->984|2370->987|2426->1022|2485->1054|2497->1057|2550->1089|2629->1141|2641->1144|2698->1180|2757->1212|2769->1215|2823->1248|2880->1278|2933->1322|2969->1337|3015->1355|3066->1375|3103->1385|3148->1400|3177->1402
                  LINES: 21->1|26->1|28->3|29->4|29->4|29->4|31->6|34->9|34->9|34->9|44->19|44->19|44->19|45->20|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|53->28|53->28|53->28|54->29|55->30|56->31|57->32|58->33
                  -- GENERATED --
              */
          