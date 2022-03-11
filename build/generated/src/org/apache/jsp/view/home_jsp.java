package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .home {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home h1 {\n");
      out.write("                font-size: 40px;\n");
      out.write("                color: #c70101;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 40px 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home ul {\n");
      out.write("                list-style: none;\n");
      out.write("                padding-left: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home a {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news .item-news {\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid #c70101;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 10px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news .item-news h4 {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #c70101;\n");
      out.write("                background-color: #fff;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news .item-news h2 {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: black;\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news .item-news h3 {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: rgba(128, 128, 128, 0.822);\n");
      out.write("                margin: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home-news .item-news p {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: black;\n");
      out.write("                margin: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home .btn-show-more {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 20px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home .btn-show-more button {\n");
      out.write("                width: 200px;\n");
      out.write("                height: 50px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #c70101;\n");
      out.write("                font-weight: bold;\n");
      out.write("                outline: none;\n");
      out.write("                border: 1px solid #c70101;\n");
      out.write("                margin: 20px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home .btn-show-more button:hover {\n");
      out.write("                color: #c70101;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 1px solid #c70101;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .home .btn-show-more button:focus {\n");
      out.write("                color: #c70101;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 1px solid #c70101;\n");
      out.write("            }                         \n");
      out.write("        </style>\n");
      out.write("        <title>Document</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MySlides.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"home\">\n");
      out.write("                <h1>News</h1>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"home-news\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"item-news\">\n");
      out.write("                                            <a href=\"\">\n");
      out.write("                                                <h4>id</h4>\n");
      out.write("                                                <img src=\"https://sport5.mediacdn.vn/158855217956261888/2021/8/31/612e0ca8d5797-16304078663241506566383.jpg\"\n");
      out.write("                                                     alt=\"\" width=\"100%\" height=\"300px\">\n");
      out.write("                                                <h2>This is an important win in the Premier League before we turn our focus to\n");
      out.write("                                                    the Champions League and towards Madrid. Back to orbit! We unite!</h2>\n");
      out.write("                                                <h3>Ronaldo has labelled his recent injury issues as ‘the toughest\n");
      out.write("                                                    hurdle\n");
      out.write("                                                    in\n");
      out.write("                                                    my career so far’\n");
      out.write("                                                    but believes he has come out the other side with more perspective and\n");
      out.write("                                                    patience.\n");
      out.write("                                                </h3>\n");
      out.write("                                                <p>17 Feb 2022</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"item-news\">\n");
      out.write("                                            <a href=\"\">\n");
      out.write("                                                <h4>id</h4>\n");
      out.write("                                                <img src=\"https://sport5.mediacdn.vn/158855217956261888/2021/8/31/612e0ca8d5797-16304078663241506566383.jpg\"\n");
      out.write("                                                     alt=\"\" width=\"100%\" height=\"300px\">\n");
      out.write("                                                <h2>This is an important win in the Premier League before we turn our focus to\n");
      out.write("                                                    the Champions League and towards Madrid. Back to orbit! We unite!</h2>\n");
      out.write("                                                <h3>Ronaldo has labelled his recent injury issues as ‘the toughest\n");
      out.write("                                                    hurdle\n");
      out.write("                                                    in\n");
      out.write("                                                    my career so far’\n");
      out.write("                                                    but believes he has come out the other side with more perspective and\n");
      out.write("                                                    patience.\n");
      out.write("                                                </h3>\n");
      out.write("                                                <p>17 Feb 2022</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"btn-show-more\">\n");
      out.write("                        <a href=\"\"><button type=\"submit\">See More News</button></a>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
