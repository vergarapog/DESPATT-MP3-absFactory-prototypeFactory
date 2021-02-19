<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddtoCart</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<link rel = "stylesheet" href = "css/indexDesign.css">
<link rel="stylesheet" href="css/footer.css">
</head>
<body>

  <div class="overlay" id="overlay">
        <h3>Searching now...</h3>
    </div>
    <div class="hero-bg">
        <section class="top">
            <header>
                 <a href="prodna.jsp">  <img  src="images/web-logo-final2.png" alt="logo" height="150" width="50" class="logo"></a>
            </header>
<div class="form-containertop">
            <h1><span>AddtoCart's</span>Platinum Loyalty Rewards</h1>
  </div>
<div class="form-containertop">
            <p>As a 5 year AddtoCart Loyalty Platinum member, your next free ultimate mobile upgrade is on us! Browse below the best smartphones for our best customer! We also made it easy to quick-buy your phone, just type your preferred brand below!</p>
</div>
            <div class="form-container">
                <form action="processproduct.action" method="post">
                    <div class="form-left">
                        <label for="city">Claim your reward:</label>
                        <input type="text" name="prodName" id="prodName" required>
                        <p>Example: "Apple", "Samsung", "Xiaomi"</p>
                    </div>

                    <input type="submit" value="Claim" id="cta-btn">
                </form>
            </div>
        </section>
    </div>
    <br>
    <h1 class = "breaker"><span> Available Rewards</span></h1>

    <section class="authentic">
        <!-- <div class="right-col">
            <h2>Authentic. Awesome.</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo, maiores reprehenderit explicabo ab ad illo eveniet enim velit, exercitationem et recusandae placeat? Maiores laboriosam libero dolore consectetur! Omnis, recusandae expedita!</p>
        </div> -->
        
        <div class="apple">
        <img src="images/apple2.png" alt="">
        <h3> Apple </h3>
       <p>Claim Apple's Flagship, the iPhone 12 Pro Max</p>
       <p>Type "Apple" on the field bar above to claim</p>
        </div>
        
        <div class="samsung">
        <img src="images/samsung3.png" alt="" >
       <h3> Samsung </h3>
       <p>Claim Samsung's Flagship, the Galaxy S21 Ultra</p>
       <p>Type "Samsung" on the field bar above to claim</p>
       </div>
       
       <div class="xiaomi">
        <img src="images/xiaomi2.png" alt="" class="xiaomi">
        <h3> Xiaomi </h3>
       <p>Claim Xiaomi's Flagship, the MI 10T Ultra</p>
       <p>Type "Xiaomi" on the field bar above to claim</p>
        </div>
        
        
        
    </section>
    
    <h1 class = "breaker"><span>Bundled Accessories</span></h1>
    
    <section class="authentic">
        <!-- <div class="right-col">
            <h2>Authentic. Awesome.</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nemo, maiores reprehenderit explicabo ab ad illo eveniet enim velit, exercitationem et recusandae placeat? Maiores laboriosam libero dolore consectetur! Omnis, recusandae expedita!</p>
        </div> -->
        
        <div class="apple">
        <img src="images/accessories/apple/appleaccs.jpg" alt="airpods">
        <h3> Apple Airpods Pro </h3>
       <p>Included in every redemption of Apple's flagship</p>
       
        </div>
        
        <div class="samsung">
        <img src="images/accessories/samsung/samsungaccs2.jpg" alt="galaxy buds" >
       <h3> Galaxy Buds </h3>
       <p>Included in every redemption of Samsung's flagship</p>
       
       </div>
       
       <div class="xiaomi">
        <img src="images/accessories/xiaomi/xiaomiaccs.jpg" alt="free buds" class="xiaomi">
        <h3> Free Buds </h3>
       <p>Included in every redemption of Xiaomi's flagship</p>
       
        </div>
    </section>
<br><br><br>
</body>

<jsp:include page ="design-comp/footer.jsp" />
