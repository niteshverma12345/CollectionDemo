<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="<c:url value="/resources/css/viewData.css" />"
	rel="stylesheet">
	<%@include file="./navbar.jsp"%>
</head>



<body>

<div class="table-div">
	<center><table >

	<center><h4>Student Record</h4></center><center>

<tr>
	<th>StuId</th>
	<th>Name</th>
	<th>Roll_number</th>
	<th>School</th>
	<th>Address</th>
	<th>City</th>
	<th>Action</th>
	
</tr>

<c:forEach var="emp" items="${empData}">

	<tr>

		 <td>${emp.stuId}</td>
		  <td>${emp.name}</td>
		 <td>${emp.roll_number}</td>
		 <td>${emp.schl}</td>
		 <td>${emp.address}</td>
		 <td>${emp.city}</td>
		 <td>
			 <a href="edite/${emp.stuId}">Edite</a>/
		 	 <a href="delete/${emp.stuId}">Delete</a>
 		</td>
	  
</c:forEach>

</center>

</table>

 <a href="NextData/2">Next</a></center>

</div>
</body>
</html>