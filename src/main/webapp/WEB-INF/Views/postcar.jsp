<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>postcar</title>
</head>
<body>
<h1>Post Your Car !</h1>

<form:form modelAttribute="car" action="savecar	" method="POST">
Car Type:
<form:input type="text" placeholder="name" path="name"></form:input><br><br>
Model:
<form:input type="text" placeholder="model" path="model"></form:input><br><br>
Make:
<form:input type="text" placeholder="make" path="make"></form:input><br><br>
Price:
<form:input type="text" placeholder="price" path="price"></form:input><br><br>
Company:
<form:input type="text" placeholder="company" id="company" path="company"></form:input><br><br>
<input type="submit" value="submit"/>
</form:form>
<a href="dash"><h2>Back to Profile</h2></a>

</body>
</html>