<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
	<h2>p2p!</h2>
	<c:forEach var="businessApply" items="${businessApply}">

		<tr>
			<td>${businessApply.businessType}
			<td><c:out value="${businessApply.businessType}"></c:out> 
		</tr>

	</c:forEach>
</body>
</html>
