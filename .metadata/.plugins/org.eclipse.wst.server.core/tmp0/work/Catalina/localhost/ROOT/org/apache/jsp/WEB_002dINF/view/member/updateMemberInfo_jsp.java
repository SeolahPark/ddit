/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-17 02:42:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.MemberVO;
import java.util.Map;

public final class updateMemberInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("vo.MemberVO");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>모람모람</title>\r\n");
      out.write("\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicon -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Web Fonts -->\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Roboto:wght@500;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Icon Font Stylesheet -->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Libraries Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Stylesheet -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\ttable, tr, td { border:1px solid blue; border-collapse: collapse; }\r\n");
      out.write("\ttd { padding:5px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"#searchAddr\").on(\"click\", function(){\r\n");
      out.write("\t\tnew daum.Postcode({\r\n");
      out.write("\t        oncomplete: function(data) {\r\n");
      out.write("\t            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.\r\n");
      out.write("\t            // 예제를 참고하여 다양한 활용법을 확인해 보세요.\r\n");
      out.write("\t            $(\"input[name=mem_addr_base]\").val(data.address);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    }).open();\r\n");
      out.write("\t}) \r\n");
      out.write("\t\t\r\n");
      out.write("\t// 정규식 결과 체크 후 서브밋하는거 만들어야 함 //// 욕심을 버리자!! 일단 구현해\r\n");
      out.write("\t$(\"#memberForm\").on(\"submit\", function(){\r\n");
      out.write("\t\tif($(\"#mem_pass\").val()!= $(\"#mem_pass_check\").val()){\r\n");
      out.write("\t\t\talert(\"비밀번호와 비밀번호 확인이 다릅니다. 다시 확인하세요.\");\r\n");
      out.write("\t\t\treturn false;   // 서버로 전송을 하지 않는다.\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#mem_pass_check\").css(\"border\", \"2px soild blue\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#mem_pass\").val()==\"\" || $(\"#mem_pass\").val()==null){\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#passCheckResult\").html()!=\"OK\"){\r\n");
      out.write("\t\t\talert(\"비밀번호형식이 올바르지 않습니다. 확인해주세요\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#hpCheckResult\").html()!=\"OK\"){\r\n");
      out.write("\t\t\talert(\"전화번호형식이 올바르지 않습니다. 확인해주세요\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#emailCheckResult\").html()!=\"OK\"){\r\n");
      out.write("\t\t\talert(\"이메일형식이 올바르지 않습니다. 확인해주세요\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t// 정규식 체크\r\n");
      out.write("\t$(\"#memberForm input\").on(\"keyup\", function(){\r\n");
      out.write("\t\tregText = \"\";\r\n");
      out.write("\t\tswitch($(this).attr(\"id\")){\r\n");
      out.write("\t\t\tcase \"mem_pass\":\r\n");
      out.write("\t\t\t\tregText = /^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\\\(\\\\)\\-_=+]).{8,16}$/;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase \"mem_hp\":\r\n");
      out.write("\t\t\t\tregText = /^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$/;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase \"mem_email\":\r\n");
      out.write("\t\t\t\tregText = /^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$/i;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(regText.test($(this).val().trim())){\r\n");
      out.write("\t\t\t$(this).css(\"border\", \"2px solid blue\");\r\n");
      out.write("\t\t\t$(this).next().next().html(\"OK\"); \r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(this).css(\"border\", \"2px solid red\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function readURL(input) {\r\n");
      out.write("\tif (input.files && input.files[0]) {\r\n");
      out.write("\t\tvar reader = new FileReader();\r\n");
      out.write("\t\treader.onload = function(e) {\r\n");
      out.write("\t\t\tdocument.getElementById('preview').src = e.target.result;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\treader.readAsDataURL(input.files[0]);\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tdocument.getElementById('preview').src = \"\";\r\n");
      out.write("\t}\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");

Map<String, Object> loginInfo = (Map<String, Object>)session.getAttribute("loginInfo");
MemberVO loginMemberInfo = (MemberVO) loginInfo.get("memberInfo");

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h2>회원정보 수정</h2>\r\n");
      out.write("<h5>");
      out.print(loginMemberInfo.getMem_name());
      out.write(" 회원님</h5>\r\n");
      out.write("<form id=\"memberForm\" enctype=\"multipart/form-data\" action=\"");
      out.print(request.getContextPath());
      out.write("/files/updateFiles.do\" method=\"post\" >\r\n");
      out.write("<input type=\"hidden\" name=\"mem_id\" value=\"");
      out.print(loginMemberInfo.getMem_id());
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"mem_no\" value=\"");
      out.print(loginMemberInfo.getMem_no());
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"file_category_no\" value=\"4\">\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>프로필 사진</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img alt=\"profileImage\" id=\"preview\">\r\n");
      out.write("\t\t\t\t<input type=\"file\" onchange=\"readURL(this);\" value=\"사진 선택\"  name=\"files\"> \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"mem_pass\" id=\"mem_pass\" placeholder=\"알파벳 + 숫자 + 특수문자 8~16자\"><br>\r\n");
      out.write("\t\t\t\t<span id=\"passCheckResult\" style=\"display:none;\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>비밀번호 확인</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"mem_pass_check\" id=\"mem_pass_check\" ><br>\r\n");
      out.write("\t\t\t\t<span id=\"passDoubleCheckResult\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>전화번호</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"mem_hp\" id=\"mem_hp\" placeholder=\"010-0000-0000\" value=\"");
      out.print(loginMemberInfo.getMem_hp() );
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t<span id=\"hpCheckResult\" style=\"display:none;\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"mem_email\" id=\"mem_email\" value=\"");
      out.print(loginMemberInfo.getMem_email());
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t<span id=\"emailCheckResult\" style=\"display:none;\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>기본주소<input type=\"button\" id=\"searchAddr\" value=\"주소찾기\"></td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"mem_addr_base\" value=\"");
      out.print(loginMemberInfo.getMem_addr_base());
      out.write("\" readonly><br>\r\n");
      out.write("\t\t\t\t<span id=\"baseAddrCheckResult\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>상세주소</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"mem_addr_detail\" value=\"");
      out.print(loginMemberInfo.getMem_addr_detail());
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t<span id=\"detailAddrCheckResult\"></span>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" style=\"text-align:center;\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"저장\"> \r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"취소\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
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
