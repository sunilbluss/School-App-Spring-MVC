<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

<title>Edit Student | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-3 mb-3">

		<a href="<c:url value="/" />" class="btn btn-light btn-lg mb-3">Back</a>
		
		<c:if test="${status != null}">
		<div class="alert ${status == 'success' ? 'alert-success':'alert-danger'}" role="alert">
		  ${msg}
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    <span aria-hidden="true">&times;</span>
		  </button>
		</div>
		</c:if>
		
		<h2>Edit Student Details</h2>

		<c:url var="editAction" value="/edit-student" ></c:url>
		<form:form class="mt-3" action="${editAction}" method="post" modelAttribute="student">
			<form:hidden  path="studentId" />
			<div class="form-group">
				<label for="firstName">First Name</label> 
				<form:input path="firstName" type="text" class="form-control" id="firstName" aria-describedby="firstNameHelp" placeholder="First Name" /> 
				<small id="firstNameHelp" class="form-text text-muted">Enter your first name.</small>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> 
				<form:input path="lastName" type="text" class="form-control" id="lastName" aria-describedby="lastNameHelp" placeholder="Last Name" /> 
				<small id="lastNameHelp" class="form-text text-muted">Enter your last name.</small>
			</div>
			<div class="form-group">
				<label for="address">Address</label> 
				<form:textarea path="address" rows="4" class="form-control" id="address" aria-describedby="addressHelp" placeholder="Address"></form:textarea>
				<small id="addressHelp" class="form-text text-muted">Enter your address.</small>
			</div>
			<div class="form-group">
				<label for="contactNumber">Contact Number</label> 
				<form:input path="contactNumber" type="text" class="form-control" id="contactNumber" aria-describedby="contactNumberHelp" placeholder="Contact Number" /> 
				<small id="contactNumberHelp" class="form-text text-muted">Enter your contact number.</small>
			</div>
			<form:button type="submit" class="btn btn-primary">Submit</form:button>
		</form:form>
		
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