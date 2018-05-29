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
<link href="<%=path%>/resource/css/parameterDetail.css"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="<%=path%>/resource/common/iconfont.css" />
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>

<script type="text/javascript"
	src="<%=path%>/resource/scripts/navigation.js"></script>



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
			<form name="shareForm" id="shareForm" method="post" action="<%=path%>/Parameter/saveParameter.do">
            <div class="content-title">新增分类</div>
            <td class="content-main">
                    <div class="table">
                        <div class="addproduct">
                            <p><span class="redicon">*</span>分类名称:</p>
                            <input name="parameterName" type="text" value="${parameter.parameterName}">
                        </div>
                        <%-- <div class="addproduct1">
                            <p><span class="redicon">*</span>分类类型:</p>
                            <select id="item-name" name="parameterTypeId" type="text" class="input-default">
                    			<c:forEach var="item" items="${parameterTypeList}">
								<option value="${item.parameterTypeId}"   <c:if test="${parameter.parameterTypeId == item.parameterTypeId}">selected="selected" </c:if>>${item.parameterTypeName}</option>
								</c:forEach>
                			</select>
                        </div> --%>
                        <div class="addproduct1">
                            <p><span class="redicon">*</span>排&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序&nbsp;:</p>
                            <input name="sort" value="${parameter.sort}" type="text">
                        </div>
                        <div class="clear"></div>
                        <div class="addproduct">
                            <p><span class="redicon">*</span>小&nbsp;&nbsp;图&nbsp;&nbsp;标:</p>
                            <input name="icon" value="${parameter.icon}" type="text">
                        </div>
                        <div class="addproduct1">
                            <p><span class="redicon">*</span>图&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;片&nbsp;:</p>
                            <input name="picture" value="${parameter.picture}" type="text">
                        </div>
                        <div class="clear"></div>
                        <div class="addproduct">
                            <p><span class="redicon">*</span>描&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;述&nbsp;:</p>
                            <input name="description" value="${parameter.description}" type="text">
                        </div>
                        <div class="clear"></div>
                    </div>
                    <input type="hidden" name="parameterId" value="${parameter.parameterId}">
                    <div id="returnbutton">
                      <button style="float:right;margin:9px 10px;" type="button"  class='modify' id="goBtn" onclick="javascript:location='${home}/Parameter/parameterList.do'">返回上一级</button>
					<input class='samestyle' type='button'  onclick="sbm()" value='保存'>
                    </div>
            </div>
            </form>
        </div>
</div>


</body>
</html>