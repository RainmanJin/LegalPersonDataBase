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
	<title>法人行政许可信息</title>
</head>
<body>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<div>${frwybs}</div>
</body>