<%@page import="java.util.ArrayList"%>
<%@page import="kr.or.ddit.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Simple Tables</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/dist/css/adminlte.min.css">
</head>
<script src="${pageContext.request.contextPath }/js/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
$(function(){
	var formBtn = $("#formBtn");
	
	formBtn.on("click", function(){
		location.href = "/notice/form.do";
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

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>공지사항 게시판</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">DDIT HOME</a></li>
								<li class="breadcrumb-item active">공지사항 게시판</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="card-tools">
										<div class="input-group input-group-sm" style="width: 440px;">
											<select class="form-control">
												<option>제목</option>
												<option>작성자</option>
											</select> <input type="text" name="table_search"
												class="form-control float-right" placeholder="Search">
											<div class="input-group-append">
												<button type="submit" class="btn btn-default">
													<i class="fas fa-search"></i>검색
												</button>
											</div>
										</div>
									</div>
									<h3 class="card-title">공지사항</h3>
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<table class="table table-bordered">
										<thead>
											<tr>
												<th style="width: 6%">#</th>
												<th style="width: px">제목</th>
												<th style="width: 12%">작성자</th>
												<th style="width: 12%">작성일</th>
												<th style="width: 10%">조회수</th>
											</tr>
										</thead>
										<tbody>
											<%
												ArrayList<NoticeVO> noticeList = (ArrayList<NoticeVO>) request.getAttribute("noticeList");
												if(noticeList != null && noticeList.size() > 0){
													for(int i = 0; i < noticeList.size(); i++){
														NoticeVO notice = noticeList.get(i);
											%>
													<tr>
														<td><%=notice.getBoNo() %></td>
														<td>
															<a href="/notice/read.do?boNo=<%=notice.getBoNo()%>">
																<%=notice.getTitle() %>
															</a>
														</td>
														<td><%=notice.getWriter() %></td>
														<td><%=notice.getRegDate() %></td>
														<td>1456</td>
													</tr>
											<%													
													}	// for end 
												}	// if end
											%>
										</tbody>
									</table>
								</div>
								<div class="card-body">
									<input type="button" id="formBtn" value="등록" class="btn btn-primary float-right">
								</div>
								<!-- /.card-body -->
								<div class="card-footer clearfix">
									<ul class="pagination pagination-sm m-0 float-right">
										<li class="page-item"><a class="page-link" href="#">&laquo;</a></li>
										<li class="page-item"><a class="page-link" href="#">1</a></li>
										<li class="page-item"><a class="page-link" href="#">2</a></li>
										<li class="page-item"><a class="page-link" href="#">3</a></li>
										<li class="page-item"><a class="page-link" href="#">&raquo;</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->
			</section>
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

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
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
