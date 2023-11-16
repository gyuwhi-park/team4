<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap')
	;
</style>

<!-- Css Styles -->
<link rel="stylesheet" href="../resources/css/qbootstrap.min.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qfont-awesome.min.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qelegant-icons.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qjquery-ui.min.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qmagnific-popup.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qowl.carousel.min.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/qslicknav.min.css"
	type="text/css">
<link rel="stylesheet" href="../resources/css/H/style.css"
	type="text/css">

<style type="text/css">
/* 새로 작업한 css */
button.increase {
	color: #ffffff;
	background: #000000;
	padding: 3px 8px;
	border-radius: 3px;
}

button.decrease {
	color: #ffffff;
	background: #000000;
	padding: 3px 10px;
	border-radius: 3px;
}

input.price {
	padding: 2px 10px;
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input.cart_count {
	padding: 2px 10px;
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input.itemCheck {
	
}

td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
	text-align: center;
	padding-bottom: 5px;
}

#th {
	padding: 8px;
	text-align: center;
	border-top: 2px solid #ccc;
	border-bottom: 2px solid #c6c6c6;
	color: #000;
}

.tableBox {
	border-collapse: collapse;
	width: 1200px;
	margin: 1rem auto;
	background-color: white;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 16px;
	padding-top: 30px;
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
}

.totalBox {
	border-collapse: collapse;
	width: 1200px;
	margin: 1rem auto;
	background-color: white;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 16px;
	padding-top: 30px;
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
}

.totalBtn {
	border-collapse: collapse;
	width: 1200px;
	margin: 1rem auto;
	background-color: white;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 16px;
	padding-top: 30px;
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
}

button#delete {
	color: #ffffff;
	background: #000000;
	padding: 3px 10px;
	border-radius: 3px;
}

button#purchaseButton {
	color: #ffffff;
	background: #000000;
	padding: 3px 10px;
	border-radius: 3px;
}

input#user_name {
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input#user_phone {
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input#addr_post {
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input#addr_addr {
	border-radius: 3px;
	border: 1px solid #b1b1b1;
}

input#purchaseButton {
	color: #ffffff;
	background: #000000;
	padding: 3px 10px;
	border-radius: 3px;
}
</style>

</head>
<body>
	<%@ include file="fix/header.jsp"%>
	<div class="tableBox">
		<table border="1">
			<thead>
				<tr>
					<th>제품번호</th>
					<th>제품명</th>
					<th>색상 정보</th>
					<th>크기 정보</th>
					<th>가격</th>
					<th>수량</th>
					<th>총 금액</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${prePurchaseList}" var="pre">
					<tr>
						<td><input class="product_idx" disabled="disabled" value="${pre.product_idx}" width="30"></td>
						<td>${pre.product_name}<input type="hidden" class="cart_idx"
							value="${pre.cart_idx}"></td>
						<td class="color">${pre.color_name}</td>
						<td class="size">${pre.size_val}</td>
						<td><input class="price" type="text"
							value="${pre.product_price}"></td>
						<td class="count"><input class="cart_count" type="text"
							value="${pre.cart_count}"></td>
						<td class="getprice"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br>
	<hr>
	<br>
	<!-- <a href="" id="load">주문자 정보 불러오기</a>-->
	<input type="hidden" id="user_idx" value="${userInfo.user_idx}" />
	<!-- <form action=""> -->
	<div class="totalBox">
		<table border="1">
			<tbody>
				<tr>
					<td>받는 사람</td>
					<!-- <td>${userInfo.user_name}</td> -->
					<td><input id="user_name" name="user_name"
						value="${userInfo.user_name}"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input id="user_phone" name="user_phone"
						value="${userInfo.user_phone}"></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td><input id="addr_post" name="addr_post"
						value="${userAddress.addr_post}"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input id="addr_addr" name="addr_addr"
						value="${userAddress.addr_addr}"></td>
				</tr>
				<tr>
					<td>배송시 요청사항</td>
					<td><input id="purchase_option" name="purchase_option"
						value=""></td>
				</tr>
			</tbody>
		</table>
		<input type="button" id="purchaseButton" value="구매하기">
	</div>
	<!-- </form> -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"
		type="text/javascript"></script>
	<script type="text/javascript" src="../resources/js/qPurchase.js"></script>
	<%@ include file="fix/footer.jsp"%>
</body>
</html>