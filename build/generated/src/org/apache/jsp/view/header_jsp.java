package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("            header {\n");
      out.write("                background-image: url('images/background-champions-league.jpg');\n");
      out.write("                background-color: #231F20;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header ul {\n");
      out.write("                list-style: none;\n");
      out.write("                padding-left: 0;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header li {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .logo {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .logo-team img {\n");
      out.write("                margin: 5px 10px;\n");
      out.write("                width: 30%;\n");
      out.write("                height: 30%;\n");
      out.write("                margin-top: 8%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .list-icons {\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .list-icons ul {\n");
      out.write("                margin: 5px;\n");
      out.write("                margin-top: 35px;\n");
      out.write("            }\n");
      out.write("            .top-header .icons-social-media li {\n");
      out.write("                margin: 10px 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-social-media .fa {\n");
      out.write("                padding: 5px;\n");
      out.write("                width: 45px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("                text-align: center;\n");
      out.write("                border-radius: 60%;\n");
      out.write("                margin-left: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-social-media .fa:hover {\n");
      out.write("                background-color: red;\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-login li {\n");
      out.write("                margin: 5px 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-login .fa {\n");
      out.write("                padding: 15px 30px;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 20px;\n");
      out.write("                background: #d8302f;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                border: 1px solid white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-login .fa:hover {\n");
      out.write("                color: white;\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .top-header .icons-login .fa:focus {\n");
      out.write("                color: white;\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("            .middle-header{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-header .list-manager{\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-header .list-manager li{\n");
      out.write("                margin: 10px 20px;\n");
      out.write("                border: 1px solid #fff;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .middle-header .list-manager a{\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header {\n");
      out.write("                background-color: #fff;\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid grey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .list-menu {\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 20px;\n");
      out.write("            }\n");
      out.write("            .bottom-header .list-menu a {\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .list-menu a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #d8302f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .list-menu a:focus {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #d8302f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .input-search {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .input-group {\n");
      out.write("                width: 100%;\n");
      out.write("                margin: 10px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .text-input {\n");
      out.write("                width: 300px;\n");
      out.write("                height: 50px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                outline: none;\n");
      out.write("                border: 2px solid #d8302f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .btn-search .fa {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: #140A47;\n");
      out.write("                text-align: center;\n");
      out.write("                outline: none;\n");
      out.write("                background-color: #d8302f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .btn-search {\n");
      out.write("                width: 70px;\n");
      out.write("                height: 50px;\n");
      out.write("                padding: 10px;\n");
      out.write("                outline: none;\n");
      out.write("                border: 2px solid #d8302f;\n");
      out.write("                background-color: #d8302f;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .btn-search:hover {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .btn-search:focus {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bottom-header .list-menu li {\n");
      out.write("                margin: 0 20px;\n");
      out.write("            }\n");
      out.write("            .top-header .list-icons .name-login{\n");
      out.write("                font-size: 30px;             \n");
      out.write("                color: red;\n");
      out.write("                margin-left: 70px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top-header\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <ul class=\"logo-team\">\n");
      out.write("                                    <li><a href=\"\"><img\n");
      out.write("                                                src=\"https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png\"\n");
      out.write("                                                alt=\"\" width=\"100px\" height=\"100px\"></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <div class=\"list-icons\">\n");
      out.write("                                <ul class=\"icons-social-media\">\n");
      out.write("                                    <li><a href=\"\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\" class=\"youtube\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"middle-header\">\n");
      out.write("                    <ul class=\"list-manager\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bottom-header\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-7\">\n");
      out.write("                            <div class=\"menu\">\n");
      out.write("                                <ul class=\"list-menu\">\n");
      out.write("                                    <li><a href=\"HomeC\">Home</a></li>\n");
      out.write("                                    <li><a href=\"ViewN\">News</a></li>                                 \n");
      out.write("                                    <li><a href=\"viewP\">Teams</a></li>\n");
      out.write("                                    <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-5\">\n");
      out.write("                            <div class=\"input-search\">\n");
      out.write("                                <form action=\"\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input class=\"text-input\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                                        <button class=\"btn-search\" type=\"sumit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account== null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <ul class=\"icons-login\">\n");
        out.write("                                        <li><a href=\"login.jsp\" class=\"user\"><i class=\"fa fa-user\">&nbspLogin</i></a></li>\n");
        out.write("                                        <li><a href=\"register.jsp\" class=\"register\"><i class=\"fa fa-registered\">&nbspRegister</i></a></li>\n");
        out.write("                                    </ul>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"\" class=\"name-login\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.isAdmin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li><a href=\"\">Manager Account</a></li>\n");
        out.write("                            <li><a href=\"\">Manager News</a></li>\n");
        out.write("                            <li><a href=\"\">Manager Match</a></li>\n");
        out.write("                            <li><a href=\"managerPlayer\">Manager Team</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
