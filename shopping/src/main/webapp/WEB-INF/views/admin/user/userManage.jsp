<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="numCount" value="0" />
<c:set var="priceCount" value="0" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 고객 - 회원 관리</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="../../../resources/js/quserManage.js"></script>
</head>

<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<form name="frm" action="userManage">
			<input type="text" id="search" name="user_idx"
				placeholder="유저 번호로 검색"> <input type="submit" id="submit"
				value="검색">
		</form>
		<br>
		<table border="1">
			<thead>
				<tr>
					<td>유저번호</td>
					<td>아이디</td>
					<td>유저이름</td>
					<td>전화번호</td>
					<td>생년월일</td>
					<td>성별</td>
					<td>이메일</td>
					<td>탈퇴여부</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${user.user_idx}</td>
					<td>${user.user_id}</td>
					<td>${user.user_name}</td>
					<td>${user.user_phone}</td>
					<td>${user.user_birth}</td>
					<td>${user.user_gender}</td>
					<td>${user.user_mail}</td>
					<td>${secession}</td>
				</tr>
			</tbody>
		</table>
		<hr>

		<table border="1" id="purchaseHistory">
			<thead>
				<tr>
					<td>구매번호</td>
					<td>주문번호</td>
					<td>구매일</td>
					<td>제품번호</td>
					<td>구매 수량</td>
					<td>옵션</td>
					<td>총 금액</td>
					<td>배송 상태</td>
					<td>배송지</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="purchase">
					<tr>
						<td>${purchase.purchase_idx}</td>
						<td>${purchase.purchase_number}</td>
						<td>${purchase.purchase_date}</td>
						<td>${purchase.product_idx}</td>
						<td>${purchase.purchase_count}</td>
						<td>${purchase.purchase_option}</td>
						<td>${purchase.purchase_price}</td>
						<td>${purchase.purchase_state}</td>
						<td>${purchase.addr_idx}</td>
					</tr>
					<c:set var="numCount" value="${numCount+purchase.purchase_count}" />
					<c:set var="priceCount"
						value="${priceCount+purchase.purchase_price}" />
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<p>구매 횟수 : ${numCount}</p>
		<p>총 구매 금액 : ${priceCount}</p>
		<hr>
	</div>

	<%@ include file="../footer.jsp"%>
</body>
</html>