<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first Jsp is here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
	<div class ="container">
	
	<h1>Welcome to the ToDo app.</h1>
	<h2>Login</h2>
	<h1><font color="red">${errormsg}</font></h1>
	
 	<form class="form-group" action ="/login" method="post">
 		Enter your name <input type="text" name="name" />
 		Enter your password <input type="password" name="password" />
 		<input type="submit" />
 		
 	</form>
 	
 	</div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>