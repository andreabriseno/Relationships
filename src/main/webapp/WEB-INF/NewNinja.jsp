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
<title>New Ninja</title>
</head>
<body>
<form:form action="/ninja/new" method="post" modelAttribute="ninja">
		<div>
			<form:label path="firstName">Name:</form:label>
			<form:errors path="firstName"></form:errors>
			<form:select path="firstName">
			<c:forEach items="${allPersons}" var="dojo">
			<option value="${dojo.id}">${dojo.firstName}</option>
			</c:forEach>
			</form:select>
		</div>
		<div>
				<form:label path="first_name">First Name:</form:label>
				<form:errors path="first_name"></form:errors>
				<form:input path="first_name"/>
		</div>
		<div>
			<form:label path="last_name">Last Name:</form:label>
			<form:errors path="last_name"></form:errors>
			<form:input path="last_name"/>
		</div>
		<div>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"></form:errors>
			<form:input path="age"/>
		</div>
		<div>
		<input type="submit" value="Create Ninja"/>
		</div>
	
	
	</form:form>

</body>
</html>