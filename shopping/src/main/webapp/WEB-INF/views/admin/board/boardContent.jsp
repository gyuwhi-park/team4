<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<h3>작성자 정보</h3>
		<table>
			<thead>
				<tr>
					<td>번호</td>
					<td>아이디</td>
				</tr>

			</thead>
			<tbody>
				<tr>
					<td>${user.user_idx}</td>
					<td><a href="../user/userManage?user_idx=${user.user_idx}">${user.user_id}</a></td>
				</tr>
			</tbody>
		</table>
		<br>
		<br>
		<h3>게시물 정보</h3>
		<table border="1">
			<tbody>
				<tr>
					<td>번호</td>
					<td>유형</td>
					<td>비밀번호</td>
					<td>옵션</td>
					<td>생성일</td>
					<td>제목</td>
				</tr>
				<tr>
					<td>${board.board_idx}</td>
					<td>${board.board_type}</td>
					<td>${board.board_pass}</td>
					<td>${board.board_option}</td>
					<td>${board.board_date}</td>
					<td>${board.board_title}</td>
				</tr>
			</tbody>
		</table>
		<br>
		<p>내용</p>
		<textarea rows="5" cols="50">${board.board_content}</textarea>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>