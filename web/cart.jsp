<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Shopping Cart</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto:wght@100&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/cart.css">
<link rel="stylesheet" href="css/footer.css">
<script src="https://kit.fontawesome.com/7dabdac481.js" crossorigin="anonymous"></script>
</head>
<body style="font-family: 'Montserrat', sans-serif;">
<nav class="navbar navbar-light " style="background-color: #f2f2f2">
  <a class="navbar-brand" href="index.jsp">
    <img src="images/web-logo-final5.png" width="130" height="60" class="d-inline-block align-top" alt="" style="margin-left: 10em;">
    
  </a>
  
 
                
</nav>



<br><br><br><br><br>


<div class="container mb-4">
    <div class="row">
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col"> </th>
                            <th scope="col">Product</th>
                            <th scope="col">Available</th>
                            <th scope="col" class="text-center">Quantity</th>
                            <th scope="col" class="text-right">Price</th>
                            <th> </th>
                        </tr>
                    </thead>
                    <tbody>
                    
                    ${Cart.displayCart()}
                        
                    ${Cart.displayTotal()}    
                        
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col mb-2">
            <div class="row">
                <div class="col-sm-12  col-md-6">
                <form action="index.jsp" method="post">
                    <button class="btn btn-block btn-light">Continue Shopping</button>
                    </form>
                </div>
                <div class="col-sm-12 col-md-6 text-right">
                <form action="checkout.jsp" method="post">
                    <button class="btn btn-lg btn-block btn-success text-uppercase">Checkout</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
<jsp:include page ="design-comp/footer.jsp" />