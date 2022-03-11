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
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            footer {\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #231F20;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer ul {\n");
      out.write("                list-style: none;\n");
      out.write("                padding-left: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer a {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer h1 {\n");
      out.write("                padding: 5px 0;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: fantasy;\n");
      out.write("                color: #fff;\n");
      out.write("                border-bottom: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .join-us {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .join-us img {\n");
      out.write("                display: block;\n");
      out.write("                margin: 10px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .join-us p {\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: #fff;\n");
      out.write("                margin: 5px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .icons-social-media {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                border-top: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .icons-social-media li {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 20px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .icons-social-media .fa {\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 40px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .icons-social-media .fa:hover {\n");
      out.write("                background-color: #c70101;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .icons-social-media .fa:focus {\n");
      out.write("                background-color: #c70101;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .menu {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-menu {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-menu li {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-menu a {\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .contact {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-contact {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-contact li {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #fff;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-footer .list-contact i {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("\n");
      out.write("            <div class=\"middle-footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"join-us\">\n");
      out.write("                                <h1>Join Us</h1>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <img src=\"https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png\"\n");
      out.write("                                             alt=\"Logo\" width=\"100px\" height=\"100px\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <p>Manchester United Football Club is a professional football club based in Old\n");
      out.write("                                            Trafford,\n");
      out.write("                                            Greater Manchester, England.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <ul class=\"icons-social-media\">\n");
      out.write("                                    <li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\" class=\"youtube\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"menu\">\n");
      out.write("                                <h1>Menu</h1>\n");
      out.write("                                <ul class=\"list-menu\">\n");
      out.write("                                    <li><a href=\"home\">Home</a></li>\n");
      out.write("                                    <li><a href=\"loadNews\">News</a></li>\n");
      out.write("                                    <li><a href=\"loadPlayer\">Teams</a></li>\n");
      out.write("                                    <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"contact-us\">\n");
      out.write("                                <h1>Contact Us</h1>\n");
      out.write("                                <ul class=\"list-contact\">\n");
      out.write("                                    <li><i class=\"fa fa-map-marker\"></i> &ensp;Manchester, London, UK</li>\n");
      out.write("                                    <li><i class=\"fa fa-phone\"></i> &ensp;0989668350</li>\n");
      out.write("                                    <li><i class=\"fa fa-envelope\"></i> &ensp;ManchesterUnited@gmail.com</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
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
