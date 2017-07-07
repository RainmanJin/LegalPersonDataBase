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
                    <div class="col-4">
                        <label class="col-6 item-name text-right" >股东：</label>
                        <div class="col-6">
                            <input type="text" name="ShareholderName" id="ShareholderName" class="form-control"
                                   value="${ShareholderName}" placeholder="请输入股东名称">
                        </div>
                    </div>
                      <div class="col-4">
                        <label class="col-6 item-name text-right">注册资本：</label>
                        <div class="col-6">
                            <div class="ipt-box col-575">
                                <input type="text" readonly="readonly" name="assetL" class="ipt-txt" id="assetL" value="${assetL}">
                            </div>
                            <span class="col-05 item-line">-</span>
                            <div class="ipt-box col-575">
                                <input type="text" readonly="readonly" name="assetH" class="ipt-txt clx" id="assetH" value="${assetH}">
                            </div>
                        </div>
                    </div>
                     <div class="col-4">
                        <label class="col-4 item-name text-right">车辆数量：</label>
                        <div class="col-6">
                            <input type="text" name="CarNum" id="CarNum" class="form-control"
                                   value="${CarNum}">
                        </div>
                    </div>
                    
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">船舶数量：</label>
                        <div class="col-6">
                            <input type="text" name="BoatNum" id="BoatNum" class="form-control"
                                   value="${BoatNum}">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">房屋数量：</label>
                        <div class="col-6">
                            <input type="text" name="HouseNum" id="HouseNum" class="form-control"
                                   value="${HouseNum}" >
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-4 item-name text-right">拖拉机数量：</label>
                        <div class="col-6">
                            <input type="text" name="TractorNum" id="TractorNum" class="form-control"
                                   value="${TractorNum}" >
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
                <th>注册资本</th>
                <th>股东</th>
                <th>认缴注册资本</th>
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
