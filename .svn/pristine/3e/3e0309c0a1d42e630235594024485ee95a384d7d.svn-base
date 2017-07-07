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
    <title>法人基本信息查询</title>
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
                        <label class="col-6 item-name text-right" >法人名称：</label>
                        <div class="col-6">
                            <input type="text" name="LPname" id="LPname" class="form-control"
                                   value="${LPname}" placeholder="请输入法人名称（支持模糊查询）">
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="col-3 item-name text-right">统一社会信用代码：</label>
                        <div class="col-6">
                            <input type="text" name="TrustCode" id="TrustCode" class="form-control"
                                   value="${TrustCode}" >
                                
                        </div>
                    </div>
                </div>
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="col-6 item-name text-right">行业：</label>
                        <div class="col-6">
                            <div class="ipt-box">
                                <select id="Category" name="Category">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="col-3 item-name text-right">经营范围：</label>
                        <div class="col-6">
                            <input type="text" name="Range" id="Range" class="form-control"
                                   value="${Range}" placeholder="请输入关键词">
                        </div>
                    </div>
                </div>
                <div class="hx-searchForm-but center">
                    <input type="button" value="查询" class="btn mr20" id="search" >
                    <input type="reset" value="重置" class="btn" id="reset">
                </div>
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
<script src="/js/search/basicsearch/basicsearch_main.js"></script>
<script id="listTemplate" type="text/x-handlebars-template">
<table id="SearchTable" class="table-row nowrap" width="100%">
            <thead>
            <tr>
                
                <th>法人名称</th>
                <th>统一社会信用代码</th>
                <th>法定代表人</th>
                <th>成立日期</th>
                <th>行业</th>
                <th>存续状态</th>
            </tr>
            </thead>
  			<tbody>
{{#each list}}
			<tr>
        		
                <td>{{frmc}}</a></td>
                <td>{{tyxydm}}</td>
                <td>{{fddbr}}</td>
                <td>{{djrq}}</td>
                <td>{{hydm}}</td>
                <td>
				<c:if test="{{cxzt}} == '1'}">
                   存续
                </c:if>
              	<c:if test="{{cxzt}} == '2'}">
                    注销
				</c:if>
				<c:if test="{{cxzt}} == '3'}">
                    个转企
				</c:if>
</td>
  			</tr>
 {{/each}}
  </tbody>
</table>
</script>
</body>
</html>
