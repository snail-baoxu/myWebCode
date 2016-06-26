<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		用户列表：
		<table width="100%" border=1>
			<tr>
				<td>用户名称</td>
				<td>用户年龄</td>
			</tr>
			
		<c:forEach items="${userList }" var="user">
			<tr>
				<td>${user.userName }</td>
				<td>${user.age }</td>
			<tr/>
		</c:forEach>
		</table>
</body>
</html>