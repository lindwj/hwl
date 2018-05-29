<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.hwl.service.common.Page"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Page _page = (Page) request.getAttribute("page");
%>
<input type="hidden" name="page.currentPage" value="${page.currentPage}" />
<input type="hidden" name="page.totalPage" value="${page.totalPage}" />
<input type="hidden" name="page.totalResult" value="${page.totalResult}" />
<table cellpadding="0" cellspacing="0" class="pagetable">
	<tr>
		<td width="20%">每页显示
			<select  cssStyle="width:50px;padding:0;height:20px;font-size:12px;margin-top: -2px" name="page.showCount" onchange="setShowCount();">
			<option value="10" <c:if test="${page.showCount == 10}">selected="selected"</c:if> >10</option>
			<option value="15"  <c:if test="${page.showCount == 15}">selected="selected"</c:if>  >15</option>
			<option value="20"  <c:if test="${page.showCount == 20}">selected="selected"</c:if>  >20</option>
			</select>条
		</td>
		<td align="center" width="40%" style="">
			<c:choose>
			<c:when test="${page.currentPage<=1}">
				第一页&nbsp;上一页
			</c:when>
			<c:otherwise>
				<a href="javascript:gotoPage(1);">第一页</a>&nbsp;
				<a href="javascript:gotoPage(<%=_page.getCurrentPage()-1 %>);">上一页</a>
			</c:otherwise>
			</c:choose>
			<%=_page.getCurrentPage() %>&nbsp;
			<c:choose>
			<c:when test="${page.currentPage==page.totalPage}">
				下一页&nbsp;最后一页
			</c:when>
			<c:otherwise>
				<a href="javascript:gotoPage(<%=_page.getCurrentPage()+1 %>);">下一页</a>&nbsp;
				<a href="javascript:gotoPage(<%=_page.getTotalPage()%>);">最后一页</a>
			</c:otherwise>
			</c:choose>
		</td>
		<td width="20%" align="right">共<%=_page.getTotalPage() %>页</td>
	</tr>
</table>