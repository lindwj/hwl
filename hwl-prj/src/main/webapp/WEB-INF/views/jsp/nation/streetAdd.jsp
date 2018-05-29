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
	<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>

<script type="text/javascript"
	src="<%=path%>/resource/scripts/navigation.js"></script>


<script type="text/javascript">
function sbm(){
	//获取 省市县 值
	
	$("#province").attr("value",$("#selprovince  option:selected").text());
	$("#city").attr("value",$("#selcity  option:selected").text());
	$("#district").attr("value",$("#seldistrict  option:selected").text());
	$("#parent").attr("value",$("#seldistrict  option:selected").val());
	if($("#province").val()=="请选择"){	
		$("#errorm4").fadeIn(300);
		$("#errorm4").fadeOut(5000);
	}else if($("#city").val()=="请选择"){
		$("#errorm5").fadeIn(300);
		$("#errorm5").fadeOut(5000);
	}else if($("#district").val()=="请选择"){
		$("#errorm6").fadeIn(300);
		$("#errorm6").fadeOut(5000);
	}else if($("#street").val()==""){
		$("#errorm7").fadeIn(300);
		$("#errorm7").fadeOut(5000);
	}else{
		$("#shareForm").attr("action", "<%=path%>/nation/saveNation.do");
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
					action="<%=path%>/nation/getNationListPage.do">
					

        <div class="content">
        <div id="errorm4">请选择省</div>
        <div id="errorm5">请选择市</div>
        <div id="errorm6">请选择区</div>
        <div id="errorm7">请填写街道</div>
           <div id="err" style="color: red">
						<c:if test="${code == 100 }">街道已存在 </c:if>
						<c:if test="${code == 101 }">省市县街道不能为空</c:if>
					</div>
            <div class="content-title">新增街道</div>
         


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
<input type="hidden" name="code" value="add" />
                            <tr>
                                <td class="col7">
                                    <select  id="selprovince" class="input-default"
											onchange="onSelectChange(this,'selcity');"></select>
											<input type="hidden" id="province" name="province" value="" />
                                </td>
                                <td class="col8">
                                    <select id="selcity" class="input-default"
											onchange="onSelectChange(this,'seldistrict');">
												<option value="">请选择</option>
										</select>
										<input type="hidden" name="city" id="city" value="" />
                                </td>
                                <td class="col9">
                                    <select  id="seldistrict" class="input-default">
												<option value="">请选择</option>
										</select>
										<input type="hidden" name="district" id="district" value="" />
										<input type="hidden" name="parent" id="parent" value="" />
                                </td>
                                <td class="col10">
                                    <input type="text" class="input-default" name="street" id="street" />
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