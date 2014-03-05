
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginform: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.38*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Welcome to Wanda.com")/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

<div class="container" id="loginModal">
	<div class="modal-header">
		<h3>Login to have fun</h3>
	</div>
	<div class="modal-body">
		<div class="well">
			<div id="myTabContent" class="tab-content">
						
				"""),_display_(Seq[Any](/*15.6*/helper/*15.12*/.form(action = routes.Application.authenticate, 'class -> "form-horizontal")/*15.88*/ {_display_(Seq[Any](format.raw/*15.90*/("""
					<fieldset>
						
						"""),_display_(Seq[Any](/*18.8*/if(loginform.hasGlobalErrors)/*18.37*/ {_display_(Seq[Any](format.raw/*18.39*/("""
							<p class="alert alert-warning">"""),_display_(Seq[Any](/*19.40*/loginform/*19.49*/.globalError.message)),format.raw/*19.69*/("""</p>
						""")))})),format.raw/*20.8*/("""
						"""),_display_(Seq[Any](/*21.8*/if(flash.contains("success"))/*21.37*/ {_display_(Seq[Any](format.raw/*21.39*/("""
							<p class="alert-success">"""),_display_(Seq[Any](/*22.34*/flash/*22.39*/.get("success"))),format.raw/*22.54*/("""</p>
						""")))})),format.raw/*23.8*/("""
						
						<!-- Username -->
						"""),_display_(Seq[Any](/*26.8*/helper/*26.14*/.inputText(loginform("email"), 'type -> "email", 'class->"input-xlarge", '_label -> "Email"))),format.raw/*26.106*/("""

						<!-- Password-->
						"""),_display_(Seq[Any](/*29.8*/helper/*29.14*/.inputPassword(loginform("password"), 'class->"input-xlarge", '_label -> "Password"))),format.raw/*29.98*/("""
						
						<!-- Button -->
						<button class="btn btn-success" type="submit">Login</button>&nbsp; New user? &nbsp;
								<a href=""""),_display_(Seq[Any](/*33.19*/routes/*33.25*/.UserService.register)),format.raw/*33.46*/("""">Register a new account!</a>
					</fieldset>
				""")))})),format.raw/*35.6*/("""
			</div>
		</div>
	</div>

</div>
<!-- /container -->

""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(loginform:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(loginform)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (loginform) => apply(loginform)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 01 21:01:45 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/login.scala.html
                    HASH: 5cb54275f120b1b2676a4f973c8d31f2b2ff24d5
                    MATRIX: 791->1|954->37|983->74|1019->76|1055->104|1094->106|1342->319|1357->325|1442->401|1482->403|1548->434|1586->463|1626->465|1702->505|1720->514|1762->534|1805->546|1848->554|1886->583|1926->585|1996->619|2010->624|2047->639|2090->651|2164->690|2179->696|2294->788|2361->820|2376->826|2482->910|2656->1048|2671->1054|2714->1075|2797->1127|2886->1185
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|43->15|43->15|43->15|43->15|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|54->26|54->26|54->26|57->29|57->29|57->29|61->33|61->33|61->33|63->35|71->43
                    -- GENERATED --
                */
            