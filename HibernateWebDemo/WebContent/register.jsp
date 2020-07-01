<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.lcipl.dao.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<a href="index.jsp">Home</a>
	<jsp:useBean id="obj" class="com.lcipl.bean.User">
	</jsp:useBean>
	<jsp:setProperty property="*" name="obj" />

	<%
		int i = UserDao.register(obj);
		if (i > 0)
			out.print("<h1>You are successfully registered</h1>");
	%>
</body>
</html>