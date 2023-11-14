$(document).ready(function() {
	
	// 작은 이미지를 클릭했을 때 블러처리
	$(".pt").on("click", function(){
		$(".pt").removeClass("pt_mouseover");
		$(this).addClass("pt_mouseover");
	});
	

	// 하트 아이콘 클릭 시
	$(".bi").on("click",function(){
		var i = 0;
		var product_idx = $(this).data('idx'); // idx 속성의 값 가져오기
		console.log(product_idx);
		console.log(user_idx);
		
		//$(this).toggleClass("bi-heart bi-heart-fill");
	
		if(user_idx != "null"){
			if($(this).hasClass("bi-heart")){
				$(".heart11").addClass("bi-heart-fill").removeClass("bi-heart");
				$.ajax({
					url : "../product/insertMark",
					type : "get",
					data : { 
						product_idx : product_idx,
						user_idx : user_idx
					},
					success : function(data){
						console.log(data);
					},
					error : function(){
						console.log("error");
					}
				});
				
			} else if($(this).hasClass("bi-heart-fill")) {
				$(".heart11").addClass("bi-heart").removeClass("bi-heart-fill");
				$.ajax({
					url : "../product/deleteMark",
					type : "get",
					data : { 
						product_idx : product_idx,
						user_idx : user_idx
					},
					success : function(data){
						console.log(data);
					},
					error : function(){
						console.log("error");
					}
				});
			}
		} else {
			alert("로그인이 필요합니다");
		}

	});
	
	// 장바구니 클릭 시
	$(".cart-btn").on("click",function(){
		alert("장바구니에 담겼습니다.");
		var i = 0;
		var product_idx = $(this).data('idx'); // idx 속성의 값 가져오기
		var cart_count = $("#input-qty").val();
		
		// 선택된 컬러 가져오기
		var color_idx;
		var radioButtons = $('input[type="radio"][name="color__radio"]');
		radioButtons.each(function(){
			if($(this).is(":checked")){
				color_name = $(this).attr("id");
			}
		});
		
		// 선택된 사이즈 가져오기
		var size_val = $(".selectBox2 .label").text();
		
		console.log(product_idx);
		console.log(user_idx);
		console.log(cart_count);
		console.log(color_name);
		console.log(size_val);

		if(user_idx == "null"){
			alert("로그인이 필요합니다.");
		} else {
			$.ajax({
				url : "../product/insertCart",
				type : "get",
				data : { 
				product_idx : product_idx,
				user_idx : user_idx,
				cart_count : cart_count,
				color_name : color_name,
				size_val : size_val
			},
			success : function(data){
				
				console.log(data);
			},
			error : function(){
				console.log("error");
			}
			});			
		}
    
   });


	// 바로구매 클릭 시
	$(".purchase-btn").on("click",function(){
		alert("현재 사용할 수 없는 기능입니다. 장바구니를 이용해 주세요.");
/*		if(user_idx == "null"){
			alert("로그인을 해주세요");
		} else {
		
			var modal = $("#imageModal");
			modal.css("display", "block");
		
			var modalImg = $("#modalImage");
			modalImg.attr("src", "../resources/images/testimg.PNG"); // 띄울 이미지의 URL을 설정
			
			// 모달 닫기 버튼 클릭 시 이벤트 처리
			$("#closeModalButton").click(function() {
				var modal = $("#imageModal");
				modal.css("display", "none");
			});
			
			// 모달 영역 외 클릭 시 모달 닫기
			$(window).click(function(event) {
				var modal = $("#imageModal");
				if (event.target == modal[0]) {
					modal.css("display", "none");
				}
			});
		
			$(modalImg).on("click", function(){
				var i = 0;
				// product_idx 가져오기
				var product_idx = $(this).data('idx');
				
				// 구매 수량 가져오기
				var purchase_count = $("#input-qty").val();
				
				// 구매 금액 가져오기
				var purchase_price = $(".total_price").text();
				
				// 선택된 컬러 가져오기
				var color_idx;
				var radioButtons = $('input[type="radio"][name="color__radio"]');
				radioButtons.each(function(){
					if($(this).is(":checked")){
						color_idx = $(this).attr("id");
					}
				});
				
				// 선택된 사이즈 가져오기
				var size_idx = $(".selectBox2 .label").text();
				
				console.log(product_idx);
				console.log(user_idx);
				console.log(purchase_count);
				console.log(purchase_price);
				console.log(color_idx);
				console.log(size_idx);
		
				if(user_idx != "null"){  
					$.ajax({
						url : "../product/insertPurchase",
						type : "get",
						data : { 
						product_idx : product_idx,
						user_idx : user_idx,
						purchase_count : purchase_count,
						purchase_price : purchase_price,
					},
					success : function(data){
						console.log(data);
					},
					error : function(){
						console.log("error");
					}
					});
				} else {
					alert("로그인이 필요합니다");
				}
		
		   });
			}
*/
		});
		

	// 클릭한 옵션의 텍스트를 라벨 안에 넣음
	const label = $('.label');
	const options = $('.optionItem');

	function handleSelect() {
		label.text($(this).text());
		label.parent().removeClass('active');
	}

	// 옵션 클릭시 클릭한 옵션을 넘김
	options.on('click', handleSelect);

	// 라벨을 클릭시 옵션 목록이 열림/닫힘
	label.click(function() {
		const parent = label.parent();
		if (parent.hasClass('active')) {
			parent.removeClass('active');
		} else {
			parent.addClass('active');
		}
	});
  

	//스크롤했을 때 tab고정
	$(window).scroll(function () {
		const navElement = $(".product__details__tab");
		const contentElement = $(".product__details__content");
		const tabHeight = navElement.height();
		const scrollPosition = $(this).scrollTop();

		if (scrollPosition > 500) { // 원하는 위치 (예: 100px)로 스크롤되면
			navElement.addClass("fixed");
			contentElement.css("margin-top", tabHeight);
		} else {
			navElement.removeClass("fixed");
			contentElement.css("margin-top", 0);
		}
	});
 
	// 해당 요소로 부드럽게 이동
	$(".nav-link").click(function(){
		var target = $($(this).attr("href"));
		if(target.length){
			$("html, body").animate({
				scrollTop: target.offset().top
			},400);
			return false;
			}
	});
	
	
	
	//리뷰	
	// 초기 값 설정
	var rating = 0;
	var comment = "";

	// 별 클릭시 활성화
	$('.star').on('click', function() {
		rating = $(this).data('rating');
		$('.star').removeClass('active');
		
		$('.star').each(function() {
			if ($(this).data('rating') <= rating) {
			$(this).addClass('active');
			}
		});
	});
  
 	 
	// textarea 내용 변경 이벤트
	$(".commentArea").on("input", function() {
		comment = $(this).val();
	});

	// 작성 버튼 클릭 이벤트
	$("#submitButton").on("click",function() {
		
		var product_idx = $(this).data('idx');
		var review_score = rating;
		var review_content = $(".commentArea").val();
		console.log("product_idx : "+product_idx);
		console.log("review_score : "+review_score);
		console.log("review_content : "+review_content);
		console.log("user_idx : "+user_idx);
		
		if (review_score === 0 || review_content === "") {
			alert("평점과 상품평을 모두 입력하세요.");
		} else {
			$('.star').removeClass('active');
			$(".commentArea").val("");
			
			// 값 저장하기
			$.ajax({
				url : "../product/insertReview",
				type : "get",
				data : {
				review_score : review_score,
				review_content : review_content,
				product_idx : product_idx,
				user_idx : user_idx,
			},
			success : function(data){
				console.log(data);
				alert("상품평이 등록되었습니다.");

			},
			error : function(){
				console.log("error");
			}
			});
		}
	});
	
	
  
	//displayRating 함수
	function displayRating(elementId, rating){
		var ratingText = "";
		
		for (var i = 1; i <= 5; i++) {
			if (i <= rating) {
				ratingText += "★";
			} else {
				ratingText += "☆";
			}
		}
		$(".displayRating").text(ratingText);
	}
	
	// displayRating 함수 호출
	$(".displayRating").each(function() {
		var rating = $(this).data('rating');
		console.log(rating);
		$(this).text(rating);
		displayRating($(this), rating);
	});
	


	// 삭제 버튼 클릭 이벤트(연속으로 기능하지 않음)
	$("#deleteButton").on("click",function() {
		var reviewList = $(this).closest('.reviews_list').remove();
		var review_idx = reviewList.find("#review_idx").val();
		var product_idx = $(this).data('idx');
		console.log("review_idx : "+review_idx);
		console.log("product_idx : "+product_idx);
		console.log("user_idx : "+user_idx);
		
		// 값 저장하기
		$.ajax({
			url : "../product/deleteReview",
			type : "get",
			data : {
			review_idx : review_idx,
			product_idx : product_idx,
			user_idx : user_idx,
		},
		success : function(data){
			console.log(data);
			alert("삭제되었습니다");
		},
		error : function(){
			console.log("error");
		}
		});
		
	});


	// 로그인 확인 모달 열기
	$("#showLoginConfirmationModal").click(function() {
		$("#loginConfirmationModal").css("display", "block");
	});

  	// 로그인 확인 모달 닫기
	$("#closeLoginConfirmationModal").click(function() {
		$("#loginConfirmationModal").css("display", "none");
	});

	// 모달 외부 클릭으로 닫기
	$("#loginConfirmationModal").click(function(event) {
		if (event.target === this) {
			$(this).css("display", "none");
		}
	});
  
	// 확인 버튼 클릭 시 로그인 페이지로 이동
	$("#loginConfirmationButton").click(function() {
		// 로그인 페이지로 이동할 URL을 여기에 지정
		window.location.href = "login.html";
	});
  
	// Escape 키로 모달 닫기
	$(document).keydown(function(e) {
		if (e.key === "Escape" && $("#loginConfirmationButton").is(":visible")) {
			$("#loginConfirmationButton").css("display", "none");
		}
	});
});