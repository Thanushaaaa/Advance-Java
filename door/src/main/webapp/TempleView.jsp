<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>

<body>
	<form>
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="total">Temple</a></li>
			</ul>
		</nav>
		<div>
		<table class="table table-secondary">
		<tr>
		<th>Name</th>
		<th>Place</th>
		<th>God name</th>
		<th>Constructed year</th>
		<th>Constructed by</th>
		</tr>
		<jstl:forEach items="${view}" var="templeDTO">
		
		<tr>
		<td>${templeDTO.name}</td>
		<td>${templeDTO.place}</td>
		<td>${templeDTO.mainGod}</td>
		<td>${templeDTO.constBy}</td>
		<td>${templeDTO.constYear}</td>
		</tr>
		</jstl:forEach>
		</table>
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>