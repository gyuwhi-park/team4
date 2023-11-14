<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 상품 - 상품 등록</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="../../../resources/css/J/font-awesome.min.css" type="text/css">

<script type="text/javascript" src="../../../resources/js/qcategoryManage.js"></script>
<script type="text/javascript" src="../../../resources/js/qregister.js"></script>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<table border="1">
			<thead>
				<tr>
					<th>브랜드(3)</th>
					<th>대분류(1)</th>
					<th>중분류(2)</th>
					<th>소분류(2)</th>
					<th>제품명</th>
					<th>가격</th>
					<th>수량</th>
					<th>제품 등록</th>
				</tr>
			</thead>
			<tbody>
				<tr id="list">
					<td><c:choose>
							<c:when test="${empty brandList}">
								브랜드 없음
							</c:when>
							<c:otherwise>
								<select size="5" name="selectBrand" id="selectBrand">
									<c:forEach items="${brandList}" var="brand">
										<option>${brand.brand_idx}:${brand.brand_name}</option>
									</c:forEach>
								</select>
							</c:otherwise>
						</c:choose></td>
					<td><c:choose>
							<c:when test="${empty div1List}">
								대분류 없음
							</c:when>
							<c:otherwise>
								<select size="5" name="selectDiv1" id="selectDiv1">
									<c:forEach items="${div1List}" var="div1">
										<option>${div1.div1_idx}:${div1.div1_name}</option>
									</c:forEach>
								</select>
							</c:otherwise>
						</c:choose></td>
					<td><c:choose>
							<c:when test="${empty div2List}">
								대분류 미 선택
							</c:when>
							<c:otherwise>
								<select size="5" name="selectDiv2" id="selectDiv2">
									<c:forEach items="${div2List}" var="div2">
										<option>${div2.div2_idx}:${div2.div2_name}</option>
									</c:forEach>
								</select>
							</c:otherwise>
						</c:choose></td>
					<td><c:choose>
							<c:when test="${empty div3List}">
								중분류 미 선택
							</c:when>
							<c:otherwise>
								<select size="5" name="selectDiv3" id="selectDiv3">
									<c:forEach items="${div3List}" var="div3">
										<option>${div3.div3_idx}:${div3.div3_name}</option>
									</c:forEach>
								</select>
							</c:otherwise>
						</c:choose></td>
					<td><input id="productName" /></td>
					<td><input id="price" /></td>
					<td><input id="count" /></td>
					<td><input type="button" id="insertProduct" value="추가하기" /></td>
				</tr>
			</tbody>
		</table>
		<br>
		<hr>
		<br>
		<table>
			<thead>
				<tr>
					<th>제품 목록</th>
					<th>색상 현황</th>
					<th>색상 추가</th>
					<th>사이즈 현황</th>
					<th>사이즈 추가</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td id=""><select size="5" id="productCurrentList">
							<c:forEach items="${productList}" var="product">
								<option>${product.product_idx}:${product.product_name}</option>
							</c:forEach>
					</select></td>
					
					<td><select size="5" id="productColorList">
					</select></td>
					
					<td><input id="colorInput" placeholder="입력 후 엔터 키로 추가" /> <select
						id="colorList" size="5"></select>
						<hr>
						<button id="colorDelete">제거</button></td>
						
					<td><select size="5" id="productSizeList">
					</select></td>
					
					<td><input id="sizeInput" placeholder="입력 후 엔터 키로 추가" /> <select
						id="sizeList" size="5"></select>
						<hr>
						<button id="sizeDelete">제거</button></td>
				</tr>
			</tbody>
		</table>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>