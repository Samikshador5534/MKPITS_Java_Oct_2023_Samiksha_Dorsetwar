<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
</head>
<body>
 <h3>Training</h3>
 <!-- read the favorite language from cookie -->
 <%
 //the default --- if there are no cookies
 String favLang = "java";
 //get cookies from the browser
 Cookie[] theCookie = request.getCookies();
 //find our favorite language cookies
 if(theCookie != null){
	 for(Cookie tempCookie: theCookie){
		 if("myApp.favoriteLanguage".equals(tempCookie.getName())){
		 favLang = tempCookie.getValue();
		 break;
	   }
    }
 }
 
 %>
 <!-- now show a personalise page-- use the "favLang" variable -->
 <!-- show new books for this lang -->
 <h4>
 New books for
 <%=favLang%></h4>
 <ul>
 <li>hello java</li>
  <li>hello java</li>
   <li>hello java</li>
 </ul>
 
 
 <h4>
 New jobs for
 <%=favLang%></h4>
 <ul>
 <li>hello java</li>
  <li>hello java</li>
   <li>hello java</li>
 </ul>
 
 <hr>
 <a href="cookies_personalise_form.html">personalise this page</a> 
</body>
</html>