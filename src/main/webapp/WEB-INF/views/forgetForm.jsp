<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%-- <%@include file="./base.jsp"%> --%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<%-- <link href="<c:url value="/resources/css/loginForm.css" />"
	rel="stylesheet"> --%>
	<%@include file="./navbar.jsp"%>
	
	<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

	
	
</head>
<body>
	<%
	String errorMsg = (String) request.getAttribute("msg");
	%>
	
			<%
			if (errorMsg == null) {
			%>

			
			<hr>
				<form class="container" action="recoverPass">
			<div class="row">
				<div class="col m6 offset-m3">
					<div class="card">
						<div class="card-content">
							
					<em><h5>ReSet Password here......</h5></em>

							<input type="text" name="userName" placeholder="Enter UserName">
							<input type="number" name="roll_number" placeholder="Enter Rollnumber">
							<input type="password" name="empPassword"
		placeholder="Enter NewPassword"> <input type="submit"
								name="submit" class="btn blue"> <input type="reset"
								name="reset" class="btn  purple darken-4"><br>

						</div>
					</div>
				</div>
			</div>
			
	
	<%
	} else {
	%>
	


	
	<center>	<em><h5 style="color: red;">
				<%="" + errorMsg%></h5>
			<em></center>

				
	</div>


	<hr>
	<form class="container" action="LogiController">
			<div class="row">
				<div class="col m6 offset-m3">
					<div class="card">
						<div class="card-content">
							
					<em><h5>ReSet Password here......</h5></em>

							<input type="text" name="userName" placeholder="Enter UserName">
							<input type="number" name="roll_number" placeholder="Enter Rollnumber">
							<input type="password" name="empPassword"
		placeholder="Enter NewPassword"> <input type="submit"
								name="submit" class="btn blue"> <input type="reset"
								name="reset" class="btn  purple darken-4"><br>

						</div>
					</div>
				</div>
			</div>

	

	<br>
	<br>
	
	</form>
	</div>




	<%
	}
	%>
</body>
</html>