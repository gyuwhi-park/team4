<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
  <meta charset="UTF-8">
  <meta name="description" content="Ashion Template">
  <meta name="keywords" content="Ashion, unica, creative, html">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>BRAND:ME | OrderPage</title>


<style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

  <!-- Css Styles -->
  <link rel="stylesheet" href="../resources/css/J/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/style.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/orderlist.css" type="text/css">
  <link rel="stylesheet" href="../resources/modalCss/bootstrap.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/modalCss/bootstrap.css" type="text/css">
  <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.10.0/themes/ui-lightness/jquery-ui.css" />

  <!-- modal -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

  <style>
    .header {
      position: sticky;
      top: 0px;
      /* 도달했을때 고정시킬 위치 */
      padding: 5px;


      z-index: 10;
     
    }
    
    .orderList {
       top : -400px;
       position: relative;
    }
    
    .date_container {
       margin-top: 10px;
    }
  
     .date {
        margin-top: 10px;
        padding-left: 10px;
     }
     
  </style>
</head>

<body>
<%@ include file="../fix/header.jsp"%>
  <!-- body -->
  <header>
    <h1>Order List</h1>
  </header>
   <%@ include file="sidebar.jsp"%>
   <div class="orderList">
  <div class="dateForm">
    <h6>전체 주문처리상태</h6>
    <label for='fromDate'></label>
    <div class="date_container">
         <table id="searchDateOrder">
            <tr>
               <td style="border: 2px solid black; ">오늘</td>
               <td style="border: 2px solid black;">1개월</td>
               <td style="border: 2px solid black;">3개월</td>
               <td style="border: 2px solid black;">6개월</td>
            </tr>
         </table>
    </div>
   <form action="" class="date">
    <input type='text' name='fromDate' id='fromDate'>
    ~
    <label for='toDate'></label>
    <input type='text' name='toDate' id='toDate'>
    <input type="submit" value="조회">
    </form>
  </div>
  <form action="orderDetailList.do" method="post">
  <section class="shop-cart spad"> <!-- 테이블 배열 처리해서 게시판 만들기-->
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="shop__cart__table">
            <table>
              <thead>
                <tr>
                  <th>Product</th>
                  <th>Option</th>
                  <th>price</th>
                  <th>State</th>

                </tr>
              </thead>
              <tbody>
                          <c:forEach items="${purchaseList}" var="purchase">
                              <tr>

                                 <td class="cart__product__item">
                                    <div class="cart__product__item__title">
                                       <h6>${purchase.purchase_date}<!-- 주문한 상품명,옵션,이미지 받아오기!-->
                                       </h6>
                                       <h6 name="product_name" id="product_name"><a href="http://localhost:8080/product/product-detail?product_idx=TH2DAQJA">${purchase.product_name}</a>  </h6>

                                    </div>
                                 </td>
                                 <td class="cart__price">${purchase.purchase_option}<!-- 주문한 상품 가격 받아오기 !--></td>
                                 <td class="cart__quantity">${ purchase.purchase_price}<!-- 주문한 상품 수량 받아오기-->
                                 </td>
                                 <td class="cart__total">구매확정</td>
                           <!-- 모달 버튼 -->
                                 <td class="cart__close"><button type="button"
                                       id='orderConfirm' class="btn btn-primary"
                                       data-toggle="modal" data-target="#myModal1">[detail]</button></td>
                           <!-- 모달 버튼 끝 -->
                                 <!-- 주문내역 팝업 띄우기-->

                                 <!-- 팝업창 내용 -->
                        <!-- 모달 시작 -->
                                 <div class="modal" id="myModal1">
                                    <div class="modal-dialog">
                                       <div class="modal-content">
                                          <!-- 모달 내용 -->
                                          <div class="modal-header">
                                             <h4 class="modal-title">주문상세정보</h4>
                                             <button type="button" class="close" data-dismiss="modal">&times;</button>
                                          </div>
                                          
                                          <div class="modal-body">

                                             <p>
                                                주문번호 <span style="color: blue; margin: 148px;">${purchase.purchase_idx }</span>
                                             </p>
                                             <p>
                                                주문일자 <span style="color: blue; margin: 146px;">${purchase.purchase_date} </span>
                                             </p>
                                             <!-- 값받기 -->
                                             <p>
                                                상품명 <span style="color: blue; margin: 160px;">${purchase.product_name} </span>
                                             </p> 
                                             <!-- 값받기 -->
                                             <p>
                                                주문처리상태 <span style="color: blue; margin: 115px;">구매확정</span>
                                             </p>
                                             <!-- 값받기 -->
                                             <p>
                                                주문자 <span style="color: blue; margin: 160px;">${purchase.user_name}</span>
                                             </p>
                                             
                                             
                                             <p>
                                                주소 <span style="color: blue; margin: 172px;">${ purchase.addr_addr}</span>
                                             </p>
                                             <p>
                                                총 주문금액 <span style="color: blue; margin: 130px;">${ purchase.purchase_price}</span>
                                             </p>
                                             
                                             <!-- 값받기 -->
                                            <%--  <p>
                                                받으시는분 <span style="color: blue; margin: 130px;">${purchase.user_name}
                                                </span>
                                             </p>
                                             <!-- 값받기 -->

                                             <p>
                                                휴대전화 <span style="color: blue; margin: 130px;">${purchase.user_phone}
                                                </span>
                                             </p> --%>
                                             <!-- 값받기 -->
                                             <p>
                                                배송메시지 <span style="color: blue; margin: 130px;">문 앞에 놔주세요
                                                </span>
                                             </p>
                                             <!-- 값받기 -->
                                          
                                 <!-- 모달 내용 끝 -->

                                          </div>
                                          <button type="button" class="btn btn-primary"
                                             data-dismiss="modal">닫기</button>
                                       </div>

                                    </div>
                                 </div>
                        <!-- 모달 끝 -->


                              </tr>
                           </c:forEach>


                        </tbody>

                     </table>
                  </div>
               </div>
            </div>
         </div>
         <table style="display:flex; justify-content:center; align-items:center; font-size: 20px;" class="container">
            <tr>
               <td><a href="orderlist?page=1">&lt;&lt;</a></td>
               <td><a href="orderlist?page=${prevMax}">&lt;</a></td>
               <c:forEach items="${numList}" var="num">
                  <td><a href="orderlist?page=${num}">${num}</a></td>
               </c:forEach>
               <td><a href="orderlist?page=${nextMin}">&gt;</a></td>
               <td><a href="orderlist?page=${lastPage}">&gt;&gt;</a></td>
            </tr>
         </table>
      </section>
   </form>
  </div>
   <!-- body end -->
      <!-- Js Plugins -->
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
  <script type="text/javascript" src="../resources/js/J/my.js"></script>
  <script type="text/javascript" src="../resources/modalJs/bootstrap.min.js"></script>
  <script type="text/javascript" src="../resources/js/J/jquery.slicknav.js"></script>
   <!--      <script src="../../../resources/js/ajax.js"></script> -->
     <%@ include file="../fix/footer.jsp"%>
</body>

</html>