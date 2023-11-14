<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<table border="1">
			<thead>
				<tr>
					<td>번호</td>
					<td>유형</td>
					<td>제목</td>
					<td>작성자</td>
					<td>생성일</td>
					<td>옵션</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList}" var="board">
					<tr>
						<td>${board.board_idx}</td>
						<td>${board.board_type}</td>
						<td><a href="boardContent?board_idx=${board.board_idx}">${board.board_title}</a></td>
						<td>${board.user_idx}</td>
						<td>${board.board_date}</td>
						<td>${board.board_option}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
		<%@ include file="../footer.jsp"%>
</body>
</html>