<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#user_name {
	width: 80px;
}
#user_birth {
	width: 120px;
}
#phone1, #phone2, #phone3 {
	width: 55px;
}
.mail {
	width: 70px;
}
#
</style>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="../resources/js/qSaveUser.js"></script>
</head>
<body>
	<%@ include file="../fix/header.jsp"%>
	<div id="mainContent">
		<form action="register" method="get" id="form">
			<h6>* 표시는 필수 입력 사항 입니다.</h6>
			<table>
				<tr>
				<td>*이름</td>
				<td><input name="user_name" id="user_name" /></td>
				</tr>
				<tr>
				<td>*성별</td>
				<td>
					<label for="male">남성</label>
					<input type="radio" id="male" checked value="M" name="user_gender"/>
					<label for="female">여성</label>
					<input type="radio" id="female" value="F" name="user_gender"/>
				</td>
				</tr>
				<tr>
				<td>*생일</td>
				<td><input name="user_birth" id="user_birth" placeholder="YYYYMMDD"/></td>
				</tr>
				<tr>
				<td>*전화번호</td>
				<td><input id="phone1" placeholder="010"/> - 
			<input id="phone2" placeholder="####"/> - 
			<input id="phone3" placeholder="####"/>
			<input type="hidden" name="user_phone" id="phone"/>
			</td>
				</tr>
				<tr>
				<td>*ID</td>
				<td><input name="user_id" id="user_id"><input type="button" id="idCheck" value="확인">
			<span id="checkResult">중복 확인이 필요합니다</span></td>
				</tr>
				<tr>
				<td>*비밀번호</td>
				<td><input type="password" name="user_pass" id="user_pass" />
			<span id="pwPattern"></span></td>
				</tr>
				<tr>
				<td>*비밀번호 확인</td>
				<td><input id="user_pass_check"/>
			<span id="pwCheck"></span> </td>
				</tr>
				<tr>
				<td>*메일</td>
				<td><input class="mail" id="mailID" placeholder="ABC"/>@
			<input class="mail" id="mailDomain" placeholder="naver"/>.
			<input class="mail" id="mailExtension" placeholder="com"/>
			<input type="hidden" name="user_mail" id="mail"/>
			</td>
				</tr>
				<!-- 
				<tr>
				<td>우편번호</td>
				<td><input name="addr_post" id="addr_post" placeholder="#####"/></td>
				</tr>
				<tr>
				<td>주소</td>
				<td><input name="addr1" id="addr_addr1" /></td>
				</tr>
				<tr>
				<td>상세주소</td>
				<td><input name="addr2" id="addr_addr2" /></td>
				</tr>
				 -->
			</table>
			<input type="button" id="submitButton" value="회원 가입"> 
			<a href="../main/mainpage"> <input type="button" value="취소"></a>
		</form>
	</div>
	<%@ include file="../fix/footer.jsp"%>

</body>
</html>