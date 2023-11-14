<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/4.4.0/chart.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
	
<script type="text/javascript" src="../../../../resources/js/qUserAnalysis.js"></script>

<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp"%>
	<%@ include file="../sidebar.jsp"%>
	<div id="mainContent">

		<table>
			<c:forEach items="${dateList}" var="date">
				<tr>
					<td class="visit_date">${date.visit_date}</td>
					<td class="visit_count">${date.visit_count}</td>
				</tr>
			</c:forEach>
		</table>
		<hr>
		<div>
			<canvas id="myChart"></canvas>
		</div>
		<hr>
	</div>

	<%@ include file="../footer.jsp"%>
</body>
</html>