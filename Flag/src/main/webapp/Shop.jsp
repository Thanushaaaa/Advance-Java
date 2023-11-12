<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello! Welcome</h1>

	<form action="dto" method="post">
		Cracker name: <input name="name" type="text"> Brand:<input
			name="brand" type="text"> Price:<input name="price"
			type="number"> Weight:<input name="weight" type="number">
		<button type="submit">Submit</button>

	</form>
	<h1>${nameValid}</h1>
	<h1>${priceValid}</h1>
	<h1>${brandValid}</h1>
	<h1>${weightValid}</h1>
</body>
</html>