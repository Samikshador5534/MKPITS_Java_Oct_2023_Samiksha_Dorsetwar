<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="data" value="mkpits"/>
Length of the string <b>${data}</b> : ${fn:length(data)}
<br><br>
UpperCase version of string <b>${data}</b> : ${fn:toUpperCase(data)}
<br><br>
Does string <b>${data}</b> start with <b>${mk}</b>? : ${startsWith(data, "mk")}

</body>
</html>