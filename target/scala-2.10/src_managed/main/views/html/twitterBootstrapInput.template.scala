
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.4*/("""
<div class="form-group """),_display_(Seq[Any](/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""error""")))})),format.raw/*6.55*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>
    """),_display_(Seq[Any](/*8.6*/elements/*8.14*/.input)),format.raw/*8.20*/("""
    <p class="help-inline">"""),_display_(Seq[Any](/*9.29*/elements/*9.37*/.infos.mkString(", "))),format.raw/*9.58*/("""</p>
    """),_display_(Seq[Any](/*10.6*/if(elements.hasErrors)/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
        <p class="help-inline">"""),_display_(Seq[Any](/*11.33*/elements/*11.41*/.errors.mkString(", "))),format.raw/*11.63*/("""</p>
    """)))})),format.raw/*12.6*/("""
</div>"""))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 01 17:05:02 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/twitterBootstrapInput.scala.html
                    HASH: 8865ec5bd58a450fc838da9ffcf0711e2e322580
                    MATRIX: 804->1|930->33|958->96|1018->121|1048->143|1087->145|1124->151|1179->171|1195->179|1219->182|1257->185|1273->193|1300->199|1348->213|1364->221|1391->227|1455->256|1471->264|1513->285|1558->295|1589->317|1629->319|1698->352|1715->360|1759->382|1800->392
                    LINES: 26->1|29->1|31->5|32->6|32->6|32->6|32->6|33->7|33->7|33->7|33->7|33->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12
                    -- GENERATED --
                */
            