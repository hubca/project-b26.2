
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(collName: String)(formHtml: Html, collectionHtml: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/localStylesheets/*5.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.50*/admin/*6.55*/.routes.Assets.at("datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css")),format.raw/*6.143*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/admin/*7.55*/.routes.Assets.at("admin/scss/dataTables.css")),format.raw/*7.101*/("""">
""")))};def /*10.2*/localScripts/*10.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.18*/("""
    """),format.raw/*11.5*/("""<!-- DataTables JavaScript -->
    <script src=""""),_display_(/*12.19*/admin/*12.24*/.routes.Assets.at("datatables/js/jquery.dataTables.min.js")),format.raw/*12.83*/(""""></script>
    <script src=""""),_display_(/*13.19*/admin/*13.24*/.routes.Assets.at("datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js")),format.raw/*13.115*/(""""></script>
    <script src=""""),_display_(/*14.19*/admin/*14.24*/.routes.Assets.at("admin/javascripts/dataTables.js")),format.raw/*14.76*/(""""></script>
""")))};
Seq[Any](format.raw/*3.58*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*15.2*/("""

"""),_display_(/*17.2*/views/*17.7*/.html.aMain("Database in collection", "Database", localScripts, localStylesheets)/*17.88*/ {_display_(Seq[Any](format.raw/*17.90*/("""

    """),format.raw/*19.5*/("""<div class="row">
        <div class="col-lg-12">

            """),_display_(/*22.14*/views/*22.19*/.html.generic.panel("panel-default", collName)/*22.65*/ {_display_(Seq[Any](format.raw/*22.67*/("""
                """),_display_(/*23.18*/formHtml),format.raw/*23.26*/("""
                """),_display_(/*24.18*/collectionHtml),format.raw/*24.32*/("""
            """)))}),format.raw/*25.14*/("""

        """),format.raw/*27.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(collName:String,formHtml:Html,collectionHtml:Html): play.twirl.api.HtmlFormat.Appendable = apply(collName)(formHtml,collectionHtml)

  def f:((String) => (Html,Html) => play.twirl.api.HtmlFormat.Appendable) = (collName) => (formHtml,collectionHtml) => apply(collName)(formHtml,collectionHtml)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 18:18:45 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/index.scala.html
                  HASH: 7736c8ed85fac1e5b428a15b76e5eeafff395425
                  MATRIX: 435->1|765->21|899->82|923->98|1003->102|1035->108|1106->153|1119->158|1228->246|1307->299|1320->304|1387->350|1415->360|1436->372|1517->376|1550->382|1627->432|1641->437|1721->496|1779->527|1793->532|1906->623|1964->654|1978->659|2051->711|2104->77|2134->355|2165->725|2196->730|2209->735|2299->816|2339->818|2374->826|2468->893|2482->898|2537->944|2577->946|2623->965|2652->973|2698->992|2733->1006|2779->1021|2818->1033
                  LINES: 17->1|22->3|26->5|26->5|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|31->10|31->10|33->10|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|39->3|41->8|43->15|45->17|45->17|45->17|45->17|47->19|50->22|50->22|50->22|50->22|51->23|51->23|52->24|52->24|53->25|55->27
                  -- GENERATED --
              */
          