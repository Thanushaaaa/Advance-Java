<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Grocery</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>

<body>

	<form action="pray" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="Temple.jsp">Temple</a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="view">View</a></li>


			</ul>
		</nav>
		</br>
		<h1>Total items :${total}</h1>


		<div class="row mb-3">
			<label for="name" class="col-sm-2 col-form-label">Name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="name" name="name">
			</div>
		</div>
		<div class="row mb-3">
			<label for="place" class="col-sm-2 col-form-label">Place</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="place" name="place">
			</div>
		</div>
		<div class="row mb-3">
			<label for="mainGod" class="col-sm-2 col-form-label">Main god</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="mainGod" name="mainGod">
			</div>
		</div>
		<div class="row mb-3">
			<label for="constYear" class="col-sm-2 col-form-label">Constructed
				Year</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="constYear"
					name="constYear">
			</div>
		</div>
		<div class="row mb-3">
			<label for="constBy" class="col-sm-2 col-form-label">Constructed
				By</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="constBy" name="constBy">
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