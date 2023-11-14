
function login() {
	alert("로그인 버튼 테스트");
}

function authGuestRole() {
	alert("주문/배송조회 버튼 테스트");
}


  
  $(function(){
  	$('#tab2').hide();
  	$('#Login').click(function(){
  		$('#tab1').show();
  		$('#tab2').hide();
  		
  		$('#nonLogin').click(function(){
  		$('#tab2').show();
  		$('#tab1').hide();
  	
  		})
  	})
  });
  

 

  
