<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SprintMvc ！！！</h1>
	<c:forEach var="user" items="${users}">
		<h1>${user.id}===${user.username}</h1>
	</c:forEach>
</body>
</html>