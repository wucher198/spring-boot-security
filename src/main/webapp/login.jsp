<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in with your account</title>
</head>
<body>
	<div>
		<c:url value="/login" var="loginURL" />
		<form method="POST" action="${loginURL}" >
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			<div>
				<label for="username">Username: </label>
				<input type="text" id="username" name="username" placeholder="Enter Username" required="required"/>
			</div>
			<div>
				<label for="password">Password: </label>
				<input type="password" id="password" name="password" placeholder="Enter Password" required="required"/>
			</div>
			<div>
				<input type="submit" value="Login"/>
			</div>
		</form> 
	</div>
</body>
</html>