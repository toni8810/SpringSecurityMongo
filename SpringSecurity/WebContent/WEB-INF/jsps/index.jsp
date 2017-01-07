<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<style>
form {
	width: 200px;
	margin: auto;
}
</style>
</head>
<body>
<sf:form action="createAccount" method="post" modelAttribute="user">
	<label for="username">Username</label>
	<sf:input type="text" name="username" path="username" />
	<label for="password">Password</label>
	<sf:input type="password" name="password" path="password" />
	<label for="first_name">First Name</label>
	<sf:input type="text" name="first_name" path="first_name" />
	<label for="last_name">Last Name</label>
	<sf:input type="text" name="last_name" path="last_name" />
	<input type="submit" value="Submit">
</sf:form>
</body>
</html>