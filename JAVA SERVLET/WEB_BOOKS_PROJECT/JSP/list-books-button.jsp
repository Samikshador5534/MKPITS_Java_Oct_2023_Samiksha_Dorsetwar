<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.mkpits.books.Books_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link type="text/css" rel="stylesheet" href="css/style.css"> 
<link type="text/css" rel="stylesheet" href="css/add-student-style.css"> 
</head>
 <% List<Books_Model> theStudents = (List<Books_Model>)request.getAttribute("STUDENT_LIST");%>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>MKPITS UNIVERSITY</h2>
		</div>
	</div>

	<div ID="container">
		<div id="content">
		<input type="button" value="Add_Books" onclick="window.location.href='add-books-form.jsp';return false;"
		class="add-student-button">
			<table border = "1">
				<tr>
				    <th>id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Characters</th>
					<th>Synopsis</th>
				</tr>
				<c:forEach var="tempBooks" items = "${STUDENT_LIST}">
				
				<tr>
				    <td>${tempBooks.id}</td>
					<td>${tempBooks.title}</td>
					<td>${tempBooks.author}</td>
					<td>${tempBooks.date}</td>
					<td>${tempBooks.genres}</td>
					<td>${tempBooks.characters}</td>
					<td>${tempBooks.synopsis}</td>
				</tr> 
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>