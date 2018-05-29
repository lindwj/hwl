<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ include file="../include/tag.jsp"%>
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
	function sbm() {
		$("#shareForm").submit();
	}
</script>
</head>

<body>
	<div class="container">
		<%@ include file="../include/top.jsp"%>
		<!--main-->
		<div class="cat_main">

			<%@ include file="../include/left.jsp"%>
			<div class="cat_m_right">
				<form name="shareForm" id="shareForm" method="post"
					action="<%=path%>/manager/saveManager.do">

					<div id="err" style="color: red">
						<c:if test="${errcode == 100 }">账号已存在 </c:if>
						<c:if test="${errcode == 101 }">省市县，专营店，姓名，账号，密码 ,电话，角色 ，身份证  不能为空</c:if>
					</div>
					<div class="cat_table">
						<h1>修改账号</h1>
						<div class="cat_alarm">

							<table cellpadding="0" cellspacing="0" class="alarm_table">
								<thead>
									<tr>
										<th>省份</th>
										<th>城市</th>
										<th>县区</th>
										<th>专营店</th>

									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="hidden" name="managerId" id="managerId"
											value="${manager.managerId }" /> <input type="hidden"
											name="dowhat" value="edit" /> ${manager.provincestr}</td>
										<td>${manager.citystr}</td>
										<td>${manager.districtstr}</td>
										<td>${manager.shopIdstr}</td>

									</tr>
								</tbody>

								<thead>
									<tr>
										<th>姓名</th>
										<th>身份证</th>
										<th>手机</th>
										<th>固定电话</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="text" name="name" id="name" value="${manager.name}"/></td>
										<td><input type="text" name="idNo" id="idNo" value="${manager.idNo}"/></td>
										<td><input type="text" name="mobile" id="mobile" value="${manager.mobile}"/></td>
										<td><input type="text" name="telephone" id="telephone" value="${manager.telephone}"/></td>

									</tr>
								</tbody>

								<thead>
									<tr>

										<th>角色</th>
										<th>账号</th>
										<th>密码</th>
										<th>状态</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><select name="roleId" id="roleId">
												<c:forEach var="item" items="${roleList}">
													<option value="${item.roleId}" <c:if test="${item.roleId == manager.roleId}">selected="selected" </c:if>>${item.code}</option>
												</c:forEach>
										</select></td>
										<td><input type="text" name="account" id="account" value="${manager.account}"/></td>
										<td><input type="text" name="password" id="password" value="${manager.password}"/></td>
										<td><select name="status" id="selstatus">
												<option value="-1"
													<c:if test="${manager.status == -1}">selected="selected" </c:if>>已删除</option>
												<option value="0"
													<c:if test="${manager.status == 0}">selected="selected" </c:if>>草稿</option>
												<option value="1"
													<c:if test="${manager.status == 1}">selected="selected" </c:if>>已激活</option>
												<option value="2"
													<c:if test="${manager.status == 2}">selected="selected" </c:if>>已注销</option>
										</select></td>

									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td></td>
										<td><a href="#" onclick="sbm()"><i
												class="page_icon detail_icon"></i>保存</a></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!--main-->
	</div>

</body>
</html>
