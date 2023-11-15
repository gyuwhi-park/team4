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
		<div id="boardArea">
			<c:if test="${boardList == null}">
				<div>
					<span>게시물이 없습니다.</span>
				</div>
			</c:if>
			<c:if test="${boardList != null}">
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
			</c:if>
		</div>
		<br>
		<hr>
		<br>
		<div id="reviewArea">
			<c:if test="${reviewList == null}">
				<div>
					<span>리뷰가 없습니다.</span>
				</div>
			</c:if>
			<c:if test="${reviewList != null}">
				<table border="1">
					<thead>
						<tr>
							<td>리뷰번호</td>
							<td>제품번호</td>
							<td>작성자</td>
							<td>평점</td>
							<td>내용</td>
							<td>생성일</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${reviewList}" var="review">
							<tr>
								<td>${review.review_idx}</td>
								<td><a href="../../product/product-detail?product_idx=${review.product_idx}">${review.product_name}</a></td>
								<td><a href="../user/userManage?user_idx=${review.user_idx}">${review.user_id}</a></td>
								<td>${review.review_score}</td>
								<td>${review.review_content}</td>
								<td>${review.review_date}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</div>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>