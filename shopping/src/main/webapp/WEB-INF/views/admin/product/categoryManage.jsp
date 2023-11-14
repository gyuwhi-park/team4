<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 - 상품 - 분류 관리</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="../../resources/js/qcategoryManage.js"></script>
</head>

<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
		<hr>
		<form action="categoryInsert" method="get">
			<table border="1">
				<thead>
					<tr>
						<th>브랜드</th>
						<th>대분류</th>
						<th>중분류</th>
						<th>소분류</th>
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
											<option>${brand.brand_idx} : ${brand.brand_name}</option>
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
											<option>${div1.div1_idx} : ${div1.div1_name}</option>
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
											<option>${div2.div2_idx} : ${div2.div2_name}</option>
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
											<option>${div3.div3_idx} : ${div3.div3_name}</option>
										</c:forEach>
									</select>
								</c:otherwise>
							</c:choose></td>
					</tr>
				</tbody>
			</table>
			<input id="category" disabled="disabled" value="브랜드">
			<input id="idx" placeholder="브랜드/분류 명칭(영어)">
			<input id="text" placeholder="브랜드/분류 명칭(한글)"> 
			<input id="addButton" type="button" value="추가">
			<input id="deleteButton" type="button" value="제거">
		</form>
	</div>
	<%@ include file="../footer.jsp"%>
</body>
</html>