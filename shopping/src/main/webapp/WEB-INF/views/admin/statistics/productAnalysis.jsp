<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		매출 높은 상품 <br>
		<hr>
		<br> 조회 수 많은 상품
		<table>
			<thead>
				<tr>
					<td>순위</td>
					<td>제품명</td>
					<td>조회수</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${totalVisitor}" var="visitor">
					<tr>
						<td>${visitor.visit_date}</td>
						<td>${visitor.visit_count}</td>
						<td>${visitor.product_name}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>