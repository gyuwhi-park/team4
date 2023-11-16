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
        let divVal = ($(this).text())/10000;
        priceList.push(divVal);
    })
    const accessAnalysis = document.getElementById('accessAnalysis');
    new Chart(accessAnalysis, {
        type: 'line',
        data: {
            labels: dateList,
            datasets: [{
                label: '일일 판매 제품 수',
                data: countList,
                borderWidth: 1
            },{
                label: '일일 판매 총액(만원)',
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
