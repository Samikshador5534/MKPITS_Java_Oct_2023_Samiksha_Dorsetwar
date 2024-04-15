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
<link type="text/css" rel="stylesheet" href="css/add-books-style.css"> 
</head>
 <% List<Books_Model> thBooks = (List<Books_Model>)request.getAttribute("BOOKS_LIST");%>
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
					<th>Action</th>
				</tr>
				<c:forEach var="tempBooks" items = "${BOOKS_LIST}">
				
				<!-- Set up a link link for each Books -->
				<c:url var="tempLink" value="BooksControllerServletNew">
				<c:param name="command" value="LOAD"/>
				<c:param name="booksId" value="${tempBooks.id}"/>
				</c:url>
				
				<!-- Set up a link to delete books -->
				<c:url var="deleteLink" value="BooksControllerServletNew">
				<c:param name="command" value="DELETE"/>
				<c:param name="booksId" value="${tempBooks.id}"/>
				</c:url>
				
				<tr>
				    <td>${tempBooks.id}</td>
					<td>${tempBooks.title}</td>
					<td>${tempBooks.author}</td>
					<td>${tempBooks.date}</td>
					<td>${tempBooks.genres}</td>
					<td>${tempBooks.characters}</td>
					<td>${tempBooks.synopsis}</td>
					<td><a href="${tempLink}">Update</a>
						|
						<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this books ?'))) return false">Delete</a>
						
						</td>
				</tr> 
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>