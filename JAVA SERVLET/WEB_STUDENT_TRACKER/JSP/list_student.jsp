<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <% List<Student> theStudents = (List<Student>)request.getAttribute("STUDENT_LIST");%>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>MKPITS UNIVERSITY</h2>
		</div>
	</div>

	<div ID="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<%for (Student tempStudent : theStudents)
				{%>
				<tr>
					<td><%=tempStudent.getFirstName()%></td>
					<td><%=tempStudent.getLastName()%></td>
					<td><%=tempStudent.getEmail()%></td>
				</tr>
				<%}%>
			</table>
		</div>
	</div>
</body>
</html>