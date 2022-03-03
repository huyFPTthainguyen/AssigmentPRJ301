package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailPlayer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .detailPlayer {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .detailPlayer .top-detailPlayer img {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .detailPlayer .top-infor-player{\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 30px;\n");
      out.write("            }\n");
      out.write("            .detailPlayer .top-infor-player .picture-player h3{\n");
      out.write("                background-color: #c70101;\n");
      out.write("                font-size: 30px;\n");
      out.write("                width: 40px;\n");
      out.write("                height: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: white;\n");
      out.write("                position: absolute;               \n");
      out.write("                top: 0;\n");
      out.write("                border: 1.5px solid black;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .detailPlayer .top-infor-player .picture-player img{\n");
      out.write("                border: 1.5px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .detailPlayer .frame-infor-player{\n");
      out.write("                width: 100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .detailPlayer .frame-infor-player{\n");
      out.write("                border: 1.5px solid black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .detailPlayer .top-infor-player .frame-infor-player .top-part h4{\n");
      out.write("                font-size: 40px;\n");
      out.write("                color: #c70101;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                margin-left: 30px;\n");
      out.write("            }\n");
      out.write("            .detailPlayer .top-infor-player .frame-infor-player .top-part h5{\n");
      out.write("                margin-top: 30px;\n");
      out.write("                margin-left: 30px;\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <title>detailPlayer</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"detailPlayer\">\n");
      out.write("            <div class=\"top-detailPlayer\">\n");
      out.write("                <img src=\"https://pbs.twimg.com/media/E7U2KsGVoAAO157?format=jpg&name=large\" alt=\"\" width=\"100%\" height=\"450px\">\n");
      out.write("            </div>           \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top-infor-player\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"picture-player\">\n");
      out.write("                                <h3>3</h3>\n");
      out.write("                                <img src=\"https://assets.manutd.com/AssetPicker/images/0/0/16/60/1063953/Scott_McTominay_profile_picture_11643363103000.jpg\" alt=\"\" width=\"80%\" height=\"200px\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <div class=\"frame-infor-player\">\n");
      out.write("                                <div class=\"top-part\">\n");
      out.write("                                    <h4>Ronaldo</h4>                           \n");
      out.write("                                    <h5>Personal Information</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"bottom-part\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Player Name</td>\n");
      out.write("                                            <td class=\"data\">huy</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Date of birth</td>\n");
      out.write("                                            <td class=\"data\">200</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Birthplace</td>\n");
      out.write("                                            <td class=\"data\">Thai Nguyen</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Height</td>\n");
      out.write("                                            <td class=\"data\">231</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Weight</td>\n");
      out.write("                                            <td class=\"data\">432</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Position</td>\n");
      out.write("                                            <td class=\"data\">2</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"attribute\">Number</td>\n");
      out.write("                                            <td class=\"data\">12</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>   \n");
      out.write("                            </div>\n");
      out.write("                        </div>                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
