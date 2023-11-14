jQuery(($) => {
    let today = new Date().toISOString().substring(0,10);

    $('#searchFixedValue').css({
        cursor : "pointer"
    })

    $('span#today').text(today);

    $("#fromdate").datepicker({
        maxDate: 0,
        dateFormat : "yy-mm-dd", //연-월-일 형식으로 출력
        onClose : function(selectedDate) {
            $("#todate").datepicker("option", "minDate", selectedDate);
        }//todate의 mindate의 값을 사용자가 지정한 값으로 설정 -> 선택된 날보다 이전 날짜 선택 불가
    });

    $("#todate").datepicker(
        {
            maxDate : 0,
            dateFormat : "yy-mm-dd",
            onClose : function(selectedDate) {
                $("#fromdate").datepicker("option", "maxDate", selectedDate);
            }//fromdate의 maxdate의 값을 사용자가 지정한 값으로 설정 -> 선택된 날보다 이후 날짜 선택 불가
        });

    $("#searchFixedValue td").click(function (){
        $('input#todate').val(today);
        let now = new Date();
        switch ($(this).text()){
            case "오늘" :
                var newDay = new Date();
                break;
            case "3일" :
                var newDay = new Date(now.setDate(now.getDate()-2))
                break;
            case "1주" :
                var newDay = new Date(now.setDate(now.getDate()-6))
                break;
            case "1개월" :
                var newDay = new Date(now.setMonth(now.getMonth()-1))
                break;
            case "3개월" :
                var newDay = new Date(now.setMonth(now.getMonth()-3))
                break;
            case "6개월" :
                var newDay = new Date(now.setMonth(now.getMonth()-6))
                break;
        }
        $('input#fromdate').val(newDay.toISOString().substring(0,10));
    })
})