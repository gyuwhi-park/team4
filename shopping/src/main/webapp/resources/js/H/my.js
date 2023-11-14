// datePicker 
$(function () {
  $('#fromDate').datepicker({
    minDate: 0,
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

  buttons.forEach(function (button) {
    button.addEventListener("click", function () {
      // 클릭한 버튼의 텍스트를 가져와서 표시
      selectedPeriodText.textContent = button.textContent;
    });
  });

})






