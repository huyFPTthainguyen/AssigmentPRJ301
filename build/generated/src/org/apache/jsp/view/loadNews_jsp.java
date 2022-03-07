package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loadNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <title>loadNews</title>\n");
      out.write("    <style>\n");
      out.write("        .news {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .top-news h1 {\n");
      out.write("            color: #c70101;\n");
      out.write("            font-size: 40px;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: rgba(128, 128, 128, 0.192);\n");
      out.write("            width: 100%;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("        .news .bottom-news{\n");
      out.write("            width: 100%;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            margin-top: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .left-bottom-news {\n");
      out.write("            width: 100%;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .left-bottom-news h3 {\n");
      out.write("            background-color: #c70101;\n");
      out.write("            font-size: 18px;\n");
      out.write("            width: 200px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            position: absolute;\n");
      out.write("            border: 1px solid #fff;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .left-bottom-news img { \n");
      out.write("            width: 100%;\n");
      out.write("            height: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .right-bottom-news {\n");
      out.write("            width: 100%;                                 \n");
      out.write("            margin-top: 20px;           \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .right-bottom-news h1 {\n");
      out.write("            font-size: 20px;\n");
      out.write("            color: #c70101;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .news .bottom-news .right-bottom-news h2 {\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .news .bottom-news .right-bottom-news h3{\n");
      out.write("            font-size: 14px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: gray;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"news\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"top-news\">\n");
      out.write("                <h1>News</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"bottom-news\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"left-bottom-news\">\n");
      out.write("                            <h3>Press Conference</h3>\n");
      out.write("                            <img src=\"https://image.thanhnien.vn/w1024/Uploaded/2022/ycivopcg/2022_03_07/bruyne-afp-2124.jpg\"\n");
      out.write("                                alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <div class=\"right-bottom-news\">\n");
      out.write("                            <h1>YOU VE GOT TO DUST YOURSELVES DOWN</h1>\n");
      out.write("                            <h2>John O’Shea is already looking ahead to the upcoming games with Tottenham Hotspur and\n");
      out.write("                                Atletico Madrid, after Sunday’s disappointing defeat in the Manchester derby.</h2>\n");
      out.write("                            <h3>2022-2-22</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
