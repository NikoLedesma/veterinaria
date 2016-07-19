<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="../top/top.jsp"></jsp:include>

<h1>Editar Persona</h1>
		${person.id}
		${person.firstName}
		${person.lastName}
		${person.age}
		${person.address}
		${person.email}
</body>
</html>