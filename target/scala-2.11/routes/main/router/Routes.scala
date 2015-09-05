
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/workspace_self/note-play/conf/routes
// @DATE:Sat Sep 05 11:58:38 CST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:7
  UserService_0: com.yl.note.controllers.UserService,
  // @LINE:11
  TagService_3: com.yl.note.controllers.TagService,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:7
    UserService_0: com.yl.note.controllers.UserService,
    // @LINE:11
    TagService_3: com.yl.note.controllers.TagService,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, UserService_0, TagService_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, UserService_0, TagService_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """com.yl.note.controllers.UserService.createUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """com.yl.note.controllers.UserService.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """com.yl.note.controllers.UserService.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """com.yl.note.controllers.TagService.addTag()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tags""", """com.yl.note.controllers.TagService.listTags()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val com_yl_note_controllers_UserService_createUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val com_yl_note_controllers_UserService_createUser1_invoker = createInvoker(
    UserService_0.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.yl.note.controllers.UserService",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:8
  private[this] lazy val com_yl_note_controllers_UserService_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val com_yl_note_controllers_UserService_login2_invoker = createInvoker(
    UserService_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.yl.note.controllers.UserService",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val com_yl_note_controllers_UserService_getUserList3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val com_yl_note_controllers_UserService_getUserList3_invoker = createInvoker(
    UserService_0.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.yl.note.controllers.UserService",
      "getUserList",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:11
  private[this] lazy val com_yl_note_controllers_TagService_addTag4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val com_yl_note_controllers_TagService_addTag4_invoker = createInvoker(
    TagService_3.addTag(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.yl.note.controllers.TagService",
      "addTag",
      Nil,
      "POST",
      """""",
      this.prefix + """tag"""
    )
  )

  // @LINE:12
  private[this] lazy val com_yl_note_controllers_TagService_listTags5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tags")))
  )
  private[this] lazy val com_yl_note_controllers_TagService_listTags5_invoker = createInvoker(
    TagService_3.listTags(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.yl.note.controllers.TagService",
      "listTags",
      Nil,
      "GET",
      """""",
      this.prefix + """tags"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:7
    case com_yl_note_controllers_UserService_createUser1_route(params) =>
      call { 
        com_yl_note_controllers_UserService_createUser1_invoker.call(UserService_0.createUser())
      }
  
    // @LINE:8
    case com_yl_note_controllers_UserService_login2_route(params) =>
      call { 
        com_yl_note_controllers_UserService_login2_invoker.call(UserService_0.login())
      }
  
    // @LINE:9
    case com_yl_note_controllers_UserService_getUserList3_route(params) =>
      call { 
        com_yl_note_controllers_UserService_getUserList3_invoker.call(UserService_0.getUserList())
      }
  
    // @LINE:11
    case com_yl_note_controllers_TagService_addTag4_route(params) =>
      call { 
        com_yl_note_controllers_TagService_addTag4_invoker.call(TagService_3.addTag())
      }
  
    // @LINE:12
    case com_yl_note_controllers_TagService_listTags5_route(params) =>
      call { 
        com_yl_note_controllers_TagService_listTags5_invoker.call(TagService_3.listTags())
      }
  
    // @LINE:15
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}