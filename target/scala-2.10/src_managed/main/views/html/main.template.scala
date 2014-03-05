
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

<title>"""),_display_(Seq[Any](/*14.9*/Messages("website.title"))),format.raw/*14.34*/("""</title>

<!-- Bootstrap core CSS -->
<link href=""""),_display_(Seq[Any](/*17.14*/routes/*17.20*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*17.61*/("""" rel="stylesheet">
<link href=""""),_display_(Seq[Any](/*18.14*/routes/*18.20*/.Assets.at("bootstrap-dialog/css/bootstrap-dialog.min.css"))),format.raw/*18.79*/("""" rel="stylesheet" type="text/css" />
<!-- from v4.0.0 does not work for editor -->
<link href="http://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href=""""),_display_(Seq[Any](/*23.14*/routes/*23.20*/.Assets.at("stylesheets/main.css"))),format.raw/*23.54*/("""" rel="stylesheet">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*24.51*/routes/*24.57*/.Assets.at("images/favicon.png"))),format.raw/*24.89*/("""">

<!-- <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script> -->
<script src=""""),_display_(Seq[Any](/*27.15*/routes/*27.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*27.60*/(""""></script>

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href=""""),_display_(Seq[Any](/*49.36*/routes/*49.42*/.Application.index)),format.raw/*49.60*/("""">Wanda.com</a>
			</div>
			<form class="navbar-form navbar-left"
				action="http://bootsnipp.com/search" method="GET" id="search-form"
				role="search">
				<div class="form-group">
					<input type="text" class="form-control" name="q"
						placeholder="Search by title or tag">
				</div>
				<button type="submit" class="btn btn-default">
					<span class="glyphicon glyphicon-search"></span>
				</button>
			</form>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					"""),_display_(Seq[Any](/*64.7*/if(session().get("email")!=null)/*64.39*/{_display_(Seq[Any](format.raw/*64.40*/("""
					<li id="nav-login-btn" class=""><a
						href=""""),_display_(Seq[Any](/*66.14*/routes/*66.20*/.UserService.show)),format.raw/*66.37*/(""""><i class="icon-login"></i>"""),_display_(Seq[Any](/*66.66*/{session().get("email")})),format.raw/*66.90*/("""</a></li>
					<li id="nav-logout-btn" class=""><a
						href=""""),_display_(Seq[Any](/*68.14*/routes/*68.20*/.Application.logout())),format.raw/*68.41*/(""""><i class="icon-logout"></i>Logout</a></li>
					""")))}/*69.7*/else/*69.11*/{_display_(Seq[Any](format.raw/*69.12*/("""
					<li id="nav-login-btn" class=""><a
						href=""""),_display_(Seq[Any](/*71.14*/routes/*71.20*/.Application.login)),format.raw/*71.38*/(""""><i class="icon-login"></i>Login</a></li>
					""")))})),format.raw/*72.7*/("""
				</ul>
			</div>
			<!--/.navbar-collapse -->

		</div>
	</div>

	"""),_display_(Seq[Any](/*80.3*/content)),format.raw/*80.10*/("""

	<hr>
	<div class="container">
		<footer>
			<p>&copy; Wanda.com By Rogers Company 2014</p>
		</footer>
	</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	
	<script src=""""),_display_(Seq[Any](/*92.16*/routes/*92.22*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*92.65*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*93.16*/routes/*93.22*/.Assets.at("bootstrap-dialog/js/bootstrap-dialog.min.js"))),format.raw/*93.79*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*94.19*/routes/*94.25*/.Assets.at("javascripts/app.js"))),format.raw/*94.57*/("""" type="text/javascript"></script>
</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 05 21:19:56 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/main.scala.html
                    HASH: 6ac53cdcf22cfb63ec876dde5b572c148ebedfb4
                    MATRIX: 778->1|902->31|1277->371|1324->396|1411->447|1426->453|1489->494|1558->527|1573->533|1654->592|1935->837|1950->843|2006->877|2112->947|2127->953|2181->985|2319->1087|2334->1093|2395->1132|3367->2068|3382->2074|3422->2092|3975->2610|4016->2642|4055->2643|4145->2697|4160->2703|4199->2720|4264->2749|4310->2773|4410->2837|4425->2843|4468->2864|4537->2915|4550->2919|4589->2920|4679->2974|4694->2980|4734->2998|4814->3047|4920->3118|4949->3125|5276->3416|5291->3422|5356->3465|5419->3492|5434->3498|5513->3555|5579->3585|5594->3591|5648->3623
                    LINES: 26->1|29->1|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|51->23|52->24|52->24|52->24|55->27|55->27|55->27|77->49|77->49|77->49|92->64|92->64|92->64|94->66|94->66|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|99->71|99->71|99->71|100->72|108->80|108->80|120->92|120->92|120->92|121->93|121->93|121->93|122->94|122->94|122->94
                    -- GENERATED --
                */
            