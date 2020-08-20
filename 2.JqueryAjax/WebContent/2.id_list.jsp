<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
	
<script type="text/javascript">
	$(document).ready(function() {
		$('#b1').change(function() {
			var name = $("#line option:selected").val();
			var data = 'id=' + name;

			//alert(data);

			$.ajax({
				type : "POST",

				url : "/2.JqueryAjax/FindMemberController",
				data : data,
				success : function(data) {
					m = $.parseJSON(data);
					$('div').html(m.id+"/"+m.address+"/"+m.name);
				}
			});
		});
	});
</script>
</head>
<body>
	<%-- select option �� ȸ�� ���̵� ǥ��
   option change �� �� ajax �椵������ �������� ȸ������ ��ȸ (�̸��� �ּ�) --%>
	<select id="b1" >
	<option>ID</option>
		<c:forEach var="list" items="${list }">
			<option value="${list.id }">${list.id }</option>
		</c:forEach>
	</select>
	<div></div>
</body>
</html>