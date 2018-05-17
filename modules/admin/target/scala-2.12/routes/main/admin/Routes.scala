
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 18:18:44 BST 2018

package admin

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._
import _root_.services.CustomBinders._
import _root_.reactivemongo.bson.BSONObjectID

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  IndexC_0: controllers.admin.db.IndexC,
  // @LINE:11
  Widgets_1: controllers.admin.db.Widgets,
  // @LINE:19
  Assets_2: controllers.admin.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    IndexC_0: controllers.admin.db.IndexC,
    // @LINE:11
    Widgets_1: controllers.admin.db.Widgets,
    // @LINE:19
    Assets_2: controllers.admin.Assets
  ) = this(errorHandler, IndexC_0, Widgets_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    admin.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, IndexC_0, Widgets_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """db/""" + "$" + """collName<[^/]+>/""" + "$" + """queryType<[^/]+>/index""", """controllers.admin.db.IndexC.index(collName:String, queryType:String, oId:Option[BSONObjectID], oActiveTabIdx:Option[Int])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """db/submitForm/""" + "$" + """queryType<[^/]+>/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.IndexC.submitForm(queryType:String, collName:String, oId:Option[BSONObjectID], oUpdatedDoc:Option[String], oActiveTabIdx:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """db/deleteDoc/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.IndexC.deleteDoc(collName:String, oId:Option[BSONObjectID], oActiveTabIdx:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.1/r/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.Widgets.index(collName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.1/r/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.Widgets.read(collName:String, oId:Option[BSONObjectID])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.1/c/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.Widgets.create(collName:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.1/u/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.Widgets.updateFromRequest(collName:String, oId:Option[BSONObjectID])"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/1.1/d/""" + "$" + """collName<[^/]+>""", """controllers.admin.db.Widgets.delete(collName:String, oId:Option[BSONObjectID])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.admin.Assets.at(path:String = "/public/lib", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_admin_db_IndexC_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("db/"), DynamicPart("collName", """[^/]+""",true), StaticPart("/"), DynamicPart("queryType", """[^/]+""",true), StaticPart("/index")))
  )
  private[this] lazy val controllers_admin_db_IndexC_index0_invoker = createInvoker(
    IndexC_0.index(fakeValue[String], fakeValue[String], fakeValue[Option[BSONObjectID]], fakeValue[Option[Int]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.IndexC",
      "index",
      Seq(classOf[String], classOf[String], classOf[Option[BSONObjectID]], classOf[Option[Int]]),
      "GET",
      this.prefix + """db/""" + "$" + """collName<[^/]+>/""" + "$" + """queryType<[^/]+>/index""",
      """ testing rest API""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_admin_db_IndexC_submitForm1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("db/submitForm/"), DynamicPart("queryType", """[^/]+""",true), StaticPart("/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_IndexC_submitForm1_invoker = createInvoker(
    IndexC_0.submitForm(fakeValue[String], fakeValue[String], fakeValue[Option[BSONObjectID]], fakeValue[Option[String]], fakeValue[Option[Int]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.IndexC",
      "submitForm",
      Seq(classOf[String], classOf[String], classOf[Option[BSONObjectID]], classOf[Option[String]], classOf[Option[Int]]),
      "POST",
      this.prefix + """db/submitForm/""" + "$" + """queryType<[^/]+>/""" + "$" + """collName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_admin_db_IndexC_deleteDoc2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("db/deleteDoc/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_IndexC_deleteDoc2_invoker = createInvoker(
    IndexC_0.deleteDoc(fakeValue[String], fakeValue[Option[BSONObjectID]], fakeValue[Option[Int]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.IndexC",
      "deleteDoc",
      Seq(classOf[String], classOf[Option[BSONObjectID]], classOf[Option[Int]]),
      "GET",
      this.prefix + """db/deleteDoc/""" + "$" + """collName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_admin_db_Widgets_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.1/r/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_Widgets_index3_invoker = createInvoker(
    Widgets_1.index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.Widgets",
      "index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/1.1/r/""" + "$" + """collName<[^/]+>""",
      """ testing API core (CRUD)""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_admin_db_Widgets_read4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.1/r/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_Widgets_read4_invoker = createInvoker(
    Widgets_1.read(fakeValue[String], fakeValue[Option[BSONObjectID]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.Widgets",
      "read",
      Seq(classOf[String], classOf[Option[BSONObjectID]]),
      "GET",
      this.prefix + """api/1.1/r/""" + "$" + """collName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_admin_db_Widgets_create5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.1/c/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_Widgets_create5_invoker = createInvoker(
    Widgets_1.create(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.Widgets",
      "create",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/1.1/c/""" + "$" + """collName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_admin_db_Widgets_updateFromRequest6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.1/u/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_Widgets_updateFromRequest6_invoker = createInvoker(
    Widgets_1.updateFromRequest(fakeValue[String], fakeValue[Option[BSONObjectID]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.Widgets",
      "updateFromRequest",
      Seq(classOf[String], classOf[Option[BSONObjectID]]),
      "PUT",
      this.prefix + """api/1.1/u/""" + "$" + """collName<[^/]+>""",
      """POST       /api/1.1/u/:collName                             controllers.admin.db.Widgets.update(collName: String, oId: Option[BSONObjectID])""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_admin_db_Widgets_delete7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/1.1/d/"), DynamicPart("collName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_admin_db_Widgets_delete7_invoker = createInvoker(
    Widgets_1.delete(fakeValue[String], fakeValue[Option[BSONObjectID]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.db.Widgets",
      "delete",
      Seq(classOf[String], classOf[Option[BSONObjectID]]),
      "DELETE",
      this.prefix + """api/1.1/d/""" + "$" + """collName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_admin_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_admin_Assets_at8_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "admin",
      "controllers.admin.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_admin_db_IndexC_index0_route(params) =>
      call(params.fromPath[String]("collName", None), params.fromPath[String]("queryType", None), params.fromQuery[Option[BSONObjectID]]("oId", None), params.fromQuery[Option[Int]]("oActiveTabIdx", None)) { (collName, queryType, oId, oActiveTabIdx) =>
        controllers_admin_db_IndexC_index0_invoker.call(IndexC_0.index(collName, queryType, oId, oActiveTabIdx))
      }
  
    // @LINE:7
    case controllers_admin_db_IndexC_submitForm1_route(params) =>
      call(params.fromPath[String]("queryType", None), params.fromPath[String]("collName", None), params.fromQuery[Option[BSONObjectID]]("oId", None), params.fromQuery[Option[String]]("oUpdatedDoc", None), params.fromQuery[Option[Int]]("oActiveTabIdx", None)) { (queryType, collName, oId, oUpdatedDoc, oActiveTabIdx) =>
        controllers_admin_db_IndexC_submitForm1_invoker.call(IndexC_0.submitForm(queryType, collName, oId, oUpdatedDoc, oActiveTabIdx))
      }
  
    // @LINE:8
    case controllers_admin_db_IndexC_deleteDoc2_route(params) =>
      call(params.fromPath[String]("collName", None), params.fromQuery[Option[BSONObjectID]]("oId", None), params.fromQuery[Option[Int]]("oActiveTabIdx", None)) { (collName, oId, oActiveTabIdx) =>
        controllers_admin_db_IndexC_deleteDoc2_invoker.call(IndexC_0.deleteDoc(collName, oId, oActiveTabIdx))
      }
  
    // @LINE:11
    case controllers_admin_db_Widgets_index3_route(params) =>
      call(params.fromPath[String]("collName", None)) { (collName) =>
        controllers_admin_db_Widgets_index3_invoker.call(Widgets_1.index(collName))
      }
  
    // @LINE:12
    case controllers_admin_db_Widgets_read4_route(params) =>
      call(params.fromPath[String]("collName", None), params.fromQuery[Option[BSONObjectID]]("oId", None)) { (collName, oId) =>
        controllers_admin_db_Widgets_read4_invoker.call(Widgets_1.read(collName, oId))
      }
  
    // @LINE:13
    case controllers_admin_db_Widgets_create5_route(params) =>
      call(params.fromPath[String]("collName", None)) { (collName) =>
        controllers_admin_db_Widgets_create5_invoker.call(Widgets_1.create(collName))
      }
  
    // @LINE:15
    case controllers_admin_db_Widgets_updateFromRequest6_route(params) =>
      call(params.fromPath[String]("collName", None), params.fromQuery[Option[BSONObjectID]]("oId", None)) { (collName, oId) =>
        controllers_admin_db_Widgets_updateFromRequest6_invoker.call(Widgets_1.updateFromRequest(collName, oId))
      }
  
    // @LINE:16
    case controllers_admin_db_Widgets_delete7_route(params) =>
      call(params.fromPath[String]("collName", None), params.fromQuery[Option[BSONObjectID]]("oId", None)) { (collName, oId) =>
        controllers_admin_db_Widgets_delete7_invoker.call(Widgets_1.delete(collName, oId))
      }
  
    // @LINE:19
    case controllers_admin_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public/lib")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_admin_Assets_at8_invoker.call(Assets_2.at(path, file))
      }
  }
}
