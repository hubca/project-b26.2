
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 18:18:44 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._
import _root_.services.CustomBinders._
import _root_.reactivemongo.bson.BSONObjectID

// @LINE:19
package controllers.admin {

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/lib")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
