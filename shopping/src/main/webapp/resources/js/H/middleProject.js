// 모바일 로그인 페이지 이동
$(function(){
  	$('.Loginbtn').click(function(){
  		$(location).attr("href", "middleProjectLogin.html");
  		
  	})
});

// 로그인 페이지 이동
$(function(){
  	$('.MainLoginbtn').click(function(){
  		$(location).attr("href", "middleProjectLogin.html");
  		
  	})
});

// 마이페이지 이동
$(function(){
  	$('.MainMybtn').click(function(){
  		$(location).attr("href", "mypage.html");
  		
  	})
});

// 모바일 마이페이지 이동
$(function(){
  	$('.Mybtn').click(function(){
  		$(location).attr("href", "mypage.html");
  		
  	})
});


// 테스트용 페이지 이동(나중에 삭제할 부분)










// 테스트용 페이지 이동(나중에 삭제할 부분)






// 가상의 상품 데이터












/*
// 물건 수량 변경
$('.'+classes[i]+' div').each(function (){
var price = $(this).attr('price');
	var name = $(this).children('span').text();
    var id = $(this).attr('id');
    console.log(classes[i]+" : "+id);

// (1) plus button
$(this).find('.plus').click(function (){
	if ($('.order .'+id).length === 0){
		var tr = $('<tr class='+classes[i]+'/>');
        var trn = $('<tr class='+classes[i]+'N/>');
        tr.addClass(id);
        trn.addClass(id+'N');

        tr.append('<td>'+name+'</td>');
        trn.append('<td>'+name+'</td>');

        tr.append('<td>1</td>');
        trn.append('<td>1</td>');
        $('div#navigation tbody.'+classes[i]+'B').append(trn);

        tr.append('<td>'+price+'</td>');
        tr.append('<input type="submit" name="delete" id="delete" value="삭제"/>');
        $('table.order > tbody').append(tr);
			} else {
				$('tr.'+id+'N > td:nth-of-type(2)').text(parseInt($('tr.'+id+'N > td:nth-of-type(2)').text())+1);

// (2) 하단 수량, 가격
parseInt($('tr.'+id+' > td:nth-of-type(2)').text(parseInt($('tr.'+id+' > td:nth-of-type(2)').text())+parseInt(1)));
parseInt($('tr.'+id+' > td:nth-of-type(3)').text(parseInt($('tr.'+id+' > td:nth-of-type(3)').text())+parseInt(price)));
	}

// (3) plus button end

// (4) nav ++
parseInt($('#navigation input#navNum').val(parseInt($('#navigation input#navNum').val())+1));
parseInt($('#navigation input#navTotal').val(parseInt($('#navigation input#navTotal').val())+parseInt(price)));

// (5) 하단 total
$('.order #totalNum').val(parseInt($('.order #totalNum').val())+1);
$('.order #total').val(parseInt($('.order #total').val())+parseInt(price));
	})

// (6) minus button
$(this).find('.minus').click(function (){
	console.log(parseInt($('tr.'+id+' > td:nth-of-type(2)').text()));
		if (parseInt($('tr.'+id+' > td:nth-of-type(2)').text()) === 1){
			$('.order tr.'+id).remove();
                    $('tr.'+id+'N').remove();
                } else if (parseInt($('tr.'+id+' > td:nth-of-type(2)').text()) > 1){
                    $('tr.'+id+' > td:nth-of-type(2)').text(parseInt($('tr.'+id+' > td:nth-of-type(2)').text())-1);
                    $('tr.'+id+' > td:nth-of-type(3)').text(parseInt($('tr.'+id+' > td:nth-of-type(3)').text())-parseInt(price));

                    $('tr.'+id+'N > td:nth-of-type(2)').text(parseInt($('tr.'+id+'N > td:nth-of-type(2)').text())-1);
                } else {
                    return;
                }
// (7) nav --
$('#navigation input#navNum').val(parseInt($('#navigation input#navNum').val())-1);
$('#navigation input#navTotal').val(parseInt($('#navigation input#navTotal').val())-parseInt(price));
//order --
$('.order #totalNum').val(parseInt($('.order #totalNum').val())-1);
$('.order #total').val(parseInt($('.order #total').val())-parseInt(price));
            })
        })
// (8) END
*/



// 결제창 불러오기 버튼
$(document).ready(function(){
	$("#list>button:first-of-type").click(function(){
  		$("#pop").show(); $("#pop").addClass("black");	
  	});
});
	
  	
// 결제창 닫기 버튼
$(document).ready(function(){
	$("#buyClosebtn").click(function(){
  		$(this).parent().hide();
  	})
});




// 결제창 구매 확정 버튼
$(function(){
  	$('.buybtn').click(function(){
  		alert("결제하시겠습니까?");
  		
  	})
});



