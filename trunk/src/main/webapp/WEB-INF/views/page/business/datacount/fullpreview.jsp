<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>公共数据法人库</title>
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" href="/css/bigscreen/bigscreen.css">
</head>
<body>
<div class="zjs-wrap">
    <div class="zjs-bs-top">
        <div class="zjs-bs-title"></div>
    </div>

    <div class="zjs-bs-content clearfix">
        <%--左部区域--%>
        <div class="zjs-bs-left">
            <div class="zjs-top clearfix">
                <div class="zjs-sub-left">
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title01.png" alt=""></h4>
                        <ul class="all-num">
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ul>
                    </div>
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title02.png" alt=""></h4>
                        <ul class="data-pandect">
                            <li>数源单位<em></em></li>
                            <li>法人库采集量<em></em></li>
                            <li>法人库入库量<em></em></li>
                            <li>本周新增数据<em></em></li>
                            <li>当年新成立法人数量<em></em></li>
                            <li>当年注销法人数量<em></em></li>
                        </ul>
                    </div>
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title03.png" alt=""></h4>
                        <div id="amount" style="height: 140px;"></div>
                    </div>
                </div>
                <div class="zjs-sub-right mt-10">
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title05.png" alt=""></h4>
                        <div class="chart-border">
                            <i class="bd-left-top"></i>
                            <i class="bd-left-bottom"></i>
                            <i class="bd-right-top"></i>
                            <i class="bd-right-bottom"></i>
                            <div class="tip-box">
                                <span></span><em></em>
                            </div>
                            <div style="height:540px" id="fr-speard">

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%--数据整合--%>
            <div class="zjs-bottom">
                <div class="main-cont">
                    <h4 class="sub-title"><img src="/img/bigscreen/sub-title04.png" alt=""></h4>
                    <div class="data-merge" >
                        <ul style="padding-top:25px">
                            <li><em>01</em>省工商局-法定代表人信息<span class="right"></span></li>
                            <li><em>02</em>省民政厅-基金会登记<span class="right"></span></li>
                            <li><em>03</em>省民政厅-民非登记<span class="right"></span></li>
                            <li><em>04</em>省民政厅-社团登记注册<span class="right"></span></li>
                            <li><em>05</em>省编办-行政单位<span class="right"></span></li>
                            <li><em>06</em>省编办-事业单位<span class="right"></span></li>
                            <li><em>07</em>省司法厅-基层法律服务信息<span class="right"></span></li>
                            <li><em>08</em>省司法厅-公证机构基本信息<span class="right"></span></li>
                            <li><em>09</em>省司法厅-律师事务所信息<span class="right"></span></li>
                            <li><em>10</em>省工商局-企业基本信息<span class="right"></span></li>
                        </ul>
                        <div class="rel-map clearfix">
                            <div class="first-map fl" style="height: 240px"></div>
                            <div class="fl rel-txt">
                                <dl class="">
                                    <dt>基本信息<br/><br/>信息表</dt>
                                    <dd><span><em>主要人员</em>信息临时表</span><span><em>主要人员</em>信息表</span></dd>
                                    <dd><span><em>地址</em>信息临时表</span><span><em>地址</em>信息</span></dd>
                                    <dd><span><em>基本登记</em>信息临时表</span><span><em>基本登记</em>信息表</span></dd>
                                </dl>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <%--右部区域--%>
        <div class="zjs-bs-right">
            <div class="zjs-top clearfix">
                <div class="zjs-sub-left">
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title06.png" alt=""></h4>
                        <ul class="data-pandect short-bg">
                            <li>接口总量<em>11</em></li>
                            <li>共享调用数量<em>230673</em></li>
                            <li>本周调用数量<em>683</em></li>
                        </ul>
                    </div>
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title07.png" alt=""></h4>
                        <div style="height: 210px;" id="depart_top"></div>
                    </div>
                </div>
                <div class="zjs-sub-right">
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title09.png" alt=""></h4>
                        <div style="height:99px" id="area_num">
                        </div>
                    </div>
                    <div class="main-cont">
                        <h4 class="sub-title"><img src="/img/bigscreen/sub-title10.png" alt=""></h4>
                        <div style="height: 210px" id="inter_top"></div>
                    </div>
                </div>
            </div>
            <%--法人属性分类--%>
            <div class="zjs-bottom">
                <div class="main-cont">
                    <h4 class="sub-title"><img src="/img/bigscreen/sub-title08.png" alt=""></h4>
                    <div class="chart-border" style="height:420px" >
                        <i class="bd-left-top"></i>
                        <i class="bd-left-bottom"></i>
                        <i class="bd-right-top"></i>
                        <i class="bd-right-bottom"></i>
                        <div  id="fr_attr" style="height:420px">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
<!-- <script src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
<script src="/js/lib/echarts/echarts-all.js"></script> -->
<script src="/js/business/datacount/fullpreview.js"></script>
</body>
</html>