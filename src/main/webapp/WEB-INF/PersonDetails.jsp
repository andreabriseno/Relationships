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
<title>Insert title here</title>
</head>
<body>


<h1><c:out value="${dojo.firstName}"/> Details:</h1>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>age</th>
        </tr>
    </thead>
    <tbody>
        <tr>
        <c:forEach items="${dojo.ninja}" var="ninja">
            <td>
                <c:out value="${ninja.first_name}"/>
            </td>
            <td>
                <c:out value="${ninja.last_name}"/>
            </td>
            <td><c:out value="${ninja.age}"/></td>
          
        </c:forEach>
        </tr>
    </tbody>
</table>
</body>
</html>