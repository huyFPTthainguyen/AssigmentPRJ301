package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerPlayer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <style>\n");
      out.write("        .managerPlayer {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .top-managerPlayer h1 {\n");
      out.write("            color: #c70101;\n");
      out.write("            font-size: 40px;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: rgba(128, 128, 128, 0.192);\n");
      out.write("            margin: 40px 150px;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer h3 {\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 25px;\n");
      out.write("            color: #c70101;\n");
      out.write("            margin-left: 65px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa {\n");
      out.write("            padding: 15px 15px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 15px;\n");
      out.write("            background: green;\n");
      out.write("            border: 1px solid white;\n");
      out.write("            margin-left: 300px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa:hover {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa:focus {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 40px;\n");
      out.write("            margin-left: 65px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer th {\n");
      out.write("            background-color: #c70101;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer img {\n");
      out.write("            width: 70%;\n");
      out.write("            height: 200px;\n");
      out.write("            margin-left: 18px;\n");
      out.write("            padding: 12px 12px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .table {\n");
      out.write("            width: 980px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa {\n");
      out.write("            padding: 15px 15px;\n");
      out.write("            color: #fff;\n");
      out.write("            background: blue;\n");
      out.write("            border: 1px solid white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa:hover {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa:focus {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa {\n");
      out.write("            background-color: #c70101;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 15px 15px;\n");
      out.write("            border: 1px solid white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa:hover {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa:focus {\n");
      out.write("            color: #c70101;\n");
      out.write("            background-color: #fff;\n");
      out.write("            border: 1px solid #140a47;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"managerPlayer\">\n");
      out.write("        <div class=\"top-managerPlayer\">\n");
      out.write("            <h1>Manager players</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom-managerPlayer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"bottom1-managerPlayer\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <h3>There are 15 player</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <a href=\"view/addPlayer.jsp\" class=\"addplayer\"><i style=\"font-size:20px\" class=\"fa\">&#xf196; Add\n");
      out.write("                                    Player</i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bottom2-managerPlayer\">\n");
      out.write("                    <table border=\"1px solid black\" class=\"table\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Img</th>\n");
      out.write("                            <th>Date</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPlayers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.playerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.playerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>\n");
          out.write("                                <a href=\"UpdateP?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.playerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"updateplayer\"><i style=\"font-size:20px\" class=\"fa\">&#9756; Update\n");
          out.write("                                        Player</i></a><br><br>\n");
          out.write("                                <a href=\"DeleteP?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.playerId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"deleteplayer\"><i style=\"font-size:21px\" class=\"fa\">&#xf014; Delete\n");
          out.write("                                        Player</i></a>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
