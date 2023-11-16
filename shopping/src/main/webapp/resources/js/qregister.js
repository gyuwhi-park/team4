jQuery(($) => {
    $('#sizeInput').keyup(function (key){
        //enter event
        if(key.keyCode==13){
            let sizeVal = $(this).val();
            let product_idx = $("#productCurrentList option:selected").val().substring(0,8);

            $.ajax({
                type : "get",
                data: {product_idx : product_idx, size_val : sizeVal},
                dataType: "json",
                url : "productSizeInsert",
                success : result => {
                    alert("success");
                    $("#sizeList").append("<option value="+sizeVal+">"+sizeVal+"</option>")
                    $(this).val("");
                }, error : err => {
                }
            })
        }
    })

    $('#colorInput').keyup(function (key){
        //enter event
        if(key.keyCode==13){
            let colorVal = $(this).val();
            let product_idx = $("#productCurrentList option:selected").val().substring(0,8);

            $.ajax({
                type : "get",
                data: {product_idx : product_idx, color_name : colorVal},
                dataType: "json",
                url : "productColorInsert",
                success : result => {
                    alert("success");
                    $("#colorList").append("<option value="+colorVal+">"+colorVal+"</option>")
                    $(this).val("");
                }, error : err => {
                    // alert("fail");
                    // console.log(err);
                }
            })
        }
    })

    $('#insertProduct').click(function (){
        let brand_idx = $("#selectBrand option:selected").val().substring(0,3);
        let div3_idx = $('#selectDiv3 option:selected').val().substring(0,5);

        let product_idx = brand_idx+div3_idx;
        var data=
            {
                product_name : $('#productName').val(),
                product_price : $('#price').val(),
                product_count : $('#count').val(),
                product_option : 0,
                brand_idx : brand_idx,
                div3_idx : div3_idx,
                product_idx : product_idx
            };

        $.ajax({
            type : "get",
            data: data,
            // dataType: "json",
            url : "productInsert",
            success : result => {
                console.log(result);
            }, error : err => {
                alert("fail");
                console.log(data);
                console.log(err);
            }
        })
    })

    $('#colorDelete').click(function (){
        $('#colorList option:checked').remove();
    })

    $('#sizeDelete').click(function (){
        $('#sizeList option:checked').remove();
    })

    $('#productCurrentList').click(function (){
        let product = $("#productCurrentList option:selected");

        $.ajax({
            type : "get",
            data: {product_idx : product.val().substring(0,8)},
            dataType: "json",
            url : "getColorList",
            success : result => {
                $('#productColorList').empty();
                $(result).each(function (){
                    $('#productColorList').append("<option>"+$(this)[0]["color_name"]+"</option>");
                })
            }, error : err => {
                alert("fail");
                console.log(err);
            }
        })

        $.ajax({
            type : "get",
            data: {product_idx : product.val().substring(0,8)},
            dataType: "json",
            url : "getSizeList",
            success : result => {
                $('#productSizeList').empty();
                $(result).each(function (){
                    $('#productSizeList').append("<option>"+$(this)[0]["size_val"]+"</option>");
                })
            }, error : err => {
                alert("fail");
                console.log(err);
            }
        })
    })
})