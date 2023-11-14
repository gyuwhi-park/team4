<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
  <meta charset="UTF-8">
  <meta name="description" content="Ashion Template">
  <meta name="keywords" content="Ashion, unica, creative, html">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>BRAND:ME | MyPage</title>

 <style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

  <!-- Css Styles -->
  <link rel="stylesheet" href="../resources/css/J/my.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/orderlist.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/resign.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/slicknav.min.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/style.css" type="text/css">

<style type="text/css">
.container {
	width: 930px;
}
</style>
</head>

<body>
<%@ include file="../fix/header.jsp"%>
  <header>
    <h1>My Page</h1>
  </header>

<%@ include file="sidebar.jsp"%>
  <div class="myForm" method="post">
    <div class="container2">
       <img src="../../../resources/images/icon/membership.jpg">
    </div>
  <div class="myForm" method="post">
    
    <div class="container2">

      <div class="order-history">
        <h4>주문 현황 / 활동현황</h4>

        <table >
        
          <tr>
            <th>주문2</th>
          </tr>
          <tr>
            <td>${purchaseCount.purchase_idx} <!-- 들어올 주문수 입력 !--></td>
          </tr>
          
        </table>

        <table class="table">
          <tr>
            <th>상품평</th>
          </tr>
          <tr>
            <td>${reviewCount.review_idx}<!-- 들어올 상품평수 입력 !--></td>
          </tr>
        </table>       
      </div>

    </div>

    <div class="container2">

      <div class="order-history">
        <h4>상품 Q&A</h4>
        <table class="container">
          <tr>
            <th>제목 </th>
            <th>등록일</th>
          </tr>
           <c:forEach items="${boardList}" var="boardList">
          <tr>
         
            <td> ${boardList.board_title} <!-- 작성한 Q&A 제목 입력 !--></td>
            <td> ${boardList.board_date}  <!-- 작성한 Q&A 등록일 입력 !--> </td>
           
          </tr>
           </c:forEach>
           
        </table>
      <table style="display:flex; justify-content:center; align-items:center; font-size: 18px; border: none;" class="container">
            <tr >
               <td style="border: none;"><a href="mypage?page=1">&lt;&lt;</a></td>
               <td style="border: none;"><a href="mypage?page=${prevMax}">&lt;</a></td>
               <c:forEach items="${numList}" var="num">
                  <td style="border: none;"><a href="mypage?page=${num}">${num}</a></td>
               </c:forEach>
               <td style="border: none;"><a href="mypage?page=${nextMin}">&gt;</a></td>
               <td style="border: none;"><a href="mypage?page=${lastPage}">&gt;&gt;</a></td>
            </tr>
         </table>
      </div>

    </div>

  </div>

  <!-- Js Plugins -->
  <script src="../resources/js/J/main.js"></script>
  <script src="../resources/js/J/mixitup.min.js"></script>
  <script src="../resources/js/J/my.js"></script>

<%@ include file="../fix/footer.jsp"%>
</body>

</html>