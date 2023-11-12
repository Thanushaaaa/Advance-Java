<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Optional: Bootstrap JS CDN -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<h1>Data entered</h1>
	<div class="container">
		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Property</th>
					<th>Value</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Name</td>
					<td>${data.name}</td>
				</tr>
				<tr>
					<td>Brand</td>
					<td>${data.brand}</td>
				</tr>
				<tr>
					<td>Price</td>
					<td>${data.price}</td>
				</tr>
				<tr>
					<td>Weight</td>
					<td>${data.weight}</td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
