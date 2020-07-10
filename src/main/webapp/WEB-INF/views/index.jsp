<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>United Airlines</title>
</head>
<body>
${message}
${mav}

<ol>
			<c:forEach var="emp" items="${mav}">
				<li>${emp}</li>
			</c:forEach>
			</ol>

	<h1>United Airline - Web Application for finding flight</h1>
	 <div class="form">
		<form action="/index"  method="GET"
			onsubmit="return validate()">
			<h2>Enter validate flight Number and Date</h2>
			
			<table>
				<tr>
					
					<td>Flight Number : <input id="flightNumber"
						name="flightNumber"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			

			</table> 
		</form>
	</div> 
	
	
	
	<c:if test="${not empty list}">

		<ul>
			<c:forEach var="listValue" items="${list}}">
				<li>${listValue.flightNumber}</li>
				<li>${listValue.carrier}</li>
			</c:forEach>
		</ul>

	</c:if>

</body>
</html>