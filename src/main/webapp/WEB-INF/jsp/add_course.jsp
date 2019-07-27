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

<title>Add Course | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-3 mb-3">

		<a href="<c:url value="/course" />" class="btn btn-light btn-lg mb-3">Back</a>
		
		<h2>Add Course Details</h2>

		<form class="mt-3">
			<div class="form-group">
				<label for="courseName">Course Name</label> 
				<input type="text" class="form-control" id="courseName" aria-describedby="courseNameHelp" placeholder="Course Name" required> 
				<small id="courseNameHelp" class="form-text text-muted">Enter the course name.</small>
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