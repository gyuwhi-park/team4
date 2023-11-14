jQuery(($) => {
    console.log(new Date().toLocaleDateString());
    $('span#today').text(new Date().toLocaleDateString());

    /*$("#fromdate").datepicker({
        minDate : 0, //오늘 날짜보다 이전 날짜 클릭안됨
        dateFormat : "yy-mm-dd", //연-월-일 형식으로 출력
        onClose : function(selectedDate) {
            //alert(selectedDate);
            $("#todate").datepicker("option", "minDate", selectedDate);
        }//todate의 mindate의 값을 사용자가 지정한 값으로 설정 -> 선택된 날보다 이전 날짜 선택 불가
    });

    $("#todate").datepicker(
        {
            dateFormat : "yy-mm-dd",
            onClose : function(selectedDate) {
                //alert(selectedDate);
                $("#fromdate").datepicker("option", "maxDate",
                    selectedDate);
            }//fromdate의 maxdate의 값을 사용자가 지정한 값으로 설정 -> 선택된 날보다 이후 날짜 선택 불가
        });*/
})