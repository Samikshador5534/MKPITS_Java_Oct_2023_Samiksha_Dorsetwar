<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
			<th>emails</th>
		</thead>
		</tr>


		<c:forEach var="tempStudent" items="${myStudent}">

			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td><c:if test="${tempStudent.goldCustomer}">Special Discount</c:if>
					<c:if test="${not tempStudent.goldCustomer}">----</c:if>
				</td>
			</tr>
			<br>
			
		</c:forEach>
	</table>
</body>
</html>