package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>About</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.nivo.slider.pack.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/CabinSketch_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/EB_Garamond_400.font.js\"></script>\n");
      out.write("<!-- [if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".bg {behavior:url(js/PIE.htc)}\n");
      out.write("</style>\n");
      out.write("<![endif]-->\n");
      out.write("<!-- [if lt IE 7]>\n");
      out.write("<div style='clear:both;text-align:center;position:relative'>\n");
      out.write("\t<a href=\"http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode\"><img src=\"http://www.theie6countdown.com/images/upgrade.jpg\" border=\"0\" alt=\"\" /></a>\n");
      out.write("</div>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page1\">\n");
      out.write("<div class=\"main\">\n");
      out.write("<!-- header -->\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t\t\t<li id=\"menu_active\"><a href=\"index.jsp\"><span>H</span>ome</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Adminlogin.jsp\"><span>A</span>dmin</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"UploadLogin.jsp\"><span>U</span>pload</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Privacy.html\"><span>D</span>ownload</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Contacts.html\"><span>C</span>ontacts</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<h1><a href=\"index.html\" id=\"logo\">deduplication </a></h1>\n");
      out.write("\t</header><div class=\"ic\">More Website Templates at TemplateMonster.com!</div>\n");
      out.write("<!-- / header -->\n");
      out.write("<!-- content -->\n");
      out.write("\t<section id=\"content\">\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<article class=\"col1\">\n");
      out.write("\t\t\t\t<h2>About Us</h2>\n");
      out.write("\t\t\t\t<div class=\"pad_left1 pad_bot1\">\n");
      out.write("\t\t\t\t\t<div id=\"slider\">\n");
      out.write("\t\t\t\t\t\t<div id=\"for_img\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"nivo_slider\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/img1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/img2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/img3.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/img4.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/img5.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pad\">\n");
      out.write("\t\t\t\t\t\t<p><strong>Design Studio</strong> Template is one of <a href=\"http://blog.templatemonster.com/free-website-templates/\" target=\"_blank\">free website templates</a> created by TemplateMonster.com team. This website template is optimized for 1024X768 screen resolution. It is also XHTML &amp; CSS valid.</p>\n");
      out.write("\t\t\t\t\t\t<p>This <a href=\"http://blog.templatemonster.com/2011/04/04/free-website-template-web-design-studio/\" target=\"_blank\">Free Design Studio Website Template</a> goes with two packages – with PSD source files and without them. PSD source files are available for free for the registered members of Templates.com. The basic package (without PSD source is available for anyone without registration).</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<h2><span>Our Solutions</span></h2>\n");
      out.write("\t\t\t\t<div class=\"pad_left1\">\n");
      out.write("\t\t\t\t\t<div class=\"pad_left1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper pad_top1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure class=\"left marg_right1\"><img src=\"images/page1_img3.png\" alt=\"\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"cols\"><strong class=\"font1\">Development</strong><br>Error sit voluptatem accus antium doloremque laiantium totam rem aperiam, eaque tecto beatae.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col3 pad_left2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure class=\"left marg_right1\"><img src=\"images/page1_img5.png\" alt=\"\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"cols\"><strong class=\"font1\">Creative Design</strong><br>Eorporis suscipit laboriosam, nisi ut aliquid ex ea commodi eum iure reprehenderit qui in ea voluptate.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure class=\"left marg_right1\"><img src=\"images/page1_img4.png\" alt=\"\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cols\"><strong class=\"font1\">Planning</strong><br>Eius modi tempora incidunt aliquam quaerat enim ad minima veniam, quis nostrum exercitationem ullam.</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col3 pad_left2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure class=\"left marg_right1\"><img src=\"images/page1_img6.png\" alt=\"\"></figure>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cols\"><strong class=\"font1\">Effective Strategies</strong><br>Velit esse quam nihil molestiae consequatur, vel illumqui dolorem eum fugiat voluptas laiantium totam rem.</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("    \t\t</article>\n");
      out.write("\t\t\t<article class=\"col2\">\n");
      out.write("\t\t\t\t<h3>Latest Works</h3>\n");
      out.write("\t\t\t\t<ul class=\"ul_works\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/page1_img1.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/page1_img2.png\" alt=\"\"></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<h4>Recent Tweets</h4>\n");
      out.write("\t\t\t\t<div class=\"tweets\">\n");
      out.write("\t\t\t\t\t<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem.<br><a href=\"#\">20 days ago</a></p>\n");
      out.write("\t\t\t\t\t<p>Accusantium doloremque laudatium, totam rem aperiam, eaque ipsa.<br><a href=\"#\">36 days ago</a></p>\n");
      out.write("\t\t\t\t\t<p>Nemo enim ipsam voluptatem quia voluptas.<br><a href=\"#\">54 days ago</a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("    \t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("<!-- / content -->\n");
      out.write("<!-- footer -->\n");
      out.write("\t<footer>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t<article class=\"col\">\n");
      out.write("\t\t\t\t<h5>Why Us</h5>\n");
      out.write("\t\t\t\t<ul class=\"list1\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Sedut perspiciatis</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Unde omnis iste</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Natus error sit </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Volupttem accus</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Ntium doloremque </a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article class=\"col pad_left2\">\n");
      out.write("\t\t\t\t<h5>Links</h5>\n");
      out.write("\t\t\t\t<ul class=\"list1\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Audantium, totam</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Remaperiam, eaque</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Ipsa quae abillo</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Inventore veritatis et </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Quasi architecto </a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article class=\"col pad_left2\">\n");
      out.write("\t\t\t\t<h5>Follow Us</h5>\n");
      out.write("\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon1.jpg\" alt=\"\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon2.jpg\" alt=\"\">Stumleupon</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon3.jpg\" alt=\"\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon4.jpg\" alt=\"\">Digg</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><img src=\"images/icon5.jpg\" alt=\"\">RSS Feed</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t<article id=\"newsletter\">\n");
      out.write("\t\t\t\t<h5>Newsletter</h5>\n");
      out.write("\t\t\t\t<form id=\"newsletter_form\">\n");
      out.write("\t\t\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t\t\t<input class=\"input\" type=\"text\" value=\"Enter your email here\" onblur=\"if(this.value=='') this.value='Enter your email here'\" onFocus=\"if(this.value =='Enter your email here' ) this.value=''\" >\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<a href=\"#\" onClick=\"document.getElementById('newsletter_form').submit()\">Subscribe</a>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<article class=\"privacy\">\n");
      out.write("\t\t\t<a rel=\"nofollow\" href=\"http://www.templatemonster.com/\">Website template</a> designed by TemplateMonster.com<br><a href=\"http://www.templates.com/product/3d-models/\">3D Models</a> provided by Templates.com\n");
      out.write("\t\t</article>\n");
      out.write("\t\t<a href=\"index.html\" class=\"footer_logo\">Design<span>Studio</span>.com</a>\n");
      out.write("\t</footer>\n");
      out.write("<!-- / footer -->\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(window).load(function() {\n");
      out.write("\t$('#nivo_slider').nivoSlider({\n");
      out.write("\t\teffect:'fold', //Specify sets like: 'fold,fade,sliceDown, sliceDownLeft, sliceUp, sliceUpLeft, sliceUpDown, sliceUpDownLeft'\n");
      out.write("\t\tslices:7,\n");
      out.write("\t\tanimSpeed:500,\n");
      out.write("\t\tpauseTime:6000,\n");
      out.write("\t\tstartSlide:0, //Set starting Slide (0 index)\n");
      out.write("\t\tdirectionNav:true, //Next & Prev\n");
      out.write("\t\tdirectionNavHide:false, //Only show on hover\n");
      out.write("\t\tcontrolNav:true, //1,2,3...\n");
      out.write("\t\tcontrolNavThumbs:false, //Use thumbnails for Control Nav\n");
      out.write("\t\tcontrolNavThumbsFromRel:false, //Use image rel for thumbs\n");
      out.write("\t\tcontrolNavThumbsSearch: '.jpg', //Replace this with...\n");
      out.write("\t\tcontrolNavThumbsReplace: '_thumb.jpg', //...this in thumb Image src\n");
      out.write("\t\tkeyboardNav:true, //Use left & right arrows\n");
      out.write("\t\tpauseOnHover:true, //Stop animation while hovering\n");
      out.write("\t\tmanualAdvance:false, //Force manual transitions\n");
      out.write("\t\tcaptionOpacity:1, //Universal caption opacity\n");
      out.write("\t\tbeforeChange:function(){},\n");
      out.write("\t\tafterChange:function(){},\n");
      out.write("\t\tslideshowEnd:function(){} //Triggers after all slides have been shown\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
