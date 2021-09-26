<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h2>User profile</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>Username</th>
				<th>Name</th>
				<th>Email</th>
				<th>Edit</th>
			</tr>

			<tr>
				<td>${User.userName}</td>
				<td>${User.name}</td>
				<td>${User.email}</td>
				<td><a href="editadmin?id=${User.id}">Edit Profile</a></td>
			</tr>
		</table>
		<a href="dash"><h2>Back to Profile</h2></a>
	</div>

</body>
</html>