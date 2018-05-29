

$(function(){

    //手机校验
    $("#account").blur(function(){

        var mobile = $(this).val();
        var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;

        if(mobile.length==0){
            error('请输入手机号码！');
            return false;
        }else if(mobile.length!=11){
            error('请输入有效的手机号码！');
            return false;
        }else if(!myreg.test(mobile)){
            error('请输入有效的手机号码！');
            return false;
        }
    });
    //密码校验
    $("#user_password").blur(function(){

        var pas = $(this).val();
        var reg =/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{7,20}$/;

        if(pas.length==0){
            error('请输入新密码！');
            return false;
        }else if(pas.length<8){
            error('密码至少为8位');
            return false;
        }else if(!reg.test(pas)){
            error("密码只能由数字和字母组成");
            return false;
        }
    });


    //获取提交链接
    var ajaxURL =  forget_password;
    $("#login").click(function(){

        //获取账号和密码
        var ipt = $("#account").val();
        var pas = $("#user_password").val();
        var cha = $("#cha").val();
        var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        var reg =/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{7,20}$/;

        //手机号校验
        if(ipt.length==0){
            error('请输入手机号码');
            return false;
        }else if(ipt.length!=11){
            error('请输入有效的手机号码');
            return false;
        }else if(!myreg.test(ipt)){
            error('请输入有效的手机号码');
            return false;
        }

        //密码校验
        if(pas.length==0){
            error('请输入新密码');
            return false;
        }else if(pas.length<8){
            error('密码至少为8位');
            return false;
        }else if(!reg.test(pas)){
            error("密码只能由数字和字母组成");
            return false;
        }

        $.ajax({
            type: 'POST',
            url: ajaxURL,
            dataType : "json" ,
            data:
            {
                mobile:ipt,
                captcha:cha,
                password:pas
            },
            success:
                function(data){
                    if(data == -1){
                        error('手机号，新密码或者验证码没填写');
                        return false;
                    }else if(data == -2){
                        error('验证码错误');
                        return false;
                    }else if(data == -3){
                        error('没有发送验证码');
                        return false;
                    }else if(data == 1){
                        error('修改成功');
                        window.location.href= url_login;
                        return false;
                    }else if(data == -4){
                        error('该账户不存在');
                        return false;
                    }
                },
            error:
                function(XMLHttpRequest,textStatus,errorThrown){
                    alert("服务器异常，请稍后重试");
                }

        });
    });

    var timeCntTotal = 60;//记录获取验证码的冻结时间
    var iCount;

    var updateTimeCnt = function(){
        timeCntTotal--;
        var text = "获取验证码(" + timeCntTotal + "s)";
        var tmp = parseInt(timeCntTotal, 10);
        if (tmp <= 0) {
            clearInterval(iCount);
            $('#time').val("获取验证码(60s)");
            //$('#time').removeClass('am-disabled');
            timeCntTotal = 60;
        }
        else {
            $('#time').val(text);
        }
    };


    var timeURL = time_out;
    $("#time").click(function(){

        var mobile = $("#account").val();
        var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;

        if(mobile.length==0){
            error('请输入手机号码');
            return false;
        }else if(mobile.length!=11){
            error('请输入有效的手机号码');
            return false;
        }else if(!myreg.test(mobile)){
            error('请输入有效的手机号码');
            return false;
        }else{
            $.ajax({
                type: 'POST',
                url: timeURL,
                dataType : "json",
                data:
                {
                    mobile:mobile
                },
                success:
                    function(data){

                        if(data == 0){
                            iCount = setInterval(updateTimeCnt, 1000);
                        }else if(data == 1){
                            error("请重新获取验证码");
                            return false;
                        }else if(data == -1){
                            error("该账户不存在");
                            return false;
                        }
                    },
                error:
                    function(XMLHttpRequest,textStatus,errorThrown){
                        alert(XMLHttpRequest.readyState);
                    }

            });
        }
    });


});
