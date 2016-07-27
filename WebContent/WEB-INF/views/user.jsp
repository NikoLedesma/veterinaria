<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="top/top.jsp"></jsp:include>

<h1>WELCOME</h1>
<p>Welcome to my web page to create new authenticques</p>



logoutURL:"${logoutUrl}"

	<c:forEach var="role" items="${roles}">
		<li>${role}</li>
	</c:forEach>



<hr />


</body>
</html>