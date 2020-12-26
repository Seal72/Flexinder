jQuery(document).ready(function () {
    jQuery.ajax({
        url: "getMessages2",
        contentType: false,
        processData: false,
        success: function (dataResponse) {
            var jsonResponse = JSON.parse(dataResponse.jsonResponse);
            var chatContent = jQuery('#chatContentId');
            for(var i = 0; i< jsonResponse.length;i++){
                var message = jsonResponse[i];
                if(message.userIdFrom.clientId === 101){
                    chatContent.html(chatContent.html() + '<p>&#8226 ' + message.content + '</p>');
                } else{
                    chatContent.html(chatContent.html() + '<p style="margin-left: 60px;">' + message.content + ' &#8226</p>');
                }
            }
            chatContent.html(chatContent.html())
        }
    });
});

function sendMessage(){
    var message = jQuery('#messageContentId').val();
    jQuery.ajax({
        url: "sendMessage2?message=" + message,
        type: "POST",
        dataType: "json",
        success: function (dataResponse) {
            var resultMessage = dataResponse.message;
            var chatContent = jQuery('#chatContentId');
            chatContent.html(chatContent.html() + '<p>&#8226 ' + resultMessage + '</p>');
        }
    });
}