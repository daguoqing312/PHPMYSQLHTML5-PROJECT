<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>
		This is an extreme secure page only for administrators.
	</h1>
	
	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	
</body>
</html>