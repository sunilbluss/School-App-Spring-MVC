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

<title>Student | School App</title>
</head>
<body>
	<%@include file="nav_bar.jsp"%>

	<div class="container mt-5">
		<a href="<c:url value="/add-student" />" class="btn btn-primary float-right">Add Student</a>
		<h2>Student Details</h2>
		<div class="table-responsive mt-3">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">First Name</th>
						<th scope="col">Last Name</th>
						<th scope="col">Address</th>
						<th scope="col">Contact Number</th>
						<th scope="col"></th>
						<th scope="col"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${students}" var="student">
					<tr>
						<th scope="row"><c:out value="${student.studentId}"/></th>
						<td><c:out value="${student.firstName}"/></td>
						<td><c:out value="${student.lastName}"/></td>
						<td><c:out value="${student.address}"/></td>
						<td><c:out value="${student.contactNumber}"/></td>
						<td><a href="<c:url value="/edit-student/${student.studentId}" />"><i class="far fa-edit"></i></a></td>
						<td><a href="<c:url value="/delete-student/${student.studentId}" />"><i class="fas fa-trash"></i></a></td>
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