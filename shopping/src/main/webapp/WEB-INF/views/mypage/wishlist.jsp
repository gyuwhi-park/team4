<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
  <meta charset="UTF-8">
  <meta name="description" content="Ashion Template">
  <meta name="keywords" content="Ashion, unica, creative, html">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>BRAND:ME | WishList</title>

<!-- 부트스트랩 icon 사용하기 위한 링크 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css">

  <!-- Google Font -->
  <link href="https://fonts.googleapis.com/css2?family=Cookie&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&display=swap"
    rel="stylesheet">
  <style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

  <!-- Css Styles -->
  <link rel="stylesheet" href="../resources/css/J/bootstrap.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/elegant-icons.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/jquery-ui.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/magnific-popup.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/owl.carousel.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/slicknav.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/style.css" type="text/css">

  <style>
    header {
      background-color: #333;
      color: #fff;
      padding: 20px;
      text-align: center;
    }

    .header {
      position: sticky;
      top: 0px;
      /* 도달했을때 고정시킬 위치 */
      padding: 5px;


      z-index: 10;
    }

    header h1 {
      font-size: 24px;
      color: white;
    }
    
    .shop__cart__table {
	  margin-top: -350px;

    }
  </style>
</head>

<body>
<%@ include file="../fix/header.jsp"%>

  <header>
    <h1>Wishlist</h1>
  </header>
  <%@ include file="sidebar.jsp"%>

  <!-- wishlist begin-->
  <section class="shop-cart spad">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="shop__cart__table">
       
            <table>
           
              <thead>
                <tr>
                  <th>Product</th>
                  <th>Price</th>
                  <th>Quantity</th>
                  <th>Add to cart</th>
                </tr>
              </thead>
              <tbody>
         
   <c:forEach items="${wishList}" var="wishList">   
                <tr>
               
                  <td class="cart__product__item">
                    <img src="" alt="">
                    <div class="cart__product__item__title">
                      <h6>${wishList.mark_idx}, <a href="http://localhost:8080/product/product-detail?product_idx=TH2DAQJA">${wishList.product_name}</a>, ${wishList.brand_name}</h6>
                    </div>
                  </td>
                  <td class="cart__price">${wishList.product_price}</td>
                  <td class="cart__quantity">
                    ${wishList.product_count}
                  </td>
                  
                  <td class="cart__total">   <button type="button" id='orderConfirm'
                                    class="btn btn-primary" data-toggle="modal"
                                    data-target="#myModal1" data-idx="${wishProductList.product_idx} ">[add]</button></td>
                           
                           <div class="modal" id="myModal1">
                            
                                 <div class="modal-dialog">
                                    <div class="modal-content">
                                       <!-- 모달 내용 -->
                                       <div class="modal-header">
                                          <h4 class="modal-title">Add to cart</h4>
                                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                                       </div>
                                       <div class="modal-body">
                                          <h5>장바구니에 추가되었습니다.</h5>
                                          <br>
                                          <p>
                                             상품명 <span style="color: blue; margin: 135px;"
                                                id="purchase_price" name="product_name"> ${wishList.product_name }</span>
                                          </p>
                                          <!-- 값받기 -->
                                          
                                          <p>
                                             상품가격 <span style="color: blue; margin: 126px;"
                                                id="purchase_price" name="product_price">${wishList.product_price } </span>
                                          </p>
                                          <!-- 값받기 -->
                                          <p>
                                             브랜드 <span style="color: blue; margin: 140px;"
                                                id="purchase_price" name="product_price">${wishList.brand_name } </span>
                                          </p>
                                          <p>
                                             수량 <span style="color: blue; margin: 155px;" >${wishList.product_count} </span>
                                          </p>                                          


                                       </div>
                                       <button type="button" class="btn btn-primary"
                                          data-dismiss="modal">닫기</button>
                                    </div>

                                 </div>
                              </div>
                </tr>
             

              
</c:forEach>

              </tbody>
    
            </table>
              
          </div>
        </div>
      </div>

    </div>
       <%-- <div class='container' style="display:flex; justify-content:center; align-items:center; font-size: 20px";>
         <c:choose>

            <c:when test="${paging.page<=1 }">
               <span>&lt;</span>
            </c:when>

            <c:otherwise>
               <a href="wishList.do?page=${paging.page-1 }">&lt;</a>
            </c:otherwise>
         </c:choose>


         <c:forEach begin="${paging.startPage }" end="${paging.endPage }"
            var="i" step="1">
            <c:choose>

               <c:when test="${ i eq paging.page }">
                  <a>${i }</a>
               </c:when>
               <c:otherwise>
                  <a href="wishList.do?page=${i }">${i }</a>
               </c:otherwise>
            </c:choose>
         </c:forEach>

         <c:choose>
            <c:when test="${paging.page >= paging.maxPage }">
               <a>&gt;</a>
            </c:when>
            <c:otherwise>
               <a href="wishList.do?page=${paging.page+1 }">&gt;</a>
            </c:otherwise>
         </c:choose>
      </div> --%>
      
      <table style="display:flex; justify-content:center; align-items:center; font-size: 20px;" class="container">
            <tr>
               <td><a href="wishlist?page=1">&lt;&lt;</a></td>
               <td><a href="wishlist?page=${prevMax}">&lt;</a></td>
               <c:forEach items="${numList}" var="num">
                  <td><a href="wishlist?page=${num}">${num}</a></td>
               </c:forEach>
               <td><a href="wishlist?page=${nextMin}">&gt;</a></td>
               <td><a href="wishlist?page=${lastPage}">&gt;&gt;</a></td>
            </tr>
         </table>
  </section>

  <!-- Js Plugins -->
  <script src="../resources/js/J/main.js"></script>
  <%@ include file="../fix/footer.jsp"%>	
</body>

</html>