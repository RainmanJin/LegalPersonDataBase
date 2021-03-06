﻿<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>关联分析</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">
<link rel="stylesheet"
	href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
<link rel="stylesheet" href="/css/style.css">
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
</head>
<body>
	<div class="iframe-wrap">
		<div class="form-panel mb10">
			<form id="form_glfx" class="form-box clearfix">
				<div class="form-list">
					<div class="form-item clearfix">
						<div class="col-6" style="margin-top: 5px;">
							<label class="col-5 item-name text-right"
								style="font-size: initial;">部门名称：</label>
							<div class="col-6">
								<input type="text" id="datasrdep" class="form-control" name="datasrdep"
									placeholder="请输入部门名称支持模糊查询">
								<input type="hidden" id="dataType" name="dataType" value="0">
							</div>
						</div>
						<div class="col-4">
							<input id="entSearch" type="button" value="查询" class="btn mr20">
							<input id="entCancle" type="reset" value="重置" class="btn">
						</div>
					</div>
				</div>
			</form>
		</div>

		<div class="form-panel pd15">
			<div class="hx-searchForm-but center"
				style="padding-top: 0px !important; margin-bottom: 11px; text-align: left !important">
				<input id="allSearch" type="button" value="全部" class="btn-vf cur">
				<input id="weekSerach" type="button" value="近一周" class="btn-vf" >
				<input id="monthSerach" type="button" value="近一月" class="btn-vf">
			</div>
			<table id="tab_glfx" class="table-row nowrap" width="100%" >
				<thead>
					<tr>
						<th style="padding: 0 20px;">序号</th>
						<th>部门名称</th>
						<th>清洗库表名</th>
						<th>清洗库数据量</th>
						<th>清洗采用表名</th>
						<th>已关联数量</th>
						<th>关联率</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<script src="<c:url value='/js/business/datagovern/relationAnalysis.js'/>"></script>
</body>
</html>
