<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
	<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld"%> 
	<script type="text/javascript"
	src="${home}/resource/common/link.js"></script>
	
	<script type="text/javascript">
	$(function(){
	$("#"+'${sessionScope.menuId}').css({'background-color':'#57b383','color':'white'});

    
});
	
	</script>
   
   <div class="nav-global" style="">
                <div class="global-logo">
                    <img class="global-logo-img" src="${home}/resource/images/logo3.png">
                    <h1 class="global-logo-title"></h1>
                </div>

                <div class="items-inner">
                    <ul class="global-items">
                        <li class="nav-item">
                            <a class="nav-item-inner" href="${home}/manager/logout.do" id="controluser">
                                <div class="user-name">
                                    <i class="iconfont userfont">&#xe60c;</i>
                                    <i style="font-style: normal" class="username"><shiro:principal type="com.bdh.business.service.model.Manager" property="account"/></i>
                                    <p id="logout">退出</p>
                                </div>
                            </a>
                        </li>
                    </ul>
                </div>
        </div>