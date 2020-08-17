<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.id }님 로그인 성공<br>
	<br>
	<a href="${pageContext.request.contextPath }/SearchController">내 정
		보 수 정</a><br>
	<a href="${pageContext.request.contextPath }/LogoutController">로 그
		아 웃</a><br>
	<a href="${pageContext.request.contextPath }/DelhController">탈 퇴</a><br>
	<c:if></c:if>
	<a href="${pageContext.request.contextPath }/seller/List">쇼 핑 몰</a><br>
</body>
</html>