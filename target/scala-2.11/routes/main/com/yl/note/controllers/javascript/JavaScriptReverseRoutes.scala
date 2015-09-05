
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/workspace_self/note-play/conf/routes
// @DATE:Sat Sep 05 11:58:38 CST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package com.yl.note.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseUserService(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getUserList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.yl.note.controllers.UserService.getUserList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:7
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.yl.note.controllers.UserService.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.yl.note.controllers.UserService.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseTagService(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listTags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.yl.note.controllers.TagService.listTags",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tags"})
        }
      """
    )
  
    // @LINE:11
    def addTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.yl.note.controllers.TagService.addTag",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag"})
        }
      """
    )
  
  }


}