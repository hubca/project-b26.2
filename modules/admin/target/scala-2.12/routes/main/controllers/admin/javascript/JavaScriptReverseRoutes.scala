
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 12:08:49 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._
import _root_.services.CustomBinders._
import _root_.reactivemongo.bson.BSONObjectID

// @LINE:18
package controllers.admin.javascript {

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.admin.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
