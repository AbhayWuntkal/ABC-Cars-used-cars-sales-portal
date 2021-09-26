<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>searchcar</title>
</head>
<body>
	<div align="center">
		<h2>Search Result</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>Name</th>
				<th>Model</th>
				<th>Make</th>
				<th>Company</th>
				<th>Price range</th>
				<th>Car Owner</th>
			</tr>
			<c:forEach items="${carlist}" var="carlist">
				<tr>

					<td>${carlist.name}</td>
					<td>${carlist.model}</td>
					<td>${carlist.make}</td>
					<td>${carlist.company}</td>
					<td>${carlist.price}</td>
					<td>${carlist.carowner}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="carform"><h2>Search other car</h2></a> <a href="dash"><h2>Profile</h2></a>
	</div>

</body>
</html>