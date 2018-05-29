/**
 * Created by 0x401 on 16/8/30.
 */

$(function(){


    //点击增加新地址，显示frame和面具
    //当收货地址为空的时候，显示frame和面具
    $("#btn-add").on( "click", function() {
        $("#addr-frame").removeClass("display-none");
        $("#frame-mask").removeClass("display-none");
    });

    //点击关闭按钮隐藏frame和面具
    $("#dialog-close").on( "click", function() {
        $("#addr-frame").addClass("display-none")
        $("#frame-mask").addClass("display-none");
    });




});
