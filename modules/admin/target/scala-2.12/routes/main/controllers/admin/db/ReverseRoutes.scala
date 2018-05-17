
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sambo/scala/play/project-b26.2/modules/admin/conf/admin.routes
// @DATE:Thu May 17 18:18:44 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._
import _root_.services.CustomBinders._
import _root_.reactivemongo.bson.BSONObjectID

// @LINE:6
package controllers.admin.db {

  // @LINE:11
  class ReverseWidgets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index(collName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.1/r/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)))
    }
  
    // @LINE:16
    def delete(collName:String, oId:Option[BSONObjectID]): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/1.1/d/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)))))
    }
  
    // @LINE:15
    def updateFromRequest(collName:String, oId:Option[BSONObjectID]): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/1.1/u/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)))))
    }
  
    // @LINE:12
    def read(collName:String, oId:Option[BSONObjectID]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/1.1/r/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)))))
    }
  
    // @LINE:13
    def create(collName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/1.1/c/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)))
    }
  
  }

  // @LINE:6
  class ReverseIndexC(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def deleteDoc(collName:String, oId:Option[BSONObjectID], oActiveTabIdx:Option[Int]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "db/deleteDoc/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].unbind("oActiveTabIdx", oActiveTabIdx)))))
    }
  
    // @LINE:7
    def submitForm(queryType:String, collName:String, oId:Option[BSONObjectID], oUpdatedDoc:Option[String], oActiveTabIdx:Option[Int]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "db/submitForm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("queryType", queryType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("oUpdatedDoc", oUpdatedDoc)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].unbind("oActiveTabIdx", oActiveTabIdx)))))
    }
  
    // @LINE:6
    def index(collName:String, queryType:String, oId:Option[BSONObjectID], oActiveTabIdx:Option[Int]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "db/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("collName", collName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("queryType", queryType)) + "/index" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[BSONObjectID]]].unbind("oId", oId)), Some(implicitly[play.api.mvc.QueryStringBindable[Option[Int]]].unbind("oActiveTabIdx", oActiveTabIdx)))))
    }
  
  }


}
