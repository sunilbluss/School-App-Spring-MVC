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

<title>Student Courses | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-3 mb-3">
	
		<a href="<c:url value="/" />" class="btn btn-light btn-lg mb-3">Back</a>
	
		<a href="<c:url value="/student-course/add-course/${studentId}" />" class="btn btn-primary float-right">Add Student Course</a>
		<h2>Student Course Details</h2>
		<div class="table-responsive mt-3">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Name</th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${courses}" var="course">
					<tr>
						<th scope="row"><c:out value="${course.courseId}"/></th>
						<td><c:out value="${course.courseName}"/></td>
						<td><a href="<c:url value="/student-course/delete-course/${studentId}/${course.courseId}" />"><i class="fas fa-trash"></i></a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
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