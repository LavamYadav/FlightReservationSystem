<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<meta charset="ISO-8859-1">
<head>
  <title>Search Flight</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
  <style>
		body{
			background-color: #eeeeee;
		}
		footer{
			position: absolute;
			bottom: 0;
			width: 100%;
		}
		a{
			color: #212121;
		}
</style>          
</head>
<body>
<!-- Header -->
	<nav>
		<div class="nav-wrapper grey darken-4">
			<a href="#" class="brand-logo">
				<i class="large material-icons">airplanemode_active</i>Flight Reservation System
			</a>
			<ul id="nav-mobile" class="right hide-on-med-and-down">
				<li><a href="#">Bookings</a></li>
				<li><a href="#">View Flights</a></li>
			</ul>
		</div>
	</nav>
	<!-- Header -->

<div class="jumbotron text-center">
  <h1>Search Your Booking</h1>
  <p>Enter your Booking Id</p> 
</div>

<div class="row text center">
    <div class="input-field col s6 ">
      <input  id="id" type="number" class="validate">
      <label class="active" for="booking_id">Booking Id:</label>
<button class="btn waves-effect waves-teal open-button col s6" >Search  <i class="fa fa-search"></i></button>
    </div>
  </div>
      
<!-- Footer -->
		<footer class="page-footer grey lighten-3">
          <div class="container"></div>
          <div class="footer-copyright grey darken-4">
            <div class="container">
            � 2019 Flight Reservation System
            <a class="grey-text text-lighten-4 right" href="#!">About Us</a>
            </div>
          </div>
        </footer>
	<!-- Footer -->
<script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</script>
</body>
</html>
</body>
</html>