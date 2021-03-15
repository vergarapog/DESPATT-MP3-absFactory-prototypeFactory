<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto:wght@100&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/7dabdac481.js" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body style="font-family: 'Montserrat', sans-serif;">
<nav class="navbar navbar-light " style="background-color: #f2f2f2">
  <a class="navbar-brand" href="index.jsp">
    <img src="images/web-logo-final5.png" width="130" height="60" class="d-inline-block align-top" alt="" style="margin-left: 10em;">
    
  </a>
  
  <form action="cart.jsp" method="post" style="margin-right: 200px">
                    <div class="form-left">
                      
                    </div>
  						
                    
                    <button type="submit" class="btn btn-warning">
					    	<i  class="fas fa-shopping-cart fa-2x"></i> Open Cart
					</button>
                </form>
                
</nav>

	<br><br><br><br><br>
	<%
		//declare local variables

		
	
	%>
	<div class="container">
			<div class="card">

				<div class="card-body">

				<h4 class="card-title">Mode of payment: <b><u>Credit Card</u></b></h4>
				
				<div class="col-12">
					
<hr>
				
					
<form style="padding-bottom: 30px; " method="post" action="checkout.action">
  <div class="form-group row">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Name:</label>
    <div class="col-sm-10">
      <input name="name" type="text" class="form-control"  required >
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabel" class="col-sm-2 col-form-label">Credit card number:</label>
    <div class="col-sm-10">
      <input name="ccNum" type="text" class="form-control creditCardText"  pattern=".{19,}" minlength="19" maxlength="19"  required >
    </div>
  </div>




					<br>
					
					<button type="submit" class="btn btn-primary">
					    	Purchase
					</button>
						
					</div>
				 </div>
			</div>
		</div>
		<br><br><br><br><br><br><br><br><br><br>
		
 <script>
 $('.creditCardText').keyup(function() {
  var foo = $(this).val().split("-").join(""); // remove hyphens
  if (foo.length > 0) {
    foo = foo.match(new RegExp('.{1,4}', 'g')).join("-");
  }
  $(this).val(foo);
});
</script>
</body>


<jsp:include page ="design-comp/footer.jsp" />