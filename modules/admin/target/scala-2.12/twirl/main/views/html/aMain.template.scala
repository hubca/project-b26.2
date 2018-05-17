
package views.html

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

object aMain extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, pageHeader: String, scripts: Html, stylesheets: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),format.raw/*3.1*/("""<html lang="en">
    <head>
        <title>"""),_display_(/*5.17*/title),format.raw/*5.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/admin/*6.59*/.routes.Assets.at("admin/scss/admin.css")),format.raw/*6.100*/("""">

        <!-- Load in any custom stylesheets -->
        """),_display_(/*9.10*/stylesheets),format.raw/*9.21*/("""
    """),format.raw/*10.5*/("""</head>
    <body>

       <div id="wrapper">
           """),_display_(/*14.13*/navigation()),format.raw/*14.25*/("""
           """),format.raw/*15.12*/("""<div id="page-wrapper">
               """),_display_(/*16.17*/generic/*16.24*/.pageHeader(pageHeader)),format.raw/*16.47*/("""
               """),_display_(/*17.17*/content),format.raw/*17.24*/("""
           """),format.raw/*18.12*/("""</div>
       </div>

       <!-- jQuery -->
       <script src=""""),_display_(/*22.22*/admin/*22.27*/.routes.Assets.at("jquery/jquery.min.js")),format.raw/*22.68*/(""""></script>

       <!-- Bootstrap Core JavaScript -->
       <script src=""""),_display_(/*25.22*/admin/*25.27*/.routes.Assets.at("bootstrap/js/bootstrap.min.js")),format.raw/*25.77*/(""""></script>

       <!-- Metis Menu Plugin JavaScript -->
       <script src=""""),_display_(/*28.22*/admin/*28.27*/.routes.Assets.at("metisMenu/metisMenu.min.js")),format.raw/*28.74*/(""""></script>

       """),_display_(/*30.9*/scripts),format.raw/*30.16*/("""

        """),format.raw/*32.9*/("""<!-- Custom Theme JavaScript -->
       <script src=""""),_display_(/*33.22*/admin/*33.27*/.routes.Assets.at("admin/javascripts/layout.js")),format.raw/*33.75*/(""""></script>

    </body>
</html>"""))
      }
    }
  }

  def render(title:String,pageHeader:String,scripts:Html,stylesheets:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,pageHeader,scripts,stylesheets)(content)

  def f:((String,String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,pageHeader,scripts,stylesheets) => (content) => apply(title,pageHeader,scripts,stylesheets)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/aMain.scala.html
                  HASH: ded67aa83371fb8ed4a273c13963057bcf80188b
                  MATRIX: 751->1|930->85|960->89|1032->135|1057->140|1146->203|1159->208|1221->249|1311->313|1342->324|1375->330|1464->392|1497->404|1538->417|1606->458|1622->465|1666->488|1711->506|1739->513|1780->526|1877->596|1891->601|1953->642|2059->721|2073->726|2144->776|2253->858|2267->863|2335->910|2384->933|2412->940|2451->952|2533->1007|2547->1012|2616->1060
                  LINES: 21->1|26->1|28->3|30->5|30->5|31->6|31->6|31->6|34->9|34->9|35->10|39->14|39->14|40->15|41->16|41->16|41->16|42->17|42->17|43->18|47->22|47->22|47->22|50->25|50->25|50->25|53->28|53->28|53->28|55->30|55->30|57->32|58->33|58->33|58->33
                  -- GENERATED --
              */
          