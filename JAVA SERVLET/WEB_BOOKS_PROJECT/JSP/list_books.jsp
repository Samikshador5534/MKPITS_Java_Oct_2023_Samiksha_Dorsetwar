<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.books.Books_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <% List<Books_Model> theBooks= (List<Books_Model>)request.getAttribute("BOOKS_LIST");%>
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
					 <th>id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Characters</th>
					<th>Synopsis</th>
				</tr>
				<%for (Books_Model tempBooks : theBooks)
				{%>
				<tr>
					<td><%=tempBooks.getTitle()%></td>
					<td><%=tempBooks.getAuthor()%></td>
					<td><%=tempBooks.getDate()%></td>
					<td><%=tempBooks.getGenres()%></td>
					<td><%=tempBooks.getCharacters()%></td>
					<td><%=tempBooks.getSynopsis()%></td>
				</tr>
				<%}%>
			</table>
		</div>
	</div>
</body>
</html>