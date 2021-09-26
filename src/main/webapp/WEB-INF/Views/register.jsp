<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration</title>
</head>
<body>

<h1>Register Here !!</h1>
<form:form modelAttribute="user" action="save" method="POST">

Name:
<form:input type="text" placeholder="FullName" path="name"></form:input><br>
Email:
<form:input type="text" placeholder="Email" path="email"></form:input><br>
Username:
<form:input type="text" placeholder="Username" path="userName"></form:input><br>
Password:
<form:input type="password" placeholder="password" id="pass" path="password"></form:input><br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>