<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome</title>
</head>
<body>

	<div class="container">

 	<h1>Enter the details of your ToDo</h1>
 
	<form:form class="form-group" action="/add-todo" method = "post" commandName="todo">
		Enter Your name <form:input type = "text" path = "user" class="form-control" id="validationCustom01" placeholder="Enter your name here" require="required"></form:input>
		Enter the description <form:input type = "text" path = "desc" class="form-control" id="validationCustom01" placeholder="Enter your task here" require="required"></form:input>
		<div class="btn btn-success">
			<input type = "submit"  value = "Submit"/>
		</div>
	</form:form>
	
	</div>
 
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
</body>
</html>