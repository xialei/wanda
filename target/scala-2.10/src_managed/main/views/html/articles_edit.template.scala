
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
object articles_edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Article],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: String, form: Form[Article]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("Welcome to Play 2.0")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
<div class="container">
	<ol class="breadcrumb">
  	<li><a href=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.Application.index)),format.raw/*8.42*/("""">Home</a></li>
  	<li><a href=""""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.UserService.show)),format.raw/*9.41*/("""">Admin Console</a></li>
  	<li><a href=""""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Articles.index)),format.raw/*10.39*/("""">Articles</a></li>
 	<li class="active">
 				"""),_display_(Seq[Any](/*12.7*/if(id==null)/*12.19*/ {_display_(Seq[Any](format.raw/*12.21*/("""
      				"""),_display_(Seq[Any](/*13.12*/Messages("action.create"))),format.raw/*13.37*/("""
    			""")))}/*14.10*/else/*14.15*/{_display_(Seq[Any](format.raw/*14.16*/("""
      				"""),_display_(Seq[Any](/*15.12*/Messages("action.edit"))),format.raw/*15.35*/("""
    			""")))})),format.raw/*16.9*/("""
    </li>
	</ol>
  <div class="span8">
    """),_display_(Seq[Any](/*20.6*/if(form.hasGlobalErrors)/*20.30*/ {_display_(Seq[Any](format.raw/*20.32*/("""
		<p class="alert alert-warning">"""),_display_(Seq[Any](/*21.35*/form/*21.39*/.globalError.message)),format.raw/*21.59*/("""</p>
	""")))})),format.raw/*22.3*/("""
	"""),_display_(Seq[Any](/*23.3*/if(flash.contains("success"))/*23.32*/ {_display_(Seq[Any](format.raw/*23.34*/("""
		<p class="alert alert-success">"""),_display_(Seq[Any](/*24.35*/flash/*24.40*/.get("success"))),format.raw/*24.55*/("""</p>
	""")))})),format.raw/*25.3*/("""
  """),_display_(Seq[Any](/*26.4*/helper/*26.10*/.form(action = (if(id==null) routes.Articles.create else routes.Articles.edit(id)), 'class -> "form-horizontal")/*26.122*/ {_display_(Seq[Any](format.raw/*26.124*/("""
  	<fieldset>
	    """),_display_(Seq[Any](/*28.7*/helper/*28.13*/.inputText(form("title"), '_label -> Messages("article.title"), 'class->"input-xlarge"))),format.raw/*28.100*/("""
	    """),_display_(Seq[Any](/*29.7*/helper/*29.13*/.inputText(form("pub"), '_label -> Messages("article.publisher"), 'class->"input-xlarge"))),format.raw/*29.102*/("""
	    """),_display_(Seq[Any](/*30.7*/helper/*30.13*/.inputText(form("pdt"), '_label -> Messages("article.publishtime"), 'class->"input-xlarge"))),format.raw/*30.104*/("""
	    <!-- """),_display_(Seq[Any](/*31.12*/helper/*31.18*/.textarea(form("content"), '_label -> Messages("article.content"), 'cols->50, 'rows->10))),format.raw/*31.106*/(""" -->
	    <div class="clearfix  " id="content_field">
		    <label for="content">"""),_display_(Seq[Any](/*33.29*/Messages("article.content"))),format.raw/*33.56*/("""</label>
		    """),_display_(Seq[Any](/*34.8*/wysiwyg(form("content").value()))),format.raw/*34.40*/("""
		</div>
	    
	    <br>
		<button class="btn btn-primary" type="submit">"""),_display_(Seq[Any](/*38.50*/Messages("action.submit"))),format.raw/*38.75*/("""</button>
	</fieldset>
  """)))})),format.raw/*40.4*/("""
  </div>
</div>
""")))})),format.raw/*43.2*/("""
"""))}
    }
    
    def render(id:String,form:Form[Article]): play.api.templates.HtmlFormat.Appendable = apply(id,form)
    
    def f:((String,Form[Article]) => play.api.templates.HtmlFormat.Appendable) = (id,form) => apply(id,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 05 21:22:41 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/articles_edit.scala.html
                    HASH: bc937af41b58e8d61437091a2bb44f5353724756
                    MATRIX: 796->1|956->34|983->69|1020->72|1055->99|1094->101|1196->168|1210->174|1249->192|1317->225|1331->231|1369->248|1447->290|1462->296|1499->311|1582->359|1603->371|1643->373|1691->385|1738->410|1766->420|1779->425|1818->426|1866->438|1911->461|1951->470|2031->515|2064->539|2104->541|2175->576|2188->580|2230->600|2268->607|2306->610|2344->639|2384->641|2455->676|2469->681|2506->696|2544->703|2583->707|2598->713|2720->825|2761->827|2817->848|2832->854|2942->941|2984->948|2999->954|3111->1043|3153->1050|3168->1056|3282->1147|3330->1159|3345->1165|3456->1253|3574->1335|3623->1362|3674->1378|3728->1410|3839->1485|3886->1510|3943->1536|3992->1554
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|42->14|42->14|42->14|43->15|43->15|44->16|48->20|48->20|48->20|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|54->26|54->26|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|61->33|61->33|62->34|62->34|66->38|66->38|68->40|71->43
                    -- GENERATED --
                */
            