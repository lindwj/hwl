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
<link href="<%=path%>/resource/common/reset.css" rel="stylesheet" type="text/css" />
<link href="<%=path%>/resource/css/usermessage.css"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="<%=path%>/resource/common/iconfont.css" />
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/navigation.js"></script>
	<script type="text/javascript"
	src="<%=path%>/resource/scripts/DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
function sbm(){
	$("#shareForm").submit();
}
</script>
</head>
<body>
<div class="container">

        <%@ include file="../include/top2.jsp"%>


		<%@ include file="../include/left2.jsp"%>
<div class="content">
<form name="shareForm" id="shareForm" method="post" action="<%=path%>/user/userList.do">
            <div class="content-title">用户信息</div>

            <div class="search">

                <label class="search-label">手机号：</label>
                <input id="item-type" name="mobile" value="${user.mobile}" type="text" class="input-default">


                <label class="search-label">昵称：</label>
                <input id="item-name" name="nickname" value="${user.nickname}" type="text" class="input-default">

                <label class="search-label">开始时间：</label>
                <input id="atele" onclick="WdatePicker({readOnly:true})" name="beginTime" value="${user.beginTime}" type="text" class="input-default Wdate">
                
                
                <label class="search-label">结束时间：</label>
                <input id="ashop" onclick="WdatePicker({readOnly:true})" name="endTime" value="${user.endTime}" type="text" class="input-default Wdate">
                
                <button type="button" class="btn-default" id="searchbtn" onclick="sbm()">搜索</button>
                
            </div>
            <div class="content-main">
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col1">手机号</th>
                            <th class="col2">昵称</th>
                            <th class="col3">微信号</th>
                            <th class="col4">邮箱</th>
                            <th class="col5">注册时间</th>
                            <th class="col6">所在地址</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="ntem" items="${user.users}">
                        	 <tr>
                                <td id="y1" class="col1">${ntem.mobile}</td>
                                <td id="y2" class="col2">${ntem.nickname}</td>
                                <td id="y3" class="col3"></td>
                                <td id="y4" class="col4"></td>
                                <td id="y5" class="col5">${ntem.createDateStr}</td>
                                <td id="y10" class="col6"></td>
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