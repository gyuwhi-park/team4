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
	
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resources/js/qcategoryManage.js"></script>
</head>

<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">
	<h4>${product_name} - 사진 관리</h4>
		<table border="1">
			<tbody>
				<tr>
					<td>제품 번호</td>
					<td>제품 이름</td>
				</tr>
				<tr>
					<td id="product_idx">${product_idx}</td>
					<td>${product_name}</td>
				</tr>
			</tbody>
		</table>
		<div class="container">
			<form name="dataForm" id="dataForm"
				onsubmit="return registerAction()" action="">
				<input type="hidden" name="product_idx" val="${product_idx}">
				<input type="hidden" name="product_name" val="${product_name}">
				<button id="btn-upload" type="button"
					style="border: 1px solid #ddd; outline: none;">파일 추가</button>
				<input id="input_file" multiple="multiple" type="file"
					style="display: none;"> <span
					style="font-size: 10px; color: gray;">※첨부파일은 최대 10개까지 등록이
					가능합니다.</span>
				<div class="data_file_txt" id="data_file_txt" style="margin: 40px;">
					<span>첨부 파일</span> <br />
					<div id="articlefileChange"></div>
				</div>
				<button type="submit" style="border: 1px solid #ddd; outline: none;">전송</button>
			</form>
		<br><hr><br>
		<table border="1">
			<tbody>
				<tr>
					<td>이미지번호</td>
					<td>이미지 이름</td>
					<td>이미지</td>
					<td>삭제</td>
				</tr>
				<c:if test="${productImageList == null}">
				<tr>
					<td colspan="4">사진이 없습니다</td>
					<div id="articlefileChange"></div>
				</tr>
					
				</c:if>
				<c:if test="${productImageList != null}">
				<c:forEach items="${productImageList}" var="img">
					<tr>
						<td class="image_idx">${img.image_idx}</td>
						<td>${img.image_name}</td>
						<td><img alt="ALT${img.image_name}" 
						src="/resources/images/cloth/${img.image_name}" 
						width="200px" height="150px"/></td>
						<td><button class="deletebutton">삭제</button></td>
					</tr>
				</c:forEach>
				</c:if>
			</tbody>
		</table>
		</div>
	</div>
	
	<%@ include file="../footer.jsp"%>
</body>
</html>