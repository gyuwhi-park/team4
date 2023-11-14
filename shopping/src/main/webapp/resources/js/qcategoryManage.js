jQuery(($) => {
    var categoryList = ['브랜드', '대분류', '중분류', '소분류'];
    $('table#brandTable').attr("style", "display:'';");

    $('#category').val(categoryList[1]);

    $('#selectBrand').click(function (){
        let brand = $("#selectBrand option:selected");
        $('#category').val(categoryList[0]);

    })

    $('#addButton').click(function (){
        let category = $('#category').val();
        let data = {};
        let url = '';
        let idx_val = $('#idx').val();
        let text_val = $('#text').val();

        switch (category){
            //브랜드
            case categoryList[0] :
                data = {sort : 'brand', brand_idx : idx_val, brand_name : text_val};
                url = 'addBrand';
                break;

            //대분류
            case categoryList[1] :
                data = {sort : 'div1', div1_idx : idx_val, div1_name : text_val};
                url = 'addDiv1';
                break;

            //중분류
            case categoryList[2] :
                data = {sort : 'div2', div2_idx : idx_val, div2_name : text_val, div1_idx : $("#selectDiv1 option:selected").val()};
                url = 'addDiv2';
                break;

            //소분류
            case categoryList[3] :
                data = {sort : 'div3', div3_idx : idx_val, div3_name : text_val, div2_idx : $("#selectDiv2 option:selected").val()};
                url = 'addDiv3';
        }

        $.ajax({
            data : data,
            url : url,
            dataType : 'json',
            success : result => {
                alert("추가 성공")
            }, error : err => {
                alert("추가 실패");
            }
        })
    })

    $('#deleteButton').click(function (){

    })

    $('#selectDiv1').click(function (){

        let div1 = $("#selectDiv1 option:selected");
        $('#category').val(categoryList[2])
        $.ajax({
            type : 'get',
            data : {div1_idx : div1.val().substring(0,1)},
            dataType : "json",
            url : "getdiv2",
            success : result => {
                console.log(result);
                $('#selectDiv2').empty();
                $('#selectDiv3').empty();

                $(result).each(function (){
                    $('#selectDiv2').append("<option>"+$(this)[0]["div2_idx"]+"</option>");
                })

            }, error : err => {
                alert("fail");
                console.log(err);
            }
        })

        $('#selectDiv2').click(function (){
            let div2 = $("#selectDiv2 option:selected");
            $('#category').val(categoryList[3]);
            $.ajax({
                type : "get",
                data: {div2_idx : div2.val().substring(0,3)},
                dataType: "json",
                url : "getdiv3",
                success : result => {
                    $('#selectDiv3').empty();

                    $(result).each(function (){
                        $('#selectDiv3').append("<option>"+$(this)[0]["div3_idx"]+"</option>");
                    })

                    /*$(result).find('Div3VO').each(function (index){
                        let data = $(this).find('div3_idx').text();
                        $('#selectDiv3').append("<option>"+data+"</option>");
                    })*/
                }, error : err => {
                    alert("fail");
                    console.log(err);
                }
            })
        })

        $('#selectDiv3').click(function (){
            $('#category').val(categoryList[3]);
            let div3 = $("#selectDiv3 option:selected");
        })

    })

    $('tr#inputbox input').attr("disabled", true);
    $('#brandValue').attr("disabled", false);
    $('#categoryLevel').change(function (){
        let value = $("select[name=categoryLevel]").val();

        $('#div'+value+'Table').attr("style", "display:'';");
        $('tr#inputbox input').attr("disabled", true);
        switch (value) {
            case "3" :
                $('#div3Value').attr("disabled", false);
            case "2" :
                $('#div2Value').attr("disabled", false);
            case "1" :
                $('#div1Value').attr("disabled", false);
                break;
            case "0" :
                $('#brandValue').attr("disabled", false);
                $('#brandTable').attr("style", "display:'';");
        }
    })
})
$('button#orderConfirm').click(function (){
    console.log($(this))
    alert($(this).prev().val());
})

jQuery(($) => {
    $(this).click(function (){
        let data = {product_idx : $(this).prev().val()};
        // console.log(data);

        /*$.ajax({
            type : 'get',
            data : data,
            datatype: 'json',
            url : "getProductDetail",
            success : result => {
                alert("success");
                console.log(result);
                $('object').text(result["purchase_idx"])

            }, error : err => {
                alert("fail");
                console.log(err);
            }
        })*/
    })
    var fileNo = 0;
    var filesArr = new Array();

    function addFile(obj){
        var fileNo = 0;
        var filesArr = new Array();


    }

})

//imageManage -> 다중 업로드 처리
$(document).ready(function()
    // input file 파일 첨부시 fileCheck 함수 실행
{
    $("#input_file").on("change", fileCheck);
});

/**
 * 첨부파일로직
 */
$(function() {
    $('#btn-upload').click(function(e) {
        e.preventDefault();
        $('#input_file').click();
    });
});

// 파일 현재 필드 숫자 totalCount랑 비교값
var fileCount = 0;
// 해당 숫자를 수정하여 전체 업로드 갯수를 정한다.
var totalCount = 10;
// 파일 고유넘버
var fileNum = 0;
// 첨부파일 배열
var content_files = new Array();

function fileCheck(e) {
    var files = e.target.files;

    // 파일 배열 담기
    var filesArr = Array.prototype.slice.call(files);

    // 파일 개수 확인 및 제한
    if (fileCount + filesArr.length > totalCount) {
        $.alert('파일은 최대 ' + totalCount + '개까지 업로드 할 수 있습니다.');
        return;
    } else {
        fileCount = fileCount + filesArr.length;
    }

    // 각각의 파일 배열담기 및 기타
    filesArr
        .forEach(function(f) {
            var reader = new FileReader();
            reader.onload = function(e) {
                content_files.push(f);
                $('#articlefileChange')
                    .append(
                        '<div id="file'
                        + fileNum
                        + '" onclick="fileDelete(\'file'
                        + fileNum
                        + '\')">'
                        + '<font style="font-size:12px">'
                        + f.name
                        + '</font>'
                        + '<img src="../../resources/images/file-earmark-minus.svg" style="width:20px; height:auto; vertical-align: middle; cursor: pointer;"/>'
                        + '<div/>');
                fileNum++;
            };
            reader.readAsDataURL(f);
        });
    console.log(content_files);
    //초기화 한다.
    $("#input_file").val("");
}

// 파일 부분 삭제 함수
function fileDelete(fileNum) {
    var no = fileNum.replace(/[^0-9]/g, "");
    content_files[no].is_delete = true;
    $('#' + fileNum).remove();
    fileCount--;
    console.log(content_files);
}

/*
 * 폼 submit 로직
 */
function registerAction() {
    var form = $("form")[0];
    var formData = new FormData(form);
    for (var x = 0; x < content_files.length; x++) {
        // 삭제 안한것만 담아 준다.
        if (!content_files[x].is_delete) {
            formData.append("article_file", content_files[x]);
        }
    }
    console.log(document.getElementById('product_idx').innerText);
    formData.append("product_idx", document.getElementById('product_idx').innerText);
    /*
     * 파일업로드 multiple ajax처리
     */
    $.ajax({
        type : "POST",
        enctype : "multipart/form-data",
        url : "file-upload",
        data : formData,
        processData : false,
        contentType : false,
        success : function(data) {
            if (JSON.parse(data)['result'] == "OK") {
                alert("파일업로드 성공");
            } else
                alert("서버내 오류로 처리가 지연되고있습니다. 잠시 후 다시 시도해주세요");
        },
        error : function(xhr, status, error) {
            alert("서버오류로 지연되고있습니다. 잠시 후 다시 시도해주시기 바랍니다.");
            return false;
        }
    });
    return false;
}

jQuery(($) => {
    $('button.deletebutton').click(function (){
        ;
        $.ajax({
            data : {image_idx : $(this).parents('tr').find('.image_idx').text()},
            url : 'deleteImage',
            success : result => {
                alert("success / "+result);
                console.log(result);
            }, error : error => {
                alert("fail");
            }
        })
    })
})