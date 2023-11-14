$(document).ready(function(){
	
	// 위시리스트 
	$('#orderConfirm').click(function(){
		var product_idx = $(this).data('idx');
		console.log("product_idx : " + product_idx);
		
		$.ajax({
				url : "insertMyCart",
				type : "get",
				data : { 
				product_idx : 1,
				user_idx : 1,
				cart_count : 1
			},
			success : function(data){
				alert("상품이 장바구니에 추가되었습니다.");
				console.log(data);
			},
			error : function(){
				alert("fail");
				console.log("error");
			}
			
		 });
	});
})