/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2017-04-17 07:45:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.act.process_002deditor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modeler_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("<html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7]>\r\n");
      out.write("<html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8]>\r\n");
      out.write("<html class=\"no-js lt-ie9\"> <![endif]-->\r\n");
      out.write("<!--[if gt IE 8]><!-->\r\n");
      out.write("<html class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>流程编辑器</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no, width=device-width\">\r\n");
      out.write("    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"Stylesheet\" media=\"screen\" href=\"editor-app/libs/ng-grid-2.0.7.min.css\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"editor-app/libs/bootstrap_3.1.1/css/bootstrap.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"Stylesheet\" media=\"screen\" href=\"editor-app/editor/css/editor.css\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"editor-app/css/style.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"editor-app/css/style-common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"editor-app/css/style-editor.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var appContextRoot='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/act';\r\n");
      out.write("</script>\r\n");
      out.write("\t<!-- <div class=\"navbar navbar-fixed-top navbar-inverse\" role=\"navigation\" id=\"main-header\">\r\n");
      out.write("\t    <div class=\"navbar-header\">\r\n");
      out.write("            <a href=\"\" ng-click=\"backToLanding()\" class=\"navbar-brand\" style=\"background: none; width: 300px;color: white;\"\r\n");
      out.write("               title=\"{{'GENERAL.MAIN-TITLE' | translate}}\">通用管理平台 - 流程编辑器</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<div class=\"unsupported-browser\">\r\n");
      out.write("\t    <p class=\"alert error\">You are using an unsupported browser. Please upgrade your browser in order to use the\r\n");
      out.write("\t        editor.</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"alert-wrapper\" ng-cloak>\r\n");
      out.write("\t    <div class=\"alert fadein {{alerts.current.type}}\" ng-show=\"alerts.current\" ng-click=\"dismissAlert()\">\r\n");
      out.write("\t        <i class=\"glyphicon\"\r\n");
      out.write("\t           ng-class=\"{'glyphicon-ok': alerts.current.type == 'info', 'glyphicon-remove': alerts.current.type == 'error'}\"></i>\r\n");
      out.write("\t        <span>{{alerts.current.message}}</span>\r\n");
      out.write("\t\r\n");
      out.write("\t        <div class=\"pull-right\" ng-show=\"alerts.queue.length > 0\">\r\n");
      out.write("\t            <span class=\"badge\">{{alerts.queue.length + 1}}</span>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"main\" class=\"wrapper full clearfix\" style=\"padding-top:0;\" ng-style=\"{height: window.height + 'px'}\" ng-app=\"activitiModeler\" ng-include=\"'editor-app/editor.html'\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"editor-app/libs/es5-shim-15.3.4.5/es5-shim.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/json3_3.2.6/lib/json3.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/libs/jquery_1.11.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/jquery-ui-1.10.3.custom.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/libs/angular_1.2.13/angular.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular_1.2.13/angular-animate.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/bootstrap_3.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-resource_1.2.13/angular-resource.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-cookies_1.2.13/angular-cookies.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-sanitize_1.2.13/angular-sanitize.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-route_1.2.13/angular-route.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-translate_2.4.2/angular-translate.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-translate-storage-cookie/angular-translate-storage-cookie.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-translate-loader-static-files/angular-translate-loader-static-files.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-strap_2.0.5/angular-strap.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-strap_2.0.5/angular-strap.tpl.min.js\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/momentjs_2.5.1/momentjs.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/libs/ui-utils.min-0.0.4.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/ng-grid-2.0.7-min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-dragdrop.min-1.0.3.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/mousetrap-1.4.5.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/jquery.autogrow-textarea.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/libs/prototype-1.5.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/libs/path_parser.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/libs/angular-scroll_0.5.7/angular-scroll.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Configuration -->\r\n");
      out.write("\t<script src=\"editor-app/app-cfg.js?v=1\"></script>\r\n");
      out.write("\t<script src=\"editor-app/editor-config.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/url-config.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/editor/i18n/translation_en_us.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/editor/i18n/translation_signavio_en_us.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/editor/oryx.debug.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/app.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/eventbus.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/editor-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/stencil-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/toolbar-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/header-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/select-shape-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/editor-utils.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/toolbar-default-actions.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-default-controllers.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-execution-listeners-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-event-listeners-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-assignment-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-fields-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-form-properties-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-in-parameters-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-multiinstance-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-out-parameters-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-task-listeners-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-sequenceflow-order-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-condition-expression-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-signal-definitions-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-signal-scope-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-message-definitions-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-message-scope-controller.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/configuration/toolbar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/toolbar-custom-actions.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"editor-app/configuration/properties-custom-controllers.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
