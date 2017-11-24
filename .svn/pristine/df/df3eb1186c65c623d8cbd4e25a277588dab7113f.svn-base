<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
	<meta charset="utf-8">
	<title>法人登记基本信息</title>

	<style type="text/css">
		.dataTables_scrollHeadInner {
			width: 100% !important;
		}

		.white-space-n {
			white-space: normal !important;
			/* text-align:left!important; */
		}
	</style>
</head>
<body>

<form id="produce-form">
	<input type="hidden" id="frwybs" name="frwybs" value="${frwybss}">
	<input type="hidden" id="errormsg" name="errormsg" value="${jbxx['error']}">
</form>

<%-- <jsp:include page="../../common/header.jsp?ref=detail"/> --%>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">${jbxx['ztdj'].frmc}</span>
				<span class="icon-rectangle green fl mr10">${jbxx['ztdj'].cxzt}</span>
			</div>
			<p>
				统一社会信用代码/注册号：${jbxx['ztdj'].tyxydm}
			</p><!--
			<c:if test="${not empty jbxx['ztdj'].datakeycontent}">
				<span style="font-size: 14px;color:#055486;float: right;margin-top: -47px;">
				<a href="/data/relationnetall/relationShow?priPID=${jbxx['ztdj'].datakeycontentForEncode}" target="_blank"><input type="button" class="js-relation btn mr20"  value="关系网查询"  data-layout="circular" style="border: 0px;background: #43a8e8"></a></span>
			</c:if>-->
			<c:if test="${not empty jbxx['ztdj'].datakeycontent}">
				<span class="relation_net_span">
					<a href="/data/relationnetall/relationShow?priPID=${jbxx['ztdj'].datakeycontentForEncode}"
					target="_self"><input type="button" class="js-relation relation_net_a btn mr20" value="关系网查询"
						data-layout="circular"></a>
				</span>
			</c:if>
		</div>
		<div class="tabbale" data-component="tab">
			<div class="tab-header type-tab person-tab">
				<ul class="clearfix">
					<li class="tab-item"><span class="tab-item"><a
						href="<c:url value='/data/frdetail/djjbxx/${frwybs}'/>">基本信息<!-- （<span id="jbxx_Nm">0</span>） --></a></span>
					</li>
					<li class=""><span class="tab-item"><a
						href="<c:url value='/data/frdetail/zbyzc/${frwybs}'/>">资本与资产<!-- （<span id="zbzc_Nm">0</span>） --></a></span>
					</li>
					<li ><span class="tab-item"><a href="<c:url value='/data/frdetail/admission/${frwybs}'/>">许可、资质与荣誉<!-- （<span
						id="xkzz_Nm">0</span>） --></a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/tax/${frwybs}'/>">纳税、参保与缴费<!-- （<span
						id="nscb_Nm">0</span>） --></a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营<!-- （<span
						id="scjy_Nm">0</span>） --></a></span>
					</li>
					<li><span class=""><a
						href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法<!-- （<span
						id="xzzf_Nm">0</span>） --></a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息<!-- （<span
						id="sfxx_Nm">0</span>） --></a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
					</li>
					<li class="tab-selected"><span class="tab-selected"><a href="<c:url value='/data/frdetail/others/${frwybs}'/>">其他信息</a></span>
					</li>
					 
				</ul>
			</div>
			<div class="tab-content">
				<div class="tab-panel tab-panel-show">
				</div>

			</div>
		</div>
	</div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frDjjbxx_main.js'/>"></script>
</body>
</html>
