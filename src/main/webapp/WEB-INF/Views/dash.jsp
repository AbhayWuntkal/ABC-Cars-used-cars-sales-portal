<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dash</title>
</head>
<body>
	<h1>Login successful</h1>
	<br>
	<sec:authorize access="hasRole('USER')">
		<a href="postcar">Post Car</a>
		<a href="viewprofile">View Profile</a>
		<a href="carform">Search Cars</a>
	</sec:authorize>
	<sec:authorize access="hasRole('ADMIN')">
		<a href="postcar">Post Car</a>
		<a href="adminprofile">View Profile</a>
		<a href="carform">Search Cars</a>
		<a href="listusers">User List</a>
		<a href="listcars">Car List</a>
	</sec:authorize>

	<br>

	<form action="logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> <br> <input type="submit"
			name="Logout" value="Logout"></input>
	</form>

</body>
</html>