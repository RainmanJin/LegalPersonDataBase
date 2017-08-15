<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<style type="text/css">
		.dataTables_scrollHeadInner {
			width: 100% !important;
		}
	</style>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
	<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
	<meta charset="utf-8">
	<title>法人纳税参保缴费情况</title>
</head>
<body>
<jsp:include page="../../common/header.jsp?ref=detail"/>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<input type="hidden" id="errormsg" name="errormsg" value="${tax['error']}">
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">${tax['ztdj'].frmc}</span>
				<span class="icon-rectangle green fl mr10">${tax['ztdj'].cxzt}</span>
				<%-- <c:if test="${tax['ztdj'].cxzt == '存续'}">
					<span class="icon-rectangle green fl mr10">存续</span>
				</c:if>
				<c:if test="${tax['ztdj'].cxzt == '注销'}">
					<span class="icon-rectangle gray fl mr10">注销</span>
				</c:if>
				<c:if test="${tax['ztdj'].cxzt == '个转企'}">
					<span class="icon-rectangle blue fl mr10">个转企</span>
				</c:if>
				<c:if test="${tax['ztdj'].cxzt == '被列入经营异常名录和严重违法失信（黑名单）'}">
					<span class="icon-rectangle red fl mr10">被列入经营异常名录和严重违法失信（黑名单）</span>
				</c:if> --%>
			</div>
			<p>
				统一社会信用代码/注册号：${tax['ztdj'].tyxydm}
			</p>
		</div>
		<div class="tabbale">
			<div class="tab-header type-tab person-tab">
				<ul class="clearfix">
					<li class=""><span class="tab-item"><a
						href="<c:url value='/data/frdetail/djjbxx/${frwybs}'/> ">基本信息</a></span>
					</li>
					<li class=""><span class="tab-item"><a
						href="<c:url value='/data/frdetail/zbyzc/${frwybs}'/>">资本与资产</a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/admission/${frwybs}'/>">许可、资质与荣誉</a></span>
					</li>
					<li class="tab-selected"><span class="tab-item"><a
						href="<c:url value='/data/frdetail/tax/${frwybs}'/>">纳税、参保与缴费</a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
					</li>
					<li><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
					</li>
					<li><span class="tab-item"><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息</a></span>
					</li>
					<%-- <li><span class="tab-item"><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
					</li> --%>
				</ul>
			</div>
			<div class="tab-content">
				<div class="tab-panel tab-panel-show">
					<div class="light-info mt10 center pos-rel">
						<i id="table_gsswjf_icon" class="flex-icon"></i>国税税务交费情况
					</div>
					<table style="width:100%!important" id="table_gsswjf" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>税所属期</th>
							<th>国税应缴税额(元)</th>
							<th>国税实缴税额(元)</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>
					<div class="light-info mt10 center pos-rel">
						<i id="table_dsswjf_icon" class="flex-icon"></i>地税税务交费情况
					</div>
					<table style="width:100%!important" id="table_dsswjf" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>税款所属期起</th>
							<th>税款所属期止</th>
							<th>地税实缴税额(元)</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>
					<div class="light-info mt10 center pos-rel">
						<i id="table_fzch_icon" class="flex-icon"></i>纳税非正常户认定情况
					</div>
					<table style="width:100%!important" id="table_fzch" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>税务登记日期（国）</th>
							<th>非正常户认定日期（国）</th>
							<th>税务登记日期（地）</th>
							<th>非正常户认定日期（地）</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>

					<div class="light-info mt10 center pos-rel">
						<i id="table_sbgjj_icon" class="flex-icon"></i>社保公积金参保情况
					</div>
					<table style="width:100%!important" id="table_sbgjj" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>养老保险缴存人数</th>
							<th>医保缴存人数</th>
							<th>生育缴存人数</th>
							<th>工伤保险缴存人数</th>
							<th>失业保险缴存人数</th>
							<th>公积金缴存人数</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>

					<div class="light-info mt10 center pos-rel">
						<i id="table_cdhb_icon" class="flex-icon"></i>船东互保情况
					</div>
					<table style="width:100%!important" id="table_cdhb" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>投保单号</th>
							<th>互保船名</th>
							<th>保险起期</th>
							<th>保险止期</th>
							<th>被保人</th>
							<th>受益人</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>

					<div class="light-info mt10 center pos-rel">
						<i id="table_ydjf_icon" class="flex-icon"></i>用电缴费情况
					</div>
					<table style="width:100%!important" id="table_ydjf" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>用电量(度)</th>
							<th>用电金额(元)</th>
							<th>交费日期</th>
							<th>交费金额(元)</th>
							<th>欠电量(度)</th>
							<th>电费欠费时段</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>

					<div class="light-info mt10 center pos-rel">
						<i id="table_wxd_icon" class="flex-icon"></i>无线电频率占用费缴费情况
					</div>
					<table style="width:100%!important" id="table_wxd" class="table-row w100 nowrap"
					       width="100%" cellpadding="0" cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="5%">序号</th>
							<th>缴费年度</th>
							<th>应缴费额(元)</th>
							<th>已缴费额(元)</th>
						</tr>
						</thead>
					</table>
					<%--------------------------------------------------------------------------------------------%>
				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frTax.js'/>"></script>
</body>
</html>
