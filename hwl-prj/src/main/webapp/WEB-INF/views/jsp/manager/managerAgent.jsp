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
<link href="<%=path%>/resource/css/contractDetail2.css"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="<%=path%>/resource/common/iconfont.css" />
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>

<script type="text/javascript">
function sbm(){
	$("#shareForm").attr("action", "<%=path%>/AgentCfg/saveAgent.do");
	$("#shareForm").submit();
}



</script>	
	
</head>
<body>



<div class="container">

 <%@ include file="../include/top2.jsp"%>


		<%@ include file="../include/left2.jsp"%>
        <div class="content">

<form name="shareForm" id="shareForm" method="post"
					action="<%=path%>/contractNo/contractNoListPage.do">
            <div class="content-title">新增独代</div>
			<input type="hidden" name="managerId" value="${manager}"/>

            <div class="content-main">
                <form>
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col1">商品uuid</th>
                            <th class="col2"></th>
                            <th class="col3"></th>
                            <th class="col4"></th>
                            <th class="col5"></th>
                            <th class="col6"></th>
                        </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[0].productUuid"  id="productUuid0" value="${productList[0].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[1].productUuid"  id="productUuid1" value="${productList[1].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[2].productUuid"  id="productUuid2" value="${productList[2].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[3].productUuid"  id="productUuid3" value="${productList[3].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[4].productUuid"  id="productUuid4" value="${productList[4].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[5].productUuid"  id="productUuid5" value="${productList[5].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[6].productUuid"  id="productUuid6" value="${productList[6].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[7].productUuid"  id="productUuid7" value="${productList[7].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[8].productUuid"  id="productUuid8" value="${productList[8].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                            
                            <tr>
                                <td class="col1">
                                <input type="text" name="products[9].productUuid"  id="productUuid9" value="${productList[9].productUuid}"/>
                                </td>
                                <td class="col2">
                                </td>
                                <td class="col3">
                                </td>
                                <td class="col4">
                                </td>
                                <td class="col5">
                                </td>
                                <td class="col6">
                                </td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <tr>

                                <td colspan="13">
<button type="button" class="btn btn-default" id="savebtn" style="float:left;" onclick="sbm()">保存</button>
                                    <div class="pull-right page-box">
                                        <div class="pagination-goto">
                                            <button type="button" class="btn btn-default" id="goBtn" onclick="javascript:location='${home}/manager/managerListPage.do'">返回上一级</button>
                                            
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