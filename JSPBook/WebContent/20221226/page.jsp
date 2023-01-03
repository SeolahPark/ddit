<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	Date day = new Date();
	double pow = Math.pow(5, 2);
%>

<p>현재날짜 : <%=day %></p>
<p>5의 제곱 : <%=pow %></p>
</body>
</html>