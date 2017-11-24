<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>关系路径</title>
   	<link rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>	
<div class="iframe-wrap bg-white">
	<div class="relative-network-wrap ">
	    <div class="relative-search">
	    	<form id="js-params" >
		        <input class="rs-input" type="text" name="companyName_1" value="" placeholder="请输入身份证号或法人名称">
		        <input class="rs-input" type="text" name="companyName_2" value="" placeholder="请输入身份证号或法人名称">
		        <a class="rs-btn-cx" href="javascript:;">查询</a>
		        <a class="rs-btn-add" href="javascript:;">关系企业</a>
		        <a href="javascript:addCompany();" class="relation u-add"></a>
		        <a href="javascript:removeCompany()" class="relation u-reduce"></a>
	        </form>
	    </div>
	    <div class="">
	        <p><span style="margin-left: 10px;">法定代表人关系: </span><span class="relation-arrow relation-arrow-color-fddbr">→</span>
	        <span style="margin-left: 35px;">股东关系：</span><span class="relation-arrow relation-arrow-color-fddbr2">→</span>
	        <span style="margin-left: 35px;">高管关系：</span><span class="relation-arrow relation-arrow-color-fddbr3">→</span>
	        <span style="float: right;color: #ff0000;">注：最多查询4个法人关系。</span></p>
	    </div>    
	</div>
	<!-- 关系路径 -->
	<div class="relative-data" id="relationChart" style="width:90%; height:500px; text-align: center;margin-top:50px;"></div>


</div>
<jsp:include page="../../common/common.jsp"/>	
<script type="text/javascript" src="/js/business/dataquery/relationPathQuery.js"></script>
</body>
</html>
