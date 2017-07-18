<%--
  Created by IntelliJ IDEA.
  User: dxh
  Date: 2017/6/29
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>资本与资产查询</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="<c:url value='/js/lib/pagination/pagination.css'/>">
</head>
<body style="background-color: #f4f4f4">
<div class="iframe-wrap">
    <div class="form-panel mb10">
        <form id="search_form" class="form-box clearfix">
            <div class="form-list">
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="col-6 item-name text-right" >行政许可名称：</label>
                        <div class="col-5">
                            <input type="text" name="AdmissionName" id="AdmissionName" class="form-control"
                                   value="${AdmissionName}" placeholder="请输入行政许可名称">
                        </div>
                    </div>
                      <div class="col-6">
                        <label class="col-2 item-name text-right">行政许可内容：</label>
                        <div class="col-5"><input type="text" name="AdmissionContent" id="AdmissionContent" class="form-control"
                                   value="${AdmissionContent}" placeholder="请输入行政许可内容">
                            </div>
                        </div>
                    </div>
                    
                </div>
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="col-6 item-name text-right">资质名称：</label>
                        <div class="col-5">
                            <input type="text" name="QualificationName" id="QualificationName" class="form-control"
                                   value="${QualificationName}" placeholder="请输入资质名称">
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="col-2 item-name text-right">荣誉名称：</label>
                        <div class="col-5">
                            <input type="text" name="AwardtName" id="AwardtName" class="form-control"
                                   value="${AwardtName}" placeholder="请输入荣誉名称">
                        </div>
                    </div>
                </div>
                <div class="hx-searchForm-but center">
                    <input type="button" value="查询" class="btn mr20" id="search" >
                    <input type="reset" value="重置" class="btn" id="reset">
                </div>
        </form>
            </div>
    <div class="js-template">
        </div>

    </div>
    <!-- 分页 -->
    <div id="js-pagination" class="pagination pagination-custom" style="position:relative;">
        <hr class="mt20">
        <div id="pagination" class="pagination"></div>
    </div>
<jsp:include page="../../common/common.jsp"/>
<script src="/js/search/AdmissionSearch/admissionsearch_main.js"></script>
<script id="listTemplate" type="text/x-handlebars-template">
<table id="SearchTable" class="table-row nowrap" width="100%">
            <thead>
            <tr>
                <th>法人名称</th>
                <th>统一社会信用代码</th>
                <th>法定代表人</th>
                <th>成立日期</th>
                <th>行业</th>
                <th>行政许可名称</th>
				<th>资质名称</th>
            </tr>
            </thead>
  			<tbody>
{{#each list}}
			<tr>
        		
                <td><a target="_blank" href="<c:url value="/data/frdetail/admission/{{frwybs}}"/>">{{frmc}}</a></td>
                <td>{{tyxydm}}</td>
                <td>{{fddbr}}</td>
                <td>{{djrq}}</td>
                <td>{{hy_content}}</td>
				<td>{{xlmc}}</td>
				<td>{{zzmc}}</td>
  			</tr>
 {{/each}}
  </tbody>
</table>
</script>
</body>
</html>
