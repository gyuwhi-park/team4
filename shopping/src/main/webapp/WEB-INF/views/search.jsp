<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>

<style type="text/css">

#mainContent {
	text-align: center;
}

</style>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>

</head>
<body>
	<%@ include file="fix/header.jsp"%>
	<div id="mainContent">
		<form action="">
			<input id="searchBox" placeholder="Search" name="keyword"
				value='${keyword}'>
			<c:if test="${sessionScope.user_id != null}">
				<table>
					<tr>
						<c:if test="${searchHistory != null}">
							<c:forEach items="${searchHistory}" var="search">
								<td><a href="http://localhost:8080/search?keyword=${search.search_content}">${search.search_content}</a> /</td>
							</c:forEach>
						</c:if>
						<c:if test="${searchHistory == null}">
							검색 기록이 없습니다
						</c:if>
					</tr>
				</table>
			</c:if>
		</form>
		<br>

		<table border="1">
			<thead>
				<tr>
					<td>브랜드</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty brandList}">
						<c:forEach items="${brandList}" var="brand">
							<tr>
								<td><a
									href="http://localhost:8080/search?keyword=${brand.brand_name}">${brand.brand_name}</a>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td>해당 키워드로 검색된 브랜드가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>

		<br>
		<hr>
		<br>

		<table border="1">
			<thead>
				<tr>
					<td>대분류</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty div1List}">
						<c:forEach items="${div1List}" var="div1">
							<tr>
								<td><a
									href="http://localhost:8080/search?keyword=${div1.div1_name}">${div1.div1_name}</a>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td>해당 키워드로 검색된 대분류가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>

		<br>
		<hr>
		<br>

		<table border="1">
			<thead>
				<tr>
					<td>중분류</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty div2List}">
						<c:forEach items="${div2List}" var="div2">
							<tr>
								<td><a
									href="http://localhost:8080/search?keyword=${div2.div1_name}">${div2.div1_name}</a>
									>> <a
									href="http://localhost:8080/search?keyword=${div2.div2_name}">${div2.div2_name}</a>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td>해당 키워드로 검색된 중분류가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>

		<br>
		<hr>
		<br>

		<table border="1">
			<thead>
				<tr>
					<td>소분류</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${not empty div3List}">
						<c:forEach items="${div3List}" var="div3">
							<tr>
								<td><a
									href="http://localhost:8080/search?keyword=${div3.div1_name}">${div3.div1_name}</a>
									>> <a
									href="http://localhost:8080/search?keyword=${div3.div2_name}">${div3.div2_name}</a>
									>> <a
									href="http://localhost:8080/search?keyword=${div3.div3_name}">${div3.div3_name}</a>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td>해당 키워드로 검색된 소분류가 없습니다.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>

		<br>
		<hr>
		<br>

		<table border="1">
			<thead>
				<tr>
					<td>제품명</td>
					<td>가격</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items='${productList}' var="product">
					<tr>
						<td><a href="http://localhost:8080/product/product-detail.do?product_idx=${product.product_idx}">${product.product_name}</a></td>
						<td>${product.product_price}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file="fix/footer.jsp"%>
</body>
</html>