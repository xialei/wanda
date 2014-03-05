
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
object articles extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[models.Article],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(articles: List[models.Article], activeSort: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to wanda.com")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

<div class="container">
  	<ol class="breadcrumb">
  	<li><a href=""""),_display_(Seq[Any](/*7.18*/routes/*7.24*/.Application.index)),format.raw/*7.42*/("""">Home</a></li>
  	<li><a href=""""),_display_(Seq[Any](/*8.18*/routes/*8.24*/.UserService.show)),format.raw/*8.41*/("""">Admin Console</a></li>
  	<li class="active">Articles</li>
	</ol>
    <div>

	    <!-- Split button -->
	    <div class="row well">
			<div class="input-group">
				<div class="col-md-4">
					<div class="input-group-btn">
						<button type="button" class="btn btn-default dropdown-toggle" id="category" data-toggle="dropdown">Publisher<span class="caret"></span></button>
						<ul class="dropdown-menu">
							<li><a href="#">Title</a></li>
							<li><a href="#">Industry</a></li>
							<li><a href="#">Publisher</a></li>
						</ul>
						<input type="text" class="form-control" id="searchbox" value="" placeholder="Filter by computer name...">
						<a class="btn btn-primary" id="searchsubmit" href=""""),_display_(Seq[Any](/*25.59*/routes/*25.65*/.Articles.showCreationForm)),format.raw/*25.91*/(""""><i class="icon-search icon-white"></i>Search</a>
					</div>
				</div>
				<div class="col-md-8">
			    	<a class="btn btn-success pull-right" id="add" href=""""),_display_(Seq[Any](/*29.63*/routes/*29.69*/.Articles.showCreationForm)),format.raw/*29.95*/(""""><i class="icon-plus-sign icon-white"></i>Add a new article</a>
			    </div>
			</div>
		</div>
		    
      	<div id="sort">
        	<span>"""),_display_(Seq[Any](/*35.17*/Messages("label.sort"))),format.raw/*35.39*/(""" <i class="icon-sort icon-white"></i> </span>
	        <ul class="nav nav-pills">
	          <li """),_display_(Seq[Any](/*37.17*/if(activeSort == "title")/*37.42*/{_display_(Seq[Any](format.raw/*37.43*/("""class="active"""")))})),format.raw/*37.58*/("""><a href=""""),_display_(Seq[Any](/*37.69*/routes/*37.75*/.Articles.index)),format.raw/*37.90*/("""?sort=title"><i class="icon-sort-up icon-white"></i>title</a></li>
	          <li """),_display_(Seq[Any](/*38.17*/if(activeSort == "-title")/*38.43*/{_display_(Seq[Any](format.raw/*38.44*/("""class="active"""")))})),format.raw/*38.59*/("""><a href=""""),_display_(Seq[Any](/*38.70*/routes/*38.76*/.Articles.index)),format.raw/*38.91*/("""?sort=-title"><i class="icon-sort-down icon-white"></i>title</a></li>
	          <li """),_display_(Seq[Any](/*39.17*/if(activeSort == "publisher")/*39.46*/{_display_(Seq[Any](format.raw/*39.47*/("""class="active"""")))})),format.raw/*39.62*/("""><a href=""""),_display_(Seq[Any](/*39.73*/routes/*39.79*/.Articles.index)),format.raw/*39.94*/("""?sort=publisher"><i class="icon-sort-up icon-white"></i>publisher</a></li>
	          <li """),_display_(Seq[Any](/*40.17*/if(activeSort == "-publisher")/*40.47*/{_display_(Seq[Any](format.raw/*40.48*/("""class="active"""")))})),format.raw/*40.63*/("""><a href=""""),_display_(Seq[Any](/*40.74*/routes/*40.80*/.Articles.index)),format.raw/*40.95*/("""?sort=-publisher"><i class="icon-sort-down icon-white"></i>publisher</a></li>
	          <li """),_display_(Seq[Any](/*41.17*/if(activeSort == "creationDate")/*41.49*/{_display_(Seq[Any](format.raw/*41.50*/("""class="active"""")))})),format.raw/*41.65*/("""><a href=""""),_display_(Seq[Any](/*41.76*/routes/*41.82*/.Articles.index)),format.raw/*41.97*/("""?sort=creationDate"><i class="icon-sort-up icon-white"></i>pubdate</a></li>
	          <li """),_display_(Seq[Any](/*42.17*/if(activeSort == "-creationDate")/*42.50*/{_display_(Seq[Any](format.raw/*42.51*/("""class="active"""")))})),format.raw/*42.66*/("""><a href=""""),_display_(Seq[Any](/*42.77*/routes/*42.83*/.Articles.index)),format.raw/*42.98*/("""?sort=-creationDate"><i class="icon-sort-down icon-white"></i>pubdate</a></li>
	          <li """),_display_(Seq[Any](/*43.17*/if(activeSort == "none")/*43.41*/{_display_(Seq[Any](format.raw/*43.42*/("""class="active"""")))})),format.raw/*43.57*/("""><a href=""""),_display_(Seq[Any](/*43.68*/routes/*43.74*/.Articles.index)),format.raw/*43.89*/("""">none</a></li>
	        </ul>
      	</div>
      	
      	<br>
      	<div>
		    """),_display_(Seq[Any](/*49.8*/if(articles.isEmpty)/*49.28*/ {_display_(Seq[Any](format.raw/*49.30*/("""
		        <p>No articles available yet.</p>
		    """)))}/*51.9*/else/*51.14*/{_display_(Seq[Any](format.raw/*51.15*/("""
		     	<ul>
				     """),_display_(Seq[Any](/*53.11*/articles/*53.19*/.map/*53.23*/ { article =>_display_(Seq[Any](format.raw/*53.36*/("""
				       <li><a href=""""),_display_(Seq[Any](/*54.26*/routes/*54.32*/.Articles.showEditForm(article.id))),format.raw/*54.66*/("""">"""),_display_(Seq[Any](/*54.69*/article/*54.76*/.title)),format.raw/*54.82*/("""</a> <em> by """),_display_(Seq[Any](/*54.96*/article/*54.103*/.pub)),format.raw/*54.107*/(""" </em> (last modified : """),_display_(Seq[Any](/*54.132*/article/*54.139*/.pdt)),format.raw/*54.143*/(""") - <a href=""""),_display_(Seq[Any](/*54.157*/routes/*54.163*/.Articles.delete(article.id))),format.raw/*54.191*/("""" class="delete">delete</a></li>
				     """)))})),format.raw/*55.11*/("""
		     	</ul>
		     	
		     	<ul class="pagination">
				<li class="disabled"><a href="#">&laquo;</a></li>
				<li class="active"><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">&raquo;</a></li>
				</ul>
		    """)))})),format.raw/*65.8*/("""
			
		</div>
    </div>

</div>
""")))})))}
    }
    
    def render(articles:List[models.Article],activeSort:String): play.api.templates.HtmlFormat.Appendable = apply(articles,activeSort)
    
    def f:((List[models.Article],String) => play.api.templates.HtmlFormat.Appendable) = (articles,activeSort) => apply(articles,activeSort)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 02 19:31:15 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/articles.scala.html
                    HASH: 0a585ca9d44cc33bc9c81a7ca46cc68e29765324
                    MATRIX: 798->1|944->53|981->56|1017->84|1056->86|1161->156|1175->162|1214->180|1282->213|1296->219|1334->236|2082->948|2097->954|2145->980|2344->1143|2359->1149|2407->1175|2587->1319|2631->1341|2765->1439|2799->1464|2838->1465|2885->1480|2932->1491|2947->1497|2984->1512|3103->1595|3138->1621|3177->1622|3224->1637|3271->1648|3286->1654|3323->1669|3445->1755|3483->1784|3522->1785|3569->1800|3616->1811|3631->1817|3668->1832|3795->1923|3834->1953|3873->1954|3920->1969|3967->1980|3982->1986|4019->2001|4149->2095|4190->2127|4229->2128|4276->2143|4323->2154|4338->2160|4375->2175|4503->2267|4545->2300|4584->2301|4631->2316|4678->2327|4693->2333|4730->2348|4861->2443|4894->2467|4933->2468|4980->2483|5027->2494|5042->2500|5079->2515|5199->2600|5228->2620|5268->2622|5338->2675|5351->2680|5390->2681|5450->2705|5467->2713|5480->2717|5531->2730|5593->2756|5608->2762|5664->2796|5703->2799|5719->2806|5747->2812|5797->2826|5814->2833|5841->2837|5903->2862|5920->2869|5947->2873|5998->2887|6014->2893|6065->2921|6140->2964|6443->3236
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|53->25|53->25|53->25|57->29|57->29|57->29|63->35|63->35|65->37|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|68->40|69->41|69->41|69->41|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|71->43|77->49|77->49|77->49|79->51|79->51|79->51|81->53|81->53|81->53|81->53|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|82->54|83->55|93->65
                    -- GENERATED --
                */
            