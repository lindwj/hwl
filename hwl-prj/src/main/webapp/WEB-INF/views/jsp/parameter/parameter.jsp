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
<title>${webTitle }</title>
<link rel="icon" href="<%=path%>/resource/images/logo.png" />
<link href="<%=path%>/resource/common/reset.css" rel="stylesheet"
	type="text/css" />
<link href="<%=path%>/resource/css/parameter.css"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="<%=path%>/resource/common/iconfont.css" />
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/navigation.js"></script>
<script type="text/javascript">
function sbm(){
	$("#shareForm").submit();
}
function del(obj){
	$('#black1').fadeIn();
	//确定事件
	$("#surebtn").click(function(){
		$("#parameterId").attr("value",$(obj).attr("data-id"));
		$("#shareForm").attr("action", "<%=path%>/Parameter/delParameter.do");
		$("#shareForm").submit();
	})
	//取消事件
	$('#canclebtn').click(function(){
        $('#black1').fadeOut();
    });
}
function edit(obj){
		$("#parameterId").attr("value",$(obj).attr("data-id"));
		$("#shareForm").attr("action", "<%=path%>/Parameter/parameterAdd.do");
		$("#shareForm").submit();
}
</script>
</head>
<body>
<div class="black" id="black1">
    <div class="fadebox1">
        <div class="ordertitle1">
            <h1>确认删除？</h1>
        </div>

        <div class="orderbtn1">
            <input id="surebtn" class="btn-default" type="button" value="确定">
            <input id="canclebtn" class="btn-default" type="button" value="取消">
        </div>
    </div>
</div>
<div class="container">

        <%@ include file="../include/top2.jsp"%>


		<%@ include file="../include/left2.jsp"%>
<div class="content">
			<form name="shareForm" id="shareForm" method="post" action="<%=path%>/Parameter/parameterList.do">
            <div class="content-title">分类管理</div>

            <div class="search">

                <label class="search-label">分类名称：</label>
                <input id="item-type" name="parameterName" value="${parameter.parameterName}" type="text" class="input-default">

                <button type="button" class="btn-default" id="searchbtn" onclick="sbm()">搜索</button>
                <button type="button" class="btn-default" id="addbtn" onclick="javascript:location='<%=path%>/Parameter/parameterAdd.do'">添加</button>
            </div>
            <div class="content-main">
            <input type="hidden" name="parameterId" id="parameterId" />
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col1">图片</th>
                            <th class="col2">分类名称</th>
                            <th class="col3">分类类型</th>
                            <th class="col4">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        	<c:forEach var="ntem" items="${parameterList}">
                            <tr>
                                <td class="col1"><img src="${ntem.icon}"></td>
                                <td class="col2">${ntem.parameterName}</td>
                                <td class="col3">${ntem.parameterTypeName}</td>
                                <td class="col4"><input class='modify' type='button' onclick="edit(this)" value='修改' data-id="${ntem.parameterId}"><input class='delete' onclick="del(this)" type='button' value='删除' data-id="${ntem.parameterId}"></td>
                            </tr>
                            </c:forEach>
                        </tbody>
                <%@include file="../include/innerNavigation.jsp"%>
            </div>
           </form>
       </div>
</div>
</body>
</html>