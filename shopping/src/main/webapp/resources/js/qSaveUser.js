jQuery(($) => {

    $('input#ch1').click(function (){
        if($('input#ch1').is(':checked')){
            $('#ch2').prop('checked', true);
            $('#ch3').prop('checked', true);
            $('#ch4').prop('checked', true);
            $('#ch5').prop('checked', true);
        } else {
            $('#ch2').prop('checked', false);
            $('#ch3').prop('checked', false);
            $('#ch4').prop('checked', false);
            $('#ch5').prop('checked', false);
        }
    })

    $('input').each(function (){
        $(this).click(function (){
            if($('#ch2').is(':checked') & $('#ch3').is(':checked') & $('#ch4').is(':checked') & $('#ch5').is(':checked')){
                $('#ch1').prop('checked', true);
            } else {
                $('#ch1').prop('checked', false);
            }
        })
    })

    $('button#agree').click(function (){
        if($('#ch2').is(':checked') & $('#ch3').is(':checked')){
            $(location).attr("href", "http://localhost:8080/user/registerForm");
        } else {
            alert("필수 약관에 동의 해주셔야 합니다.");
        }
    })
    $('#user_birth').keyup(function (){
        if($(this).val().length === 8){
            $('#phone1').focus();
        }
    })
    $('#phone1').keyup(function (){
        if($(this).val().length === 3){
            $(this).next().focus();
        }
    })
    $('#phone2').keyup(function (){
        if($(this).val().length === 4){
            $(this).next().focus();
        }
    })
    $('#phone3').keyup(function (){
        if($(this).val().length === 4){
            $('#user_id').focus();
        }
    })

    $('#idCheck').click(function (){
        $.ajax({
            type : 'get',
            data : {user_id :$(this).prev().val()},
            url : 'userIdCheck',
            success : result => {
                console.log(result);
                if(result === 'Available'){
                    $('#checkResult').text("사용 가능한 아이디입니다.")
                    $('#checkResult').css({
                        color : "green"
                    })
                } else {
                    $('#checkResult').text("중복 된 아이디입니다.")
                    $('#checkResult').css({
                        color : "red"
                    })
                }
            }, error : err => {
                alert("fail");
                console.log(err);
            }
        })
    })

    $('#user_pass_check').keyup(function (){
        if($('#user_pass').val() === $('#user_pass_check').val()){
            $('#pwCheck').text("비밀번호와 일치합니다.")
            $('#pwCheck').css({
                color : "green"
            })
        } else {
            $('#pwCheck').text("비밀번호와 일치하지 않습니다.")
            $('#pwCheck').css({
                color : "red"
            })
        }
    })
    
	$('#submitButton').click(function (){
		let phone = $('#phone').val($('#phone1').val()+$('#phone2').val()+$('#phone3').val());
		let mail = $('#mail').val($('#mailID').val()+"@"+$('#mailDomain').val()+"."+$('#mailExtension').val());
		// alert(phone.val());
		// alert(mail.val());
		$('#form').submit();
		alert("회원가입이 완료되었습니다.");
    })
})