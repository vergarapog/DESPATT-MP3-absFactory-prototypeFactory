<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="prod" type="model.product.Product" scope="request"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reward details</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="css/details.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>


<nav class="navbar navbar-light " style="background-color: #f2f2f2">
  <a class="navbar-brand" href="index.jsp">
    <img src="images/web-logo-final5.png" width="130" height="60" class="d-inline-block align-top" alt="" style="margin-left: 10em;">
    
  </a>
</nav>

<div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    
						
							<img id="item-display" src="<jsp:getProperty name="prod" property="imgSrc1"/>" alt="">
						
					</div>
					
					<div class="container service1-items col-sm-2 col-md-2 pull-left">
						<center>
							<a id="item-1" class="service1-item">
								<img src="<jsp:getProperty name="prod" property="imgSrc2"/>" alt=""></img>
							</a>
							<a id="item-2" class="service1-item">
								<img src="<jsp:getProperty name="prod" property="imgSrc3"/>" alt=""></img>
							</a>
							<a id="item-3" class="service1-item">
								<img src="<jsp:getProperty name="prod" property="imgSrc4"/>" alt=""></img>
							</a>
						</center>
					</div>
				</div>
					
				<div class="col-md-7">
					<div class="product-title"><jsp:getProperty name="prod" property="prodName"/></div>
					<br>
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> </div>
					<hr>
					<div class="product-price"> P <jsp:getProperty name="prod" property="price"/></div>
					<div class="product-stock">In Stock - 100% discount for 5 year platinum members.</div>
					<hr>
					<div class="btn-group cart">
					<form action="claimsuccess.jsp" method="post">
						<button type="submit" class="btn btn-success">
							Claim Reward
						</button>
						</form>
					</div>
					<div class="btn-group cart">
					<form action="index.jsp" method="post">
						<button type="submit" class="btn btn-danger">
							Back
						</button>
						</form>
					</div>
					
					
				</div>
			</div> 
		</div>
		<div class="container-fluid">		
			<div class="col-md-12 product-info">
					<ul id="myTab" class="nav nav-tabs nav_tabs">
						
						<li class="active"><a href="#service-one" data-toggle="tab">DESCRIPTION</a></li>
						
						
						
					</ul>
				<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade in active" id="service-one">
						 
							<section class="container product-info">
								<jsp:getProperty name="prod" property="shortDesc"/>
								<h3><jsp:getProperty name="prod" property="prodName"/> Specifications:</h3>
								<li><jsp:getProperty name="prod" property="display"/></li>
								<li><jsp:getProperty name="prod" property="cameras"/></li>
								<li><jsp:getProperty name="prod" property="cpu"/></li>
								<li><jsp:getProperty name="prod" property="ram"/></li>
								<li><jsp:getProperty name="prod" property="secMemory"/></li>
								
								<h3> ${prod.getAccsProdName()} - included FREE Accessory</h3>
								
								<img src="${prod.getAccsImgSrc1()}" alt="accessory" width="350" height="350">
					
								
							</section>
										  
						</div>
					<div class="tab-pane fade" id="service-two">
						
						
								
						</section>
						
					</div>
					<div class="tab-pane fade" id="service-three">
												
					</div>
				</div>
				<hr>
			</div>
		</div>
	</div>
</div>

<jsp:include page ="design-comp/footer.jsp" />