<%@page import="vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
List<BoardVO> list;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SLAH블로그</title>
<!-- Google Font -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
     folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/dist/css/skins/_all-skins.min.css">
<!-- Morris chart -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/morris.js/morris.css">
<!-- jvectormap -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/jvectormap/jquery-jvectormap.css">
<!-- Date Picker -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
<!-- Daterange picker -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/bower_components/bootstrap-daterangepicker/daterangepicker.css">
<!-- bootstrap wysihtml5 - text editor -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

<link rel="stylesheet" href="http://cdn.datatables.net/1.13.1/css/jquery.dataTables.min.css">
<script src="<%=request.getContextPath() %>/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath() %>/js/jquery.serializejson.js"></script>
<script src="<%=request.getContextPath() %>/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
$(function(){
	
	$('.prev').on('click', function() {
		currentpage = parseInt($('.pnums').first().text().trim()) - 1;
		location.href = "<%=request.getContextPath()%>/board/List.do?page="+currentpage; 
	});
	  
	$('.pnums').on('click', function() {
		//검색을 해서 2페이지로 넘어갈 때 파라미터를 같이 가져가야하는데 안가져감. 그래서 다시 목록으로 간다.
		currentpage = parseInt($(this).text().trim());
		stype = <%=request.getParameter("stype")%>
		sword = <%=request.getParameter("sword")%>
		if(stype!=null && sword!=null){
			location.href = "<%=request.getContextPath()%>/board/List.do?page="+currentpage+"&sword="+sword+"&stype="+stype; 
		}else{
			location.href = "<%=request.getContextPath()%>/board/List.do?page="+currentpage; 
		}
	});
	  
	$('.next').on('click', function() {
		currentpage = parseInt($('.pnums').last().text().trim()) + 1;
		location.href = "<%=request.getContextPath()%>/board/List.do?page="+currentpage; 
	});
	  
	$('#insert').on('click', function() {
		location.href = "<%=request.getContextPath()%>/board/Insert.do";
	});
	  
	$("#searchMy").on("click", function(){
		vstype = $('#stype').val();
		vsword = $('#sword').val();
		location.href = "<%=request.getContextPath()%>/board/List.do?page=1&stype=" + vstype + "&sword=" + vsword;
	});
	  
	$('tbody tr').on('click', function(){
		boardNo = $(this).find("td").eq(0).text();
		location.href = "<%=request.getContextPath()%>/board/Read.do?board_no="+boardNo;
	});
});
</script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
	<jsp:include page="../../header.jsp"></jsp:include>
	
	<jsp:include page="../../sidebar.jsp"></jsp:include>
	
	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
	    <!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>SLAH<small>Control panel</small></h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li class="active">Dashboard</li>
			</ol>
		</section>
	
		<!-- Main content -->
		<section class="content">
			<div class="row">
				<div class="col-xs-12">
					<div class="box">
						<div class="box-header">
							<h3 class="box-title">게시판</h3>
							<div class="input-group input-group-sm" style="width: 440px; float: right; padding-top: 20px;">
								<select id="stype" class="form-control stype" style="width: 15%; margin-right: 5px;">
									<option value="BOARD_TITLE">제목</option>
									<option value="BOARD_CONTENT">내용</option>
								</select> 
								<input type="text" id="sword" name="table_search" class="form-control float-right" placeholder="Search" style="width: 65%; margin-right: 5px;">
								<div class="input-group-append">
									<button type="button" id="searchMy" class="btn btn-default"><i class="fas fa-search"></i>검색</button>
								</div>
							</div>
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<table id="myTable" class="table table-bordered table-hover">
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>작성일</th>
										<th>조회수</th>
									</tr>
								</thead>
								<tbody>
								<%
								list = (List<BoardVO>) request.getAttribute("boardList");
								if(list != null || list.size() > 0){
									for(BoardVO vo : list){
								%>
									<tr>
										<td><%=vo.getBoard_no() %></td>
										<td><%=vo.getBoard_title() %> </td>
										<td><%=vo.getMem_name() %></td>
										<td><%=vo.getBoard_date() %></td>
										<td><%=vo.getBoard_hit() %></td>
									</tr>
								<%
									}
								}
								%>
								</tbody>
							
							</table>
							<div style="display:inline-block; float: left;">
								<ul class="pagination">
									<li class="page-item"><a id="insert" class="page-link" href="#">글등록</a></li>
								</ul>
							</div>
							<div style="display:inline-block; float: right;">
								<ul class="pagination">
								<%
								int startpage = (int) request.getAttribute("startpage");
								int endpage = (int) request.getAttribute("endpage");
								int totalpage = (int) request.getAttribute("totalpage");
								if(startpage  > 1){%>
									<li class="page-item"><a class="page-link prev" href="#">Previous</a></li>
								<%} %>
							    
							    <%for(int i = startpage; i<= endpage; i++){%>
									<li class="page-item"><a class="page-link pnums" href="#"><%=i %></a></li>
							    <%};
	
							     if(endpage < totalpage){%>
									<li class="page-item"><a class="page-link next" href="#">Next</a></li>
							     <%}%>
								</ul>
							</div>
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->
	
	<jsp:include page="../../footer.jsp"></jsp:include>
 
</div>
<!-- ./wrapper -->

	<!-- jQuery 3 -->
	<script src="<%=request.getContextPath() %>/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script src="<%=request.getContextPath() %>/bower_components/jquery-ui/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
	  $.widget.bridge('uibutton', $.ui.button);
	</script>
	<!-- Bootstrap 3.3.7 -->
	<script src="<%=request.getContextPath() %>/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- Morris.js charts -->
	<script src="<%=request.getContextPath() %>/bower_components/raphael/raphael.min.js"></script>
	<script src="<%=request.getContextPath() %>/bower_components/morris.js/morris.min.js"></script>
	<!-- Sparkline -->
	<script src="<%=request.getContextPath() %>/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script src="<%=request.getContextPath() %>/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<%=request.getContextPath() %>/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- jQuery Knob Chart -->
	<script src="<%=request.getContextPath() %>/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script src="<%=request.getContextPath() %>/bower_components/moment/min/moment.min.js"></script>
	<script src="<%=request.getContextPath() %>/bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
	<!-- datepicker -->
	<script src="<%=request.getContextPath() %>/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script src="<%=request.getContextPath() %>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
	<!-- Slimscroll -->
	<script src="<%=request.getContextPath() %>/bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="<%=request.getContextPath() %>/bower_components/fastclick/lib/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="<%=request.getContextPath() %>/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="<%=request.getContextPath() %>/dist/js/pages/dashboard.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="<%=request.getContextPath() %>/dist/js/demo.js"></script>
</body>
</html>