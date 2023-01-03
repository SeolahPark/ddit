<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	Date day = Calendar.getInstance().getTime();
%>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<p>현재시간 : <%=day %></p>
	
</body>
</html>