<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
	<h3><a href="index.html">Home</a></h3>
		<h2>Add Student Data</h2>
		<form:form method="POST" action="saveStudent.html">
	   		<table>
			    <tr>
			        <td><form:label path="stuId">Student ID:</form:label></td>
			        <td><form:input path="stuId" value="${student.stuId}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="stuName">Student Name:</form:label></td>
			        <td><form:input path="stuName" value="${student.stuName}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="stuAge">Student Age:</form:label></td>
			        <td><form:input path="stuAge" value="${student.stuAge}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="stuClass">Student Class:</form:label></td>
			        <td><form:input path="stuClass" value="${student.stuClass}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty students}">
		<h2>List Students</h2>
	<table align="left" border="1">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Student Class</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.stuId}"/></td>
				<td><c:out value="${student.stuName}"/></td>
				<td><c:out value="${student.stuAge}"/></td>
				<td><c:out value="${student.stuClass}"/></td>
				<td align="center"><a href="editStudent.html?stuId=${student.stuId}">Edit</a> | <a href="deleteStudent.html?stuId=${student.stuId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html>