<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sidebar</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
}

header {
	background-color: #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

.container2 {
	max-width: 960px;
	margin: 40px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	position: relative;
	top: -350px;
}

header h1 {
	font-size: 24px;
	color: white;
}

.profile-info {
	flex: 1;
}

.order-history {
	margin-top: 30px;
}

.table {
	width: 60%;
	position: relative;
	bottom: -200;
	margin-top: 20px;
}

table {
	width: 60%;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #ddd;
	height: 60px;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #333;
	color: #fff;
}

.logout {
	text-align: center;
	margin-top: 20px;
}

.sidebar {
	padding: 100px;
	margin: 100px;
	margin-right: 200px;
	display: inline-block;
}

#full {
	width: 600px;
	height: 600px;
	background-color: gray;
}

#screen_left {
	width: 200px;
	height: 600px;
	background-color: black;
}

#screenleft-1 {
	width: 200px;
	height: 400px;
	background-color: black;
}

#screenleft-2 {
	width: 200px;
	height: 200px;
	background-color: black;
}

#screenright {
	width: 400px;
	height: 600px;
	background-color: black;
	float: left;
}

#mainContent {
	position: absolute;
	top : 193.3px;
	left : 30%;
}

</style>
</head>
<c:set var="adminPath" value="http://localhost:8080/admin/"/>
<body>
	<div id="container">
		<section class="shop spad">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 col-md-3">
						<div class="shop__sidebar">
							<div class="sidebar__categories">
								<div class="section-title">
									<h4>
										<a href="${adminPath}adminMain">관리자 홈</a>
									</h4>
								</div>
								<div class="categories__accordion">
									<div class="accordion" id="accordionExample">
										<div class="card">
											<div class="card-heading active">
												<a data-toggle="collapse" data-target="#collapseOne">주문</a>
											</div>
											<div id="collapseOne" class="collapse show"
												data-parent="#accordionExample">
												<div class="card-body">
													<ul>
														<li><a href="${adminPath}purchase/dashboard">주문 대시보드</a></li>
														<li><a href="${adminPath}purchase/inquire">전체 주문 조회</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-heading">
												<a data-toggle="collapse" data-target="#collapseTwo">상품</a>
											</div>
											<div id="collapseTwo" class="collapse"
												data-parent="#accordionExample">
												<div class="card-body">
													<ul>
														<li><a href="${adminPath}product/dashboard">상품 대시보드</a></li>
														<li><a href="${adminPath}product/register">상품 등록</a></li>
														<li><a href="${adminPath}product/productManage">상품 관리</a></li>
														<li><a href="${adminPath}product/categoryManage">분류 관리</a></li>
														<li><a href="${adminPath}product/displayManage">상품 진열</a></li>
														<li><a href="${adminPath}product/stockManage">재고 관리</a></li>
														<li><a href="${adminPath}product/optionManage">상품 옵션 관리</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-heading">
												<a data-toggle="collapse" data-target="#collapseThree">고객</a>
											</div>
											<div id="collapseThree" class="collapse"
												data-parent="#accordionExample">
												<div class="card-body">
													<ul>
														<li><a href="${adminPath}user/dashboard">고객 대시보드</a></li>
														<li><a href="${adminPath}user/inquire">회원 조회</a></li>
														<li><a href="${adminPath}user/userManage">회원 관리</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-heading">
												<a data-toggle="collapse" data-target="#collapseFour">게시판</a>
											</div>
											<div id="collapseFour" class="collapse"
												data-parent="#accordionExample">
												<div class="card-body">
													<ul>
														<li><a href="${adminPath}board/dashboard">게시판 대시보드</a></li>
														<li><a href="${adminPath}board/boardManage">게시판 관리</a></li>
														<li><a href="${adminPath}board/postManage">게시물 관리</a></li>
													</ul>
												</div>
											</div>
										</div>
										<div class="card">
											<div class="card-heading">
												<a data-toggle="collapse" data-target="#collapseFive">통계</a>
											</div>
											<div id="collapseFive" class="collapse"
												data-parent="#accordionExample">
												<div class="card-body">
													<ul>
														<li><a href="${adminPath}statistics/dashboard">통계 대시보드</a></li>
														<li><a href="${adminPath}statistics/salesAnalysis?sort=static">매출 분석</a></li>
														<li><a href="${adminPath}statistics/productAnalysis">상품 분석</a></li>
														<li><a href="${adminPath}statistics/userAnalysis">고객 분석</a></li>
														<li><a href="${adminPath}statistics/accessAnalysis">접속 통계</a></li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script type="text/javascript" src="../../resources/js/qjquery.slicknav.js"></script>
</body>
</html>