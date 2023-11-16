jQuery(($) => {
    let countState = false;
    $("input.editCount").click(function (){
        let countTd = $(this).parents("tr").children(".product_count");
        let countInit = countTd.text();
        if(countState){
            let ajaxData = {};
            let count = countTd.children(".edit");
            ajaxData['product_count'] = count.val();
            ajaxData['product_idx'] = $(this).parents("tr").find(".product_idx").text();
            console.log(ajaxData);
            countTd.empty();
            $.ajax({
                type : 'get',
                data : ajaxData,
                // dataType : 'json',
                url : 'productUpdate',
                success : result =>{
                    if(result === "Success"){
                        countTd.text(count.val());
                    } else {
                        countTd.text(countInit);
                    }
                    $(this).val("수량 변경");
                }, error : err =>{
                    console.log("error");
                    console.log(err);
                }
            })
        } else {
            countTd.empty();
            let input = "<input type='text' class='edit' value='"+countInit+"'>";
            countTd.append(input);
            $(this).val("재고 수정");
        }
        countState = !countState;
    })
})

