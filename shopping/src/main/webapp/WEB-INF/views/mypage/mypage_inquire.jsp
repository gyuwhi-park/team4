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
  <link rel="stylesheet" href="../resources/css/J/style.css" type="text/css">
  <link rel="stylesheet" href="../resources/css/J/inquire.css" type="text/css">

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

  <style>
  	body {
		overflow: auto; /* 또는 scroll; */
	}

	@media screen and (max-width: 768px) {
		body {
			overflow: auto;
		}
	}
	
	.header {
		position: sticky;
		top: 0px;
		 /* 도달했을때 고정시킬 위치 */
		padding: 5px;
		z-index: 10;
    }
    
	.subBtn {
    	color : white;
    }
    
	.inquireContent {
    	margin-top: 5px;
    } 
    
	.inquire_container {
	  margin-top: -350px;

    }
  </style>

</head>

<script>
$(function() {
	
	$('#insertQa').click(function(){
		if($('#inquireTitle').val() === ''){
		alert('제목을 입력해주세요.');
	}else if($('#inquireEmail').val() === ''){
		alert('답장 받을 메일주소를 입력해 주세요.');
	}else if($('#inquireContent').val() === ''){
		alert('내용을 입력해주세요.');
	}else {
		alert('1:1문의가 등록되었습니다.');
	}
});
	
})
</script>

<body>

<%@ include file="../fix/header.jsp"%>
  <header>
    <h1>1:1 문의</h1>
  </header>
<%@ include file="sidebar.jsp"%>
  <div class="inquire_container">
    <form id="contactForm">
    	<div>
      <label for="inquireType">문의유형</label>
      <select id="inquireType" name="inquireType">
        <option value="일반 문의">일반 문의</option>
        <option value="결제 문의">결제 문의</option>
        <option value="기타">기타</option>
      </select>
      </div>
		<div>
      <label for="inquireContent" class="inquireContent">문의내용</label>
      <input type="text" id="inquireTitle" name="inquireTitle" placeholder="제목을 입력해주세요.">
       <input type="text" id="inquireEmail" name="inquireEmail" placeholder="답장 받을 메일주소를 입력해 주세요">
      <textarea id="inquireContent" name="inquireContent" rows="4" required></textarea>
		</div>
		<br/>
      <button type="submit" class="subBtn">등록</button>
    </form>
  </div>

  <!-- Js Plugins -->
  <%@ include file="../fix/footer.jsp"%>	
</body>

</html>