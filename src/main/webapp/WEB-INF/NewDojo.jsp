<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<div>
	<h1>New Dojo</h1>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
		<div>
		<form:label path="firstName">Name:</form:label>
		<form:errors path="firstName"></form:errors>
		<form:input path="firstName"/>
		</div>
		<div>
		<input type="submit" value="Submit"/>
		</div>
	
	
	</form:form>
	</div>

</body>
</html>