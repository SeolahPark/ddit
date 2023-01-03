<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="org.apache.commons.fileupload.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
	String path = "D:/d_other/upload";

	DiskFileUpload upload = new DiskFileUpload();
	
	upload.setSizeMax(1000000);
	upload.setSizeThreshold(4096);
	upload.setRepositoryPath(path);
	
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	
	while(params.hasNext()){
		FileItem item = (FileItem) params.next();
		if(item.isFormField()){
			String name = item.getFieldName();
			String value = item.getString("UTF-8");
			out.println(name + " = " + value + "<br>");
		}else{
			String fileName = item.getName();
			fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			File file = new File(path + "/" + fileName);
			item.write(file);
		}
	}
%>
</body>
</html>