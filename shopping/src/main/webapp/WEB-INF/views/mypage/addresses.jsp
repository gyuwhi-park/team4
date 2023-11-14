<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BRAND:ME</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" type="text/javascript"></script>
<script type="text/javascript" src="../../../resources/js/qAddress.js"></script>
</head>
<body>
	<h3>주소 추가</h3>
	<form action="addressInput" id='form'>
		<input type="hidden" name="user_idx" id="user_idx" value="${user_idx}"/>
		<table border="1">
			<thead>
				<tr>
					<th>우편번호</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input id="addr_post" name="addr_post" /></td>
					<td><input id="addr_addr" name="addr_addr" /></td>
				</tr>
				<tr>
					<td colspan="2"><input id="submit" type="button" value="등록" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<br>
	<hr>
	<c:if test="${addressList != null}">
		<br>
		<table border="1">
			<thead>
				<tr>
					<th>우편번호</th>
					<th>주소</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${addressList}" var="addr">
					<tr>
						<td>${addr.addr_post}</td>
						<td>${addr.addr_addr}</td>
						<td><input class="edit" type="button" value="수정"></td>
						<td><input class="delete" type="button" value="삭제"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	<c:if test="${addressList == null}">
		<table border="1">
			<thead>
				<tr>
					<th>우편번호</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td rowspan="2">등록된 주소가 없습니다</td>
				</tr>
			</tbody>
		</table>
	</c:if>
</body>
</html>