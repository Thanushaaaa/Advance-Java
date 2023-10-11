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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form>
		<nav class="navbar navbar-expand-sm btn btn-success navbar-success">
			<ul class="navbar-nav">
			    <li class="nav-item"><a class="nav-link"
					href="ProductSuccess.jsp">ProductSuccess</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="Player.jsp">Player</a></li>
				<li class="nav-item"><a class="nav-link"
					href="index.jsp">Home</a></li>
			</ul>
		</nav>
		
</form>
<h1>Player info sent successfully</h1>
<p>Name :${key1}</p>
<p>Sport :${key2}</p>
<p>Wife Name :${key3}</p>
<p>Date Of Birth :${key4}</p>
<p>Father :${key5}</p>
<p>Jersey No :${key6}</p>
<p>Captain name :${key7}</p>
<p>Coach name :${key8}</p>
<p>Age :${key9}</p>





<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>