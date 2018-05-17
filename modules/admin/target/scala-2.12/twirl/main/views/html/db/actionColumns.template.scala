
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

object actionColumns extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Option[reactivemongo.bson.BSONObjectID],Option[Int],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(collName: String, oId: Option[reactivemongo.bson.BSONObjectID])(oActiveTabIdx: Option[Int]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.94*/("""


"""),format.raw/*5.1*/("""<td class="text-center"><a href=""""),_display_(/*5.35*/admin/*5.40*/.db.routes.IndexC.index(collName, "u", oId, oActiveTabIdx)),format.raw/*5.98*/(""""><i class="fa fa-pencil-square-o"></i></a></td>
<td class="text-center"><a href=""""),_display_(/*6.35*/admin/*6.40*/.db.routes.IndexC.deleteDoc(collName, oId, oActiveTabIdx)),format.raw/*6.97*/(""""><i class="fa fa-trash-o"></i></a></td>"""))
      }
    }
  }

  def render(collName:String,oId:Option[reactivemongo.bson.BSONObjectID],oActiveTabIdx:Option[Int]): play.twirl.api.HtmlFormat.Appendable = apply(collName,oId)(oActiveTabIdx)

  def f:((String,Option[reactivemongo.bson.BSONObjectID]) => (Option[Int]) => play.twirl.api.HtmlFormat.Appendable) = (collName,oId) => (oActiveTabIdx) => apply(collName,oId)(oActiveTabIdx)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu May 17 12:30:50 BST 2018
                  SOURCE: C:/Users/sambo/scala/play/project-b26.2/modules/admin/app/views/db/actionColumns.scala.html
                  HASH: 18f7b3ca6be051146d6615f5f8a0debfea013869
                  MATRIX: 435->1|815->19|1002->111|1034->117|1094->151|1107->156|1185->214|1295->298|1308->303|1385->360
                  LINES: 17->1|22->2|27->2|30->5|30->5|30->5|30->5|31->6|31->6|31->6
                  -- GENERATED --
              */
          