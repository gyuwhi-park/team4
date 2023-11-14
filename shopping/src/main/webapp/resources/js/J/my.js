// datePicker 
$(function () {
	let today = new Date().toISOString().substring(0,10);
	
	 $('#searchDateOrder').css({
	        cursor : "pointer"
	    })
  $('#fromDate').datepicker({
    maxDate: 0,
    dateFormat: 'yy-mm-dd',
    onClose: function (selectedDate) {
      // alert(selectedDate);
      $('#toDate').datepicker("option",
        "minDate", selectedDate);
    },
    showOn: 'button',
    buttonImage: '../../../resources/images/icon/calendar.gif',
    showButtonPanel: true,
    showAnim: 'slideDown'
  });

  $('#toDate').datepicker({
	maxDate : 0,
    dateFormat: 'yy-mm-dd',
    onClose: function (selectedDate) {
      $('#fromDate').datepicker("option",
        "maxDate", selectedDate);
    },
    showOn: 'button',
    buttonImage: '../../../resources/images/icon/calendar.gif',
    showButtonPanel: true,
    showAnim: 'slideDown'
  });

  // 기간별 버튼박스
  const buttons = document.querySelectorAll(".period-button");
  const selectedPeriodText = document.getElementById("selected-period-text");

 $("#searchDateOrder td").click(function (){
	  $('input#toDate').val(today);
        let now = new Date();
        switch ($(this).text()){
            case "오늘" :
                var newDay = new Date();
                break;   
            case "1주" :
                var newDay = new Date(now.setDate(now.getDay()-6))
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
        $('input#fromDate').val(newDay.toISOString().substring(0,10));
    })
})






