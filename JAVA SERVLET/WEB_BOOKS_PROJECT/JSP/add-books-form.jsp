<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add student</title>
 <link type="css/text" rel="stylesheet" href="css/style.css">
<link type="css/text" rel="stylesheet" href="css/add-books-style.css"> 
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>Mkpits University</h2>
</div>
</div>
<div id="container">
<h3>add Books</h3>
<form action="BooksControllerServletNew" method="get">
<input type="hidden" name="command" value="ADD"/>

<table>
<tbody>
<tr>
<td><label>Title:</label></td>
<td><input type="text" name="title"  required/></td>

<tr>
<td><label>Author:</label></td>
<td><input type="text" name="author" required  /></td>
</tr>

<tr>
<td><label>Date:</label></td>
<td><input type="Date" name="date" required /></td>
</tr>

<tr>
<td><label>Genres:</label></td>
<td><input type="text" name="genres" required/></td>
</tr>

<tr>
<td><label>Characters:</label></td>
<td><input type="text" name="characters" required/></td>
</tr>

<tr>
<td><label>Synopsis:</label></td>
<td><input type="text" name="synopsis" required /></td>
</tr>

<tr>
<td><input type="submit" value="save" class="save"></td>
</tr>
</tbody>
</table>
</form>
<div style="clear:both;"></div>
<p>
<a href="BooksControllerServletNew" >back to list</a>
</div>
</body>
</html>