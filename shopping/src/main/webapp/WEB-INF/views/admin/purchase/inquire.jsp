<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>purchase inquire</title>

<link rel="stylesheet" type="text/css"
	href="http://code.jquery.com/ui/1.10.0/themes/ui-lightness/jquery-ui.css" />
	
<!-- Css Styles -->
<link rel="stylesheet" href="../../resources/css/qbootstrap.min.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qfont-awesome.min.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qelegant-icons.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qjquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qmagnific-popup.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qowl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qslicknav.min.css" type="text/css">
<link rel="stylesheet" href="../../resources/css/qstyle.css" type="text/css">

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<!--  <script src="https://code.jquery.com/jquery-3.6.0.js"></script> -->
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script src="../../resources/js/qcalender.js"></script>

</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">

		전체 주문 조회
		<div>
			<table id="searchFixedValue">
				<tr>
					<td>오늘</td>
					<td>3일</td>
					<td>1주</td>
					<td>1개월</td>
					<td>3개월</td>
					<td>6개월</td>
				</tr>
			</table>
			​ 오늘 날짜 : <span id="today"></span> ​
			<form action="">
				<label for="fromDate">시작일</label> <input type="text" name="fromDate"
					id="fromdate"> ~ <label for="teDate">종료일</label> <input
					type="text" name="toDate" id="todate"> <input type="submit"
					value="조회">
			</form>
		</div>
		<div>
			<table>
				<tr>
					<th>주문번호</th>
					<th>주문일</th>
					<th>총 수량</th>
					<th>총 가격</th>
					<th>주문 처리 상태</th>
					<th>유저번호</th>
				</tr>
				<c:forEach items="${purchaseList}" var="purchase">
					<tr>
						<td>${purchase.purchase_idx}</td>
						<td>${purchase.purchase_date}</td>
						<td>${purchase.purchase_count}</td>
						<td>${purchase.purchase_price}</td>
						<td>${purchase.purchase_state}</td>
						<td>${purchase.user_idx}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
<%@ include file="../footer.jsp"%>	
</body>
</html>