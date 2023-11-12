<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveData" method="post">
Festival Name:
<input type="text" name="festivalName">
No of days:
<input type="number" name="noOfDays">
Date:
<input type="text" name="date">
Season:
<input type="text" name="season">
<button type="submit">Send</button>
</form>
<h1>${saved}</h1>
</body>
</html>