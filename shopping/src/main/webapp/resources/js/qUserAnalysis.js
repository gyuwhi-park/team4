jQuery(($) => {
    let dateList = [];
    let countList = [];
    $('td[class="visit_date"]').each(function (){
        dateList.push($(this).text());
    })
    $('td[class="visit_count"]').each(function (){
        countList.push($(this).text());
    })
    // console.log(dateList);
    // console.log(countList);

    const ctx = document.getElementById('myChart');

    new Chart(ctx, {
        type: 'bar',
        data: {
            labels: dateList,
            datasets: [{
                label: '일일 방문자 수',
                data: countList,
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