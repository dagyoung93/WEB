<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#b1').click(function() {
			var name = $('.id').val();
			var data = 'id=' + name;

			alert(data);

			$.ajax({
				type : "POST",

				url : "/1.JqueryAjax/WelcomeServlet5",
				data : data,
				success : function(data) {
					$('div').append(data);
				}
			});
		});
	});
</script>
</head>
<body>
	이름 :
	<input type="text" class="id">
	<input type="button" id="b1" value="회원정보검색">
	<!-- span과 동일 , 단지 행만 바뀜 -->
	<div></div>
</body>
</html>