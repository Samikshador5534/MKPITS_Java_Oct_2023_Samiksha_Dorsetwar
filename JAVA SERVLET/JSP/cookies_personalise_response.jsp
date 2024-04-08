<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie</title>
</head>
<body>
   <%
   /*read form data */
   String favlang= request.getParameter("favoriteLanguage");
   
   //create the cookies
   Cookie theCookie = new Cookie("myApp.favoriteLanguage", favlang);
   theCookie.setMaxAge(60*60*24*365);
   response.addCookie(theCookie);
   %>
   Thank You! we set your favoriteLanguage to :${param.favoriteLanguage}
   <br><br>
   <a href="cookies_homepage.jsp">homepage</a>
</body>
</html>