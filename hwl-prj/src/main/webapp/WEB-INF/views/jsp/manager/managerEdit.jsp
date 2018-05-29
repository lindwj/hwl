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
	var regIdNo = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	var regMobile = /^1[34578]\d{9}$/;
	var regPhone = /^1[34578]\d{9}$/;
	if($("#name").val()==""){
		$("#errorm8").fadeIn(300);
		$("#errorm8").fadeOut(5000);
	}
	/* else if($("#idNo").val()==""){
		$("#errorm9").fadeIn(300);
		$("#errorm9").fadeOut(5000);
	}else if(regIdNo.test($("#idNo").val())==false){
		$("#errorm15").fadeIn(300);
		$("#errorm15").fadeOut(5000);
	} */
	/* else if($("#mobile").val()==""){
		$("#errorm10").fadeIn(300);
		$("#errorm10").fadeOut(5000);
	}else if(regMobile.test($("#mobile").val())==false){
		$("#errorm16").fadeIn(300);
		$("#errorm16").fadeOut(5000);
	} */
/* 	else if(regPhone.test($("#telephone").val())==false){
		$("#errorm17").fadeIn(300);
		$("#errorm17").fadeOut(5000);
	} */
	else if($("#roleId").val()==""){
		$("#errorm12").fadeIn(300);
		$("#errorm12").fadeOut(5000);
	}else if($("#account").val()==""){
		$("#errorm13").fadeIn(300);
		$("#errorm13").fadeOut(5000);
	}else if($("#password").val()==""){
		$("#errorm14").fadeIn(300);
		$("#errorm14").fadeOut(5000);
	}else{
		$("#shareForm").attr("action", "<%=path%>/manager/saveManager.do");
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
					<div id="errorm8">请填写姓名</div>
        			<div id="errorm9">请填写身份证号码</div>
        			<div id="errorm10">请填写手机号</div>
        			<div id="errorm11">请填写固定电话</div>
        			<div id="errorm12">请选择角色</div>
        			<div id="errorm13">请填写账号</div>
        			<div id="errorm14">请填写密码</div>
        			<div id="errorm15">请填写正确的身份证号码</div>
        			<div id="errorm16">请填写正确的手机号码</div>
        			<div id="errorm17">请填写正确的电话号码</div>
					<div id="err" style="color: red">
						<c:if test="${errcode == 100 }">账号已存在 </c:if>
						<c:if test="${errcode == 101 }">省市县，专营店，姓名，账号，密码 ,电话，角色 ，身份证  不能为空</c:if>
					</div>

            <div class="content-title">修改账号</div>


            <div class="content-main">
<table class="table">
                        <thead>
                        <tr>
                            <th class="col1">省份</th>
                            <th class="col2">城市</th>
                            <th class="col3">县区</th>
                            <th class="col4">专营店</th>
                        </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td class="col1">
                                    <input type="hidden" name="managerId" id="managerId"
											value="${manager.managerId }" /> <input type="hidden"
											name="dowhat" value="edit" /> ${manager.provincestr}
                                    </td>
                                <td class="col2">
                                    ${manager.citystr}
                                </td>
                                <td class="col3">
                                    ${manager.districtstr}
                                </td>
                                <td class="col4">
                                   ${manager.shopIdstr}
                                </td>

                            </tr>



                        </tbody>

                    </table>
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col5">姓名</th>
                            <th class="col6">身份证号码</th>
                            <th class="col7">手机号</th>
                            <th class="col8">固定电话</th>
                        </tr>

                        </thead>
                        <tbody>

                            <tr>
                                <td class="col5">
                                    <input type="text" name="name" id="name" value="${manager.name}"/>
                                </td>
                                <td class="col6">
                                   <input type="text" name="idNo" id="idNo" value="${manager.idNo}"/>
                                </td>
                                <td class="col7">
                                    <input type="text" name="mobile" id="mobile" value="${manager.mobile}"/>
                                </td>
                                <td class="col8">
                                   <input type="text" name="telephone" id="telephone" value="${manager.telephone}"/>
                                </td>
                            </tr>



                        </tbody>

                    </table>
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col9">角色</th>
                            <th class="col10">账号</th>
                            <th class="col11"></th>
                            <th class="col12"></th>
                        </tr>

                        </thead>
                        <tbody>

                            <tr>
                                <td class="col9">
                                   <select name="roleId" id="roleId" class="input-default">
												<c:forEach var="item" items="${roleList}">
													<option value="${item.roleId}" <c:if test="${item.roleId == manager.roleId}">selected="selected" </c:if>>${item.code}</option>
												</c:forEach>
										</select>
                                </td>
                                <td class="col10">
                                    <input type="text" name="account" id="account" value="${manager.account}"/>
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