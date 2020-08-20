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
		var pwd = $('.passwd').val();
		var data = '.uname='+name+'&password='+pwd;
		alert(data);
        
		$.ajax({
			type : "POST",
		url : "/1.JqueryAjax/WelcomeServlet3",
		data : data,
		success : function(data){
			$('#message').html(data); //데이터 새롭게 추가
		}
		});
	});
});

</script>
</head>
	
<body>
	<form>
		<label>Enter your name </label>
		<input type="text" name="uname"	class="uname"/><br /> 
		<label>Enter your password </label> 
		<input type="text" name="password"	class="passwd" /><br /> 
		<input type="button" id="b1" class="click" value="전송" /><br />
	</form>
	<div id="message"></div>
</body>
</html>
