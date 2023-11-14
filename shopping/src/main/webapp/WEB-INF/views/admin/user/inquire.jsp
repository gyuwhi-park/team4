<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 고객 - 회원 관리</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="../../resources/js/quserManage.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<table border="1">
			<thead>
				<tr>
					<th>유저번호</th>
					<th>아이디</th>
					<th>유저이름</th>
					<th>전화번호</th>
					<th>생년월일</th>
					<th>성별</th>
					<th>이메일</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${userList}" var="user">
				<tr>
				<td>${user.user_idx}</td>
				<td><a href="userManage?user_idx=${user.user_idx}">${user.user_id}</a></td>
				<td>${user.user_name}</td>
				<td>${user.user_phone}</td>
				<td>${user.user_birth}</td>
				<td>${user.user_gender}</td>
				<td>${user.user_mail}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>