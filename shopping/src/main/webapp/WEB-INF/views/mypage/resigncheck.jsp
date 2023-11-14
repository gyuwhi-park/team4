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
    <link rel="stylesheet" href="../../../resources/css/J/resign.css" type="text/css">
    <link rel="stylesheet" href="../../../resources/css/J/my.css" type="text/css">
    
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
<%@ include file="../fix/header.jsp"%>
  <head>
    <title>회원 탈퇴</title>
  
  </head>

  <body>
  
    <header class="">
      <h1>회원탈퇴</h1>
    </header>
     <%@ include file="sidebar.jsp"%>
    <div class="container2">
      <p>회원 탈퇴를 위한 비밀번호를 입력해주세요</p>
      <form action="탈퇴처리파일.php" method="post">
        <input type="password" name="password" placeholder="비밀번호 입력" required>
        <textarea name="reason" placeholder="탈퇴 이유" required></textarea>
        <input type="submit" value="탈퇴하기">
      </form>
    </div>
   
<%@ include file="../fix/footer.jsp"%>

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
  </body>

</html>