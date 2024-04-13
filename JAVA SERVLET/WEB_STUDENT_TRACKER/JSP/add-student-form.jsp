<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add student</title>
<link type="css/text" rel="stylesheet" href="css/style.css">
<link type="css/text" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>Mkpits University</h2>
</div>
</div>
<div id="container">
<h3>add student</h3>
<form action="StudentControllerServletNew" method="get">
<input type="hidden" name="command" value="ADD"/>

<table>
<tbody>
<tr>
<td><label>First Name:</label></td>
<td><input type="text" name="firstName" required/></td>

<tr>
<td><label>Last Name:</label></td>
<td><input type="text" name="lastName"  required/></td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><input type="text" name="email" required/></td>
</tr>

<tr>
<td><input type="submit" value="save" class="save"></td>
</tr>
</tbody>
</table>
</form>
<div style="clear:both;"></div>
<p>
<a href="StudentControllerServletNew" >back to list</a>
</div>
</body>
</html>