// @SOURCE:/Users/roger/workspace/poc/wanda/conf/routes
// @HASH:e9065bf3464874fb2f20929f2dd5d8aca6e9206d
// @DATE:Sat Mar 01 16:29:22 CST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:10
private[this] lazy val controllers_UserService_register4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:11
private[this] lazy val controllers_UserService_createuser5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:12
private[this] lazy val controllers_UserService_show6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:14
private[this] lazy val controllers_Articles_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles"))))
        

// @LINE:15
private[this] lazy val controllers_Articles_showCreationForm8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/new"))))
        

// @LINE:16
private[this] lazy val controllers_Articles_create9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/new"))))
        

// @LINE:17
private[this] lazy val controllers_Articles_showEditForm10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_Articles_edit11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Articles_delete12 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("articles/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.UserService.register"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.UserService.createuser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.UserService.show"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles""","""controllers.Articles.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/new""","""controllers.Articles.showCreationForm"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/new""","""controllers.Articles.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""","""controllers.Articles.showEditForm(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""","""controllers.Articles.edit(id:String)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """articles/$id<[^/]+>""","""controllers.Articles.delete(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate, HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout, HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:10
case controllers_UserService_register4(params) => {
   call { 
        invokeHandler(controllers.UserService.register, HandlerDef(this, "controllers.UserService", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:11
case controllers_UserService_createuser5(params) => {
   call { 
        invokeHandler(controllers.UserService.createuser, HandlerDef(this, "controllers.UserService", "createuser", Nil,"POST", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:12
case controllers_UserService_show6(params) => {
   call { 
        invokeHandler(controllers.UserService.show, HandlerDef(this, "controllers.UserService", "show", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:14
case controllers_Articles_index7(params) => {
   call { 
        invokeHandler(controllers.Articles.index, HandlerDef(this, "controllers.Articles", "index", Nil,"GET", """""", Routes.prefix + """articles"""))
   }
}
        

// @LINE:15
case controllers_Articles_showCreationForm8(params) => {
   call { 
        invokeHandler(controllers.Articles.showCreationForm, HandlerDef(this, "controllers.Articles", "showCreationForm", Nil,"GET", """""", Routes.prefix + """articles/new"""))
   }
}
        

// @LINE:16
case controllers_Articles_create9(params) => {
   call { 
        invokeHandler(controllers.Articles.create, HandlerDef(this, "controllers.Articles", "create", Nil,"POST", """""", Routes.prefix + """articles/new"""))
   }
}
        

// @LINE:17
case controllers_Articles_showEditForm10(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Articles.showEditForm(id), HandlerDef(this, "controllers.Articles", "showEditForm", Seq(classOf[String]),"GET", """""", Routes.prefix + """articles/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_Articles_edit11(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Articles.edit(id), HandlerDef(this, "controllers.Articles", "edit", Seq(classOf[String]),"POST", """""", Routes.prefix + """articles/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Articles_delete12(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Articles.delete(id), HandlerDef(this, "controllers.Articles", "delete", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """articles/$id<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     