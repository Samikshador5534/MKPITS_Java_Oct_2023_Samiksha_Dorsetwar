<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List, com.mkpits.model.Student"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
// create some sample data

List<Student> data = new ArrayList<Student>();
data.add(new Student("karan", "mohod", true));
data.add(new Student("raj", "warohkar", false));
data.add(new Student("rohit", "sharma", true));
data.add(new Student("ashik", "tembare", true));
pageContext.setAttribute("myStudent", data);
%>
<table border="1">
<tr>
<thead>
<th>First Name</th>
<th>Last Name</th>
<th>Gold Customer</th>
</thead>
</tr>

<c:forEach var="tempStudent" items="${myStudent}">
<tr>
<td>${tempStudent.fName}</td>
<td>${tempStudent.lName}</td>
<td><c:Lchoose>
<c:if test="${tempStudent.goldCustomer}">speciel discout</c:if> 
 <c:otherwise>------</c:otherwise>
 </c:Lchoose>   
</td>
</tr>
</table>
<br>
</c:forEach>
</body>
</html>
</html>