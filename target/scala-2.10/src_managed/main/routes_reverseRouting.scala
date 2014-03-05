// @SOURCE:/Users/roger/workspace/poc/wanda/conf/routes
// @HASH:e9065bf3464874fb2f20929f2dd5d8aca6e9206d
// @DATE:Sat Mar 01 16:29:22 CST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseArticles {
    

// @LINE:18
def edit(id:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:16
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "articles/new")
}
                                                

// @LINE:17
def showEditForm(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:15
def showCreationForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "articles/new")
}
                                                

// @LINE:19
def delete(id:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "articles/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "articles")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserService {
    

// @LINE:12
def show(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:11
def createuser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:10
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseArticles {
    

// @LINE:18
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.edit",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:16
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/new"})
      }
   """
)
                        

// @LINE:17
def showEditForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.showEditForm",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:15
def showCreationForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.showCreationForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/new"})
      }
   """
)
                        

// @LINE:19
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "articles/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Articles.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "articles"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserService {
    

// @LINE:12
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.show",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:11
def createuser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.createuser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:10
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserService.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        
    
}
              

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseArticles {
    

// @LINE:18
def edit(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.edit(id), HandlerDef(this, "controllers.Articles", "edit", Seq(classOf[String]), "POST", """""", _prefix + """articles/$id<[^/]+>""")
)
                      

// @LINE:16
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.create(), HandlerDef(this, "controllers.Articles", "create", Seq(), "POST", """""", _prefix + """articles/new""")
)
                      

// @LINE:17
def showEditForm(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.showEditForm(id), HandlerDef(this, "controllers.Articles", "showEditForm", Seq(classOf[String]), "GET", """""", _prefix + """articles/$id<[^/]+>""")
)
                      

// @LINE:15
def showCreationForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.showCreationForm(), HandlerDef(this, "controllers.Articles", "showCreationForm", Seq(), "GET", """""", _prefix + """articles/new""")
)
                      

// @LINE:19
def delete(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.delete(id), HandlerDef(this, "controllers.Articles", "delete", Seq(classOf[String]), "DELETE", """""", _prefix + """articles/$id<[^/]+>""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Articles.index(), HandlerDef(this, "controllers.Articles", "index", Seq(), "GET", """""", _prefix + """articles""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseUserService {
    

// @LINE:12
def show(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.show(), HandlerDef(this, "controllers.UserService", "show", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:11
def createuser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.createuser(), HandlerDef(this, "controllers.UserService", "createuser", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:10
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserService.register(), HandlerDef(this, "controllers.UserService", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    