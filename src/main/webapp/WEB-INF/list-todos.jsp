<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Todo's of ${name}</title>
</head>
<body>
<div class="container">
Here are the list of your todos. 
<H1>Your Todos</H1>
<table class="table table-striped">
<caption></caption>
<thead>
	<tr>
		<th>Description</th>
		<th>Target Date</th>
		<th>Is it done?</th>
		<th>Delete</th>
	</tr>
</thead>

<tbody>
	<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.desc}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.done}</td>
				<td><a type="button" class="btn btn-warning">Delete</a></td>
			</tr>
	
	</c:forEach>




</tbody>
	
</table>
<BR/>
<div><a class="button" href="/add-todos"> Add a Todo </a></div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>
</html>