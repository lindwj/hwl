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
    <link href="<%=path%>/resource/common/reset.css" rel="stylesheet" type="text/css"/>
    <link href="<%=path%>/resource/css/streetDetail.css" rel="stylesheet" type="text/css"/>
    <link type="text/css" rel="stylesheet" href="<%=path%>/resource/common/iconfont.css"/>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>

<script type="text/javascript">
function sbm(){
if($("#street").val()==""){
	$("#errorm3").fadeIn(300);
	$("#errorm3").fadeOut(5000);
}else{
	$("#shareForm").submit();
}
} 


</script>
</head>
<body>



<div class="container">

        <%@ include file="../include/top2.jsp"%>


        <%@ include file="../include/left2.jsp"%>
        
       <form name="shareForm" id="shareForm" method="post"
					action="<%=path%>/nation/saveNation.do">

        <div class="content">
        <div id="errorm3">请填写街道</div>
<div id="err" style="color: red">
						<c:if test="${errcode == '100' }">街道已存在 </c:if>
						<c:if test="${errcode == '101' }">省市县街道不能为空</c:if>
					</div>
            <div class="content-title">修改街道</div>


            <div class="content-main">
                    <table class="table">
                        <thead>
                        <tr>
                            <th class="col1">省份</th>
                            <th class="col2">城市</th>
                            <th class="col3">县区</th>
                            <th class="col4">街道</th>
                            <th class="col5">操作</th>
                        </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td class="col7">
<input type="hidden" id="id" name="id" value="${nation.id }" />
										<input type="hidden" id="code" name="code" value="edit" />
											<input type="text" id="province" value="${nation.province }" disabled="disabled"/>                                </td>
                                <td class="col8">
                                    <input type="text"  id="city" value="${nation.city }" disabled="disabled"/>
                                </td>
                                <td class="col9">
                                    <input type="text" id="district" value="${ nation.district}" disabled="disabled"/>
                                </td>
                                <td class="col10">
                                    <input type="text" name="street" id="street" value="${nation.street }"/>
                                </td>
                                <td class="col11"><input class='modify' type='button' onclick="sbm()" value='保存'></td>
                            </tr>



                        </tbody>
                        
                        
                        <tfoot>
                            <tr>

                                <td colspan="13">

                                    <div class="pull-right page-box">
                                        <div class="pagination-goto">
                                            <button type="button" class="btn btn-default" id="goBtn" onclick="javascript:location='${home}/nation/getNationListPage.do'">返回上一级</button>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </tfoot>

                    </table>
                


            </div>



        </div>
</form>

</div>
	<script type="text/javascript">
function onSelectChange(obj,toSelId){
 setSelect(obj.value,toSelId);
}
function setSelect(fromSelVal,toSelId){
 //alert(document.getElementById("province").selectedIndex);
 document.getElementById(toSelId).innerHTML="";
 jQuery.ajax({
  url: "<%=path%>/nation/getNation.do",
				cache : false,
				data : "parent=" + fromSelVal,
				success : function(data) {
					createSelectObj(data, toSelId);
				}
			});
		}
		function createSelectObj(data, toSelId) {
			var arr = jsonParse(data);
			if (arr != null && arr.length > 0) {
				var obj = document.getElementById(toSelId);
				obj.innerHTML = "";
				var nullOp = document.createElement("option");
				nullOp.setAttribute("value", "");
				nullOp.appendChild(document.createTextNode("请选择"));
				obj.appendChild(nullOp);
				for ( var o in arr) {
					var op = document.createElement("option");
					op.setAttribute("value", arr[o].id);
					//op.text=arr[o].name;//这一句在ie下不起作用，用下面这一句或者innerHTML
					if (toSelId == 'selprovince') {
						op
								.appendChild(document
										.createTextNode(arr[o].province));
					} else if (toSelId == 'selcity') {
						op.appendChild(document.createTextNode(arr[o].city));
					} else if (toSelId == 'seldistrict') {
						op
								.appendChild(document
										.createTextNode(arr[o].district));
					}
					obj.appendChild(op);
				}
			}
		}
		setSelect('1', 'selprovince');
		
		
	</script>

</body>
</html>