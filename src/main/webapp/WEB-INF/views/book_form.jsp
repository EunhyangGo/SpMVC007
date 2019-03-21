<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	#book_field{
		width:500px;
		margin: 10px auto; <!-- 위에 10정도 공간을 남기고 폭을 조정하고 마진을 주면 오토로 바꾸면 된다. -->
	}
	
	legend{
		font-size:12pt;
		font-weight: bold;
		color: #3e65ff;
	}
	label {
	
		width:120px;
		display: block;
		float:left;
		text-align:right;
		font-weight:bold;
		font-size:10pt;
		padding:8px; <!-- 안쪽 여백을 만든것.-->
		
	}
	
	input {
		margin :3px;
		padding: 8px;
		border : 1px solid #ccc;
	}
	
	#btn-box{
		border:1px solid lightgray;
		width : 103px;
		margin: 5px auto;
	}
	
	#btn-box button{
		width: 100px;
		margin: 3px;		
	}
	
	#btn-ok{
		width:100px;
		margin:3px;
		padding:8px;
	}
</style>
</head>
<body>

	<form action="book" method="POST">
	<fieldset id="book_field"> <!-- legend는 fieldset이 없으면 움직일 수 없음 -->
	<legend>도서정보입력</legend>
	<label for="b_title">도서명</label>
	<input id="b_title" name="b_title"><br/>
	
	<label for="b_comp">출판사명</label>
	<input id="b_comp" name="b_comp"><br/>
	
	<label for="b_auth">저자</label>
	<input id="b_auth" name="b_auth"><br/>
	
	<label for="b_price">가격</label>
	<input id="b_price" name="b_price"><br/>
		<label for="btn-ok"></label>
		<button id="btn-ok">확인</button>
	</fieldset>
	</form>

</body>
</html>