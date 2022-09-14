<%@page import="com.spring.main.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Employees</h1>

<%
	List<Employee> list = 
	(List<Employee>)request.getAttribute("list");

	for(Employee e : list){
		out.print(e + "<br />");
	}
%>
</body>
</html>