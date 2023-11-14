<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="description" content="Ashion Template">
<meta name="keywords" content="Ashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>BRAND:ME</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Cookie&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&display=swap"
    rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="../../../resources/css/J/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/jquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/style.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/carousel.css" type="text/css">


  <style>
    .header {
      position: sticky;
      top: 0px;
      /* 도달했을때 고정시킬 위치 */
      padding: 5px;
      z-index: 10;
    }
  </style>
   
</head>
<body>
	<!-- Header Section Begin -->
	<header class="header">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xl-3 col-lg-2">
					<div class="header__logo">
						<a href="../main/mainpage.do"><img
							src="../../../resources/images/icon/logo.png" alt=""></a>
					</div>
				</div>
				<div class="col-xl-6 col-lg-7">
					<nav class="header__menu">
						<ul>
							<li class="active"><a href="../main/mainpage.do">Home</a></li>
							<li><a href="./shop.html">Shop</a></li>
							<li><a href="#">Pages</a>
								<ul class="dropdown">
									<li><a href="./product-details.html">Product Details</a></li>
									<li><a href="./shop-cart.html">Shop Cart</a></li>
								</ul></li>

						</ul>
					</nav>
				</div>
				<div class="col-lg-3">
					<div class="header__right">
						<div class="header__right__auth">
							<c:if test="${empty sessionScope.admin}">
							<a href="login.do" class="log">Login</a>
							</c:if>
							<c:if test="${not empty sessionScope.admin}">
							<a href="logout.do" class="log">Logout</a>
							</c:if>
						</div>
						<ul class="header__right__widget">
							<li><a href="../search.do"><i class="bi bi-search"></i></a></li>
							<li>${"관리자"}님 환영합니다.</li>
						</ul>
					</div>
				</div>
			</div>

		</div>
	</header>
	<!-- Header Section End -->
	<!-- Js Plugins -->
	<script src="../../../resources/js/J/jquery-3.3.1.min.js"></script>
	<script src="../../../resources/js/J/bootstrap.min.js"></script>
	<script src="../../../resources/js/J/jquery.magnific-popup.min.js"></script>
	<script src="../../../resources/js/J/jquery-ui.min.js"></script>
	<script src="../../../resources/js/J/mixitup.min.js"></script>
	<script src="../../../resources/js/J/jquery.countdown.min.js"></script>
	<script src="../../../resources/js/J/jquery.slicknav.js"></script>
	<script src="../../../resources/js/J/owl.carousel.min.js"></script>
	<script src="../../../resources/js/J/jquery.nicescroll.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/eleganticons@0.0.1/lte-ie7.min.js"></script>
	<script src="../../../resources/js/J/main.js"></script>
</body>
</html>