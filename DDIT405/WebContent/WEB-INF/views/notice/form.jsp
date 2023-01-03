<%@page import="kr.or.ddit.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Blank Page</title>

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/plugins/fontawesome-free/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/dist/css/adminlte.min.css">
</head>
<script src="${pageContext.request.contextPath }/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
$(function(){
	var listBtn = $("#listBtn");
	var formBtn = $("#formBtn");
	
	listBtn.on("click", function(){
		location.href = "/notice/list.do";
	});
	
	formBtn.on("click", function(){
		if($("#title").val() == null || $("#title").val() == ""){
			alert("제목을 입력해주세요!");
			$("#title").focus();
			return false;
		}
		
		if($(this).val() == "수정"){
			$("#registerForm").attr("action", "/notice/modify.do");
		}
		
		$("#registerForm").submit();
	});
});
</script>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
			</ul>
		</nav>

		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<a href="../../index3.html" class="brand-link"> <img
				src="${pageContext.request.contextPath }/resources/dist/img/AdminLTELogo.png"
				alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
				style="opacity: .8"> <span
				class="brand-text font-weight-light">SPRING</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user (optional) -->
				<div class="user-panel mt-3 pb-3 mb-3 d-flex">
					<div class="image">
						<img
							src="${pageContext.request.contextPath }/resources/dist/img/user2-160x160.jpg"
							class="img-circle elevation-2" alt="User Image">
					</div>
					<div class="info">
						<a href="#" class="d-block">DDIT Spring</a>
					</div>
				</div>
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>공지사항</p>
						</a></li>
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>
		<%
			String type = "등록";
			NoticeVO noticeVO = (NoticeVO) request.getAttribute("notice");
			String status = (String) request.getAttribute("status");	// 수정일때 'u'
			if(status != null && status.equals("u")){
				type = "수정";
			}
		%>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>공지사항 <%=type %></h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">DDIT HOME</a></li>
								<li class="breadcrumb-item active">공지사항 <%=type %></li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<%
				if(noticeVO != null){
			%>
			<!-- Main content -->
			<section class="content">
				<form class="row" action="/notice/register.do" method="post" id="registerForm">
					<%
						if(status != null && status.equals("u")){
					%>
						<input type="hidden" name="boNo" value="<%=noticeVO.getBoNo()%>"/> 
					<%		
						}
					%>
					<div class="col-md-12">
						<div class="card card-primary">
							<div class="card-header">
								<h3 class="card-title">공지사항 <%=type %></h3>
								<div class="card-tools"></div>
							</div>
							<div class="card-body">
								<div class="form-group">
									<label for="inputName">제목을 입력해주세요</label> 
									<input type="text" id="title" name="title" value="<%=noticeVO.getTitle() %>" class="form-control" placeholder="제목을 입력해주세요">
								</div>
								<div class="form-group">
									<label for="inputDescription">내용을 입력해주세요</label>
									<textarea id="content" class="form-control" name="content" rows="14"><%=noticeVO.getContent() %></textarea>
								</div>
							</div>
							<div class="card-footer bg-white">
								<div class="row">
									<div class="col-12">
										<input type="button" id="listBtn" value="목록" class="btn btn-success float-right"> 
										<input type="button" id="formBtn" value="<%=type %>" class="btn btn-primary float-right">
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</section>
			<%
				}else{
			%>
			<!-- Main content -->
			<section class="content">
				<form class="row" action="/notice/register.do" method="post" id="registerForm">
					<div class="col-md-12">
						<div class="card card-primary">
							<div class="card-header">
								<h3 class="card-title">공지사항 <%=type %></h3>
								<div class="card-tools"></div>
							</div>
							<div class="card-body">
								<div class="form-group">
									<label for="inputName">제목을 입력해주세요</label> 
									<input type="text" id="title" name="title" class="form-control" placeholder="제목을 입력해주세요">
								</div>
								<div class="form-group">
									<label for="inputDescription">내용을 입력해주세요</label>
									<textarea id="content" class="form-control" name="content" rows="14"></textarea>
								</div>
							</div>
							<div class="card-footer bg-white">
								<div class="row">
									<div class="col-12">
										<input type="button" id="listBtn" value="목록" class="btn btn-success float-right"> 
										<input type="button" id="formBtn" value="<%=type %>" class="btn btn-primary float-right">
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>
			</section>
			<%
				}
			%>

			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<footer class="main-footer">
			<div class="float-right d-none d-sm-block">
				<b>Version</b> 1.0.0
			</div>
			<strong>Copyright &copy; 2014-2021 <a href="#">DDIT
					SPRING</a>.
			</strong> All rights reserved.
		</footer>
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath }/resources/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script
		src="${pageContext.request.contextPath }/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script
		src="${pageContext.request.contextPath }/resources/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script
		src="${pageContext.request.contextPath }/resources/dist/js/demo.js"></script>
</body>
</html>
