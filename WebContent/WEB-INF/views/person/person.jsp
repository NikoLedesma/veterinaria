<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="../top/top.jsp"></jsp:include>

<h1>Personas</h1>



<style>
td, th {
	text-align: center;
}
</style>


<c:if test="${not empty persons}">
	<table class="table">
		<tr>
			<th>Id</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>age</th>
			<th>address</th>
			<th>email</th>
			<th></th>
		</tr>
		<c:forEach var="person" items="${persons}">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
				<td>${person.age}</td>
				<td>${person.address}</td>
				<td>${person.email}</td>
				<td><a href="<c:url value='/editPerson/${person.id}'/>"
					class="btn btn-primary" role="button">edit</a> <a
					href="<c:url value='/deletePerson/${person.id}'/>" class="btn btn-danger"
					role="button">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>


</body>
</html>