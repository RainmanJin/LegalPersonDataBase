<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>基本信息查询</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">

	<link rel="stylesheet"
	      href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
	<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
	<link rel="stylesheet" href="/css/style.css">
	<script src="/js/lib/laydate/laydate.js" type="text/javascript"
	        charset="utf-8"></script>
	<script src="/js/lib/require.js"></script>
	<script src="/js/config.js"></script>
</head>
<body>
<div class="iframe-wrap">
	<div class="form-panel mb10">
		<form id="search_form" class="form-box clearfix">
			<div class="form-list">
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="col-6 item-name text-right">法人名称：</label>
						<div class="col-6">
							<input type="text" name="LPname" id="LPname" class="form-control"
							       placeholder="请输入法人名称（支持模糊查询）">
						</div>
					</div>
					<div class="col-4">
						<label class="col-5 item-name text-right">统一社会信用代码：</label>
						<div class="col-6">
							<input type="text" name="TrustCode" id="TrustCode" class="form-control"
							       placeholder="请输入统一社会信用代码">

						</div>
					</div>
					<div class="col-4">
						<label class="col-3 item-name text-right">经营范围：</label>
						<div class="col-7">
							<input type="text" name="Range" id="Range" class="form-control"
							       placeholder="请输入关键词">
						</div>
					</div>
				</div>
				<div class="hx-searchForm-but center">
					<input type="button" value="查询" class="btn mr20" id="search">
					<input type="reset" value="重置" class="btn" id="reset">
				</div>
			</div>
		</form>
	</div>
	<div class="form-panel pd15">
		<table id="search_table" class="table-row nowrap" width="100%">
			<thead>
			<tr>
				<th>序号</th>
				<th>法人名称</th>
				<th>法人唯一标识</th>
				<th>法定代表人</th>
				<th>成立日期</th>
				<th>行业</th>
				<th>存续状态</th>
			</tr>
			</thead>
		</table>
	</div>
</div>
<script src="/js/search/basicsearch/basicsearch.js"></script>
</body>
</html>
