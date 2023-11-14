<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
         <!DOCTYPE html>
         <html lang="zxx">

         <head>
            <meta charset="UTF-8">
            <meta name="description" content="Ashion Template">
            <meta name="keywords" content="Ashion, unica, creative, html">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <title>BRAND:ME</title>


            <!-- Css Styles -->
            <link rel="stylesheet" href="../../../resources/css/J/font-awesome.min.css" type="text/css">
            <link rel="stylesheet" href="../../../resources/css/J/elegant-icons.css" type="text/css">
            <link rel="stylesheet" href="../../../resources/css/J/style.css" type="text/css">
            <link rel="stylesheet" href="../../../resources/css/J/carousel.css" type="text/css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
            <script src="../../../resources/js/J/carousel.js"></script>

            <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
            <script src="https://code.jquery.com/jquery-3.7.1.min.js"
               integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

            <script type="text/javascript">

               var user_idx = '<%= session.getAttribute("user_idx") %>';

               console.log(user_idx);


               $(window).scroll(function () {
                  if ($(this).scrollTop() > 300) {
                     $('.btn_gotop').show();
                  } else {
                     $('.btn_gotop').hide();
                  }
               });
               $('.btn_gotop').click(function () {
                  $('html, body').animate({ scrollTop: 0 }, 400);
                  return false;
               });
            </script>


            <style>
               .header {
                  position: sticky;
                  top: 0px;
                  /* 도달했을때 고정시킬 위치 */
                  padding: 5px;
                  z-index: 10;
               }

               .categories__item set-bg {
                  max-width: 100%;
                  height: auto;
               }

               .btn_gotop {
                  display: none;
                  position: fixed;
                  bottom: 30px;
                  right: 30px;
                  z-index: 999;
                  border: 1px solid #ccc;
                  outline: none;
                  background-color: white;
                  color: #333;
                  cursor: pointer;
                  padding: 15px 20px;
                  border-radius: 100%;
               }
            </style>

         </head>

         <body>
            <%@ include file="../fix/header.jsp" %>

               <!-- 상단으로 이동하기 버튼 -->
               <a href="#" class="btn_gotop">
                  <span class="glyphicon glyphicon-chevron-up">
                  </span>
               </a>

               <!--  main source start -->
               <div class="container">


                  <div class='carousel slide' id="carousel-example-generic">
                     <!-- Indicators -->
                     <ol class='carousel-indicators'>
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                     </ol>

                     <!-- Carousel items -->
                     <div class='carousel-inner'>
                        <div class="item active">
                           <img src="../../../resources/images/cloth/mainCarousel_1.jpg" alt="First slide">
                        </div>
                        <div class="item">
                           <img src="../../../resources/images/cloth/mainCarousel_2.jpg" alt="Second slide">
                        </div>
                        <div class="item">
                           <img src="../../../resources/images/cloth/mainCarousel_3.jpg" alt="Third slide">
                        </div>
                     </div>

                     <!-- Controls -->
                     <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                        <span class="icon-prev"></span>
                     </a>
                     <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                        <span class="icon-next"></span>
                     </a>
                  </div>
               </div>

               <!-- Product Section Begin -->
               <section class="product spad">
                  <div class="container">
                     <div class="row">
                        <div class="col-lg-4 col-md-4">
                           <div class="section-title">
                              <h4>New product</h4>
                           </div>
                        </div>
                        <div class="col-lg-8 col-md-8">
                           <ul class="filter__controls">
                              <li class="active" data-filter="*">All</li>
                              <li data-filter=".women">Women’s</li>
                              <li data-filter=".men">Men’s</li>
                              <li data-filter=".kid">Kid’s</li>
                              <li data-filter=".accessories">Accessories</li>
                              <li data-filter=".cosmetic">Cosmetics</li>
                           </ul>
                        </div>
                     </div>
                     <div class="row property__gallery">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix women">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/CM2D9W03.jpg">
                                 <div class="label new">New</div>
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/CM2D9W03.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="CMCFC2D7"></span></a></li>

                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="CMCFC2D7"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=CMCFC2D7">울 블렌드 핀턱 와이드 팬츠</a>
                                 </h6>
                                 <div class="product__price">200,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix men">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/O22DA01.jpg">
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/O22DA01.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="OD2B2DA0"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="OD2B2DA0"></span></a></li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=OD2B2DA0">비딩 프린티드 후드 티셔츠</a>
                                 </h6>
                                 <div class="product__price">100,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix accessories">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/TH2DAQ1.jpg">
                                 <div class="label stockout">out of stock</div>
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/TH2DAQ1.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="TH2DAQJA"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="TH2DAQJA"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=TH2DAQJA">하이넥 구스 다운 점퍼</a>
                                 </h6>
                                 <div class="product__price">650,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix cosmetic">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/TH2DBK1.jpg">
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/TH2DBK1.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="TH2DBKOU"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="TH2DBKOU"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=TH2DBKOU ">울 블렌드 하이넥 니트 탑</a>
                                 </h6>
                                 <div class="product__price">450,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix kid">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/TH2DBW3.jpg">
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/TH2DBW3.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="TH2DBWCO"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="TH2DBWCO"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=TH2DBWCO">캐시미어 블렌드 발마칸 코트</a>
                                 </h6>
                                 <div class="product__price">1,450,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix women men kid accessories cosmetic">
                           <div class="product__item sale">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/TH2D1WP1.jpg">
                                 <div class="label sale">Sale</div>
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/TH2D1WP1.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="TH2D8WPH"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="TH2D8WPH"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=TH2D8WPH">스트레치 슬림 밴딩 팬츠</a>
                                 </h6>

                                 <div class="product__price">
                                    220,000 <span>250,000</span>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix women men kid accessories cosmetic">
                           <div class="product__item">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/SJ2DBW01.jpg">
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/SJ2DBW01.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="SJTY2DBW"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="SJTY2DBW"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=SJTY2DBW">플랩 퍼 자켓</a>
                                 </h6>

                                 <div class="product__price">780,000</div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6 mix women men kid accessories cosmetic">
                           <div class="product__item sale">
                              <div class="product__item__pic set-bg" data-setbg="../resources/images/cloth/O22DAA1.jpg">
                                 <div class="label">Sale</div>
                                 <ul class="product__hover">
                                    <li><a href="../resources/images/cloth/O22DAA1.jpg" class="image-popup"><span
                                             class="bi bi-arrows-angle-expand"></span></a></li>
                                    <li><a href="#"><span class="bi bi-heart" data-idx="OD2B2DAA"></span></a></li>
                                    <li><a href="#"><span class="bi bi-bag-dash" data-idx="OD2B2DAA"></span></a>
                                    </li>
                                 </ul>
                              </div>
                              <div class="product__item__text">
                                 <h6>
                                    <a href="http://localhost:8080/product/product-detail?product_idx=OD2B2DAA">와이드 카고 데님 팬츠</a>
                                 </h6>

                                 <div class="product__price">
                                    135,000 <span>150,000</span>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </section>
               <!-- Product Section End -->

               <!-- Banner Section Begin -->
               <div class="container">


                  <div class='carousel slide' id="carousel-example-generic_2">
                     <!-- Indicators -->
                     <ol class='carousel-indicators'>
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                     </ol>

                     <!-- Carousel items -->
                     <div class='carousel-inner'>
                        <div class="item active">
                           <img src="../../../resources/images/cloth/slideProduct_1.jpg" alt="First slide">
                        </div>
                        <div class="item">
                           <img src="../../../resources/images/cloth/slideProduct_2.jpg" alt="Second slide">
                        </div>
                        <div class="item">
                           <img src="../../../resources/images/cloth/slideProduct_3.jpg" alt="Third slide">
                        </div>
                     </div>

                     <!-- Controls -->
                     <a class="left carousel-control" href="#carousel-example-generic_2" data-slide="prev">
                        <span class="icon-prev"></span>
                     </a>
                     <a class="right carousel-control" href="#carousel-example-generic_2" data-slide="next">
                        <span class="icon-next"></span>
                     </a>
                  </div>
               </div>
               <!-- <div class="banner__slider owl-carousel">
                  <div class="banner__item">
                  
                     <div class="banner__text">
                  
                        <span>The Q Collection</span>
                        <h1>The Project Jacket</h1>
                        <a href="#">Shop now</a>
                     </div>
                  </div>
                  <div class="banner__item">
                     <div class="banner__text">
                        <span>The Chloe Collection</span>
                        <h1>The Project Jacket</h1>
                        <a href="#">Shop now</a>
                     </div>
                  </div>
                  <div class="banner__item">
                     <div class="banner__text">
                        <span>The Chloe Collection</span>
                        <h1>The Project Jacket</h1>
                        <a href="#">Shop now</a>
                     </div>
                  </div>
               </div> -->


               <!-- Banner Section End -->

               <!-- Trend Section Begin -->
               <section class="trend spad">
                  <div class="container">
                     <div class="row">
                        <div class="col-lg-4 col-md-4 col-sm-6">
                           <div class="trend__content">
                              <div class="section-title">
                                 <h4>Hot Trend</h4>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/hotProduct_1.jpg" alt="">

                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=CMCF2D9W">Cashmere
                                          neat</a></h6>

                                    <div class="product__price">200,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/hotProduct_2.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=SJTY2D84">Wool vneck
                                          neat</a></h6>

                                    <div class="product__price">180,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/hotProduct_3.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=OD2BD9WO">Cashmere
                                          jacket</a></h6>

                                    <div class="product__price">300,000</div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6">
                           <div class="trend__content">
                              <div class="section-title">
                                 <h4>Best seller</h4>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/trendProduct_1.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=ON2D9NWO">Cashmere dott
                                          cardigan</a></h6>

                                    <div class="product__price">450,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/trendProduct_2.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6>
                                       <a href="http://localhost:8080/product/product-detail?product_idx=OD2B2DAA">Coduroy pants</a>
                                    </h6>

                                    <div class="product__price">135,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/trendProduct_3.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=SJTM2D9T">collar knit</a>
                                    </h6>

                                    <div class="product__price">80,000</div>
                                 </div>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-6">
                           <div class="trend__content">
                              <div class="section-title">
                                 <h4>Feature</h4>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/featureProduct_1.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=TH2D7WPO">Cashmere
                                          highneck jarcket</a></h6>

                                    <div class="product__price">550,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/featureProduct_2.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=TH2DBWPC">Hood tshirt</a>
                                    </h6>

                                    <div class="product__price">220,000</div>
                                 </div>
                              </div>
                              <div class="trend__item">
                                 <div class="trend__item__pic">
                                    <img src="../../../resources/images/cloth/featureProduct_3.jpg" alt="">
                                 </div>
                                 <div class="trend__item__text">
                                    <h6><a href="http://localhost:8080/product/product-detail?product_idx=TH2D8WPO">goose down
                                          blouson</a></h6>

                                    <div class="product__price">1,150,000</div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </section>
               <!-- Trend Section End -->

               <!-- Discount Section Begin -->
               <section class="discount">
                  <div class="container">
                     <div class="row">
                        <div class="col-lg-6 p-0">
                           <div class="discount__pic">
                              <img src="../../../resources/images/cloth/eventproduct.jpg" alt="">
                           </div>
                        </div>
                        <div class="col-lg-6 p-0">
                           <div class="discount__text">
                              <div class="discount__text__title">
                                 <span>New</span>
                                 <h2>Autumn 2023</h2>

                              </div>
                              <div class="discount__countdown" id="countdown-time">
                                 <div class="countdown__item">
                                    <span>21</span>
                                    <p>Century</p>
                                 </div>
                                 <div class="countdown__item">
                                    <span>18</span>
                                    <p>Hour</p>
                                 </div>
                                 <div class="countdown__item">
                                    <span>46</span>
                                    <p>Min</p>
                                 </div>
                                 <div class="countdown__item">
                                    <span>05</span>
                                    <p>Sec</p>
                                 </div>
                              </div>
                              <a href="#">Shop now</a>
                           </div>
                        </div>
                     </div>
                  </div>
               </section>
               <!-- Discount Section End -->

               <!-- Services Section Begin -->

               <section class="services spad">
                  <div class="container">
                     <div class="section-title">
                        <h4>Brand</h4>
                     </div>
                     <div class="row">

                        <div class="col-lg-3 col-md-4 col-sm-6">
                           <div class="services__item">
                              <a href="https://www.ssfshop.com/main"><img src="../../../resources/images/icon/ssf.jpg"></a>

                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6">
                           <div class="services__item">
                              <a href="https://www.thehandsome.com/ko"><img src="../../../resources/images/icon/handsome.jpg"></a>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6">
                           <div class="services__item">
                              <a href="https://www.giordano.co.kr/"><img src="../../../resources/images/icon/giordano.jpg"></a>
                           </div>
                        </div>
                        <div class="col-lg-3 col-md-4 col-sm-6">
                           <div class="services__item">
                              <a href="https://m.lfmall.co.kr/app/exhibition/menu/302"><img
                                    src="../../../resources/images/icon/lfmall.jpg"></a>
                           </div>
                        </div>
                     </div>
                  </div>
               </section>
               <!-- Services Section End -->


               <!-- Instagram Begin -->
               <div class="instagram">
                  <div class="container-fluid">
                     <div class="row">
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_1.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_2.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_3.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_4.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_5.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                        <div class="col-lg-2 col-md-4 col-sm-4 p-0">
                           <div class="instagram__item set-bg" data-setbg="../../../resources/images/cloth/bottomImg_6.jpg">
                              <div class="instagram__text">
                                 <i class="fa fa-instagram"></i> <a href="../main/mainpage.do">@ ashion_shop</a>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>

               <!-- Instagram End -->
               <!-- main source end -->

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
               <script src="../../../resources/js/J/main.js"></script>
               <script src="../../../resources/js/J/mainpage.js"></script>

               <%@ include file="../fix/footer.jsp" %>
         </body>

         </html>