<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <meta charset="utf-8">
    <title>法人评价信息</title>
</head>
<body>
<jsp:include page="../../common/header.jsp?ref=detail"/>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<div class="iframe-wrap bg-white">
    <div class="pd15">
        <div class="reg-caption">
            <div class="title clearfix">
                <span class="name fl mr5">${zbyzc['ztdj'].frmc}</span>

                <c:if test="${zbyzc['ztdj'].cxzt == '1'}">
                    <span class="icon-rectangle green fl mr10">存续</span>
                </c:if>
                <c:if test="${zbyzc['ztdj'].cxzt == '2'}">
                    <span class="icon-rectangle gray fl mr10">注销</span>
                </c:if>
                <c:if test="${zbyzc['ztdj'].cxzt == '3'}">
                    <span class="icon-rectangle blue fl mr10">个转企</span>
                </c:if>
                <c:if test="${zbyzc['ztdj'].cxzt == '4'}">
                    <span class="icon-rectangle red fl mr10">被列入经营异常名录和严重违法失信（黑名单）</span>
                </c:if>
            </div>
            <p>
                统一社会信用代码/注册号：${zbyzc['ztdj'].tyxydm}
            </p>
        </div>
        <div class="tabbale">
            <div class="tab-header type-tab person-tab">
                                <ul class="clearfix">
                    <li class=""><span class="tab-item"><a href="<c:url value='/data/frdetail/djjbxx/${frwybs}'/> ">基本信息</a></span>
                    </li>
                    <li class=""><span class="tab-item"><a href="<c:url value='/data/frdetail/${frwybs}'/>">资本与资产</a></span>
                    </li>
                    <li ><span class="tab-item"><a href="<c:url value='/data/frdetail/admission/${frwybs}'/>">许可、资质与荣誉</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/tax/${frwybs}'/>">纳税、参保与缴费</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息</a></span>
                    </li>
                    <li class="tab-selected"><span class=""><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
                    </li>
                </ul>
            </div>
            <div class="tab-content">
                <div class="tab-panel tab-panel-show">
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>严重违法失信(黑名单)
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>列入黑名单日期</th>
                            <th>作出决定机关(列入黑名单)</th>
                            <th>移出严重违法失信企业名单原因</th>
                            <th>移出黑名单日期</th>
                            <th>作出决定机关(移出黑名单)</th>
                        </thead>
                        <tbody>
                        <c:forEach var="gdczxx" varStatus="status" items="${zbyzc['gdczxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${gdczxx.gd}</td>
                                <td>${gdczxx.gdLx}</td>
                                <td>${gdczxx.rjcze}</td>
                                <td>${gdczxx.rjczbl}</td>
                                <td><fmt:formatDate value="${gdczxx.rjczrq}" pattern="yyyy年MM月dd日 HH时mm分ss秒"/></td>
                                <td>${gdczxx.sjcze}</td>
                                <td>${gdczxx.sjczbl}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>异常经营名录
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>列入经营异常名录原因</th>
                            <th>列入经营异常名录日期</th>
                            <th>作出决定机关(列入异常名录)</th>
                            <th>移出经营异常名录原因</th>
                            <th>移出经营异常名录日期</th>
                            <th>作出决定机关(移出异常名录)</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="gqxx" varStatus="status" items="${zbyzc['gqxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${gqxx.tzr}</td>
                                <td>${gqxx.gqZre}</td>
                                <td>${gqxx.gqQrqbl}</td>
                                <td>${gqxx.gqQrhbl}</td>
                                <td><fmt:formatDate value="${gqxx.gqZrrq}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frZbyzc_main.js'/>"></script>
</body>
</html>
