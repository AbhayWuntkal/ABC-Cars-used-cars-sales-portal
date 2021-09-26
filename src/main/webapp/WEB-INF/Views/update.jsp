<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>editprofile</title>
</head>
<body>
	<div align="center">
		<h2>Edit Profile</h2>

		<form:form modelAttribute="User" action="saveprofile" method="post">
			<form:hidden path="id" />
			<form:hidden path="password" />
			<form:input type="text" placeholder="Username" path="userName"></form:input>
			<br>
			<form:input type="text" placeholder="Name" path="name"></form:input>
			<br>
			<form:input type="text" placeholder="Email" path="email"></form:input>
			<br>
			<input type="submit" value="submit" />
			<a href="dash"><h2>Back to Profile</h2></a>
		</form:form>

	</div>
</body>
</html>