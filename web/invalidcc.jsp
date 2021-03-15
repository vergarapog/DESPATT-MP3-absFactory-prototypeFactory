<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product not available</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto:wght@100&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/7dabdac481.js" crossorigin="anonymous"></script>

</head>
<body style="font-family: 'Montserrat', sans-serif;">
<nav class="navbar navbar-light " style="background-color: #f2f2f2">
  <a class="navbar-brand" href="index.jsp">
    <img src="images/web-logo-final5.png" width="130" height="60" class="d-inline-block align-top" alt="" style="margin-left: 10em;">
    
  </a>
  
  
</nav>
	<br><br><br><br><br>
	<%
		//declare local variables

		
	
	%>
	<div class="container">
			<div class="card">

				<div class="card-body">

				<h3 class="card-title">Invalid Credit Card Number!</h3>
				
				<div class="col-12">
					
<hr>
				
					<div class="row">
					<p class="text-info" style="font-weight: bold">Click the button below to try again.</p>
					</div>
					<br>
					<a href="index.jsp" class="btn btn-primary" style="margin-left: -1em;">Try again</a>
						
					</div>
				 </div>
			</div>
		</div>
		<br><br><br><br><br><br><br><br><br><br>
</body>


<jsp:include page ="design-comp/footer.jsp" />