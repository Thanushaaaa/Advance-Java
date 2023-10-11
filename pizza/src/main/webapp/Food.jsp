<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style>
.bg {
	background-image: url(bg.jpg);
	width: 100%;
	height: 100vh;
	background-repeat: no-repeat;
	background-size: cover;
	";
}
</style>
</head>

<body class="bg">

	<form action="eat" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="Food.jsp">Food</a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>


			</ul>
		</nav>
		</br>

		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="row mb-3">
			<label for="price" class="col-sm-2 col-form-label">Price</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="price" name="price">
			</div>
		</div>




		<fieldset class="row mb-3">
			<legend class="col-form-label col-sm-2 pt-0">Type</legend>
			<div class="col-sm-10">
				<div class="form-check">
					<input class="form-check-input" type="radio" name="type" id="type"
						value="veg" checked> <label class="form-check-label"
						for="type"> Veg </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="type" id="type"
						value="Non-veg"> <label class="form-check-label"
						for="type"> Non-veg </label>
				</div>
			</div>
		</fieldset>
		Hotel name:<select class="form-select"
			aria-label="Default select example" name="hotel">

			<option selected>Select a hotel</option>
			<option value="Royal Orchid Central">Royal Orchid Central</option>
			<option value="Taj Yeshwanthpur">Taj Yeshwanthpur</option>
			<option value="Bloom Hotel">Bloom Hotel</option>
			<option value="The Pride">The Pride</option>
			<option value="The Lalith Ashok">The Lalith Ashok</option>
		</select> Quantity:<select class="form-select"
			aria-label="Default select example" name="quantity">

			<option selected>Select quantity</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select> </br> </br>
		<div class="col-12">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="invalidCheck" required> <label class="form-check-label"
					for="invalidCheck"> Terms & Conditions </label>
				<div class="invalid-feedback">Click the above checkbox to
					proceed</div>
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