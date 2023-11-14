$(document).ready(function(){

	// 장바구니 클릭시 장바구니에 담기게하기
	$(".product__hover .bi-bag-dash").click(function(){
		
		var product_idx = $(this).data('idx');
		console.log("product_idx : " + product_idx);
		//console.log(user_idx);
		//console.log(cart_count);
		
		
			$.ajax({
				url : "/main/insertMainCart",
				type : "get",
				data : { 
				product_idx : product_idx,
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

	// 하트 아이콘 클릭시 장바구니에 담기게하기
	$(".product__hover .bi-heart").click(function(){
	
		var product_idx = $(this).data('idx');
	
		$.ajax({
			url : "/main/insertMainMark",
			type : "get",
			data : {
				product_idx : product_idx,
				user_idx : user_idx
			},
			success : function(data){
				alert("상품이 위시리스트에 추가되었습니다.");
				console.log(data);
			},
			error : function(){
				alert("fail");
				console.log("error");
			}
		});
	});

})
