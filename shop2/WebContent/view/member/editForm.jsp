<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="model.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>������ ����</h3>
	<c:if test="${not empty m }">
		<form action="${pageContext.request.contextPath }/EditController"
			method="post">
			<table boreder="1">
				<tr>
					<td>id</td>
					<td><input type="test" name="id" value="${m.id }" readonly>
						<c:if test="${m.type==1 }">�Ǹ���</c:if> <c:if test="${m.type==2 }">������</c:if>
					</td>
				</tr>
				<tr>
					<td>pwd</td>
					<td><input type="test" name="pwd" value="${m.pwd }"></td>
				</tr>
				<tr>
					<td>name</td>
					<td><input type="test" name="name" value="${m.name }" readonly></td>
				</tr>
				<tr>
					<td>email</td>
					<td><input type="test" name="email" value="${m.email }"></td>
				</tr>
				<tr>
					<td>addr</td>
					<td><input type="test" name="addr" value="${m.addr }"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="����"></td>
				</tr>
			</table>
		</form>
	</c:if>
</html>