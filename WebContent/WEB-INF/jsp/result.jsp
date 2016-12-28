<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<form:form modelAttribute="student" >
<table>
<tr><td>Name: </td><td>${student.name}</td></tr>
<tr><td>Age: </td><td>${student.age}</td></tr>
<tr><td>Id: </td><td>${student.id}</td></tr>
</table>
</form:form>
</body>
</html>