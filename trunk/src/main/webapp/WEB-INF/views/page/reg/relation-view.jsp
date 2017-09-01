<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
    <title>关系图</title>
    <link rel="stylesheet" href="/css/reg.server.css">
</head>
<body>
<!--  头部信息 start -->
<div style="background: #055486;" class="header clearfix">
	<a href="" class="logo fl">
		<img src="<c:url value='/img/logo.png'/>" alt="" class="fl"/>
	</a>
	<c:if test="${!empty _session_sys_user_key && param.ref != 'detail'}">
		<div class="hd-nav">
		</div>
	</c:if>
</div>
<!-- 头部信息 end  -->
<div class="clearfix reg-company-basic reg-company-basic-yellowish" style="margin-top: 2px;border-top: 4px solid #055486;border-right: 1px solid #055486;border-bottom: 1px solid #055486;border-left: 1px solid #055486;background: #F5F5F5;">
    <div class="clearfix reg-caption">
        <div class="title clearfix">
            <span class="name fl mr5">${jbxx['ztdj'].frmc}</span>
            <span></span>
            <span class="icon-rectangle blue fl mr10"></span>
        </div>
        <div class="clearfix">
            <p class="w360">
                <i class="book2-icon"></i>统一社会信用代码/注册号：<span>${jbxx['ztdj'].tyxydm}</span>
            </p>
            <p>
                <i class="person-icon"></i>法定代表人：<span>${jbxx['ztdj'].fddbr}</span>
            </p>
        </div>
    </div>
</div>

<%--参数值--%>
<form id="js-params">
    <input type="hidden" name="entName" value="${jbxx['ztdj'].frmc}">
    <input type="hidden" name="corpid" value="${jbxx['ztdj'].datakeycontent}">
    <input type="hidden" name="isGxcsSlt" value="2" id="isGxcsSlt"> <!-- 默认层级：2 -->
    <input type="hidden" name="nodeType" value="" id="js-nodeType"> <!-- 关系类型 -->

    <%--   <input type="hidden" name="entName" value="浙江汇信科技有限公司">
   <input type="hidden" name="corpid" value="3300000000012888">
   <input type="hidden" name="isGxcsSlt" value="2" id="isGxcsSlt"> <!-- 默认层级：2 -->--%>

</form>

<div style="margin-top: 10px;text-align: center;clear: both;height: 32px;">
    <div style="float: left;">
        <input type="button" class="js-relation btn mr20"  value="关系网图"  data-layout="force" style="border: 0px;background: #43a8e8">
        <input type="button" class="js-relation btn mr20"  value="关系圈图"  data-layout="circular" style="border: 0px;background: #43a8e8">
    </div>
    <div class="ipt-box col-1" style="float: left;">
        <select id="js-cengji">
            <option>--请选择层级--</option>
            <option value="1">一层</option>
            <option value="2">二层</option>
        </select>
    </div>

   <%-- <div class="ipt-box col-1" style="float: left;">
        <select id="js-people-type">
            <option>--请选择类型--</option>
            <option value="1">法定代表人关系</option>
            <option value="2">股东关系</option>
            <option value="3">高管关系</option>
        </select>
    </div>--%>

   <%-- <div style="float: left;height: 30px;line-height: 30px;font-size: 14px;">--%>
    <div style="clear: both; height: 30px;line-height: 30px;font-size: 14px;">
         &nbsp;提示：(线条箭头颜色关系)
        【股东关系(红色):<span style="color: #ff8686;font-size: 18px;vertical-align: middle;font-weight: bold;">→</span>】
        【高管关系(蓝色):<span style="color: #7575ff;font-size: 18px;vertical-align: middle;font-weight: bold;">→</span>】
        【法定代表人关系(褐色):<span style="color: #ab5555;font-size: 18px;vertical-align: middle;font-weight: bold;">→</span>】
        【既是法人代表也是高管关系(绿色):<span style="color: #94dfc2;font-size: 18px;vertical-align: middle;font-weight: bold;">→</span>】
    </div>
</div>


<!-- 显示图 -->
<div id="main_rel" style="width: auto;height: 800px;margin: 2px auto;"></div>

<script src="<c:url value="/js/lib/require.js"/>"></script>
<script src="<c:url value="/js/config.js"/>"></script>
<script src="<c:url value="/js/reg/relation-view.js"/>"></script>

</body>
</html>
