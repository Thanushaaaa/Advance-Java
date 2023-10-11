<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Profit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
	<form action="road" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					href="Vendor.jsp">Vendor</a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>

			</ul>
		</nav>
		</br>
		<div class="mb-3 row">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="gst" class="col-sm-2 col-form-label">GST</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="gst" name="gst">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="owner" class="col-sm-2 col-form-label">Owner</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="owner" name="owner">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="location" class="col-sm-2 col-form-label">Location</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="location"
					name="location">
			</div>
		</div>
		<div class="d-flex justify-content-center">
			<button class="btn btn-primary" type="submit">Send</button>
		</div>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>