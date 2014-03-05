
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
object user extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.14*/(""" 

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Welcome to Wanda.com")/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

<div class="container">
	<ol class="breadcrumb">
  		<li><a href=""""),_display_(Seq[Any](/*9.19*/routes/*9.25*/.Application.index)),format.raw/*9.43*/("""">Home</a></li>
  		<li class="active">"""),_display_(Seq[Any](/*10.25*/user/*10.29*/.email)),format.raw/*10.35*/("""</li>
	</ol>
	<div class="row-fluid">
		<div class="span12">
			 <p><a class="btn btn-default" href=""""),_display_(Seq[Any](/*14.42*/routes/*14.48*/.Articles.index)),format.raw/*14.63*/("""">"""),_display_(Seq[Any](/*14.66*/Messages("admin.console"))),format.raw/*14.91*/(""" &raquo;</a></p>
			 <p><a class="btn btn-default" href=""""),_display_(Seq[Any](/*15.42*/routes/*15.48*/.Articles.index)),format.raw/*15.63*/("""">"""),_display_(Seq[Any](/*15.66*/Messages("admin.statistic"))),format.raw/*15.93*/(""" &raquo;</a></p>
		</div>
	</div>
</div>
<!-- /container -->

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 01 16:35:43 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/user.scala.html
                    HASH: 4be12d819bdb59faaa8d91cccfe1ce0a6d060b49
                    MATRIX: 771->1|910->13|939->50|975->52|1011->80|1050->82|1154->151|1168->157|1207->175|1283->215|1296->219|1324->225|1462->327|1477->333|1514->348|1553->351|1600->376|1694->434|1709->440|1746->455|1785->458|1834->485|1928->548
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|49->21
                    -- GENERATED --
                */
            