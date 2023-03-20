<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student View</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<table width="50%" class="table table-hover table-striped">
			<tr class="table-primary">
				<th>Student ID</th>
				<th>Student Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="current" items="${students}">
				<tr>
					<td><c:out value="${current.sid}" /></td>
					<td><c:out value="${current.sname}" /></td>
					<td><c:out value="${current.age}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>