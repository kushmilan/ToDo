<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
	<h1>Hi ${name}</h1>
</div> 


<div class = "container">	
	 <h1>Your all todo's are :</h1>
	 
	 <table class = "table table-striped">
	 		<tr>
			 	<th>Item Id</th> 
			 	<th>User name</th>
			 	<th>Description</th> 
			 	<th>Target Date</th>
			 	<th>Update Button</th>
			 	<th>Delete Button</th>
		 	</tr>
		 <c:forEach items="${todo}" var="t">
		 	<tr>
			 	<td>${t.id}</td> 
			 	<td>${t.user}</td>
			 	<td>${t.desc}</td> 		 	
			 	<td>${t.targetDate}</td>
			 	<td>
			 		<div class="btn btn-sucess">
					 	<a href = "/update-todo?id=${t.id}">Update</a>	 	 		 	
					</div>
		 		</td>
			 	<td>
			 		<div class="btn btn-danger">
					 	<a href = "/delete-todo?id=${t.id}">Delete</a>	 	 		 	
					</div>
		 		</td>
		 	</tr>
		 </c:forEach>
	 </table>
	 
	 <br>
	 
	 <div class="btn btn-success">
	 	<a href = "/add-todo">Add</a>	 	 		 	
	 </div>	 	
 
 </div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
</body>
</html>