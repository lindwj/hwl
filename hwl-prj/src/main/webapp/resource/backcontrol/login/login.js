
function setCookie(name,value)
{
    var Days = 30;
    var exp = new Date();
    exp.setTime(exp.getTime() + Days*24*60*60*1000);
    document.cookie = name + "="+ escape (value) + ";expires=" + exp.toGMTString();
}


$(function(){
    var ajaxURL =  link_login;
    //获取账号和密码
    $("#login").on( "click", function() {

        var ipt = $("#account").val().trim();
        var pas = $("#user_password").val().trim();
        if(ipt == ''){
        //alert("请输入密码！");
            $('#errorm').fadeIn(300);
            $('#errorm').fadeOut(5000);
            return false;
    }

        $.ajax({
            type: 'POST',
            url: ajaxURL,
            dataType : "json" ,
            data:
            {
                account:ipt,
                password:pas
            },

            success:
                function(data,textStatus){
                    setCookie("userName", ipt);
                    if(data.errcode=="000"){
                    	if(data.roleId==9){
                    		data.spit("");
                    		window.location.href= link_ordermanagementDD;
                        }else{
                        	window.location.href= link_forgetpsw;
                        }
                    }else{
                        $('#errorm').fadeIn(300);
                        $('#errorm').fadeOut(5000);
                    }
                },
            error:
                function(data,textStatus){
                    //alert("success:" + data + "," + textStatus);
                    alert(data.errcode);
                }

        });
    });


    $(".forgetpassword").click(function(){
        window.location.href= link_forgetpsw;
    });






});
