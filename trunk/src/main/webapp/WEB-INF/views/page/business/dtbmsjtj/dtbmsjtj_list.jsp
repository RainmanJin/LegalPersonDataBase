<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<title>法人基本信息查询</title>
	<link rel="stylesheet" href="/css/style.css">
	<link rel="stylesheet" href="<c:url value='/js/lib/pagination/pagination.css'/>">
</head>
<body style="background-color: #f4f4f4">
<div class="iframe-wrap">
	<div class="form-panel mb10">

	</div>

	<div class="js-template">
	</div>
</div>
<!-- 分页 -->
<div id="js-pagination" class="pagination pagination-custom" style="position:relative;">
	<!-- <hr class="mt20"> -->
	<div id="pagination" class="pagination"></div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dtbmsjtj/dtbmtjsj_main.js'/>"></script>
<script id="listTemplate" type="text/x-handlebars-template">
	<table id="SearchTable" class="table-row nowrap" width="100%">
		<thead>
		<tr>

			<th width='30%'>部门名称</th>
			<th width='30%'>信息目录</th>
			<th width='10%'>清洗库数量</th>
			<th width='10%'>法人库数量</th>
			<th width='10%'>采用率</th>

		</tr>
		</thead>
		<tbody>
		{{#each list}}
		<tr>

			<td>{{bmmc}}</a></td>
			<td>{{zwbm}}</td>
			<td>{{qxksl}}</td>
			<td>{{frksl}}</td>
			<td>{{ppbl}}%</td>

		</tr>

		{{/each}}
		</tbody>
		<tfoot>
		<tr>
			<th>合计</th>
			<th>-</th>
			<th></th>
			<th></th>
			<th>-</th>


		</tr>
		</tfoot>
	</table>

	</body>
	</html>
