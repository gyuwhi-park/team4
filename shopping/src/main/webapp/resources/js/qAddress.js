jQuery(($) => {
    $('#submit').click(function (){
        let state = true;
/*        $('#addr_post').keyup(function (){
            if($('#addr_post').val().length !== 5){
                $('#addr_post').css({
                    color : 'red'
                })
            } else {
                $('#addr_post').css({
                    color : 'green'
                })
            }
        })*/

        if($('#addr_post').val().length !== 5){
            alert("우편번호 5자리를 입력해 주세요");
            state = false;
        }

        if ($('#addr_addr').val() == null){
            alert('주소를 확인해 주세요');
            state = false;
        }

        if(state){
            $('#form').submit();
        }
    })
})