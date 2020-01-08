<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>

  

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
    
body {
    margin:0;
    font-size:16px;
    font-family:'Open Sans', sans-serif;
    background-image: url(./background.jpg);
    background-attachment: fixed;
    background-size: cover;
  }
  
  header {
    float:left;
    width:100%;
    padding:5em 20% 2em;
    background:rgba(0,128,128,0.8);
    margin-bottom:1em;
  }
  
  header a {
    color:#56dcee;
    opacity:0.5;
    text-decoration:none;
  }
  
  header a:hover {
    color:#333;
    opacity:1;
  }
  
  
  section {
    float:left;
    width:60%;
    margin:3em 20%;
  }
  
  
  h1, h2 {
    font-family:'Maven Pro', sans-serif;
    margin:0;
    font-weight:500;
  }
  
  h1 {
    color:#fff;
    font-size:2.5em;
  }
  
  h2 {
    color:#56dcee;
  }
  
  
  
  p {
    padding:0 1em;
    font-size:1em;
  }
  
  html {
         overflow-y: scroll;
  }



  
/*DO NOT EDIT BELOW*/
.footer {
    background-color: rgba(0,128,128,0.8);
    height: 150px;
    width: 100%;
    padding: 25px;
  }
  .whitetext {
    color:white;
    margin: 0px;
    padding:0px;
  }
  .whitelogo {
    color:white;
    font-size:2em;
  }
  .whitelogo:hover {
    color:lightgray;
  }
</style>
</head>

    <header>
        <h1>IT CINEMA</h1>
        <h2>where stress comes to THE END</h2>
      </header>
        <div  class="row">
            
            
            <div class="col-md-4 ">
                
            </div>
           
            <div class="col-md-4" style="line-height: 30px;">
                <h1 class="text-center" style="border: 20px;padding:10px; color:white;font-family:'Courier New', Courier, monospace;"><b>Invoice</b></h1>
                <div class="row " style="border: 20px;padding:10px;background-color: whitesmoke;">
                   
                   <c:forEach items="${movie}" var="m">
                   	<div class="col-md-6 text-right"><h5> Mobile No:</h5></div>
                    <div class="col-md-6" id="invoiceMobile"><h5>${m.getUserMobile()} </h5>  </div>
                    <div class="col-md-6 text-right"><h5>E-mail:</h5></div>
                    <div class="col-md-6" id="invoiceMail"><h5>${m.getUserEmail()}</h5></div>
                    <div class="col-md-6 text-right"><h5>Movie Name:</h5></div>
                    <div class="col-md-6" id="InvoiceMname"><h5> ${m.getMovieBooked()}</h5></div>
                    <div class="col-md-6 text-right"><h5>Date: </h5></div>
                    <div class="col-md-6" id="invoiceDate"><h5>25/12/2019</h5></div>
                    
                    <div class="col-md-6 text-right"><h5>Seat No(s):</h5></div>
                    <div class="col-md-6" id="invoiceSno"><h5>1</h5></div>
                    <div class="col-md-6 text-right"><h5>Total Seats Booked:</h5></div>
                    <div class="col-md-6"id="invoiceTotal"><h5>${m.getSeatsBooked()}</h5></div>
                    <div class="col-md-6 text-right"><h5>Total Price:</h5></div>
                    <div class="col-md-6"id="invoicePrice"><h5>Rs.600</h5></div>
                   </c:forEach>
                    
                    
                </div>
                <br><br>
                &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
               <a href= "/payment" > <button id ="invoicePay" style="background-color: black; color:wheat">Proceed To Pay</button></a> &nbsp;&nbsp;&nbsp;&nbsp;
                <button id="invoiceCancel" style="background-color: black;color:wheat;">Cancel</button>
        </div>
        <div class="col-md-4 ">
            
        </div>
        </div>
       
        <div class="container-fluid">
            <div class="footer nav navbar navbar-full bg-faded">
              <div class="text-center">
                <div class="row">
                  <div class="col-md-4 col-md-offset-4">
                    <p class="whitetext">Copyright @ <strong>IT CINEMA</strong></p>
                    <hr>
                    </div>
                  </div>
              </div>
            </div>
          </div>

</body>
</html>