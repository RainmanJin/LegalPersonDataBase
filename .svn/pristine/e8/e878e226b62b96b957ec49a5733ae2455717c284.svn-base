<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>部门未入库统计</title>
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
						<label class="col-5 item-name text-right" id="ruku_stype">最近未上传时间段：</label>
						<div class="col-6">
							<div class="ipt-box">
								<select id="" name="">
									<option value="" selected="selected">全部</option>
									<option value="">从未入库</option>
									<option value="">近半年</option>
									<option value="">近3个月</option>
									<option value="">近1个月</option>
									<option value="">近1周</option>
								</select>
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
		<table id="tab_mltj" class="table-row nowrap" width="100%" style="display: none">
			<thead>
			<tr>
				<th style="padding: 0 20px;">序号</th>
				<th>部门名称</th>
				<th>最近未上传时间段</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<td>1</td>
				<td>省建设厅</td>
				<td>从未入库</td>
			</tr>
			<tr>
				<td>2</td>
				<td>省物价局</td>
				<td>近半年</td>
			</tr>
			<tr>
				<td>3</td>
				<td>省通信管理局</td>
				<td>近3个月</td>
			</tr>
			<tr>
				<td>4</td>
				<td>省卫生计生委</td>
				<td>近1个月</td>
			</tr>
			<tr>
				<td>5</td>
				<td>省气象局</td>
				<td>近1周</td>
			</tr>
			</tbody>
		</table>
	</div>
</div>
<script src="<c:url value='/js/business/datagovern/deptOutStroage.js'/>"></script>
</body>
</html>
