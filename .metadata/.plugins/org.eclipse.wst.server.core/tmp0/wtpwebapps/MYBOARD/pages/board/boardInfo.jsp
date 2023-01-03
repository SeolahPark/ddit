<%@page import="vo.BoardCommentVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
BoardVO vo = (BoardVO)request.getAttribute("boardInfo");
List<BoardCommentVO> boardCommentList = (List<BoardCommentVO>)request.getAttribute("boardCommentList");
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
	$('#backtolist').on('click', function(){
		location.href = "<%=request.getContextPath()%>/board/List.do?page=1";
	});
	
	$('#update').on('click', function(){
		location.href = "<%=request.getContextPath()%>/board/Update.do?board_no="+<%=vo.getBoard_no()%>;
	});
	
	$('#delete').on('click', function(){
		location.href = "<%=request.getContextPath()%>/board/Delete.do?board_no="+<%=vo.getBoard_no()%>;
	});

	//댓글 수정 버튼 클릭 
	$('.coUpdate').on('click', function(){
		vidx = $(this).attr('idx');
	});
	
	$('.coDelete').on('click', function(){
		vidx = $(this).attr('idx');
		location.href = "<%=request.getContextPath()%>/board/deleteComment.do?board_comment_no="+vidx+"&board_no="+<%=vo.getBoard_no()%>;
	});
	
});
</script>
<style type="text/css">
#modifyForm {
	display: none;
}
</style>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<!-- //댓글 수정 편집창 -->
<div id="modifyForm">
	<textarea id="text" rows="1" cols="40"></textarea>
	<input type="button" value="확인" id="btnok"> 
	<input type="button" value="취소" id="btnreset">
</div>
	
<div class="wrapper">
	<jsp:include page="../../header.jsp"></jsp:include>
	
	<jsp:include page="../../sidebar.jsp"></jsp:include>
	
	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<section class="content">
			<div class="row">
				<div class="col-md-12">	
					<!-- Box Comment -->
					<div class="box box-widget">
						<div class="box-header with-border">
							<div class="user-block">
								<img class="img-circle" src="../dist/img/user1-128x128.jpg" alt="User Image">
								<span class="username"><a href="#"><%=vo.getMem_name() %></a></span>
								<span class="description"><%=vo.getBoard_date() %></span>
							</div>
							<!-- /.	user-block -->
							<div class="box-tools">
								<button type="button" id="update" class="btn btn-box-tool"><i class="fa fa-eraser"></i>수정</button>
								<button type="button" id="delete" class="btn btn-box-tool"><i class="fa fa-times"></i>삭제</button>
								<button type="button" id="backtolist" class="btn btn-box-tool"><i class="fa fa-list"></i>목록</button>
							</div>
						<!-- /.box-tools -->
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<%int filecheck = (int)request.getAttribute("filecheck");
							if(filecheck == 1){%>
								<img class="img-circle img-sm" src="<%=request.getContextPath() %>/files/imageView.do?mem_no=60&file_category=2" alt="User Image">
							<%} %>
							<p><%=vo.getBoard_content() %></p>
							<button type="button" class="btn btn-default btn-xs"><i class="fa fa-share"></i> Share</button>
							<button type="button" class="btn btn-default btn-xs"><i class="fa fa-thumbs-o-up"></i> Like</button>
							<span class="pull-right text-muted"><%=vo.getBoard_hit() %> views - 127 likes - 3 comments</span>
						</div>
						
						<!-- /.box-body -->
						<div class="box-footer box-comments">
							<!-- /.box-comment -->
							<div class="box-comment">
								<%if(boardCommentList != null || boardCommentList.size() > 0){
									for(BoardCommentVO cvo : boardCommentList){%>
								<!-- User image -->
								<img class="img-circle img-sm" src="../dist/img/user4-128x128.jpg" alt="User Image">
								
								<div class="comment-text">
									<span class="username"> <%=cvo.getMem_name() %><span class="text-muted pull-right"><%=cvo.getBoard_comment_date() %></span></span>
									<!-- /.username -->
									<span id="acontent<%=cvo.getBoard_comment_no() %>"><%=cvo.getBoard_comment_content() %></span>
									<div id="abt<%=cvo.getBoard_comment_no() %>" class="box-tools" style="display: inline-block; float: right;">
										<button type="button" name="coUpdate" idx="<%=cvo.getBoard_comment_no() %>" class="btn btn-box-tool coUpdate" title="Collapse"><i class="fa fa-eraser"></i>수정</button>
										<button type="button" name="coDelete" idx="<%=cvo.getBoard_comment_no() %>" class="btn btn-box-tool coDelete" title="Remove"><i class="fa fa-times"></i>삭제</button>
									</div>
								</div>
								
								<hr style="  margin-top: 10px; margin-bottom: 10px;"/>
								<!-- /.comment-text -->
								<%}
								} %>
							</div>
							<!-- /.box-comment -->
						</div>
						
						<!-- /.box-footer -->
						<div class="box-footer">
							<form action="<%=request.getContextPath() %>/board/insertComment.do" method="post">
								<input type="hidden" name="mem_no" value="60">
								<input type="hidden" name="board_no" value="<%=vo.getBoard_no()%>">
								<img class="img-responsive img-circle img-sm" src="../dist/img/user4-128x128.jpg" alt="Alt Text">
								<!-- .img-push is used to add margin to elements next to floating images -->
								<div class="img-push">
									<input type="text" name="board_comment_content" class="form-control input-sm" placeholder="Press enter to post comment" style="width: 90%; display: inline-block; float: left;">
									<div class="pull-right box-tools" style="display: inline-block; float: right;">
										<button type="submit" class="btn btn-info btn-sm" title="Collapse"><i class="fa fa-plus-square"></i>등록</button>
										<button type="reset" class="btn btn-info btn-sm" title="Remove"><i class="fa fa-times"></i>취소</button>
									</div>
								</div>
							</form>
						</div>
						<!-- /.box-footer -->
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