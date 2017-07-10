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
    <title>行政执法信息</title>
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
                    <li class="tab-selected"><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
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
                        <i class="flex-icon"></i>行政处罚
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>执法部门名称</th>
                            <th>案件名称</th>
                            <th>被处罚对象类别</th>
                            <th>行政处罚权力事项名称</th>
                            <th>处罚日期</th>
                            <th>撤销处罚日期</th>
                            <th>撤销处罚的原因说明</th>
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
                        <i class="flex-icon"></i>行政强制
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>临时措施时间</th>
                            <th>解除临时措施时间</th>
                            <th>强制执行文号</th>
                            <th>强制执行内容</th>
                            <th>强制执行时间</th>
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
                        <i class="flex-icon"></i>重点监管
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>列入重点监管原因</th>
                            <th>监管内容</th>
                            <th>列入时间</th>
                            <th>监管机关</th>
                            <th>撤销时间</th>
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
                        <i class="flex-icon"></i>分类监管
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>评价类别</th>
                            <th>评价内容</th>
                            <th>评价结果</th>
                            <th>评价年度</th>
                            <th>评价依据</th>
                            <th>评价机关</th>
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
                        <i class="flex-icon"></i>监督抽查
                    </div>
                    <table id="metadata-table" class="table-row  nowrap" width="100%">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>被抽查单位</th>
                            <th>抽查测绘项目名称</th>
                            <th>检验报告日期</th>
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
                        <i class="flex-icon"></i>监督抽查不合格记录
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>被抽查食品名称</th>
                            <th>被抽查药品名称</th>
                            <th>检验结论</th>
                            <th>抽查日期</th>
                            <th>抽查任务下达单位</th>
                            <th>不合格测绘项目名称</th>
                            <th>不合格记录检验报告日期</th>
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
                        <i class="flex-icon"></i>机构年检
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>年检年度</th>
                            <th>年检（年度报告）</th>
                            <th>评估情况</th>
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
                        <i class="flex-icon"></i>企业年报
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>年报年度</th>
                            <th>年度报告日期</th>
                            <th>年度报告状态</th>
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
                        <i class="flex-icon"></i>劳动保障书面审查
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>书面审查年度</th>
                            <th>评定等级</th>
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
                        <i class="flex-icon"></i>无线电台（站）年检
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>无线电台（站）年检</th>
                            <th>年检结果</th>
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
                        <i class="flex-icon"></i>监测监控
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>站点名称</th>
                            <th>监测时间</th>
                            <th>监测指标</th>
                            <th>监测结果</th>
                            <th>达标情况</th>
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
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>窃电记录
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>用电户名</th>
                            <th>窃电量</th>
                            <th>窃电时段</th>
                            <th>窃电总额</th>
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
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>事故信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>事故发生时间</th>
                            <th>事故类型</th>
                            <th>事故原因</th>
                            <th>死亡人数</th>
                            <th>重伤人数</th>
                            <th>财产损失</th>
                            <th>事故简要情况</th>
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
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>隐患记录
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>存在重大安全隐患内容</th>
                            <th>认定时间</th>
                            <th>认定依据</th>
                            <th>认定机构</th>
                            <th>销案时间</th>
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
