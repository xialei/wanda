
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
object wysiwyg extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/(""" 

<link href=""""),_display_(Seq[Any](/*3.14*/routes/*3.20*/.Assets.at("google-code-prettify/prettify.css"))),format.raw/*3.67*/("""" rel="stylesheet">
<link href=""""),_display_(Seq[Any](/*4.14*/routes/*4.20*/.Assets.at("bootstrap-wysiwyg/css/bootstrap-wysiwyg.css"))),format.raw/*4.77*/("""" rel="stylesheet">

  <div>
	<div id="alerts"></div>
    <div class="btn-toolbar" data-role="editor-toolbar" data-target="#editor">
      <div class="btn-group">
        <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font"><i class="icon-font"></i><b class="caret"></b></a>
          <ul class="dropdown-menu">
          </ul>
      </div>
      <div class="btn-group">
        <a class="btn dropdown-toggle" data-toggle="dropdown" title="Font Size"><i class="icon-text-height"></i>&nbsp;<b class="caret"></b></a>
          <ul class="dropdown-menu">
          <li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
          <li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
          <li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
          </ul>
      </div>
      <div class="btn-group">
        <a class="btn" data-edit="bold" title="Bold (Ctrl/Cmd+B)"><i class="icon-bold"></i></a>
        <a class="btn" data-edit="italic" title="Italic (Ctrl/Cmd+I)"><i class="icon-italic"></i></a>
        <a class="btn" data-edit="strikethrough" title="Strikethrough"><i class="icon-strikethrough"></i></a>
        <a class="btn" data-edit="underline" title="Underline (Ctrl/Cmd+U)"><i class="icon-underline"></i></a>
      </div>
      <div class="btn-group">
        <a class="btn" data-edit="insertunorderedlist" title="Bullet list"><i class="icon-list-ul"></i></a>
        <a class="btn" data-edit="insertorderedlist" title="Number list"><i class="icon-list-ol"></i></a>
        <a class="btn" data-edit="outdent" title="Reduce indent (Shift+Tab)"><i class="icon-indent-left"></i></a>
        <a class="btn" data-edit="indent" title="Indent (Tab)"><i class="icon-indent-right"></i></a>
      </div>
      <div class="btn-group">
        <a class="btn" data-edit="justifyleft" title="Align Left (Ctrl/Cmd+L)"><i class="icon-align-left"></i></a>
        <a class="btn" data-edit="justifycenter" title="Center (Ctrl/Cmd+E)"><i class="icon-align-center"></i></a>
        <a class="btn" data-edit="justifyright" title="Align Right (Ctrl/Cmd+R)"><i class="icon-align-right"></i></a>
        <a class="btn" data-edit="justifyfull" title="Justify (Ctrl/Cmd+J)"><i class="icon-align-justify"></i></a>
      </div>
      <div class="btn-group">
		  <a class="btn dropdown-toggle" data-toggle="dropdown" title="Hyperlink"><i class="icon-link"></i></a>
		    <div class="dropdown-menu input-append">
			    <input class="span2" placeholder="URL" type="text" data-edit="createLink"/>
			    <button class="btn" type="button">Add</button>
        </div>
        <a class="btn" data-edit="unlink" title="Remove Hyperlink"><i class="icon-cut"></i></a>
      </div>
      
      <div class="btn-group">
        <a class="btn" title="Insert picture (or just drag & drop)" id="pictureBtn"><i class="icon-picture"></i></a>
        <input type="file" data-role="magic-overlay" data-target="#pictureBtn" data-edit="insertImage"/>
      </div>
      <div class="btn-group">
        <a class="btn" data-edit="undo" title="Undo (Ctrl/Cmd+Z)"><i class="icon-undo"></i></a>
        <a class="btn" data-edit="redo" title="Redo (Ctrl/Cmd+Y)"><i class="icon-repeat"></i></a>
      </div>
      <input type="text" data-edit="inserttext" id="voiceBtn" x-webkit-speech="">
    </div>

    <div id="editor" contenteditable="true">
      """),_display_(Seq[Any](/*61.8*/content)),format.raw/*61.15*/("""
    </div>
  </div>
<!-- <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script> -->

<script src=""""),_display_(Seq[Any](/*66.15*/routes/*66.21*/.Assets.at("javascripts/jquery.hotkeys.js"))),format.raw/*66.64*/(""""></script>
<script src=""""),_display_(Seq[Any](/*67.15*/routes/*67.21*/.Assets.at("bootstrap-wysiwyg/js/bootstrap-wysiwyg.js"))),format.raw/*67.76*/(""""></script>
<script>
  $(function()"""),format.raw/*69.15*/("""{"""),format.raw/*69.16*/("""
    function initToolbarBootstrapBindings() """),format.raw/*70.45*/("""{"""),format.raw/*70.46*/("""
      var fonts = ['Serif', 'Sans', 'Arial', 'Arial Black', 'Courier', 
            'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact', 'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
            'Times New Roman', 'Verdana'],
            fontTarget = $('[title=Font]').siblings('.dropdown-menu');
      $.each(fonts, function (idx, fontName) """),format.raw/*75.46*/("""{"""),format.raw/*75.47*/("""
          fontTarget.append($('<li><a data-edit="fontName ' + fontName +'" style="font-family:\''+ fontName +'\'">'+fontName + '</a></li>'));
      """),format.raw/*77.7*/("""}"""),format.raw/*77.8*/(""");
      $('a[title]').tooltip("""),format.raw/*78.29*/("""{"""),format.raw/*78.30*/("""container:'body'"""),format.raw/*78.46*/("""}"""),format.raw/*78.47*/(""");
    	$('.dropdown-menu input').click(function() """),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""return false;"""),format.raw/*79.63*/("""}"""),format.raw/*79.64*/(""")
		    .change(function () """),format.raw/*80.27*/("""{"""),format.raw/*80.28*/("""$(this).parent('.dropdown-menu').siblings('.dropdown-toggle').dropdown('toggle');"""),format.raw/*80.109*/("""}"""),format.raw/*80.110*/(""")
        .keydown('esc', function () """),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""this.value='';$(this).change();"""),format.raw/*81.69*/("""}"""),format.raw/*81.70*/(""");

      $('[data-role=magic-overlay]').each(function () """),format.raw/*83.55*/("""{"""),format.raw/*83.56*/(""" 
        var overlay = $(this), target = $(overlay.data('target')); 
        overlay.css('opacity', 0).css('position', 'absolute').offset(target.offset()).width(target.outerWidth()).height(target.outerHeight());
      """),format.raw/*86.7*/("""}"""),format.raw/*86.8*/(""");
      if ("onwebkitspeechchange"  in document.createElement("input")) """),format.raw/*87.71*/("""{"""),format.raw/*87.72*/("""
        var editorOffset = $('#editor').offset();
        $('#voiceBtn').css('position','absolute').offset("""),format.raw/*89.58*/("""{"""),format.raw/*89.59*/("""top: editorOffset.top, left: editorOffset.left+$('#editor').innerWidth()-35"""),format.raw/*89.134*/("""}"""),format.raw/*89.135*/(""");
      """),format.raw/*90.7*/("""}"""),format.raw/*90.8*/(""" else """),format.raw/*90.14*/("""{"""),format.raw/*90.15*/("""
        $('#voiceBtn').hide();
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
	"""),format.raw/*93.2*/("""}"""),format.raw/*93.3*/(""";
	
	function showErrorAlert (reason, detail) """),format.raw/*95.43*/("""{"""),format.raw/*95.44*/("""
		var msg='';
		if (reason==='unsupported-file-type') """),format.raw/*97.41*/("""{"""),format.raw/*97.42*/(""" msg = "Unsupported format " +detail; """),format.raw/*97.80*/("""}"""),format.raw/*97.81*/("""
		else """),format.raw/*98.8*/("""{"""),format.raw/*98.9*/("""
			console.log("error uploading file", reason, detail);
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/("""
		$('<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>'+ 
		 '<strong>File upload error</strong> '+msg+' </div>').prependTo('#alerts');
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/(""";
	
    initToolbarBootstrapBindings(); 
	$('#editor').wysiwyg("""),format.raw/*106.23*/("""{"""),format.raw/*106.24*/(""" fileUploadError: showErrorAlert"""),format.raw/*106.56*/("""}"""),format.raw/*106.57*/(""" );
	window.prettyPrint && prettyPrint();
  """),format.raw/*108.3*/("""}"""),format.raw/*108.4*/(""");
</script>

"""))}
    }
    
    def render(content:String): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 05 21:12:44 CST 2014
                    SOURCE: /Users/roger/workspace/poc/wanda/app/views/wysiwyg.scala.html
                    HASH: e4ff570b728a86a5182500d06c1d321ecdb97e9e
                    MATRIX: 776->1|887->18|938->34|952->40|1020->87|1088->120|1102->126|1180->183|4580->3548|4609->3555|4765->3675|4780->3681|4845->3724|4907->3750|4922->3756|4999->3811|5062->3846|5091->3847|5164->3892|5193->3893|5571->4243|5600->4244|5776->4393|5804->4394|5863->4425|5892->4426|5936->4442|5965->4443|6044->4494|6073->4495|6114->4508|6143->4509|6199->4537|6228->4538|6338->4619|6368->4620|6434->4658|6463->4659|6522->4690|6551->4691|6637->4749|6666->4750|6912->4969|6940->4970|7041->5043|7070->5044|7206->5152|7235->5153|7339->5228|7369->5229|7405->5238|7433->5239|7467->5245|7496->5246|7561->5284|7589->5285|7618->5287|7646->5288|7720->5334|7749->5335|7832->5390|7861->5391|7927->5429|7956->5430|7991->5438|8019->5439|8106->5498|8135->5499|8345->5681|8374->5682|8466->5745|8496->5746|8557->5778|8587->5779|8659->5823|8688->5824
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|89->61|89->61|94->66|94->66|94->66|95->67|95->67|95->67|97->69|97->69|98->70|98->70|103->75|103->75|105->77|105->77|106->78|106->78|106->78|106->78|107->79|107->79|107->79|107->79|108->80|108->80|108->80|108->80|109->81|109->81|109->81|109->81|111->83|111->83|114->86|114->86|115->87|115->87|117->89|117->89|117->89|117->89|118->90|118->90|118->90|118->90|120->92|120->92|121->93|121->93|123->95|123->95|125->97|125->97|125->97|125->97|126->98|126->98|128->100|128->100|131->103|131->103|134->106|134->106|134->106|134->106|136->108|136->108
                    -- GENERATED --
                */
            