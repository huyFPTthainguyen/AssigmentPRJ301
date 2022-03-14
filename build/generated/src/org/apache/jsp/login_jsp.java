package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login {\n");
      out.write("                width: 50%;\n");
      out.write("                margin: 5% auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login h2 {\n");
      out.write("                font-size: 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #c70101;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login form {\n");
      out.write("                border: 3px solid #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .alert {\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("                color: white;\n");
      out.write("                width: 90%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .closebtn {\n");
      out.write("                margin-left: 15px;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 22px;\n");
      out.write("                line-height: 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .closebtn:hover {\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login input[type=text],\n");
      out.write("            .form-login input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login button {\n");
      out.write("                background-color: #c70101;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login cancelbtn:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .cancelbtn {\n");
      out.write("                width: auto;\n");
      out.write("                padding: 10px 18px;\n");
      out.write("                background-color: #c70101;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .imgcontainer {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 24px 0 12px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login .container {\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-login span.psw {\n");
      out.write("                float: right;\n");
      out.write("                padding-top: 16px;\n");
      out.write("                color: #c70101;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 300px) {\n");
      out.write("                .form-login span.psw {\n");
      out.write("                    display: block;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .form-login .cancelbtn {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String userName = "", password = "";
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cook : cookies) {
                    if (cook.getName().equals("userC")) {
                        userName = cook.getValue();
                    } else if (cook.getName().equals("passC")) {
                        password = cook.getValue();
                    }
                }
            }
        
      out.write("\n");
      out.write("        <div class=\"form-login\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("\n");
      out.write("            <form action=\"login\" method=\"post\">\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("                    <img src=\"https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png\" alt=\"\" class=\"logo\" width=\"100px\" height=\"100px\">\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label for=\"uname\"><b>Username</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Username\" name=\"user\" value=\"");
      out.print(userName);
      out.write("\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" value=\"");
      out.print(password);
      out.write("\" required>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Login</button>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" name=\"remember\" value=\"ON\"> Remember me\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("                    <a href=\"home\" class=\"cancelbtn\">Cancel</a>\n");
      out.write("                    <span class=\"psw\">Don't have an account yet? <a href=\"register.jsp\">Register</a></span>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
