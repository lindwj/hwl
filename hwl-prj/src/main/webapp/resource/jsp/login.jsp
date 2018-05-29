<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Login</title>
    <link href="../css/login/styles.css" type="text/css" media="screen" rel="stylesheet" />
    <link href="../css/login/jquery-ui-1.8.16.custom.css" rel="stylesheet"/>
    <script src="../scripts/jquery-1.6.2.min.js"></script>
    <script src="../scripts/jquery-ui-1.8.16.custom.min.js"></script>
    <script type="text/javascript" src="../scripts/jquery.keyboard.extension-typing.js"></script>
    <link type="text/css" href="../css/login/keyboard.css" rel="stylesheet" />
    <script type="text/javascript" src="../scripts/jquery.keyboard.js"></script>

<script type="text/javascript">
function sbm(){
	$("#loginform").submit();
}

</script>
    

</head>
<body id="login">
    <div id="wrappertop">
    </div>
    <div id="wrapper">
        <div id="content">
            <div id="header">
            </div>
            <div id="darkbanner" class="banner320">
                <h2>
                    </h2>
            </div>
            <div id="darkbannerwrap">
            </div>
            <form name="form1" id="loginform" method="post" action="<%=path%>/manager/login.do">
            <fieldset class="form">
                <p>
                    <label class="loginlabel" for="user_name">
                        Username:</label>
                    <input class="logininput ui-keyboard-input ui-widget-content ui-corner-all" name="account"
                        id="account" type="text" value="" />
                </p>
                <p>
                    <label class="loginlabel" for="user_password">
                        Password:</label>
                    <span>
                        <input class="logininput"   name="password" id="user_password" type="password" /><img
                            id="passwd" class="tooltip" alt="Click to open the virtual keyboard" title="Click to open the virtual keyboard"
                            src="../css/login/keyboard.png" /></span>
                </p>
                <button id="loginbtn" type="button" class="positive" name="Submit">
                    <img src="../css/login/key.png" alt="Announcement" />Login</button>
                <ul id="forgottenpassword">
                    <li class="boldtext">|</li>
                    <li>
                        </li>
                </ul>
            </fieldset>
        </div>
    </div>
    <div id="wrapperbottom_branding">
        <div id="wrapperbottom_branding_text">
            </div>
    </div>
    <script type="text/javascript">
        $(document).ready(function() {
            $('#user_password').keyboard({
                openOn: null,
                stayOpen: true,
                layout: 'qwerty'
            }).addTyping();
            $('#passwd').click(function() {
                $('#user_password').getkeyboard().reveal();
            })

            $(".logininput").blur(function() {
                if ($(this).val() == "") {
                    $(this).css("border-color", "red");
                                    }
                else
                    $(this).css("border-color", "#D9D6C4");
            })

            $("#loginbtn").click(function() {
            	var k = 0;
                var ajaxhtml = "";
                $(".logininput").each(function(i, obj) {
                    if ($(obj).val().trim() == "") {
                        k++;
                        $(this).css("border-color", "red");
                        $(this).focus();
                        return false;
                    }
                });
                if (k != 0) return;
                ajaxhtml = $("#loginbtn").html();
                $("#loginbtn").html("Loading....  <img src='loading.gif' alt='Announcement' /> ");
                $("#loginbtn").attr("disabled", "disabled");

                sbm();

            })
        });
        
    </script>
</body>
