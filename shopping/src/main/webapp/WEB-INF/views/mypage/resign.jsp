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
  <title>Ashion | Template</title>

  <!-- Css Styles -->
  <link rel="stylesheet" href="../resources/css/J/style.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/resign.css" type="text/css">
  <style>
    .header {
      position: sticky;
      top: 0px;
      /* 도달했을때 고정시킬 위치 */
      padding: 5px;


      z-index: 10;
    }
    
    .resign_container {
    	top: -350px;
    }
  </style>
</head>

<body>
<%@ include file="../fix/header.jsp"%>
  <header>
    <h1>회원탈퇴</h1>
  </header>
  <%@ include file="sidebar.jsp"%>
  <div class="resign_container">

    <h5>탈퇴 사유를 선택해주세요</h5><br />
    <h6>개인정보 관련</h6>
    <form action="탈퇴처리파일.php" method="post">
      <input type="checkbox" name="reason[]" value="아이디 변경을 위해 탈퇴 후 재가입"> 아이디 변경을 위해 탈퇴 후 재가입<br>
      <input type="checkbox" name="reason[]" value="장기간 부재(군입대,유학 등)"> 장기간 부재(군입대,유학 등)<br>
      <input type="checkbox" name="reason[]" value="개인정보 유출우려"> 개인정보 유출우려<br />
    </form><br />
    <h6>사이트 이용 관련</h6><br />
    <input type="checkbox" name="reason[]" value="컨텐츠 등 이용할 만한 서비스 부족"> 컨텐츠 등 이용할 만한 서비스 부족<br>
    <input type="checkbox" name="reason[]" value="사이트 이용불편"> 사이트 이용불편<br>
    <input type="checkbox" name="reason[]" value="이용빈도 낮음"> 이용빈도 낮음<br />
    <input type="checkbox" name="reason[]" value="실질적인 혜택 부족"> 실질적인 혜택 부족<br /><br />
    <h6>서비스 이용관련</h6><br />
    <input type="checkbox" name="reason[]" value="상품의 다양성/품질불만"> 상품의 다양성/품질불만<br>
    <input type="checkbox" name="reason[]" value="상품 가격불만"> 상품 가격불만<br>
    <input type="checkbox" name="reason[]" value="배송불만"> 배송불만 <br />
    <input type="checkbox" name="reason[]" value="교환/환불/반품불만"> 교환/환불/반품불만<br />
    <input type="checkbox" name="reason[]" value="사후조치 불만"> 사후조치 불만<br /><br />
    <a href="resigncheck.html"><input type="submit" value="회원탈퇴"></a>
  </div>

  <!-- Js Plugins -->
  <script src="../resources/js/J/main.js"></script>
   <%@ include file="../fix/footer.jsp"%>
</body>

</html>