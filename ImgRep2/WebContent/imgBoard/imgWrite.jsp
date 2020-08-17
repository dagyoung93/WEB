

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>이미지 올리기</h3>
	<form action="${pageContext.request.contextPath }/WriteController"
		method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>

			</tr>
			<tr>
				<th>게시자</th>
				<td><input type="writer" name="writer"></td>

			</tr>
			<tr>
				<th>이미지</th>
				<td><input type="file" name="file"></td>

			</tr>
			<tr><td colspan="2"><input type="submit" value="올리기"></td></tr>
		</table>
	</form>
</body>
</html>