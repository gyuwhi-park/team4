jQuery(($) => {
    $('#purchaseButton').click(function (){
        let user_idx = $('#user_idx').val();    //
        let user_name = $('#user_name').val();
        let user_phone = $('#user_phone').val();
        let addr_post = $('#addr_post').val();
        let addr_addr = $('#addr_addr').val();
        let purchase_option = $('#purchase_option').val();  //
        let productList = $('.product_idx').val();  //
        console.log($('.product_idx').val());
        let countList = $('.cart_count').val();
        let priceList = $('.price').val();
        let purchase_number = 3;
        let addr_idx = 1;
        let purData = [user_idx, user_name, user_phone, addr_post, addr_addr, purchase_option, productList, countList, priceList];
        console.log(purData);

    for (let i = 0; i < productList.length; i++) {
        if ((user_name!= null) && (user_phone != null) && (addr_post != null) && (addr_addr != null)){
            let data = {
                purchase_number : purchase_number,
                purchase_count : Number(countList[i]),
                purchase_option : Number(purchase_option[i]),
                purchase_price : Number(priceList[i]),
                user_idx : Number(user_idx[i]),
                product_idx : productList,
                addr_idx : addr_idx
            }
            $.ajax({
                url : 'insertPurchase',
                data : data,
                // dataType : 'json',
                success : result => {
                    $.ajax({
                        url : 'deleteCart',
                        data : {
                            user_idx : Number(user_idx[i]),
                            product_idx : productList
                        },
                        success : result => {
                            alert("deleteCart / result : "+result);
                        }, error : err => {
                            alert("deleteCart err");
                        }
                    })
                    alert("insertPurchase / result : "+result);

                    $('#addr_post').val(result['addr_post']);
                    $('#addr_addr').val(result['addr_addr']);
                    $(location).attr("href", "http://localhost:8080/mypage/mypage.do");
                }, error : err => {
                    alert("here fail");
                }
            })
        }
    })
})