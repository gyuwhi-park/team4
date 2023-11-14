<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

<link rel="stylesheet" href="../resources/css/qstyle.css" type="text/css">

<style type="text/css">
#mainContent {
    height: 500px;
    background: #ffffff;
    display: flex;
    justify-content: center;
    flex-direction: column;
    align-items: center;
    font-family: 'Noto Sans KR', sans-serif;
    font-weight: bold;
    font-size: 19px;
    text-align: center;
}

#user_id {
	margin-top: 10px;
}

</style>

</head>
<body>
	<%@ include file="fix/header.jsp"%>
	<div id="mainContent">
		<form action="loginCheck" name="frm">
			<label style="font-size: 30px">로그인</label>
			<br/>
			<div>ID : <input name="user_id" id="user_id"></div>
			<br/>
			<div>PW : <input type="password" name="user_pass" id="user_pass"></div>
			<br/>
			<input type="submit" value="로그인" class="login logBtn">
			<a href="../main/mainpage"><input type="button" class="canBtn" value="취소"></a>
		</form>
	</div>
	<%@ include file="fix/footer.jsp"%>
</body>
</html>