<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Fly high</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
	<form action="fly" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="Airport.jsp">Airport</a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>


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
			<label for="type" class="col-sm-2 col-form-label">Type</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="type" name="type">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="country" class="col-sm-2 col-form-label">Country</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="country" name="country">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="city" class="col-sm-2 col-form-label">City</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="city" name="city">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="capacity" class="col-sm-2 col-form-label">Capacity</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="capacity"
					name="capacity">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="width" class="col-sm-2 col-form-label">Width</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="width" name="width">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="totalTerminals" class="col-sm-2 col-form-label">Total
				terminals</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="totalTerminals"
					name="totalTerminals">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="openDate" class="col-sm-2 col-form-label">Open
				date</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="openDate"
					name="openDate">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="inauguratedBy" class="col-sm-2 col-form-label">Inaugurated
				by</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inauguratedBy"
					name="inauguratedBy">
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