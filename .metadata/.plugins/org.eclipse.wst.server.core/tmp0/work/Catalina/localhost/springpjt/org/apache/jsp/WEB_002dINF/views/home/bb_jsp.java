/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-12-10 07:49:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bb_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Page Heading -->\r\n");
      out.write("	<h1 class=\"h3 mb-4 text-gray-800\">Buttons</h1>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Circle Buttons -->\r\n");
      out.write("			<div class=\"card shadow mb-4\">\r\n");
      out.write("				<div class=\"card-header py-3\">\r\n");
      out.write("					<h6 class=\"m-0 font-weight-bold text-primary\">Circle Buttons</h6>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<p>Use Font Awesome Icons (included with this theme package)\r\n");
      out.write("						along with the circle buttons as shown in the examples below!</p>\r\n");
      out.write("					<!-- Circle Buttons (Default) -->\r\n");
      out.write("					<div class=\"mb-2\">\r\n");
      out.write("						<code>.btn-circle</code>\r\n");
      out.write("					</div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-circle\"> <i\r\n");
      out.write("						class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-success btn-circle\"> <i\r\n");
      out.write("						class=\"fas fa-check\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-info btn-circle\"> <i\r\n");
      out.write("						class=\"fas fa-info-circle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-warning btn-circle\"> <i\r\n");
      out.write("						class=\"fas fa-exclamation-triangle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-danger btn-circle\"> <i\r\n");
      out.write("						class=\"fas fa-trash\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("					<!-- Circle Buttons (Small) -->\r\n");
      out.write("					<div class=\"mt-4 mb-2\">\r\n");
      out.write("						<code>.btn-circle .btn-sm</code>\r\n");
      out.write("					</div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-circle btn-sm\"> <i\r\n");
      out.write("						class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-success btn-circle btn-sm\"> <i\r\n");
      out.write("						class=\"fas fa-check\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-info btn-circle btn-sm\"> <i\r\n");
      out.write("						class=\"fas fa-info-circle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-warning btn-circle btn-sm\"> <i\r\n");
      out.write("						class=\"fas fa-exclamation-triangle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-danger btn-circle btn-sm\"> <i\r\n");
      out.write("						class=\"fas fa-trash\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("					<!-- Circle Buttons (Large) -->\r\n");
      out.write("					<div class=\"mt-4 mb-2\">\r\n");
      out.write("						<code>.btn-circle .btn-lg</code>\r\n");
      out.write("					</div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-circle btn-lg\"> <i\r\n");
      out.write("						class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-success btn-circle btn-lg\"> <i\r\n");
      out.write("						class=\"fas fa-check\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-info btn-circle btn-lg\"> <i\r\n");
      out.write("						class=\"fas fa-info-circle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-warning btn-circle btn-lg\"> <i\r\n");
      out.write("						class=\"fas fa-exclamation-triangle\"></i>\r\n");
      out.write("					</a> <a href=\"#\" class=\"btn btn-danger btn-circle btn-lg\"> <i\r\n");
      out.write("						class=\"fas fa-trash\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- Brand Buttons -->\r\n");
      out.write("			<div class=\"card shadow mb-4\">\r\n");
      out.write("				<div class=\"card-header py-3\">\r\n");
      out.write("					<h6 class=\"m-0 font-weight-bold text-primary\">Brand Buttons</h6>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<p>Google and Facebook buttons are available featuring each\r\n");
      out.write("						company's respective brand color. They are used on the user login\r\n");
      out.write("						and registration pages.</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						You can create more custom buttons by adding a new color variable\r\n");
      out.write("						in the\r\n");
      out.write("						<code>_variables.scss</code>\r\n");
      out.write("						file and then using the Bootstrap button variant mixin to create a\r\n");
      out.write("						new style, as demonstrated in the\r\n");
      out.write("						<code>_buttons.scss</code>\r\n");
      out.write("						file.\r\n");
      out.write("					</p>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-google btn-block\"><i\r\n");
      out.write("						class=\"fab fa-google fa-fw\"></i> .btn-google</a> <a href=\"#\"\r\n");
      out.write("						class=\"btn btn-facebook btn-block\"><i\r\n");
      out.write("						class=\"fab fa-facebook-f fa-fw\"></i> .btn-facebook</a>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"card shadow mb-4\">\r\n");
      out.write("				<div class=\"card-header py-3\">\r\n");
      out.write("					<h6 class=\"m-0 font-weight-bold text-primary\">Split Buttons\r\n");
      out.write("						with Icon</h6>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"card-body\">\r\n");
      out.write("					<p>\r\n");
      out.write("						Works with any button colors, just use the\r\n");
      out.write("						<code>.btn-icon-split</code>\r\n");
      out.write("						class and the markup in the examples below. The examples below\r\n");
      out.write("						also use the\r\n");
      out.write("						<code>.text-white-50</code>\r\n");
      out.write("						helper class on the icons for additional styling, but it is not\r\n");
      out.write("						required.\r\n");
      out.write("					</p>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-flag\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Primary</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-success btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-check\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Success</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-info btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-info-circle\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Info</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-warning btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i\r\n");
      out.write("							class=\"fas fa-exclamation-triangle\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Warning</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-danger btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-trash\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Danger</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-secondary btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-arrow-right\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Secondary</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-light btn-icon-split\"> <span\r\n");
      out.write("						class=\"icon text-gray-600\"> <i class=\"fas fa-arrow-right\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Light</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"mb-4\"></div>\r\n");
      out.write("					<p>Also works with small and large button classes!</p>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-icon-split btn-sm\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-flag\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Small</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<div class=\"my-2\"></div>\r\n");
      out.write("					<a href=\"#\" class=\"btn btn-primary btn-icon-split btn-lg\"> <span\r\n");
      out.write("						class=\"icon text-white-50\"> <i class=\"fas fa-flag\"></i>\r\n");
      out.write("					</span> <span class=\"text\">Split Button Large</span>\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>");
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
