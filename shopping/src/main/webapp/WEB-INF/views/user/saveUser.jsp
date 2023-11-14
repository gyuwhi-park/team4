<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
<link href="saveUser.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
crossorigin="anonymous"></script>
</head>
<body>
	

	<form action="register" method="post" class="userForm">
		<div class="divOne">
		<h3>정보입력</h3>
		<hr/>
		<h4>회원 상세 정보 입력</h4>
	

		<input name="user_name" id="user_name" placeholder="이름 입력"/><br/>
		<hr/>
		
		<input name="user_phone" id="user_phone" placeholder="연락처 입력" /><br/>
		<hr/>
		
		<input name="user_birth" id="user_birth" placeholder="생일" /><br/>
		<hr/>
		
		<input name="user_id" id="user_id" placeholder="아이디 입력"><br/>
		
			
			<input type="button" class="idCHeck" value="중복 확인">
			<span name="idCheckResult" id="idCheckResult" style="width:150px;color:red"></span>
	
		
		<input name="user_pass" id="user_pass" placeholder="비밀번호" /><br/>
			<td class="normalbold tb_ttl">
				<div align="center">비밀번호 확인</div>
			</td>
			<td width="160">
				<input type="password" name="user_pass2" id="user_pass2">
			</td>
		<hr/>
		
		<input name="user_mail" id="user_mail" placeholder="이메일" /><br/>
		<hr/>
		
		<input type="submit" class="sucessBtn" name="sucessBtn" id="sucessBtn" value="회원 가입">
		<a href="../index.jsp"><input type="button" class="nonBtn" name="nonBtn" id="nonBtn" value="취소"></a>
		</div>
	</form>

	<!-- divOne end -->
	
<style>


body {
  background-image:#34495e;
}

.userForm {
  position:absolute;
  width:400px;
  height:400px;
  padding: 30px, 20px;
  background-color:#FFFFFF;
  text-align:center;
  top:40%;
  left:50%;
  transform: translate(-50%,-50%);
  border-radius: 15px;
}

.userForm h3 {
  text-align: center;
  margin: 30px;
}

.divOne {
  border-bottom: 2px solid #adadad;
  margin: 30px;
  padding: 10px 10px;
}


#user_id {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

#user_pass {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

#user_name {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

#user_mail {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

#user_birth {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

#user_phone {
  width: 100%;
  border:none;
  outline:none;
  color: #636e72;
  font-size:16px;
  height:25px;
  background: none;
}

.sucessBtn {
  position:relative;
  left:40%;
  transform: translateX(-50%);
  margin-bottom: 40px;
  width:80%;
  height:40px;
  background: linear-gradient(125deg,#81ecec,#6c5ce7,#81ecec);
  background-position: left;
  background-size: 200%;
  color:white;
  font-weight: bold;
  border:none;
  cursor:pointer;
  transition: 0.4s;
  display:inline;
}

.sucessBtn:hover {
  background-position: right;
}

.nonBtn {
  position:relative;
  left:40%;
  transform: translateX(-50%);
  margin-bottom: 40px;
  width:80%;
  height:40px;
  background: linear-gradient(125deg,#81ecec,#6c5ce7,#81ecec);
  background-position: left;
  background-size: 200%;
  color:white;
  font-weight: bold;
  border:none;
  cursor:pointer;
  transition: 0.4s;
  display:inline;
}

.nonBtn:hover {
  background-position: right;
}

</style>
	
	<!-- css -->
	
<script>
$(($) => {
    var checkID = false;
    var passCheck = false;

    $('.idCheck').click(function (){
        // alert('test')
        $.ajax({
            type : 'post',
            data : {user_id : $('#user_id').val()}, // 보내는 값
            dataType : 'json',              // 받는 값
            url : 'saveUser/checkID',
            success : result => {
                console.log(result);
                if(result === "Available"){
                    $('#idCheckResult').text("사용 가능한 아이디 입니다.")
                    $('#idCheckResult').css({
                        color : "green"
                    })
                    checkID = true;
                } else {
                    $('#idCheckResult').text("이미 사용 중인 아이디 입니다.")
                    $('#idCheckResult').css({
                        color : "red"
                    })
                    checkID = false;
                }
            }
        })
    })

    $('#user_pass2').keyup(function (){
        if($('#user_pass2').val() === $('#user_pass2').val()){
            $('#user_pass2').css({
                backgroundColor : 'green'
            })
            passCheck = true;
        } else {
            $('#user_pass2').css({
                backgroundColor : 'red'
            })
            passCheck = false;
        }
    })
    
    $('#sucessBtn').click(function (){
        if(checkID == false){
            alert("ID 중복 여부를 확인해주세요");
        }
        if(passCheck == false){
            alert("비밀번호를 확인해 주세요");
        }
        if(checkID == true & passCheck == true){
            $('#userinput').submit();
        }
    })
});
</script>
	
	
</body>
</html>