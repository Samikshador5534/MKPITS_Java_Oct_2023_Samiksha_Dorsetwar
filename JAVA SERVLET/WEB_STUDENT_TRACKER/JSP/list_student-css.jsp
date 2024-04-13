<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.jdbc1.Student_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css"> 
</head>
 <% List<Student_Model> theStudents = (List<Student_Model>)request.getAttribute("STUDENT_LIST");%>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>MKPITS UNIVERSITY</h2>
		</div>
	</div>

	<div ID="container">
		<div id="content">
			<table border = "1">
				<tr>
				    <th>id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					
				</tr>
				<c:forEach var="tempStudent" items = "${STUDENT_LIST}">
				
				<tr>
				    <td>${tempStudent.id}</td>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email}</td>
					
				</tr> 
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>