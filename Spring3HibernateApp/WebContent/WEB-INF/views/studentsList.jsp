<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Students</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<h1>List Students</h1>
<h3><a href="addStudent.html">Add More Student</a></h3>

<c:if test="${!empty students}">
	<table align="left" border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student Class</th>			
		</tr>

		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.stuId}"/></td>
				<td><c:out value="${student.stuName}"/></td>
				<td><c:out value="${student.stuAge}"/></td>
				<td><c:out value="${student.stuClass}"/></td>				
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>