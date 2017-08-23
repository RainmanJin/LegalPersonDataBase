<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">
<title>日志管理</title>
<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>"
	type="image/x-icon" />
<link rel="stylesheet"
	href="<c:url value='/css/vendor/bootstrap.min.css'/>">
<!-- <link rel="stylesheet" href="/css/style.css"> -->
<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
<script src="<c:url value='/js/lib/require.js'/>"></script>
<script src="<c:url value='/js/config.js'/>"></script>
</head>
<body>
	<div class="iframe-wrap">
		<div class="form-panel mb10">
			<div class="title">日志管理</div>
		</div>
		<div class="pd15">
            <table id="hx-table" class="table-row nowrap" width="100%">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>操作人</th>
                    <th>日志类型</th>
                    <th>请求地址</th>
                    <th>日志时间</th>
                    <th>备注</th>
                </tr>
                </thead>
            </table>
        </div>
	</div>
	<script src="<c:url value='/js/system/log/log_list.js'/>"></script>
</body>
</html>
