<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>法人库登录页</title>
	<!-- 默认视图 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<!-- 360浏览器兼容视图适配 -->
	<meta name="renderer" content="webkit">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<link rel="stylesheet" href="<c:url value='/css/style.css'/>">
	<script>
    //失效自动跳转到顶层登录页面
    if (top.location != self.location) {
      top.location = "<c:url value='/'/>";
    }
	</script>
</head>

<body class="loginBody">
<jsp:include page="common/header.jsp">
	<jsp:param name="flag" value="false"/>
</jsp:include>
<div class="loginContent">
	<div class="loginMoudle">
		<form id="login-form" class="clear">
			<div class="large-wrap fl">
				<h4 class="title">用户登录</h4>
				<img src="/img/log-pic.png" alt="">
			</div>
			<div class="login-box fl">
				<a href="http://guser.zjzwfw.gov.cn/sso/"
				   class="btn login-btn orange-bg mb20">浙江政务服务网用户登录</a>
				<ul>
					<li class="form-li">
						<div class="form-label">
							<i class="icons user-icon"></i>
							<input type="text" class="form-control" name="username" id="username"
							       placeholder="请输入用户名"
							       autocomplete="off" autocomplete="new-password" value=""/>
						</div>
					</li>
					<li class="form-li">
						<div class="form-label">
							<i class="icons pw-icon"></i>
							<input type="password" class="form-control" name="password" id="password"
							       placeholder="请输入密码" autocomplete="off" autocomplete="new-password" value=""/>
						</div>
					</li>
					<li class="form-li">
						<div class="form-label w-180">
							<i class="icons pzm-icon"></i>
							<input type="text" class="form-control" name="checkCode" id="checkCode"
							       placeholder="请输入验证码">
							<div class="checkcode-wrap js-checkcode">
								<img class="js-checkcode" src="/captcha" width="82px"/>
							</div>
						</div>
					</li>
				</ul>
				<button type="submit" class="btn login-btn blue-bg mt15">用户名密码登录</button>
			</div>

		</form>
	</div>
</div>
<div class="log-footer">
	主办单位：浙江省人民政府办公厅&emsp;&emsp;技术支持：浙江汇信科技有限公司&emsp;&emsp;客服 400-888-4636&emsp;&emsp;技术 0571-88234769
</div>
<!-- 通用页面 -->
<jsp:include page="common/common.jsp"/>
<script src="<c:url value='/js/login/login_main.js'/>"></script>
</body>
</html>