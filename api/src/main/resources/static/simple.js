
$(function(){
    $.ajax({
        url: "/temp/data", // 클라이언트가 HTTP 요청을 보낼 서버의 URL 주소
        method: "GET",                           // HTTP 요청 방식(GET, POST)
        dataType: "json", // 서버에서 보내줄 데이터의 타입
        success: (data) =>{
            const tempData = {
                data: data
            }
            render(tempData);
        }
    })

function render(data){
    const  html = $('#simple').html()
    const tempResult = Mustache.render(html,data)
    $('.tempClass').html(tempResult);
}
// const temp={
//     phone : "aaa",
//     name: 1
// }
// const  html = $('#simple').html()
// const tempResult = Mustache.render(html,temp)
// $('.tempClass').html(tempResult);

// Mustache.render(NoticeTable.TEMPLATE.LIST_TABLE, tableHtml);
})
