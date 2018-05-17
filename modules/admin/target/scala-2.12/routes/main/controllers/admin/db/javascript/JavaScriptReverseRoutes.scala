
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 12:08:49 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._
import _root_.services.CustomBinders._
import _root_.reactivemongo.bson.BSONObjectID

// @LINE:6
package controllers.admin.db.javascript {

  // @LINE:11
  class ReverseWidgets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.Widgets.index",
      """
        function(collName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.1/r/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0))})
        }
      """
    )
  
    // @LINE:16
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.Widgets.delete",
      """
        function(collName0,oId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.1/d/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId1)])})
        }
      """
    )
  
    // @LINE:15
    def updateFromRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.Widgets.updateFromRequest",
      """
        function(collName0,oId1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.1/u/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId1)])})
        }
      """
    )
  
    // @LINE:12
    def read: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.Widgets.read",
      """
        function(collName0,oId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.1/r/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId1)])})
        }
      """
    )
  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.Widgets.create",
      """
        function(collName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/1.1/c/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseIndexC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def deleteDoc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.IndexC.deleteDoc",
      """
        function(collName0,oId1,oActiveTabIdx2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "db/deleteDoc/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId1), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].javascriptUnbind + """)("oActiveTabIdx", oActiveTabIdx2)])})
        }
      """
    )
  
    // @LINE:7
    def submitForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.IndexC.submitForm",
      """
        function(queryType0,collName1,oId2,oUpdatedDoc3,oActiveTabIdx4) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "db/submitForm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("queryType", queryType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId2), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("oUpdatedDoc", oUpdatedDoc3), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].javascriptUnbind + """)("oActiveTabIdx", oActiveTabIdx4)])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.db.IndexC.index",
      """
        function(collName0,queryType1,oId2,oActiveTabIdx3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "db/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("collName", collName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("queryType", queryType1)) + "/index" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].javascriptUnbind + """)("oId", oId2), (""" + implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].javascriptUnbind + """)("oActiveTabIdx", oActiveTabIdx3)])})
        }
      """
    )
  
  }


}
