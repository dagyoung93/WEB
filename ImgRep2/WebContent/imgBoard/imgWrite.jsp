

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�̹��� �ø���</h3>
	<form action="${pageContext.request.contextPath }/WriteController"
		method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th>����</th>
				<td><input type="text" name="title"></td>

			</tr>
			<tr>
				<th>�Խ���</th>
				<td><input type="writer" name="writer"></td>

			</tr>
			<tr>
				<th>�̹���</th>
				<td><input type="file" name="file"></td>

			</tr>
			<tr><td colspan="2"><input type="submit" value="�ø���"></td></tr>
		</table>
	</form>
</body>
</html>