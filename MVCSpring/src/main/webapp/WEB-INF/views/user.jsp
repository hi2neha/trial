<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
	Greeting from test.jsp : ${greeting}
	<form:form method="post" action="/MVCSpring/createUser" modelAttribute="userForm">
		<div class="userForm">
	    <label><b>Username</b></label>
	    <input type="text" placeholder="Enter name" name="userName">
		<br>
	    <label><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="password" required>
		<br>
		<br>
	    <label><b>Age</b></label>
	    <form:input path="age" type="text" placeholder="Enter age"/>
		<br>
	    <button type="submit">Login</button>
	    <input type="checkbox" checked="checked"> Remember me
	  </div>
	</form:form>
</body>
</html>