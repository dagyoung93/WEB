<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<h3>ȸ������</h3>
	<form action = "${pageContext.request.contextPath }/JoinController" method="post">
	<table border="1">
	<tr>
		<td>id</td><td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>pwd</td><td><input type="text" name="pwd"></td>
	</tr>
	<tr>
		<td>name</td><td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>email</td><td><input type="text" name="email"></td>
	</tr>
	<tr>
		<td>address</td><td><input type="text" name="addr"></td>
	</tr>
	<tr><td>ȸ������</td>
	<td>
     <input type="radio" name="type" value="1">�Ǹ���
     <input type="radio" name="type" value="2">������
     </td>
     </tr>
     <tr>
     <td colspan="2">
     <input type="submit" value="����">
     <input type ="reset" value="���">
     </td>
     </tr>
    </table>
    </form>
</body>
</html>