/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-18 08:58:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.AddressVO;
import java.text.DecimalFormat;
import vo.ExpertVO;
import member.service.MemberService;
import member.service.MemberServiceImpl;
import vo.ServiceVO;
import java.util.List;

public final class serviceDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("member.service.MemberServiceImpl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.ServiceVO");
    _jspx_imports_classes.add("vo.ExpertVO");
    _jspx_imports_classes.add("member.service.MemberService");
    _jspx_imports_classes.add("vo.AddressVO");
    _jspx_imports_classes.add("java.text.DecimalFormat");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>MORAM MORAM</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/jquery.dataTables.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src='");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.6.1.min.js'></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- modal -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t \r\n");
      out.write("    <!-- calendar -->\r\n");
      out.write("    <link href='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/core/main.css' rel='stylesheet' />\r\n");
      out.write("\t<link href='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/daygrid/main.css' rel='stylesheet' />\r\n");
      out.write("\t<link href='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/timegrid/main.css' rel='stylesheet' />\r\n");
      out.write("\t<script src='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/core/main.js'></script>\r\n");
      out.write("\t<script src='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/interaction/main.js'></script>\r\n");
      out.write("\t<script src='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/daygrid/main.js'></script>\r\n");
      out.write("\t<script src='");
      out.print( request.getContextPath() );
      out.write("/calendar/packages/timegrid/main.js'></script>\r\n");
      out.write("\t<script src='");
      out.print( request.getContextPath() );
      out.write("/js/calendar.js'></script>\r\n");
      out.write("    <script src='");
      out.print( request.getContextPath() );
      out.write("/js/servicePay.js'></script>\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/mapSearchwithMarker.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\r\n");
      out.write("  \t<!-- iamport.payment.js -->\r\n");
      out.write("  \t<script type=\"text/javascript\" src=\"https://cdn.iamport.kr/js/iamport.payment-1.2.0.js\"></script>\r\n");
      out.write("  \t\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://t1.kakaocdn.net/kakao_js_sdk/2.0.1/kakao.min.js\" integrity=\"sha384-eKjgHJ9+vwU/FCSUG3nV1RKFolUXLsc6nLQ2R1tD0t4YFPCvRmkcF8saIfOZNWf/\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		ServiceVO svo = (ServiceVO)request.getAttribute("serviceVO");
		ExpertVO evo = (ExpertVO)request.getAttribute("ExpertVO");
		AddressVO avo = (AddressVO)request.getAttribute("AddressVO");
 		double rate_point = (double)request.getAttribute("rate_point");
		int countWishlist= (int)request.getAttribute("countWishlist"); 
		
		
		
	    DecimalFormat formatter = new DecimalFormat("###,###,###,###");
	    int price = svo.getService_price();
	    String service_price = formatter.format(price);
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("    <script>\r\n");
      out.write("\t// 전문가의 서비스 -> 주소 api 조회해서 가져올 정보로 지도 바꿔두기\t\r\n");
      out.write("\tfunction relayout(latitude,longitude) {    \r\n");
      out.write("\t    map.relayout();\r\n");
      out.write("\t    coords = new kakao.maps.LatLng(latitude, longitude);\r\n");
      out.write("        map.setCenter(coords);\r\n");
      out.write("        marker.setPosition(coords);\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \t$(function(){\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\tif(");
      out.print( countWishlist);
      out.write("==1){\r\n");
      out.write("\t\t\t\t$('#redheart').show();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('#whiteheart').show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("   \t\t\r\n");
      out.write(" \t\t$('.heart').on('click',function(){\r\n");
      out.write("   \t\t\tif($(this).attr('id')=='redheart'){\r\n");
      out.write("   \t\t\t\t$('#redheart').hide()\r\n");
      out.write("   \t\t\t\t$('#whiteheart').show();\r\n");
      out.write("   \t\t\t\tchange($(this).attr(\"value\"));\r\n");
      out.write("   \t\t\t\t\r\n");
      out.write("   \t\t\t}else{\r\n");
      out.write("   \t\t\t\t$('#whiteheart').hide();\r\n");
      out.write("   \t\t\t\t$('#redheart').show();\r\n");
      out.write("   \t\t\t\tchange($(this).attr(\"value\"));\r\n");
      out.write("   \t\t\t}\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t}) \r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   change = function(val){\r\n");
      out.write(" \t\t\t\r\n");
      out.write("   \t\t\t$.ajax({\r\n");
      out.write("   \t\t\t\turl : '");
      out.print( request.getContextPath());
      out.write("/service/memWishlist.do',\r\n");
      out.write("   \t\t\t\tdata : {\"serviceNo\" : '");
      out.print( svo.getService_no());
      out.write("',\r\n");
      out.write("   \t\t\t\t\t\t \"memNo\" :  '26' ,\r\n");
      out.write("   \t\t\t\t\t\t \"countWishlist\" : val },\r\n");
      out.write("   \t\t\t\ttype : 'get',\r\n");
      out.write("   \t\t\t\tsuccess : function(res){\r\n");
      out.write("   \t\t\t\t\t\r\n");
      out.write("   \t\t\t\t\tif(res==1){\r\n");
      out.write("   \t\t\t\t\t\talert(\"성공\");\r\n");
      out.write("   \t\t\t\t\t}\r\n");
      out.write("   \t\t\t\t\t// 1. 디테일 화면을 불러올때 회원이 이 서비스를 찜 했는지 판단 - DB\r\n");
      out.write("   \t\t\t\t\t// select count(*) from 위시리스트 where service_no = 선택한 서비스 and mem_no = 로그인한 회원번호\r\n");
      out.write("   \t\t\t\t\t// 2. 1번의 결과에 따라 해당하는 이미지(편한 방법으로 하시면 됩니다)를 보여줌 - js\r\n");
      out.write("   \t\t\t\t\t\r\n");
      out.write("   \t\t\t\t\t// 3. 이미지를 누르면 1번의 결과에 따라 DB의 정보를 반대로 해주면 된다.\r\n");
      out.write("   \t\t\t\t\t// 1이면 delete 0이면 insert\r\n");
      out.write("   \t\t\t\t\t// -> 있으ㅕㅁㄴ 삭제하고 없으면 insert하고\r\n");
      out.write("   \t\t\t\t},\r\n");
      out.write("   \t\t\t\terror : function(xhr){\r\n");
      out.write("   \t\t\t\t\talert(\"상태:\" + status)\r\n");
      out.write("   \t\t\t\t},\r\n");
      out.write("   \t\t\t\tdataType : 'text'\r\n");
      out.write("   \t\t\t})\r\n");
      out.write(" \t\t} \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("   \t\t// 구입에 필요한 정보\r\n");
      out.write("\t\t// ==> 서비스번호, 회원번호\r\n");
      out.write("\t\t// 세션에 있는 회원 아이디를 꺼내옴 -> 회원아이디로 회원번호를 구한다.\r\n");
      out.write("\t\t//String userId = (String)session.getAttribute(\"ID\");\r\n");
      out.write("  \t\t\t\r\n");
      out.write("\t\t//*** 결제 진행\r\n");
      out.write("\t\t$('#cardPay').on('click',function(){\r\n");
      out.write("\t\t\tconsole.log('일반결제');\r\n");
      out.write("\t\t//PayKakaoService();\r\n");
      out.write("\t\t});    \t\t\t\r\n");
      out.write("\t\t$('#kakaoPay').on('click',function(){\r\n");
      out.write("\t\t\t// 결제 금액 받기\r\n");
      out.write("\t\t\tlostpay = $('#paybox').val();\r\n");
      out.write("\t\t\tlostpay = lostpay.replaceAll(\",\",\"\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar id = $('#memberNo').val(); // 회원정보 받는 곳 ==> 회원번호로?\r\n");
      out.write("\t\t\t// 서비스명\r\n");
      out.write("\t\t\tservice_name = $('#service_name').text();\r\n");
      out.write("\t\t\tconsole.log('서비스명 : ' + service_name);\r\n");
      out.write("\t\t\tconsole.log('결제금액' + lostpay);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tPayService(id,service_name);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("   \t})\r\n");
      out.write("\t\t\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../serviceSidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Start -->\r\n");
      out.write("        <div class=\"content col-sm-1 w-85 mx-3\">\r\n");
      out.write("            <div class=\"container-fixed pt-4 px-4 container-center-align\">\r\n");
      out.write("                <div class=\"bg-light text-center rounded p-4\" style=\"width: 1300px; margin-left: 15%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t\t\t        <div class=\"content-wrapper\">\r\n");
      out.write("\t\t\t\t\t          <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-sm grid-margin stretch-card\">\r\n");
      out.write("\t\t\t\t\t              <div class=\"card\">\r\n");
      out.write("\t\t\t\t\t                <div class=\"card-body border-bottom\">\r\n");
      out.write("\t\t\t\t\t                  <div class=\"d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("\t\t\t\t\t                    <h5 class=\"mb-2 mb-md-0 text-uppercase font-weight-medium\">");
      out.print(svo.getService_name() );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t                  </div>\r\n");
      out.write("\t\t\t\t\t                  <div class=\"container-fluid pt-4 px-4\">\r\n");
      out.write("\t\t\t\t\t\t                <div class=\"row g-4 pb-4\">\r\n");
      out.write("\t\t\t\t\t\t                    <main class=\"col col-sm col-3\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"bg-light rounded h-100 p-4\">\r\n");
      out.write("\t\t\t\t\t\t                            <h6 class=\"mb-4\">서비스 사진</h6>\r\n");
      out.write("\t\t\t\t\t\t                            <img src=\"../img/배너 (1).png\" style=\"width:100%;\">\r\n");
      out.write("\t\t\t\t\t\t                         <div class=\"bg-light rounded\">\r\n");
      out.write("\t\t\t\t\t\t\t                        <!-- 서비스 정보 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <div class=\"row\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <div class=\"col-xl grid-margin stretch-card\" style=\"padding : 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t              <div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                <div class=\"card-body border-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  <div class=\"d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                    <div class=\"card-body\" style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>포트폴리오</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>테이블 컬럼x</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>전문가 학력</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                 \t<div>");
      out.print(evo.getExpert_education() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>전문가 경력</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                 \t<div>");
      out.print(evo.getExpert_career() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>서비스일정</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                 \t<div>");
      out.print(evo.getExpert_contact() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div id=\"calendar\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>전문가 자격증</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                 \t<div>");
      out.print(evo.getExpert_license() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>전문가 서비스 지역</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                \t");

															if(avo.getAddr_longi() != "없음" && !avo.getAddr_longi().equals("없음")){
									                	
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./mapView.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlongitude =");
      out.print(avo.getAddr_longi());
      out.write(";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlatitude = ");
      out.print(avo.getAddr_lati());
      out.write(";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trelayout(longitude,latitude);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</script>\t\t\t\t\t\t\t                \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

															}else{
														
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>등록된 정보가 없습니다.</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>취소,환불규정</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>01. 전문가와 의뢰인 간의 상호 협의 후 청약철회가 가능합니다. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>02. 전문가의 귀책사유로 디자인작업을 시작하지 않았거나 혹은 이에 준하는 보편적인 관점에서 심각하게 잘못 이행한 경우 결제 금액 전체 환불이 가능합니다. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>03. 전문가가 작업 기간 동안 지정된 서비스를 제공하지 못할 것이 확실한 경우 지급받은 서비스 비용을 일할 계산하여 작업물 개수와 작업 기간 일수만큼 공제하고 잔여 금액을 환불합니다. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>04. 서비스 받은 항목을 공제하여 환불하며, 공제 비용은 정가 처리됩니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>가. 소비자 피해 보상 규정에 의거하여 작업물 원본의 멸실 및 작업 기간 미이행 및 이에 상응하는 전문가 책임으로 인한 피해 발생 시, 전액 환불 </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>나. 시안 작업 진행된 상품 차감 환불\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>ⓐ. '디자인'에 대한 금액이 서비스 내 별도 기재가 되지 않았거나, 디자인 상품 패키지 내 수정 횟수가 1회(1회 포함) 이상인 서비스 상품의 시안 or 샘플이 제공된 경우</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>→ 구매금액의 10% 환불(디자인 비용이 별도 기재되어 있는 경우, 해당금액 차감 후 환불)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>※ 시안 제공 및 수정이 추가로 이뤄진 경우 환불 금액내 수정 횟수에 따라 분할하여 환불. v\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>05. 주문 제작 상품 등 서비스 받은 항목이 없으며, 결제 후 1일 이내 작업이 진행되기 전 시점은 전액 환불 가능. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>06. 다만, 환불이 불가능한 서비스에 대한 사실을 표시사항에 포함한 경우에는 의뢰인의 환불요청이 제한될 수 있습니다. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>가. 고객의 요청에 따라 개별적으로 주문 제작되는 재판매가 불가능한 경우(인쇄, 이니셜 각인, 사이즈 맞춤 등) v\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>ⓐ. 주문 제작 상품 특성상 제작(인쇄 등) 진행된 경우. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>ⓑ. 인쇄 색상의 차이 : 모니터의 종류에 따라 색상의 차이가 발생하며,인쇄 시마다 합판 인쇄 방법의 특성상 색상 표현의 오차가 발생함. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>ⓒ. 디자인 서비스이며 수정 횟수가 존재하지 않았던 상품일 경우 시안 수령 후 환불 불가</p></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>후기 및 서비스평점</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>");
      out.print(rate_point );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div></div> <!-- 후기 게시판 불러오기 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t                          </div>\r\n");
      out.write("\t\t\t\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t\t                       <!--  </div --> <!--  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t                    </main>\r\n");
      out.write("\t\t\t\t\t\t                    \r\n");
      out.write("\t\t\t\t\t\t                    <aside class=\"col col-sm-auto asidemin\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"bg-light rounded h-100 p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<section class=\"css-r0kfeg ed4cxi41\" style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/빨간하트.png\" id=\"redheart\" class=\"heart\" style=\"width: 50px; display: none;\" value=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/빈하트.png\" id=\"whiteheart\" class=\"heart\" style=\"width: 50px; display : none;\" value=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t \t\t\t\t\t\t\t\t\t <div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t            <div class=\"col-xl grid-margin stretch-card\" style=\"padding : 10px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t              <div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                <div class=\"card-body border-bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  <div class=\"d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                    <div class=\"card-body\" style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                 \t<span><b>서비스분류</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>");
      out.print(svo.getService_category_sub_no());
      out.write("</div><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>서비스명</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>");
      out.print(svo.getService_name() );
      out.write("</div><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \t                \t<span><b>서비스설명</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>");
      out.print(svo.getService_info() );
      out.write("</div><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<span><b>서비스가격</b></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<div>");
      out.print(service_price );
      out.write("원</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                \t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  <div class=\"card-body d-grid gap-2\" style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                  \t<button class=\"btn btn-primary w-100 m-2\" type=\"button\"  data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" id=\"action\">구매하기</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t                          </div>\r\n");
      out.write("\t\t\t\t\t\t\t                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t            </aside>\r\n");
      out.write("\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t          \t \t\t</div>\r\n");
      out.write("\t\t\t        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     <!-- content End -->\r\n");
      out.write("     \r\n");
      out.write("        <!-- Right Sidebar Start -->\r\n");
      out.write("            <div class=\"bg-light fly\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"navbar-brand mx-4 mb-3\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"navbar-nav\">\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-item nav-link active\"><button type=\"button\" class=\"btn btn-outline-primary m-2\"><i class=\"fa fa-home me-2\"></i>My Menu</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("\t\t            <div class=\"col-sm grid-margin stretch-card\">\r\n");
      out.write("\t\t              <div>\r\n");
      out.write("\t\t                <div class=\"card-body border-bottom\">\r\n");
      out.write("\t\t                  <div class=\"d-flex justify-content-between align-items-center flex-wrap\">\r\n");
      out.write("\t\t                    <h6 class=\"mb-2 mb-md-0 text-uppercase font-weight-medium\">추천 전문가</h6>\r\n");
      out.write("\t\t                  </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"card-body\" style=\"text-align:left\">\r\n");
      out.write("\t\t                \t<div><b>추천 서비스</b></div><br>\r\n");
      out.write("\t\t                \t</div>\r\n");
      out.write("\t\t                \t<hr/>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"card-body border-bottom\">\r\n");
      out.write("\t\t                  <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"OrderSummary__main\" style=\"text-align:left\">\r\n");
      out.write("\t\t\t\t\t\t<!-- divider -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"OrderSummary__divider\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t            </div><!-- div class=row end -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Right Sidebar End -->\r\n");
      out.write("    \t</div> <!--  Container End -->\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">서비스 결제 진행창</h1>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("      \t<form id=\"modalForm\">\r\n");
      out.write("       <div class=\"card-body border-bottom\">\r\n");
      out.write("      \t\r\n");
      out.write("      \t<div><b>서비스 정보</b></div>\r\n");
      out.write("      \t<img src=\"../img/배너 (1).png\" style=\"width : 200px;\">\r\n");
      out.write("      \t\r\n");
      out.write("      \t<div>서비스명</div>\r\n");
      out.write("      \t<div id=\"service_name\">");
      out.print(svo.getService_name() );
      out.write("</div>\r\n");
      out.write("      \t\r\n");
      out.write("      \t<div>서비스 설명</div>\r\n");
      out.write("      \t<div id=\"service_info\">");
      out.print(svo.getService_info() );
      out.write("</div>\r\n");
      out.write("      \t\r\n");
      out.write("      \t</div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("      \t <div><b>가격 정보</b></div>\r\n");
      out.write("      \t <div>총 결제금액</div>\r\n");
      out.write("      \t <div>");
      out.print(service_price );
      out.write("원</div>\r\n");
      out.write("      \t</div>\r\n");
      out.write("\t\t \t<div class=\"OrderSummary__agreement-wrapper\">\r\n");
      out.write("\t  \t\t\t<div class=\"OrderSummary__agreement-checkbox-wrapper\">\r\n");
      out.write("\t\t\t\t  <div class=\"awesome-checkbox\">\r\n");
      out.write("       \t\t\t\t <label>\r\n");
      out.write("\t                     <input class=\"checkbox\" type=\"checkbox\">\r\n");
      out.write("\t                     주문 내용을 확인하였으며, 결제에 동의합니다. (필수)\r\n");
      out.write("      \t\t\t\t </label>\r\n");
      out.write("  \t\t\t\t  </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("      \t\r\n");
      out.write("      \t\r\n");
      out.write("      \t<!-- 결제에 필요한 정보 -->\r\n");
      out.write("      \t<input type=\"hidden\" id=\"memberNo\" name=\"serviceNo\" value=\"");
      out.print( svo.getService_no() );
      out.write("\">\r\n");
      out.write("      \t<input type=\"hidden\" id=\"paybox\" name=\"servicePrice\" value=\"");
      out.print(service_price );
      out.write("\">\r\n");
      out.write("      \t\r\n");
      out.write("      \t</form>\r\n");
      out.write("      \t\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">취소</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" id=\"cardPay\">결제하기</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-warning\" id=\"kakaoPay\">카카오페이</button>\r\n");
      out.write("      </div>\r\n");
      out.write("       </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t  <!-- iamport.payment.js -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://cdn.iamport.kr/js/iamport.payment-1.2.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/main.js\"></script>\r\n");
      out.write("\r\n");
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
