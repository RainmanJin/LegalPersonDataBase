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
    <title>生产经营</title>
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
                    <li class="tab-selected"><span class=""><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
                    </li>
					<li><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
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
                        <i class="flex-icon"></i>化学药品原料药制造
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>序号</th>
                                <th>委托加工药品通用名</th>
                                <th>药品受委托加工数量</th>
                                <th>药品加工委托方名称</th>
                                <th>药品加工受托方名称</th>
                                <th>药品加工期限</th>
                                <th>药品委托加工备案日期</th>
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
                        <i class="flex-icon"></i>医疗器械制造
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>生产许可/备案编号（委托方）</th>
                            <th>委托生产产品名称</th>
                            <th>产品注册号/备案号</th>
                            <th>委托期限</th>
                            <th>备案日期</th>
                            <th>备案部门</th>
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
                        <i class="flex-icon"></i>印刷委托书备案信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>委托印刷书的编号</th>
                            <th>委托印刷书（刊）名</th>
                            <th>产品注册号/备案号</th>
                            <th>书(刊)印刷委托书创建时间</th>
                            <th>出版单位办理时间</th>
                            <th>印刷企业办理时间</th>
                            <th>撤销委托书的时间</th>
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
                        <i class="flex-icon"></i>测绘与地理项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>委托单位</th>
                            <th>项目类型</th>
                            <th>项目开始时间</th>
                            <th>项目完工时间</th>
                            <th>项目金额</th>
                            <th>项目备案时间</th>
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
                        <i class="flex-icon"></i>国家知识产权软科学研究计划项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设单位、单位名称</th>
                            <th>项目编号</th>
                            <th>项目名称</th>
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
                        <i class="flex-icon"></i>国家重大科学仪器设备开发专项计划项目信息
                    </div>
                    <table id="metadata-table" class="table-row  nowrap" width="100%">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设单位、单位名称</th>
                            <th>项目名称</th>
                            <th>项目负责人</th>
                            <th>中央财政经费（万元）</th>
                            <th>项目实施周期（年）</th>
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
                        <i class="flex-icon"></i>国家重点新产品计划项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设单位、单位名称</th>
                            <th>项目编号</th>
                            <th>项目名称</th>
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
                        <i class="flex-icon"></i>交通建设项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>工程状态</th>
                            <th>项目类型</th>
                            <th>开工时间</th>
                            <th>交工时间</th>
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
                        <i class="flex-icon"></i>重大产业项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>行业地位</th>
                            <th>项目名称</th>
                            <th>项目年份</th>
                            <th>产业项目开工时间</th>
                            <th>竣工时间</th>
                            <th>总用地</th>
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
                        <i class="flex-icon"></i>企业投资项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设项目名称</th>
                            <th>主要建设内容及规模</th>
                            <th>建设起始时间</th>
                            <th>建设结束时间</th>
                            <th>项目总投资</th>
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
                        <i class="flex-icon"></i>社会发展项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>社会发展项目建设</th>
                            <th>建设工期</th>
                            <th>项目总投资</th>
                            <th>项目状态</th>
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
                        <i class="flex-icon"></i>中央投资项目信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>专项名称</th>
                            <th>计划建设内容与规模</th>
                            <th>项目总投资</th>
                            <th>项目状态</th>
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
                        <i class="flex-icon"></i>农业会展企业信息信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>参加会展记录</th>
                            <th>加入会展时间</th>
                            <th>农业产业化等级类型</th>
                            <th>主营产品类型</th>
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
                        <i class="flex-icon"></i>科技成果
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>科技成果名称</th>
                            <th>科技成果登记号</th>
                            <th>知识产权</th>
                            <th>成果公报内容</th>
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
                        <i class="flex-icon"></i>水利、环境和公共设施管理 废物治理
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>废物产生单位</th>
                            <th>废物接收单位</th>
                            <th>废物名称</th>
                            <th>废物数量</th>
                            <th>废物接收日期</th>
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
                        <i class="flex-icon"></i>慈善捐赠
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>捐赠项目名称</th>
                            <th>捐赠金额</th>
                            <th>受理单位</th>
                            <th>捐赠日期</th>
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
                        <i class="flex-icon"></i>上市信息
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>股票代码</th>
                            <th>上市日期</th>
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
                        <i class="flex-icon"></i>承建项目
                    </div>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>项目类别</th>
                            <th>社会发展项目建设内容</th>
                            <th>项目总投资</th>
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
