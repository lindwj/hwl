$(function(){

    $("#controluser").mouseenter(function(){
        $("#logout").show();
    });

    //鼠标离开用户或者退出时退出按钮隐藏
    $(".user-name").mouseleave(function(){
        $("#logout").hide();
    });




});