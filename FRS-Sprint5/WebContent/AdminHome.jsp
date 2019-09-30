<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en-US">

<head>
    <title>Admin Panel</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
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
		.brand-logo{
			margin-left: 20px;
		}
		.card{
			margin-top: 25vh;
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
				<li><a href="logOut">Log Out</a></li>
			</ul>
		</div>
	</nav>
	<!-- Header -->
	
	<!-- Body -->
	<div class="row">
		<div class="col s8 offset-s2">
			<div class="row">
				<div class="col s4">
			<div class="card center">
				<div class="card-image waves-effect waves-block waves-light">
					<img class="activator" src="user.png">
				</div>
				<div class="card-content">
					<span class="card-title activator grey-text text-darken-4">User<br>Management</span>
				</div>
				<div class="card-reveal">
					<span class="card-title grey-text text-darken-4">User<br>Management<br>
						<i class="material-icons small">arrow_drop_down</i>
					</span>
					<p>
						<a href="regUserList">View Registered Users</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col s4">
			<div class="card center">
				<div class="card-image waves-effect waves-block waves-light">
					<img class="activator" src="flight.png">
				</div>
				<div class="card-content">
					<span class="card-title activator grey-text text-darken-4">Flight<br>Management</span>
				</div>
				<div class="card-reveal">
					<span class="card-title grey-text text-darken-4">Flight<br>Management<br>
						<i class="material-icons small">arrow_drop_down</i>
					</span>
					<p>
						<a href="addFlight">Add a Flight</a><br>
						<a href="showFlights">Show all Flights</a><br>
						<a href="searchFlight">Search a Flight</a><br>
						<a href="modifyFlight">Modify an Existing Flight</a><br>
						<a href="removeFlight">Remove a Flight</a>
					</p>
				</div>
			</div>
		</div>
<div class="col s4">
			<div class="card center">
				<div class="card-image waves-effect waves-block waves-light">
					<img class="activator" src="schedule.png">
				</div>
				<div class="card-content">
					<span class="card-title activator grey-text text-darken-4">Schedule<br>Management</span>
				</div>
				<div class="card-reveal">
					<span class="card-title grey-text text-darken-4">Schedule<br>Management<br>
						<i class="material-icons small">arrow_drop_down</i>
					</span>
					<p>
						<a href="scheduleFlight">Schedule a Flight</a><br>
						<a href="showScheduledFlights">Show all Scheduled Flights</a><br>
						<a href="searchScheduledFlights">Search a Flight Schedule</a><br>
						<a href="modifyScheduledFlight">Modify a Flight Schedule</a><br>
						<a href="removeScheduledFlight">Unschedule a Flight</a>
					</p>
				</div>
			</div>
		</div>
			</div>
		</div>
	</div>
	<!-- Body -->
	
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
    </script>
</body>

</html>
