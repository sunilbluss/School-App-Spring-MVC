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

<title>Add Student Course | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-3 mb-3">

		<a href="<c:url value="/student-course/${studentId}" />" class="btn btn-light btn-lg mb-3">Back</a>
		
		<c:if test="${status != null}">
		<div class="alert ${status == 'success' ? 'alert-success':'alert-danger'}" role="alert">
		  ${msg}
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		    <span aria-hidden="true">&times;</span>
		  </button>
		</div>
		</c:if>
		
		<h2>Add Student Course</h2>
		
		<c:url var="addAction" value="/student-course/add-course/${studentId}" ></c:url>
		<form:form class="mt-3" action="${addAction}" method="post" modelAttribute="course">
			<div class="form-group">
				<label for="courseName">Course Name</label> 
				<form:select path="courseId" class="form-control" aria-describedby="courseNameHelp">
			    	<form:options items="${courses}" itemValue="courseId" itemLabel="courseName"></form:options>
			  	</form:select> 
				<small id="courseNameHelp" class="form-text text-muted">Select the course name.</small>
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