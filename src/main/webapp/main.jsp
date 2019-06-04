<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/settings" var="settingsURL"/>
	<c:url value="/login" var="loginURL"/>
	<c:url value="/logout" var="logoutURL"/>
	<div>
		<a href="${settingsURL}">Settings</a>
	</div>
	<div>
		<a href="${loginURL}">Login</a>
	</div>
	<div>
		<form:form id="logoutForm" method="POST" action="${logoutURL}">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</form:form>
		<a onclick="document.forms['logoutForm'].submit()">Logout</a>
	</div>
</body>
</html>