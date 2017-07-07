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
    <title>法人资本与资产</title>
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
                    <li class="tab-selected"><span class="tab-item"><a href="<c:url value='/data/frdetail/admission/${frwybs}'/>">许可、资质与荣誉</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/tax/${frwybs}'/>">纳税、参保与缴费</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
                    </li>
                </ul>
            </div>
            <div class="tab-content">
                <div class="tab-panel tab-panel-show">
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>基本资产情况汇总
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>注册资本</th>
                                <th>车辆数量</th>
                                <th>房屋数量</th>
                                <th>拖拉机数量</th>
                                <th>船舶数量</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>${zbyzc['ztdj'].zczb}</td>
                                <td>${zbyzc['clsl']}</td>
                                <td>${zbyzc['fwsl']}</td>
                                <td>${zbyzc['tljsl']}</td>
                                <td>${zbyzc['cbsl']}</td>
                            </tr>
                        </tbody>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>股东及出资信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>股东名称</th>
                            <th>股东类型</th>
                            <th>认缴出资额</th>
                            <th>认缴出资比例</th>
                            <th>认缴出资时间</th>
                            <th>实缴出资额</th>
                            <th>实缴出资比例</th>
                        </tr>
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
                        <i class="flex-icon"></i>股权变更情况
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>投资人</th>
                            <th>股权转让额</th>
                            <th>转让前股权比例</th>
                            <th>转让后股权比例</th>
                            <th>股权转让日期</th>
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


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>股权出质情况
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>股权出质人</th>
                            <th>股权质权人</th>
                            <th>股权出质数额</th>
                            <th>股权出质登记日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="gqxx" varStatus="status" items="${zbyzc['gqxx']}">
                            <c:if  test="${!empty gqxx.czCzr}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${gqxx.czCzr}</td>
                                <td>${gqxx.czZqr}</td>
                                <td>${gqxx.czSe}</td>
                                <td><fmt:formatDate value="${gqxx.czDjrq}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                            </c:if>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>股权冻结情况
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>股权冻结执行法院</th>
                            <th>股权冻结执行裁定书文号</th>
                            <th>股权冻结执行事项</th>
                            <th>股权冻结被执行人</th>
                            <th>股权冻结期限自</th>
                            <th>股权冻结期限至</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="gqxx" varStatus="status" items="${zbyzc['gqxx']}">
                            <c:if  test="${!empty gqxx.djBzxr}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${gqxx.djZxfy}</td>
                                <td>${gqxx.djCdwh}</td>
                                <td>${gqxx.djZxsx}</td>
                                <td>${gqxx.djBzxr}</td>
                                <td><fmt:formatDate value="${gqxx.djQxqs}" pattern="yyyy年MM月dd日"/></td>
                                <td><fmt:formatDate value="${gqxx.djQxjz}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                            </c:if>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>不动产查封信息
                    </div>
                    <table id="metadata-table" class="table-row  nowrap" width="100%">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>房屋所有权人</th>
                            <th>房屋所有权登记时间</th>
                            <th>房屋查封文号</th>
                            <th>房屋查封申请日期</th>
                            <th>申请房屋查封单位</th>
                            <th>查封状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="bdccfxx" varStatus="status" items="${zbyzc['bdccfxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${bdccfxx.fwsyqr}</td>
                                <td><fmt:formatDate value="${bdccfxx.fwsyqdjsj}" pattern="yyyy年MM月dd日 HH时mm分ss秒"/></td>
                                <td>${bdccfxx.whFwcf}</td>
                                <td><fmt:formatDate value="${bdccfxx.fwcfrq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${bdccfxx.sqfwcfdw}</td>
                                <td>${bdccfxx.ztFwcf}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>动产抵押信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>抵押人名称</th>
                            <th>抵押是否失效</th>
                            <th>抵押物</th>
                            <th>抵押日期</th>
                            <th>抵押金额</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="dcdyxx" varStatus="status" items="${zbyzc['dcdyxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${dcdyxx.dwmc}</td>
                                <td>${dcdyxx.dysfzx}</td>
                                <td>${dcdyxx.dyw}</td>
                                <td><fmt:formatDate value="${dcdyxx.dyrq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${dcdyxx.dyje}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>无形资产-知识产权信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>知识产权出质人</th>
                            <th>版权登记号</th>
                            <th>作品名称</th>
                            <th>作品类别</th>
                            <th>版权登记日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="zscqxx" varStatus="status" items="${zbyzc['zscqxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${zscqxx.syzmc}</td>
                                <td>${zscqxx.bqdjh}</td>
                                <td>${zscqxx.zpmc}</td>
                                <td>${zscqxx.zplb}</td>
                                <td>${zscqxx.bqdjrq}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>土地使用权信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>土地使用权登记日期</th>
                            <th>土地使用权登记状态</th>
                            <th>土地使用权使用年限</th>
                            <th>土地是否抵押</th>
                            <th>土地是否查封</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="tdsyqxx" varStatus="status" items="${zbyzc['tdsyqxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td><fmt:formatDate value="${tdsyqxx.syqdjrq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${tdsyqxx.qszt}</td>
                                <td>${tdsyqxx.syq_nx}</td>
                                <td>${tdsyqxx.bz_dy}</td>
                                <td>${tdsyqxx.bz_cf	}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>无形资产-采矿权
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>使用权所有者名称</th>
                            <th>采矿权证号</th>
                            <th>采矿权矿山名称</th>
                            <th>年开采规模</th>
                            <th>有效起始日期</th>
                            <th>有效到期日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="ckqxx" varStatus="status" items="${zbyzc['ckqxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${ckqxx.syzmc}</td>
                                <td>${ckqxx.ckqzh}</td>
                                <td>${ckqxx.ckqksmc}</td>
                                <td>${ckqxx.nkcgm}</td>
                                <td><fmt:formatDate value="${ckqxx.yxqsrq}" pattern="yyyy年MM月dd日"/></td>
                                <td><fmt:formatDate value="${ckqxx.yxdqrq}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>无形资产-林业使用权
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>使用权所有者名称</th>
                            <th>小地名</th>
                            <th>山林使用期</th>
                            <th>山林终止期</th>
                            <th>是否抵押</th>
                            <th>是否查封</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="lysyqxx" varStatus="status" items="${zbyzc['lysyqxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${lysyqxx.syzmc}</td>
                                <td>${lysyqxx.xdm}</td>
                                <td><fmt:formatDate value="${lysyqxx.slsyq}" pattern="yyyy年MM月dd日"/></td>
                                <td><fmt:formatDate value="${lysyqxx.slzzq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${empty lysyqxx.dyfs?'否':'是'}</td>
                                <td>${empty lysyqxx.cfjg?'否':'是'}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>其他资产-生物资产
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>养殖场名称</th>
                            <th>畜种</th>
                            <th>存栏量</th>
                            <th>商品畜存栏量</th>
                            <th>仔畜存栏量</th>
                            <th>母畜存栏量</th>
                            <th>公畜存栏量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="swzcxx" varStatus="status" items="${zbyzc['swzcxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${swzcxx.dwmc}</td>
                                <td>${swzcxx.czhong}</td>
                                <td>${swzcxx.cll}</td>
                                <td>${swzcxx.spcsl}</td>
                                <td>${swzcxx.zcsl}</td>
                                <td>${swzcxx.mcsl}</td>
                                <td>${swzcxx.gcsl}</td>
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
