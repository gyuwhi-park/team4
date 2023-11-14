<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BRAND:ME</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Cookie&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet"
	href="../../../resources/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet"
	href="../../../resources/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet"
	href="../../../resources/css/elegant-icons.css" type="text/css">
<link rel="stylesheet"
	href="../../../resources/css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/slicknav.min.css"
	type="text/css">
<link rel="stylesheet" href="../../resources/css/style.css"
	type="text/css">

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">
	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>	

<style type="text/css">
	.bi-heart {
		height: 20px;
	}

</style>

<script type="text/javascript">
	var user_idx = '<%= session.getAttribute("user_idx") %>';
	
	console.log(user_idx);
</script>

</head>
<body>
	<%@ include file="../fix/header.jsp"%>
	<!-- Product Details Section Begin -->
	<!-- 왼쪽 상단 -->
	<section class="product-details spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="product__details__pic">
						<div
							class="product__details__pic__left product__thumb nice-scroll">
							<c:forEach var="imgs" items="${imageList}" begin="0" end="2">
								<a	class="pt <c:if test="${imags.isActive eq true}">active</c:if>"	href="#${imgs.image_name}"> 
								<img src="${imgs.image_path}/${imgs.image_name}" alt="">
								</a>
							</c:forEach>
						</div>
						<div class="product__details__slider__content">
							<div class="product__details__pic__slider owl-carousel">
								<c:forEach var="imgs" items="${imageList}">
									<img data-hash="${imgs.image_name}" class="product__big__img"
										src="${imgs.image_path}/${imgs.image_name}"
										alt="">
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<!-- 오른쪽 상단 -->
				<div class="col-lg-6">
					<!-- 분류 -->
					<div class="breadcrumb-option">
						<div class="container">
							<div class="row">
								<div class="col-lg-12">
									<c:set var="div1" value="${fn:substring(productList.div3_idx, 0, 1)}" />
									<c:set var="div2" value="${fn:substring(productList.div3_idx, 0, 3)}" />
									<c:set var="div3" value="${productList.div3_idx}" />
									<div class="breadcrumb__links">
										<a href="../search?keyword=${productList.brand_name}">${productList.brand_name}</a>
										<a href="../search?keyword=${divResult.div1_name}">${divResult.div1_name}</a> 
										<a href="../search?keyword=${divResult.div2_name}">${divResult.div2_name}</a>
										<a href="../search?keyword=${divResult.div3_name}">${divResult.div3_name}</a> 
										<span>${productList.product_name}</span>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- 제품명 -->
					<div class="product__details__text">
						<span class="product__details__title">${productList.product_name}</span> 
						<span class="product__details__zzim"> 
<!-- 							<i class="bi bi-heart"></i> -->
							<c:choose>
								<c:when test="${not empty sessionScope.user_idx}">
									<!-- 빈하트일때 -->
									<c:if test="${empty markResult}">
									<i class="bi bi-heart heart11" data-idx="${productList.product_idx}"></i>
									</c:if>
									<c:if test="${not empty markResult}">
									<i class="bi bi-heart-fill heart11" data-idx="${productList.product_idx}"></i>
									</c:if>
								</c:when>
								<c:otherwise>
									<i class="bi bi-heart notlogin"></i>
								</c:otherwise>
							</c:choose>	
						</span>
						<!-- 평점 -->
						<div class="rating">
							<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <i class="fa fa-star"></i> <i
								class="fa fa-star"></i> <span>( 138 reviews )</span>
						</div>
					</div>
					<!-- 가격 -->
					<div class="product__details__price">${productList.product_price}</div>
					<div class="product__details__widget">
						<ul>
							<li class="colors_li">
								<div class="colors">
									<span>컬러 :</span>
									<div class="color__checkbox">
										<c:forEach var="colors" items="${colorList}"><%-- ${colorList} --%>
										<label for="${colors.color_name}"> <input type="radio" name="color__radio" id="${colors.color_name}"checked>
											<span class="checkmark" style="background-color: ${colors.color_name}" data-idx="${productList.product_idx}"></span>
										</label>
 										</c:forEach>
									</div>
								</div>
							</li>
							<span class="sizes">사이즈 :</span>
							<div class="selectBox2">
								<button class="label">사이즈</button>
								<ul class="optionList">
									<c:forEach var="sizes" items="${sizeList}">
                      					<li class="optionItem">${sizes.size_val}</li>
                    				</c:forEach>
								</ul>
							</div>
						</ul>
						<!-- 버튼 구성 -->
						<div class="product__details__button">
							<div class="quantity">
								<span>수량 : </span>
								<div class="pro-qty">
									<input type="text" readonly='readonly' id="input-qty" value="1">
								</div>
							</div>
						</div>
						<hr />
						<div class="prices">
							<span>총 합계 : </span>
							<div class="totalPrice">
							<span class="total_price">${productList.product_price}</span><span>원</span>
							</div>
						</div>
						<div class="cart-btn-button">
     						<a href="#" class="cart-btn" data-idx="${productList.product_idx}">장바구니</a>
							<a href="#"><button class="purchase-btn" id="openModalButton" data-idx="${productList.product_idx}">바로구매</button></a>
							<!-- 모달 창 -->
 						<div id="imageModal" class="modal">
							  <span class="close" id="closeModalButton">&times;</span>
							  <a href="product_purchase.do">
							  <img class="modal-content" id="modalImage">
							  </a>
							</div>
						</div>
						<!-- </ul> -->
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<nav class="product__details__tab">
					<ul class="nav" role="anker">
						<li class="nav-item"><a class="nav-link active" href="#a1">상세정보</a></li>
						<li class="nav-item"><a class="nav-link active" href="#a2">상품평</a></li>
					</ul>
				</nav>

				<section class="product__detail__content">
					<div id="a1">
						<c:forEach var="imgs" items="${imageList}" begin="3">
						<img src="${imgs.image_path}/${imgs.image_name}" alt="" style="width: 90%;">
						</c:forEach>
					</div>
					<div id="a2">
						<h5 class="purchase__contents">상품평</h5>
						<hr />
						<!-- 리뷰입력 -->
						<c:if test="${not empty sessionScope.user_idx}">
						<div class="rating">
							<span class="star" data-rating="1"></span> 
							<span class="star" data-rating="2"></span>
							<span class="star" data-rating="3"></span>
							<span class="star" data-rating="4"></span> 
							<span class="star" data-rating="5"></span>
						</div>
						<textarea class="commentArea" rows="4" cols="50" placeholder="상품평을 작성해주세요."></textarea>
						<button type="button" class="btn btn-default btn-xs" id="submitButton" data-idx="${productList.product_idx}">작성</button>
						</c:if>
						<!-- 세션중 myid값이 없으면-->
						<c:if test="${empty sessionScope.user_idx}">
						<button type="button" class="btn btn-default"
							id="showLoginConfirmationModal">로그인</button>
						<!-- 로그인 확인 모달 다이얼로그 -->
						<div id="loginConfirmationModal" class="modal">
							<div class="modal-content">
								<span class="close" id="closeLoginConfirmationModal">&times;</span>
								<h5>로그인을 하시겠습니까?</h5>
								<button id="loginConfirmationButton">확인</button>
							</div>
						</div>
						</c:if>
						<hr />
						<c:if test="${notlist}">
							리뷰가 없습니다.
						</c:if>
						<c:if test="${not notlist}">
						<c:forEach items="${reviewList}" var="reviews">
						<div class="reviews_list">
						<div>
							<button type="button" class="btn btn-default btn-xs" id="deleteButton" data-idx="${productList.product_idx}">삭제</button>
							<div id="review_date">${reviews.review_date}</div>
							<div class="displayRating" data-rating="${reviews.review_score}"></div>
							<div id="user_id">${reviews.user_id}</div>
						</div>
						<div>
							<input type="hidden" id="review_idx" value="${reviews.review_idx}"/>
							<span class="product_sort">${reviews.product_idx}</span>
							<span class="product_sort">${reviews.product_name}</span>
						</div>
						<div id="commentValue">
							<div>${reviews.review_content}</div>
						</div>
						<hr/>
						</div>
						</c:forEach>
						</c:if>
					</div>
				</section>
			</div>
		</div>
		</div>
	</section>
	<!-- Product Details Section End -->
	<!-- Js Plugins -->
	<script src="../../../resources/js/jquery.magnific-popup.min.js"></script>
	<script src="../../../resources/js/jquery-ui.min.js"></script>
	<script src="../../../resources/js/mixitup.min.js"></script>
	<script src="../../../resources/js/jquery.countdown.min.js"></script>
	<script src="../../../resources/js/jquery.slicknav.js"></script>
	<script src="../../../resources/js/owl.carousel.min.js"></script>
	<script src="../../../resources/js/jquery.nicescroll.min.js"></script>
	<script src="../../../resources/js/main.js"></script>
	<script type="text/javascript" src="../../../resources/js/product_detail.js"></script>
	<script src="../../../resources/js/bootstrap.min.js"></script>
	<%@ include file="../fix/footer.jsp"%>
</body>
</html>