<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Bootstrap Simple Project</title>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="css/bootstrap.min.css"/>     
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body style="border:10px solid black; color:blue">
   <script src="js/bootstrap.min.js">  </script>
<nav class="navbar navbar-default" style="background-color:blue; border:4px solid black; color:black">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Mysite.com</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="Contactus.jsp">Contact Us</a></li>
      <li><a href="Login.jsp">Login</a></li>
      <li><a href="Register.jsp">Register User</a></li>
      <li><a href="Aboutus.jsp">About Us</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  
  
</div>
 <br><br><br><br><br>
     <div id="myCarousel" class="carousel slide" data-ride="carousel">
  
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>


  <div class="carousel-inner" style="border:2px solid pink">
    <div class="item active">
      <img src="C:\Users\mr tyagi\Desktop\Aakash.jpg" alt="Bhai">
              <h3>Tyagi Ji</h3>
        <p>Have A Great Day</p>
    </div>

    <div class="item">
      <img src="C:\Users\mr tyagi\Desktop\Aakash2.jpg" alt="Bhai">
      <h3>Tyagi Ji</h3>
        <p>Have A Great Day</p>
    </div>

    <div class="item">
      <img src="C:\Users\mr tyagi\Desktop\Aakash3.jpg" alt="Rampur">
      <h3>Tyagi Ji</h3>
        <p>Have A Great Day</p>
    </div>
  </div>

  
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
   
</body>
</html>