/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-11-25 10:42:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.controller.meta.MetaController;
import org.openxava.util.Is;
import org.openxava.web.Ids;
import org.openxava.util.Labels;
import java.util.Collection;
import org.openxava.controller.meta.MetaAction;
import org.openxava.controller.meta.MetaSubcontroller;

public final class subButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1574337818468L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1574337817530L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1574337817554L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaSubcontroller");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaController");
    _jspx_imports_classes.add("org.openxava.util.Labels");
    _jspx_imports_classes.add("java.util.Collection");
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaControllers");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.Is");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
String controllerName = request.getParameter("controller");
MetaController metaController = MetaControllers.getMetaController(controllerName);
String image = request.getParameter("image");
if (Is.empty(image)) image = metaController.getImage();
String icon = request.getParameter("icon"); 
if (Is.empty(icon)) icon = metaController.getIcon();
String mode = request.getParameter("xava_mode"); 
if (mode == null) mode = manager.getModeName();
String argv = request.getParameter("argv");
if (Is.empty(argv)) argv = "";
// add the mode in the ids to fix problem on the split mode
String id = Ids.decorate(request, "sc-" + controllerName + "_" + mode);
String containerId = Ids.decorate(request, "sc-container-" + controllerName + "_" + mode);
String buttonId = Ids.decorate(request, "sc-button-" + controllerName + "_" + mode);
String imageId = Ids.decorate(request, "sc-image-" + controllerName + "_" + mode);
String aId = Ids.decorate(request, "sc-a-" + controllerName + "_" + mode);
String spanId = Ids.decorate(request, "sc-span-" + controllerName + "_" + mode);

      out.write("\r\n");
      out.write("<span id='");
      out.print(containerId);
      out.write("'>\r\n");
      out.write("\t<span id='");
      out.print(buttonId);
      out.write("' class=\"");
      out.print(style.getButtonBarButton());
      out.write(' ');
      out.print(style.getSubcontrollerButton());
      out.write("\">\r\n");
      out.write("\t\t<a \r\n");
      out.write("\t\t\tid ='");
      out.print(aId);
      out.write("'\r\n");
      out.write("\t\t\thref=\"javascript:openxava.subcontroller('");
      out.print(id);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(containerId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(buttonId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(imageId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(aId);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(spanId);
      out.write("')\" \r\n");
      out.write("\t\t\t>\r\n");
      out.write("\t\t\t");
 if (!Is.emptyString(icon) && (style.isUseIconsInsteadOfImages() || Is.emptyString(image))) { 
      out.write("\r\n");
      out.write("\t\t\t<i class=\"mdi mdi-");
      out.print(icon);
      out.write("\"></i>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t<span\r\n");
      out.write("\t\t\t\tid='");
      out.print(spanId);
      out.write("' \r\n");
      out.write("\t\t\t\tstyle=\"padding:4px; background: url(");
      out.print(request.getContextPath());
      out.write('/');
      out.print(style.getImagesFolder());
      out.write('/');
      out.print(image);
      out.write(") no-repeat 5px 50%;\">\t\t\t\t\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( Labels.get(controllerName));
      out.write("\r\n");
      out.write("\t\t\t<i id='");
      out.print(imageId);
      out.write("' class=\"mdi mdi-menu-down\"></i>&nbsp;\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</span>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"");
      out.print(id);
      out.write("\" class=\"");
      out.print(style.getSubcontroller());
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t");

		Collection actions = manager.getSubcontrollerMetaActions(controllerName);
		java.util.Iterator actionsIt = actions.iterator();
		while(actionsIt.hasNext()){
			MetaAction action = (MetaAction)actionsIt.next();
			if (action.appliesToMode(mode)) {
		
      out.write("\t\r\n");
      out.write("\t\t\t<tr><td>\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "barButton.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(action.getQualifiedName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("addSpaceWithoutImage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("argv", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(argv), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t");

			}
		}
		
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</span>\t");
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
