<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.4.0/chart.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<script type="text/javascript" src="../../../../resources/js/qSalesAnaysis.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<table border="1">
			<tr>
				<td>구매일</td>
				<td>총 수량</td>
				<td>총 금액</td>
			</tr>
			<c:forEach items="${purchaseStatics}" var="staticsData">
				<tr>
					<td class="purchase_date">${staticsData.purchase_date}</td>
					<td class="purchase_count">${staticsData.purchase_count}</td>
					<td class="purchase_price">${staticsData.purchase_price}</td>
				</tr>
			</c:forEach>
		</table>
		<div>
			<canvas id="accessAnalysis"></canvas>
		</div>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>