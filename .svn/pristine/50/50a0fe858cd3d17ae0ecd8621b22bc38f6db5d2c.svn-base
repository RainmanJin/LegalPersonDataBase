<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>部门已入库统计</title>
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
			<form id="form_mltj" class="form-box clearfix">
				<div class="form-list">
					<div class="form-item clearfix">
						<div class="col-5">
							<label class="col-5 item-name text-right">部门：</label>
							<div class="col-6">
								<input type="text" id="dept_name" class="form-control" name=""
									placeholder="支持模糊查询">
							</div>
						</div>
						<div class="col-5">
							<label class="col-5 item-name text-right">统计日期：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt " onclick="laydate()"
										id="ruku_startTime" name="startTime" readonly="true">
								</div>
								<span class="col-05 item-line">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt clx " onclick="laydate()"
										id="ruku_endTime" name="endTime" readonly="true">
								</div>
							</div>
						</div>

					</div>
					<div class="hx-searchForm-but center">
						<input id="entSearch" type="button" value="查询" class="btn mr20">
						<input id="entCancle" type="reset" value="重置" class="btn">
					</div>
				</div>
			</form>
		</div>

		<div class="form-panel pd15">
			<table id="tab_mltj" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th style="padding: 0 20px;">序号</th>
						<th>部门名称</th>
						<th>入库数量（条）</th>
						<th>入库数据表数量（个）</th>
						<th>统计日期</th>
					</tr>
					<tr>
						<td>1</td>
						<td>省质监局</td>
						<td>1000</td>
						<td>2</td>
						<td>2017-08-30</td>
					</tr>
					<tr>
						<td>2</td>
						<td>省财政厅</td>
						<td>800</td>
						<td>1</td>
						<td>2017-08-30</td>
					</tr>
					<tr>
						<td>3</td>
						<td>省编办</td>
						<td>600</td>
						<td>2</td>
						<td>2017-08-29</td>
					</tr>
					
					<tr>
						<td>4</td>
						<td>省质监局</td>
						<td>400</td>
						<td>2</td>
						<td>2017-08-29</td>
					</tr>
					<tr>
						<td>5</td>
						<td>省通信管理局</td>
						<td>200</td>
						<td>2</td>
						<td>2017-08-28</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<script src="<c:url value='/js/business/dataquery/frProduce.js'/>"></script>
</body>
</html>
