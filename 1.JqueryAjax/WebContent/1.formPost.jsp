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
$(document).ready(function(){//준비된 상태라는 것을 알려줌
	$('#b1').click(function(){
		var name = $('.uname').val();
		var data = '.uname='+name;
		alert(data);
        
		$.ajax({//HTTP요청으로 원격지의 페이지를 불러오고 XMLHTTP
			type : "POST",
		url : "/1.JqueryAjax/WelcomeServlet",
		data : data,
		success : function(data){
			$('body').append(data);
		}
		});
	});
});
</script>
</head>
<body>
	<form>
		<label>Enter your name </label> <input type="text" name="uname"
			class="uname" /><br /> <input type="button" id="b1" class="click"value="전송" /><br />
	</form>
</body>
</html>