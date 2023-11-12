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

	<form action="sendSweets" method="post">
		SweetName: <input name="sweetName" type="text">
		Price:<input name="price" type="number">
		<button type="submit">Submit</button>
		
	</form>
	<h3>${valid}</h3>
</body>
</html>