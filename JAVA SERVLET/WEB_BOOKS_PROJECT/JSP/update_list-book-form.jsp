<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-books-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>
	
	<div id="container">
	<h3>Update Student</h3>
	<form action="BooksControllerServletNew" method="get">
	<input type="hidden" name="command" value="UPDATE"/>
	<input type="hidden" name="booksId" value="${THE_BOOKS.id}">
	
	<table>
	<tbody>
	<tr> 
	<td><label>title:</label></td>
	<td><input type="text" name="title" value="${THE_BOOKS.title}"/></td>
	</tr>
	
	
	<tr> 
	<td><label>author:</label></td>
	<td><input type="text" name="author" value="${THE_BOOKS.author}"/></td>
	</tr>
	
	<tr> 
	<td><label>date:</label></td>
	<td><input type="text" name="date" value="${THE_BOOKS.date}"/></td>
	</tr>
	
	<tr> 
	<td><label>genres:</label></td>
	<td><input type="text" name="genres" value="${THE_BOOKS.genres}"/></td>
	</tr>
	
	<tr> 
	<td><label>characters:</label></td>
	<td><input type="text" name="characters" value="${THE_BOOKS.characters}"/></td>
	</tr>
	
	<tr> 
	<td><label>synopsis:</label></td>
	<td><input type="text" name="synopsis" value="${THE_BOOKS.synopsis}"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Update" class="save"></td>
	</tr>
	</tbody>
	
	</table>
	</form>
	<div style="clear:both;"></div>
	<p>
	<a href="BooksControllerServletNew">Back To List</a>
	</p>
	</div>
</body>
</html>