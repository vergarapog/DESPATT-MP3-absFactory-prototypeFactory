<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <jsp:useBean id="searchResults" type="model.searchResultHolder.SearchResults" scope="request"/>  
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Montserrat&family=Roboto:wght@100&display=swap" rel="stylesheet">
<style>
input[type=submit] {
    background-color: #F89104;
    border: none;
    width: 10%;
    color: white;
    padding: 0.5em 0;
    border-radius: .5em;
    font-size: 1em;
    cursor: pointer;
}
</style>
</head>
<body style="font-family: 'Montserrat', sans-serif;">
<nav class="navbar navbar-light " style="background-color: #f2f2f2">
  <a class="navbar-brand" href="index.jsp">
    <img src="images/web-logo-final5.png" width="130" height="60" class="d-inline-block align-top" alt="" style="margin-left: 10em;">
    
  </a>
</nav>
	<br><br><br><br><br>
	
	<div style="text-align: center; color: black;"><h4><b>Search Results:</b></h4></div>
	
	<br>
	${searchResults.displayResults()}
		
		
		<br><br><br><br><br><br><br><br><br><br><br>
</body>


<jsp:include page ="design-comp/footer.jsp" />