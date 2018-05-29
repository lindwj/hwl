<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ include file="../include/tag.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <!--<link rel="icon" href="/static/images/favicon.ico?v=1" type="image/x-icon"/>-->


<title>${webTitle }</title>
<link rel="icon" href="<%=path%>/resource/images/logo.png" />
<link href="<%=path%>/resource/common/reset.css" rel="stylesheet"
	type="text/css" />
<link href="<%=path%>/resource/css/accountDetail.css"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="<%=path%>/resource/common/iconfont.css" />
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>
	
	<script type="text/javascript">
function sbm(){
	if($("#password").val()==""){
		$("#errorm14").fadeIn(300);
		$("#errorm14").fadeOut(5000);
	}else{
		$("#shareForm").attr("action", "<%=path%>/manager/saveManagerPWD.do");
		$("#shareForm").submit();
	}
}
</script>

</head>
<body>



<div class="container">

        <%@ include file="../include/top2.jsp"%>


		<%@ include file="../include/left2.jsp"%>

        <div class="content">
        
        <form name="shareForm" id="shareForm" method="post"
					action="<%=path%>/shop/shopListPage.do">
        			<div id="errorm14">请填写密码</div>
					<div id="err" style="color: red">
						<c:if test="${errcode == 101 }">密码   不能为空</c:if>
					</div>

            <div class="content-title">修改账号</div>


            <div class="content-main">
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col9">密码</th>
                            <th class="col10"></th>
                            <th class="col11"></th>
                            <th class="col12"></th>
                        </tr>

                        </thead>
                        <tbody>

                            <tr>
                            <input type="hidden" name="managerId" id="managerId"
											value="${manager.managerId}" /> <input type="hidden"
											name="dowhat" value="edit" />
                                <td class="col9">
                                <input type="text" name="password" id="password" value="${manager.password}"/>
                                </td>
                                <td class="col10">
                                </td>
                                <td class="col11">
                                </td>
                                <td class="col12"></td>
                            </tr>



                        </tbody>
                        
                        
                        <tfoot>
                            <tr>

                                <td colspan="13">

                                    <div class="pull-right page-box">
                                        <div class="pagination-goto">
                                            <button type="button" class="btn btn-default" id="goBtn" onclick="javascript:location='${home}/manager/managerListPage.do'">返回上一级</button>
                                            <input class='samestyle' style="height:32px; margin:0 10px;" type='button' onclick="sbm()" value='保存'>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </tfoot>

                    </table>                
                
                
                
                
                


            </div>
</form>

        </div>


</div>

</body>
</html>