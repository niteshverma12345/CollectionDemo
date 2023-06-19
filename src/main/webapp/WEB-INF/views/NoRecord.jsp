<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%@include file="./base.jsp"%>

<head>
<meta charset="ISO-8859-1">

<link href="<c:url value="/resources/css/NoRecord.css" />"
	rel="stylesheet">
<%@include file="./navbar.jsp"%>
</head>

<body>
	<center><div class="record-div">
	
		<center>
			<b>
			<p style="color: orange">No  Record Found</p>
			</b>
		</center>
	</div>
	</center>
	 
 <%
 
 int pageNumber=(Integer)request.getAttribute("page");
 
 %>
 <%--  <%= "Value of the variable is:"+pageNumber %>  --%>
 <center><a href=3>Previews</a></center>

</body>
</html>