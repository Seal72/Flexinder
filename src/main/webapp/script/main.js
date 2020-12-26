jQuery(document).ready(function () {
    jQuery('#foundUserName').html('');
    jQuery('#personalInfo').html('');
    jQuery('#relationships').html('');
    jQuery.ajax({
        url: "getRandomUser",
        success: function (dataResponse) {
            var response = JSON.parse(dataResponse.jsonResponse);
            var firstName = response.firstName;
            jQuery('#foundUserName').html('<strong>' + firstName + '</strong>');
            jQuery('#personalInfo').html('Личная информация');
            jQuery('#relationships').html('Отношения: свободно');
        }
    });
});

function getNewUser(){
    jQuery('#foundUserName').html('');
    jQuery('#personalInfo').html('');
    jQuery('#relationships').html('');
    jQuery.ajax({
        url: "getRandomUser",
        success: function (dataResponse) {
            var response = JSON.parse(dataResponse.jsonResponse);
            var firstName = response.firstName;
            jQuery('#foundUserName').html('<strong>' + firstName + '</strong>');
            jQuery('#personalInfo').html('Личная информация');
            jQuery('#relationships').html('Отношения: свободно');
        }
    });
}