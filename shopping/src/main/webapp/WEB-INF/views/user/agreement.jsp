<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="../../../../resources/js/qSaveUser.js"></script>
</head>
<body>
	<%@ include file="../fix/header.jsp"%>
	<div id="mainContent">
			약관에 동의하십니까?<br>
	<span><input type="checkbox" name="ch1" id="ch1">전체 동의하기</span><br>
	<div style="border = '1'">
	<span><input type="checkbox" name="ch2" id="ch2">(필수) 개인정보 활용 동의</span><br>
	<span><input type="checkbox" name="ch3" id="ch3">(필수) 위치정보 활용 동의</span><br>
	<span><input type="checkbox" name="ch4" id="ch4">(선택) 구매기록 활용 동의</span><br>
	<span><input type="checkbox" name="ch5" id="ch5">(선택) 마케팅 정보 제공 동의</span><br>
	</div>
	<button id="agree">가입하기</button>
	</div>
	<%@ include file="../fix/footer.jsp"%>

</body>
</html>