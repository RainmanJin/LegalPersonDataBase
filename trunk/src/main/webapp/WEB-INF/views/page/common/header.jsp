<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
   Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
  --%>
<div class="header clearfix">
	<a href="" class="logo fl">
		<img src="<c:url value='/img/logo.png'/>" alt="" class="fl"/>
		<%--<h1 class="fl">
				法人库

				<span>——管理端</span>

		</h1>--%>
	</a>
	<c:if test="${!empty _session_sys_user_key && param.ref != 'detail'}">
		<div class="hd-nav user-info2">
			<ul class="clearfix">
				<li>${userProfile.realName},欢迎您!<span class="ml10 ">|</span></li>
					<%--<li><a class="J_menuItem" href="/admin/dashboard">操作指南<i class="guide"></i></a><span>|</span></li>--%>
				<li style="display: inline-block;padding-left: 10px;"><a href="javascript:void(0)" class="modify-pwd">修改密码</a></li>
				<li><a class="js-logout">退出<i class="log-out"><img
					src="<c:url value='/img/sign_out_icon.png'/>"></i></a></li>
			</ul>
		</div>
	</c:if>
</div>