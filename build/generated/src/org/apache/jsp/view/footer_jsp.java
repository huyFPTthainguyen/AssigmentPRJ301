package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    .footer-1 {\n");
      out.write("        background-color: rgba(255, 0, 0, 0.644);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .imgLogo img {\n");
      out.write("        height: 50%;\n");
      out.write("        width: 70%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .join {\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 30px;\n");
      out.write("        color: azure;\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .MU {\n");
      out.write("        color: whitesmoke;\n");
      out.write("        font-size: 14px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .row {\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .link-web li {\n");
      out.write("        width: 40px;\n");
      out.write("        display: inline-block;\n");
      out.write("        color: white;\n");
      out.write("        padding: 10px;\n");
      out.write("        font-size: 20px;\n");
      out.write("        text-align: center;\n");
      out.write("        margin-left: 25px;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        border: 1px solid #fff;\n");
      out.write("        border-radius: 50%;\n");
      out.write("    }\n");
      out.write("    .link-web li:hover{\n");
      out.write("        background-color: red;\n");
      out.write("            color: white;\n");
      out.write("            border: 1px solid white;\n");
      out.write("    }\n");
      out.write("    .link-web a {\n");
      out.write("        color: aliceblue;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .menu-1 {\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 30px;\n");
      out.write("        color: azure;\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .list-menu li {\n");
      out.write("        list-style: none;\n");
      out.write("        font-size: 16px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .list-menu a {\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .contact-us {\n");
      out.write("        text-align: center;\n");
      out.write("        color: white;\n");
      out.write("        font-size: 30px;\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .list-contact li {\n");
      out.write("        list-style: none;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .list-contact i {\n");
      out.write("        color: white;\n");
      out.write("        font-size: 20px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-1\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h1 class=\"join\">Join us</h1>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 imgLogo\">\n");
      out.write("                                <img src=\"https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png\"\n");
      out.write("                                    alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"MU\">Manchester United Football Club is a professional football club based in Old\n");
      out.write("                                Trafford,\n");
      out.write("                                Greater Manchester, England. The club is playing in the English Premier League.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"link-web\">\n");
      out.write("                            <li><a href=\"https://www.facebook.com/manchesterunited\" class=\"facebook\"><i\n");
      out.write("                                        class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                            <li><a href=\"\" class=\"youtube\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h1 class=\"menu-1\">Menu</h1>\n");
      out.write("                        <div class=\"menu\">\n");
      out.write("                            <ul class=\"list-menu\">\n");
      out.write("                                <li><a href=\"\">Home</a></li>\n");
      out.write("                                <li><a href=\"\">News</a></li>\n");
      out.write("                                <li><a href=\"\">Matches</a></li>\n");
      out.write("                                <li><a href=\"\">Teams</a></li>\n");
      out.write("                                <li><a href=\"\">About</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <h1 class=\"contact-us\">Contact Us</h1>\n");
      out.write("                        <div class=\"contact\">\n");
      out.write("                            <ul class=\"list-contact\">\n");
      out.write("                                <li><i class=\"fa fa-map-marker\"></i> &ensp;Manchester, London, UK</li>\n");
      out.write("                                <li><i class=\"fa fa-phone\"></i> &ensp;0989668350</li>\n");
      out.write("                                <li><i class=\"fa fa-envelope\"></i> &ensp;ManchesterUnited@gmail.com</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
