<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Veterinary</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>


	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	<c:url value="/logout" var="logoutUrl" />
	<!-- logoutUrl=/appName/logout -->


	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Veterinary Pepe</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="<c:url value='/welcome'/>">Home</a></li>
			<li><a href="<c:url value='/person'/>">Person</a></li>
			<li><a href="<c:url value='/page1'/>">Page 2</a></li>
			<li><a href="hello">Page 3</a></li>
		</ul>


		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
			<li><a href="javascript:formSubmit()"><span
					class="glyphicon glyphicon-log-out"></span> Logout</a></li>
		</ul>


	</div>

	</nav>


	<div class="row">
		<div class="col-sm-8">
			<img src="<c:url value='/resource/img/logPet.jpg'/>" class="img-rounded"
				alt="Cinque Terre" width="304" height="236">
		</div>
		<div class="col-sm-4">
			
				<h3>Basic Navbar Example</h3>
				<p>A navigation bar is a navigation header that is placed at the
					top of the page.</p>
			
		</div>

	</div>

	<form action="${logoutUrl}" method="POST" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>

<%-- 	<c:if test="${pageContext.request.userPrincipal.name != null}"> --%>
<%-- 		<h2>Usuario : ${pageContext.request.userPrincipal.name}</h2> --%>
<%-- 	</c:if> --%>