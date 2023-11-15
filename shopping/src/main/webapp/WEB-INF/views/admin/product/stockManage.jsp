<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 상품 - 재고관리</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="../../../../resources/js/qstockManage.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
	<table border="1">
	<thead>
		<tr>
			<th>제품번호</th>
			<th>대분류</th>
			<th>중분류</th>
			<th>소분류</th>
			<th>브랜드</th>
			<th>제품명</th>
			<th>가격</th>
			<th>옵션</th>
			<th>수량</th>
			<th>수량 변경</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${productList}" var="product">
		<tr>
			<td class="product_idx">${product.product_idx}</td>
			<td>${product.div1_name}</td>
			<td>${product.div2_name}</td>
			<td>${product.div3_name}</td>
			<td>${product.brand_name}</td>
			<td>${product.product_name}</td>
			<td>${product.product_price}</td>
			<td>${product.product_option}</td>
			<td class="product_count">${product.product_count}</td>
			<td><input type="button" class="editCount" value="수량 변경"></td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>