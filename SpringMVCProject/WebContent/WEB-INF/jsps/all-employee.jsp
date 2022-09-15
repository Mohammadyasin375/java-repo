<%@page import="com.spring.main.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	body{
		margin: 0px;
	}
	.emp_block{
		border: 1px solid #000;
		padding: 20px;
		width: 55%;
		float: left;	
		margin: 10px;
		background: gray;
		color: #fff;
		font-family: monospace;
		font-size: x-large;
	}
	.emp_block1{
		border: 1px solid #000;
		padding: 20px;
		width: 35%;
		float: left;	
		margin: 10px;
		background: gray;
		color: #fff;
		font-family: monospace;
		font-size: x-large;
	}
	
</style>
</head>
<body>
<section> 
<div class="emp_block">
	<h1>All Employees</h1>


<%
	List<Employee> list = 
	(List<Employee>)request.getAttribute("list");

	for(Employee e : list){
		out.print(e + "<br />");
	}
%>
</div>

<div class="emp_block1">
	<h3>Add Employee </h3>
	
	<form action="<%=request.getContextPath() %>/insert-employee" method="get">
		<label>Name: </label> 
		<input type="text" name="ename">
		<br /><br />
		<label>City: </label> 
		<input type="text" name="ecity">
		<br /><br />
		<label>Salary: </label> 
		<input type="number" name="esalary">
		<br /><br />
		<input type="submit" value="Add Employee">
	</form>
	
</div>
</section>



</body>
</html>