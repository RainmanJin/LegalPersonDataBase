<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>问题数据统计</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">
<link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
<link rel="stylesheet" href="/css/style.css">
<script src="/js/lib/laydate/laydate.js" type="text/javascript"charset="utf-8"></script>
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
</head>
<body>
	<div class="iframe-wrap">
		<div class="form-panel pd15">
			<table id="search_table" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th>序号</th>
						<th>部门名称</th>
						<th>表名称</th>
						<th>问题原因</th>
						<th>Bus Key</th>
						<th>更新时间</th>
					</tr>
				</thead>
			</table>
		</div>
	</div>
<script src="<c:url value='/js/business/dtbmsjtj/ProblemData.js'/>"></script>
</body>
</html>




