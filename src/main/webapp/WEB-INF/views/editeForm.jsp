<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="./navbar.jsp"%>
</head>
<body>

<h4>Student Edite Data Here........</h4>


<form action="update">
	  <lable  for="stuId" >StudentId:</lable>
	<input type="number"  name="stuId" value=${detail.stuId}>
	<br>  
	<lable  for="name" >Name:</lable>
	<input type="text"  name="name" value=${detail.name}>
	<br>
	<br> 
	<lable  for="roll_number" >Roll_number:</lable>
	<input type="number"  name="roll_number" value=${detail.roll_number}>
	<br>
	<lable  for="schl" >School</lable>
	<input type="text"  name="schl" value=${detail.schl}>
	<br>
	<lable  for="address" >Address</lable>
	<input type="text"  name="address" value=${detail.address}>
	<br>
	<lable  for="city" >City</lable>
	<input type="text"  name="city" value=${detail.city}>

	<br>
	<!-- <input type="submit" value="Submit">  -->
	<input type="submit" value="Submit">

</form>

</body>
</html>