<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="login.css"> 
<title>login</title>
</head>
<body>
<div class="container">
  <h1>Login</h1>
  <form action="" method="post">  <label for="username">Username:</label>
    <input type="text" id="username" name="username" placeholder="Enter your username" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Enter your password" required>
    <button type="submit">Login</button>
  </form>
  <p>Don't have an account? <a href="registration.jsp" style= "text-decoration: none;">
  Sign Up</a></p>
</div>
</body>
</html>