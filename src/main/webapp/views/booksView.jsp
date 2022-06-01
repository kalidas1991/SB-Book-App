<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Book List</h2>

	<table border=1>
		<thead>
			<tr>
				<td><b>Book Id</b></td>
				<td><b>Book Name</b></td>
				<td><b>book Price</b></td>
			</tr>
		</thead>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.bookId}</td>
				<td>${book.bookName}</td>
				<td>${book.bookPrice}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>