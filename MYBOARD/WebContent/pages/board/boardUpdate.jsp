<%@page import="vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
BoardVO vo = (BoardVO)request.getAttribute("boardInfo");
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
			<h1>Text Editors<small>Advanced form element</small></h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">Forms</a></li>
				<li class="active">Editors</li>
			</ol>
		</section>

		<!-- Main content -->
		<section class="content">
			<div class="row">
				<div class="col-md-12">
					<form action="<%=request.getContextPath() %>/board/Update.do" method="post" enctype="multipart/form-data">
						<div class="box box-info">
							<div class="box-header">
								<h3 class="box-title">CK Editor<small>Advanced and full of features</small></h3>
								<!-- tools box -->
								<div class="pull-right box-tools">
									<button type="submit" class="btn btn-info btn-sm" title="Collapse"><i class="fa fa-minus"></i>등록</button>
									<button type="button" class="btn btn-info btn-sm" title="Remove"><i class="fa fa-times"></i>취소</button>
								</div>
								<!-- /. tools -->
							</div>
							<!-- /.box-header -->
							<div class="box-body pad">
									<input type="hidden" id="board_no" name="board_no" value="<%=vo.getBoard_no()%>"/>
									<input type="hidden" id="mem_no" name="mem_no" value="<%=vo.getMem_no()%>"/>
									<div class="form-group">
					                  <label>Text</label>
					                  <input type="text" id="board_title" name="board_title" class="form-control" placeholder="제목" value="<%=vo.getBoard_title()%>">
					                </div>
									<textarea id="board_content" name="board_content" rows="10" cols="80"><%=vo.getBoard_content() %></textarea>
							</div>
						</div>
					</form>
					<!-- /.box -->
				</div>
				<!-- /.col-->
			</div>
			<!-- ./row -->
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
	<!-- FastClick -->
	<script src="<%=request.getContextPath() %>/bower_components/fastclick/lib/fastclick.js"></script>
	<!-- CK Editor -->
	<script src="<%=request.getContextPath() %>/bower_components/ckeditor/ckeditor.js"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script src="<%=request.getContextPath() %>/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script>
  $(function () {
    // Replace the <textarea id="editor1"> with a CKEditor
    // instance, using default configuration.
    CKEDITOR.replace('board_content')
    //bootstrap WYSIHTML5 - text editor
    $('.textarea').wysihtml5()
  })
</script>
</body>
</html>