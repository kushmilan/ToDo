<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Welcome</title>
</head>
<body>
 <h1>Enter the details of your ToDo</h1>
 
	<form action="/delete-todo" method = "post">
		Enter the Id you wanna delete <input type = "text"  name = "id"/>
		<input type = "submit"  value = "Delete"/>
	</form>
 
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
</body>
</html>