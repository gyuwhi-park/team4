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
		<h4>제품 및 이미지 관리</h4>
		<c:if test="${productList == null}">
			등록된 제품이 없습니다.
		</c:if>
		<c:if test="${productList != null}">
			<table border="1">
				<thead>
					<tr>
						<td>제품번호</td>
						<td>제품명</td>
						<td>제품 삭제</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${productList}" var="product">
						<tr>
							<td>${product.product_idx}</td>
							<td><a href="imageManage?product_idx=${product.product_idx}&product_name=${product.product_name}">${product.product_name}</a></td>
							<td><button class="productDelete">삭제</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>