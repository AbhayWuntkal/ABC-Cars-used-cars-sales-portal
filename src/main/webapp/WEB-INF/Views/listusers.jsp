<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<h2>Search Result</h2>
<table border="1" cellpadding="5">
		<tr>
			<th>Username</th>
			<th>Name</th>
			<th>Email</th>
			<th>Delete</th>
		</tr>
	<c:forEach items="${userlist}" var="userlist">
		<tr>
		
			<td>${userlist.userName}</td>
			<td>${userlist.name}</td>
			<td>${userlist.email}</td>
			<td><a href="deleteprofile?id=${userlist.id}" >Delete Profile</a></td>
		</tr>
	</c:forEach>
	<a href="dash"><h2>Back to Profile</h2></a>
	</table>
</div>

</body>
</html>