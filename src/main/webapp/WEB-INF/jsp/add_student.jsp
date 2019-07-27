<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>Add Student | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-3 mb-3">

		<a href="<c:url value="/" />" class="btn btn-light btn-lg mb-3">Back</a>
		
		<h2>Add Student Details</h2>

		<form class="mt-3">
			<div class="form-group">
				<label for="firstName">First Name</label> 
				<input type="text" class="form-control" id="firstName" aria-describedby="firstNameHelp" placeholder="First Name" required> 
				<small id="firstNameHelp" class="form-text text-muted">Enter your first name.</small>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> 
				<input type="text" class="form-control" id="lastName" aria-describedby="lastNameHelp" placeholder="Last Name" required> 
				<small id="lastNameHelp" class="form-text text-muted">Enter your last name.</small>
			</div>
			<div class="form-group">
				<label for="address">Address</label> 
				<textarea rows="4" class="form-control" id="address" aria-describedby="addressHelp" placeholder="Address" required></textarea>
				<small id="addressHelp" class="form-text text-muted">Enter your address.</small>
			</div>
			<div class="form-group">
				<label for="lastName">Contact Number</label> 
				<input type="text" class="form-control" id="contactNumber" aria-describedby="contactNumberHelp" placeholder="Contact Number" required> 
				<small id="contactNumberHelp" class="form-text text-muted">Enter your contact number.</small>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script src="https://kit.fontawesome.com/092cd90528.js"></script>
</body>
</html>