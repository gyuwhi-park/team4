jQuery(($) => {
    let dateList = [];
    let countList = [];
    let priceList = [];
    $('td[class="purchase_date"]').each(function (){
        dateList.push($(this).text());
    })
    $('td[class="purchase_count"]').each(function (){
        countList.push($(this).text());
    })
    $('td[class="purchase_price"]').each(function (){
        priceList.push($(this).text());
    })

    const myChart = document.getElementById('myChart');

    new Chart(myChart, {
        type: 'bar',
        data: {
            labels: dateList,
            datasets: [{
                label: '일일 판매 제품 수',
                data: countList,
                borderWidth: 1
            },{
                label: '일일 판매 총액',
                data: priceList,
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });


})