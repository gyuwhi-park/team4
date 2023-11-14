<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/css/J/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="../../../resources/css/J/jquery-ui.min.css" type="text/css">
  <link rel="stylesheet" href="../../../resources/css/H/style.css" type="text/css">



<style type="text/css">
button.increase {
   color: #ffffff;
   background: #000000;
   padding: 3px 8px;
   border-radius: 3px;
}

button.decrease {
   color: #ffffff;
   background: #000000;
   padding: 3px 10px;
   border-radius: 3px;
}

input.price {
   padding: 2px 10px;
   border-radius: 3px;
   border: 1px solid #b1b1b1;
}

input.cart_count {
   padding: 2px 10px;
   border-radius: 3px;
   border: 1px solid #b1b1b1;
}

input.itemCheck {
   
}

td { 
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
  text-align: center;
  padding-bottom: 5px;
}

#th {
  padding: 8px;
  text-align: center;
  border-top: 2px solid #ccc;
  border-bottom: 2px solid #c6c6c6;
  color: #000;
}

.tableBox {
     border-collapse: collapse;
     width: 1200px;
     margin: 1rem auto;
    background-color: white;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 16px;
   padding-top: 30px;
    display: flex;
   justify-content: center;
  flex-direction: column;
  align-items: center;
}

.totalBox {
   border-collapse: collapse;
     width: 1200px;
     margin: 1rem auto;
    background-color: white;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 16px;
   padding-top: 30px;
    display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

.totalBtn {
   border-collapse: collapse;
     width: 1200px;
     margin: 1rem auto;
    background-color: white;
    font-family: 'Noto Sans KR', sans-serif;
    font-size: 16px;
   padding-top: 30px;
    display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}

button#delete {
   color: #ffffff;
   background: #000000;
   padding: 3px 10px;
   border-radius: 3px;
}

button#purchaseButton {
   color: #ffffff;
   background: #000000;
   padding: 3px 10px;
   border-radius: 3px;
}

</style>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
   integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
   crossorigin="anonymous"></script>
<script src="../../../resources/js/J/bootstrap.min.js"></script>
<script type="text/javascript" src="../../../resources/js/qcart.js"></script>

<!-- font-awesome -->
<script src="https://kit.fontawesome.com/c983244183.js" crossorigin="anonymous"></script>
</head>

<body>
<%@ include file="../fix/header.jsp"%>
<div class="tableBox">
   <table border="1">
      <thead>
         <tr>
            <th id="th">체크박스</th>
            <th id="th">제품명</th>
            <th id="th">제품번호</th>
            <th id="th">색상 정보</th>
            <th id="th">크기 정보</th>
            <th id="th">가격</th>
            <th id="th">수량</th>
            <th id="th">총 금액</th>
         </tr>
      </thead>
      <tbody>
         <c:forEach items="${cartList}" var="cart">
            <tr>
               <td><input class="itemCheck" type="checkbox" checked="checked">
                  <input type="hidden" class="cart_idx" value="${cart.cart_idx}"/>
               </td>
               <td>${cart.product_name}</td>
               <td>${cart.product_idx}</td>
               <td class="color">${cart.color_name}</td>
               <td class="size">${cart.size_val}</td>
               <td>
                  <input class="price" type="text" value="${cart.product_price}">
               </td>
               <td class="count">
                  <button class="increase">+</button>
                  <input class="cart_count" type="text" value="${cart.cart_count}">
                  <button class="decrease">-</button>
               </td>
               <td class="getprice"></td>
            </tr>
         </c:forEach>
      </tbody>
   </table>
</div>
   <br>
   <hr>
   <br>
<div class="totalBox">
   <p>
      총 수량 : <input id="totalcount" disabled="disabled" value="0" /> 개
   </p>
   <p>
      총 금액 : <input id="totalprice" disabled="disabled" value="0" /> 원
   </p>
</div>
<div class="totalBtn">   
   <!-- <button id="purchase">구매</button> -->
   <button type="button" id='orderConfirm' class="btn btn-primary"
      data-toggle="modal" data-target="#myModal1">구매</button>
   <button id="delete">선택 항목 제거</button>
   <div class="modal" id="myModal1">
      <div class="modal-dialog">
         <div class="modal-content">
            <!-- 모달 내용 -->
            <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">
               총 수량 : <span id="totalcountSpan">0</span>
               총 금액 : <span id="totalpriceSpan">0</span>
            </div>
            <button type="button" id="purchase" class="btn btn-primary" data-dismiss="modal">결제하기</button>
            <button type="button" class="btn btn-primary" data-dismiss="modal">취소</button>
         </div>
      </div>
   </div>
</div>
    <%@ include file="../fix/footer.jsp"%>
</body>
</html>