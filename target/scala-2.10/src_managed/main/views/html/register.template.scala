
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[UserService.Register],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(regform: Form[UserService.Register]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/(""" 


"""),_display_(Seq[Any](/*4.2*/main("Welcome to Wanda.com")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

<div class="container" id="registerModal">
	<div class="modal-header">
		<h3>Create a new account</h3>
	</div>
	<div class="modal-body">
		<div class="well">
				
			"""),_display_(Seq[Any](/*13.5*/helper/*13.11*/.form(routes.UserService.createuser(), 'class -> "form-horizontal")/*13.78*/ {_display_(Seq[Any](format.raw/*13.80*/("""
			
			<fieldset>
				"""),_display_(Seq[Any](/*16.6*/if(regform.hasGlobalErrors)/*16.33*/ {_display_(Seq[Any](format.raw/*16.35*/("""
					<p class="alert alert-warning">"""),_display_(Seq[Any](/*17.38*/regform/*17.45*/.globalError.message)),format.raw/*17.65*/("""</p>
				""")))})),format.raw/*18.6*/("""
				"""),_display_(Seq[Any](/*19.6*/if(flash.contains("success"))/*19.35*/ {_display_(Seq[Any](format.raw/*19.37*/("""
					<p class="success alert-success">"""),_display_(Seq[Any](/*20.40*/flash/*20.45*/.get("success"))),format.raw/*20.60*/("""</p>
				""")))})),format.raw/*21.6*/("""
				
				"""),_display_(Seq[Any](/*23.6*/helper/*23.12*/.inputText(regform("name"), 'class->"input-xlarge", '_label -> "Username"))),format.raw/*23.86*/("""
				"""),_display_(Seq[Any](/*24.6*/helper/*24.12*/.inputText(regform("email"), 'type -> "email", 'class->"input-xlarge", '_label -> "Email"))),format.raw/*24.102*/("""
				"""),_display_(Seq[Any](/*25.6*/helper/*25.12*/.inputPassword(regform("password"), 'class->"input-xlarge", '_label -> "Password"))),format.raw/*25.94*/("""

				<button class="btn btn-primary" type="submit">Create Account</button>
				
			</fieldset>
			""")))})),format.raw/*30.5*/("""
		</div>
	</div>
</div>

</div>
<!-- /container -->

""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(regform:Form[UserService.Register]): play.api.templates.HtmlFormat.Appendable = apply(regform)
    
    def f:((Form[UserService.Register]) => play.api.templates.HtmlFormat.Appendable) = (regform) => apply(regform)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 01 21:23:59 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/register.scala.html
                    HASH: 2e89988d9a43e5670b9608e092fbee2304c7b8e2
                    MATRIX: 797->1|928->38|967->43|1003->71|1042->73|1246->242|1261->248|1337->315|1377->317|1436->341|1472->368|1512->370|1586->408|1602->415|1644->435|1685->445|1726->451|1764->480|1804->482|1880->522|1894->527|1931->542|1972->552|2018->563|2033->569|2129->643|2170->649|2185->655|2298->745|2339->751|2354->757|2458->839|2589->939|2675->994
                    LINES: 26->1|29->1|32->4|32->4|32->4|41->13|41->13|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|58->30|66->38
                    -- GENERATED --
                */
            