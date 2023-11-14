// AJAX

/*
	$.ajax({
		type: 'get',
		data: {   }, // 보내는 값
		dataType: 'json',
		url: 'product.jsp',
		success: result => {
			console.log(result);
			if(result === "Available") {
				$().text("연결 성공")
			} else {
				$().text("실패")
			}
		} 
		
	});
*/


$.ajax({
		url: 'product.jsp',
	//	type : 'get',
		success: function (data) {
				let result = "<table border='1'>";
				$.each(data, function(){
				 		result += "<tr>";
						result += "<td>" + this.product_idx + "</td>";
						result += "<td>" + this.product_name + "</td>";
						result += "<td>" + this.brand_idx + "</td>";
						result += "<td>" + this.div3_idx + "</td>";
						result += "<td>" + this.color_idx + "</td>";
						result += "</tr>";
				}); 
				result += "</table>";
				$('div').html(result);
		},
		error: function (xhr) {
				alert("상태 : " + xhr.status);
		},
// 	complete: function(){},
		dataType: 'json'
});
	
	
	
/*
	$.ajax({
    type : 'get',
    data : {userId : $('#userId').val()}, // 보내는 값
    //dataType : 'json',              // 받는 값
    url : "userTest",
    success : result => {
        console.log(result);
        if(result === "Available"){
            $('span#idCheckResult').text("사용 가능한 아이디 입니다.")
            $('span#idCheckResult').css({
                color : "green"
            })
        } else {
            $('span#idCheckResult').text("이미 사용 중인 아이디 입니다.")
            $('span#idCheckResult').css({
                color : "red"
            })
        }
    }
})

*/