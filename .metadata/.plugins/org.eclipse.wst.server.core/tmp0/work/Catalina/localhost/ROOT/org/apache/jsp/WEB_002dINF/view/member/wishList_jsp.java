/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-17 02:42:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.util.List;

public final class wishList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");

List<Map<String, Object>> wishList = (List<Map<String, Object>>) request.getAttribute("wishList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Web Fonts -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Icon Font Stylesheet -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Libraries Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=");
      out.print(request.getContextPath());
      out.write("/\"lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/slick/slick.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/slick/slick-theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/style/public.css\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/slick/slick.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/public.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#deleteWish\").on(\"click\", function(){\r\n");
      out.write("\t\tidx = $(this).parent().attr(idx);\r\n");
      out.write("\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/member/deleteWish.do?wish_no\" + idx;\r\n");
      out.write("\t})\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/header.jsp", out, false);
      out.write("\r\n");
      out.write("<h3>위시리스트</h3>\r\n");

if(wishList == null || wishList.size() == 0){

      out.write("\r\n");
      out.write("<div><h5>위시리스트가 없습니다.</h5></div>\r\n");
}else{ 
	for(Map<String, Object> wish : wishList){

      out.write("\r\n");
      out.write("\t\t<div idx=\"");
      out.print(wish.get("WISH_NO"));
      out.write("\">\r\n");
      out.write("\t\t<p>");
      out.print(wish.get("SERVICE_NO"));
      out.write("</p>\r\n");
      out.write("\t\t<input type=\"button\" value=\"삭제\" id=\"deleteWish\">\r\n");
      out.write("\t\t</div>\r\n");

	} 
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
