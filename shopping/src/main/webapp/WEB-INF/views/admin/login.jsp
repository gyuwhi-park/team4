<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Ashion Template">
<meta name="keywords" content="Ashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>login</title>


 <style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

<link rel="stylesheet" href="../resources/css/qstyle.css" type="text/css">

</head>
<body>
<%@ include file="../fix/header.jsp"%>
  <form action="adminMain" method="post" class="adminMain">
 	 <div id="adminMain" class= "adminMain">
		<label style="font-size: 30px">관리자 로그인</label>
		<br/>
		<input name="user_id" id="user_id"><br>
		<input name="user_pass" id="user_pass">
		<br/>
		<div>
		<input type="submit" class="logBtn" value="로그인"> 
		<a href="../index.jsp"><input type="button" class="canBtn" value="취소"></a>
	 	</div>
	 </div>
  </form>

<%@ include file="../fix/footer.jsp"%>	
<%-- 	<%@ include file="../fix/header.jsp"%>
	<form action="adminMain" method="post">
		관리자 로그인<br> ID : <input name="user_id" id="user_id"><br>
		pw : <input name="user_pass" id="user_pass"><br> <input
			type="submit" value="로그인"> <a href="../index.jsp"><input
			type="button" value="취소"></a>
	</form>

	<%@ include file="../fix/footer.jsp"%> --%>
</body>
</html>