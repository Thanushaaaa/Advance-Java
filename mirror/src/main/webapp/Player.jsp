<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Player</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
	<form action="game" method="post">
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="Player.jsp">Player</a></li>
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
			<label for="sport" class="col-sm-2 col-form-label">Sport</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="sport" name="sport">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="country" class="col-sm-2 col-form-label">Country</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="country" name="country">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="wifeName" class="col-sm-2 col-form-label">Wife
				name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="wifeName"
					name="wifeName">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="dateOfBirth" class="col-sm-2 col-form-label">Date
				Of Birth</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="dateOfBirth"
					name="dateOfBirth">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="father" class="col-sm-2 col-form-label">Father</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="father" name="father">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="jerseyNo" class="col-sm-2 col-form-label">Jersey
				No</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="jerseyNo"
					name="jerseyNo">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="captainName" class="col-sm-2 col-form-label">Captain
				name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="captainName"
					name="captainName">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="coachName" class="col-sm-2 col-form-label">Coach
				name</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="coachName"
					name="coachName">
			</div>
		</div>
		<div class="mb-3 row">
			<label for="age" class="col-sm-2 col-form-label">Age</label>
			<div class="col-sm-10">
				<input type="number" class="form-control" id="age" name="age">
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