<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>注册资本统计</title>
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
						<div class="col-6" style="margin-top: 5px;">
							<label class="col-5 item-name text-right"
								style="font-size: initial;">行业：</label>
							<div class="col-6">
								<input type="text" id="dept_name" class="form-control" name=""
									placeholder="请输入行业名称支持模糊查询">
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
			<table id="tab_mltj" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th style="padding: 0 20px;">序号</th>
						<th>行业</th>
						<th>企业数量</th>
						<th>注销企业数量</th>
					</tr>
				</thead>
				<tbody>
				
				    <tr>
						<td style="padding: 0 20px;">1</td>
						<td>农、林、牧、渔业</td>
						<td>6855976</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">2</td>
						<td>采矿业</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
					<tr>
						<td style="padding: 0 20px;">3</td>
						<td>制造业</td>
						<td>1085</td>
						<td>0</td>
					</tr>
				
				</tbody>
			</table>
		</div>
	</div>
	<script src="<c:url value='/js/business/datagovern/relationAnalysis.js'/>"></script>
</body>
</html>
