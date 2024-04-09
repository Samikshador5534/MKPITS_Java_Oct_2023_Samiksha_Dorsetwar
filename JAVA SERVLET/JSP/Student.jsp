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
<c:forEach var="tempStudent" items="${myStudent}">
${tempStudent.fName}
${tempStudent.lName}
${tempStudent.isgoidCustomer}
<br>
</c:forEach>
</body>
</html>