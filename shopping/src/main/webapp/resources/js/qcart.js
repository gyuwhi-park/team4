jQuery(($) => {
    let totalCount = 0;
    let totalPrice = 0;

    function setTotal(totalCount, totalPrice){
        $('#totalcount').val(totalCount);
        $('#totalprice').val(totalPrice);
        $('span#totalcountSpan').text(totalCount);
        $('span#totalpriceSpan').text(totalPrice);
    }

    $('td.getprice').each(function (){
        let parent = $(this).parent();
        let count = Number(parent.find('.cart_count').val());
        let price = Number(parent.find('.price').val());
        $(this).text(count * price);

        totalCount += count;
        totalPrice += price;
    })
    setTotal(totalCount, totalPrice);

    $('button.increase').click(function (){
        let parent = $(this).parent().parent();
        let count = Number(parent.find('.cart_count').val());
        let price = Number(parent.find('.price').val());

        parent.find('.cart_count').val(count+1);
        parent.find('.getprice').text(count*price);
        totalCount += 1;
        totalPrice += price;
        setTotal(totalCount, totalPrice);
    })

    $('button.decrease').click(function (){
        let parent = $(this).parent().parent();
        let count = Number(parent.find('.cart_count').val());
        let price = Number(parent.find('.price').val());

        if (count !== 1){
            parent.find('.cart_count').val(count-1);
            parent.find('.getprice').text(count * price);
            totalCount -= 1;
            totalPrice -= price;
            setTotal(totalCount, totalPrice);
        }
    })

    $('button#purchase').click(function (){
        // alert('구매에 성공하였습니다.');
        let cartList = [];
        $('input.cart_idx').each(function (){
            cartList.push($(this).val());
        })
        console.log(cartList);
        $(location).attr('href', 'http://localhost:8080/purchase?cart='+cartList.join('a'));
    })
})
