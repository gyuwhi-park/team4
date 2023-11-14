<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/css/style.css"
	type="text/css">

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.js"></script>
<script type="text/javascript"
	src="../../../resources/js/product_purchase.js"></script>

</head>
<body>
	<div id="boxes">
		<div id="dialog" class="window">
			<table border="1" class="orderList">
				<tr>
					<td>주문번호</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.product_name}</span></td>
				</tr>
				<tr>
					<td>주문일자</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.product_date}</span></td>
				</tr>
				<tr>
					<td>주문자</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.user_name}</span></td>
				</tr>
				<tr>
					<td>주문처리상태</td>
					<td><span style="color: blue; margin: 130px;">구매확정</span></td>
				</tr>
				<tr>
					<td>총 주문금액</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.purchase_price}</span></td>
				</tr>
				<tr>
					<td>받으시는분</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.user_name}</span></td>
				</tr>
				<tr>
					<td>휴대전화</td>
					<td><span style="color: blue; margin: 130px;">${purchaseList.user_phone}</span></td>
				</tr>
				<tr>
					<td>배송메시지</td>
					<td><span style="color: blue; margin: 130px;">문 앞에 놔주세요</span></td>
				</tr>
			</table>
			<div id="popupfoot">
				<a href="#" class="mainpage">
					<button type="button">메인페이지</button>
				</a> <a href="#" class="orderList">
					<button type="button">주문목록</button>
				</a>
			</div>
		</div>
		<div id="mask"></div>
	</div>

</body>
</html>