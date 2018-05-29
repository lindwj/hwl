<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ include file="include/tag.jsp"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<link href="<%=path%>/resource/css/Pagestyle.css" type="text/css"
	rel="stylesheet">
<link href="<%=path%>/resource/css/icon.css" type="text/css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/resource/css/dropkick.css">
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/toastr/toastr.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/global.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/jquery.dropkick-min.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/layer/layer.js"></script>
<script type="text/javascript"
	src="<%=path%>/resource/scripts/json-minified.js"></script>

<script type="text/javascript"
	src="<%=path%>/resource/scripts/navigation.js"></script>
<title>${webTitle }</title>

<script type="text/javascript">
function sbm(){
	//获取 省市县 值
	
	$("#province").attr("value",$("#selprovince  option:selected").text());
	$("#city").attr("value",$("#selcity  option:selected").text());
	$("#district").attr("value",$("#seldistrict  option:selected").text());
	$("#parent").attr("value",$("#seldistrict  option:selected").val());
	
	
	$("#shareForm").attr("action", "<%=path%>/nation/saveNation.do");
	$("#shareForm").submit();
}


function del(obj){
	
	$("#nationid").attr("value",$(obj).attr("id"));
	
	
	$("#shareForm").attr("action", "<%=path%>/nation/delNation.do");
	$("#shareForm").submit();
}


function edit(obj){
	
	$("#nationid").attr("value",$(obj).attr("id"));
	
	
	$("#shareForm").attr("action", "<%=path%>/nation/nationEditIni.do");
	$("#shareForm").submit();
}

</script>
</head>

<body>
	<div class="container">
		<%@ include file="include/top.jsp"%>
		<!--main-->
		<div class="cat_main">

			<%@ include file="include/left.jsp"%>
			<div class="cat_m_right">
				<form name="shareForm" id="shareForm" method="post"
					action="<%=path%>/nation/getNationListPage.do">

					<div id="err" style="color: red">
						<c:if test="${code == 100 }">街道已存在 </c:if>
						<c:if test="${code == 101 }">省市县街道不能为空</c:if>
					</div>
					<div class="cat_table">
						<h1>新增街道</h1>
						<div class="cat_alarm">

							<table cellpadding="0" cellspacing="0" class="alarm_table">
								<thead>
									<tr>
										<th>省份</th>
										<th>城市</th>
										<th>县区</th>
										<th>街道</th>
										<th>操作</th>
									</tr>
								</thead>
								<input type="hidden" name="code" value="add" />
								<tbody>
									<tr>
										<td><select  id="selprovince"
											onchange="onSelectChange(this,'selcity');"></select>
											<input type="hidden" id="province" name="province" value="" />
											</td>
										<td><select id="selcity"
											onchange="onSelectChange(this,'seldistrict');">
												<option value="">请选择</option>
										</select>
										<input type="hidden" name="city" id="city" value="" />
										</td>
										<td><select  id="seldistrict">
												<option value="">请选择</option>
										</select>
										<input type="hidden" name="district" id="district" value="" />
										<input type="hidden" name="parent" id="parent" value="" />
										</td>
										<td><input type="text" name="street" id="street" /></td>
										<td><a href="#" onclick="sbm()"><i
												class="page_icon detail_icon"></i>保存</a></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<div class="cat_table">
						<h1>已添加街道列表</h1>
						<div class="cat_alarm">

							<table cellpadding="0" cellspacing="0" class="alarm_table">
								<thead>
									<tr>
										<th>省份</th>
										<th>城市</th>
										<th>县区</th>
										<th>街道</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
								<input type="hidden" name="id" id="nationid" />
									<c:forEach var="item" items="${nationList}">
										<tr>
											<td>${item.province}</td>
											<td>${item.city}</td>
											<td>${item.district}</td>
											<td>${item.street}</td>
											<td><a href="#" id="${item.id}" onclick="del(this)" ><i class="page_icon detail_icon"></i>删除</a>
												<a href="#" id="${item.id}" onclick="edit(this)"><i class="page_icon detail_icon"></i>修改</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>

							<%@ include file="include/innerNavigation.jsp"%>

						</div>
					</div>
				</form>
			</div>
		</div>
		<!--main-->
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
