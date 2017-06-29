<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>法人库数据清洗监控中心</title>
    <link rel="stylesheet" href="/css/frk.css">
</head>
<body class="bg-white">
<div class="wrap2 clearfix">
    <div class="inner-top">
        <h2 class="h2-title">法人库数据清洗监控中心</h2>
        <div class="data js-data-week"></div>
    </div>
    <div class="wrap-l bg-blue mr10">
        <h3 class="title"><i class="daily-task-icon"></i>每日任务情况统计</h3>
        <!-- 每日任务数统计 -->
        <div id="main1" class="main1"></div>
        <!-- 每日处理流量 -->
        <div id="main2" class="main2"></div>
        <!-- 读入读出情况 -->
        <div id="main3" class="main3"></div>
    </div>
    <div class="wrap-c mr10">
        <div class="bg-blue clearfix mb10">
            <h3 class="title"><i class="legal-person-num-icon"></i>法人数量动态统计</h3>
            <div class="l">
                <!-- 法人数量动态统计 -->
                <div>
                    <div class="person-number-wrap js-person-number">
                        <ul>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                            <li></li>
                        </ul>
                        <div class="unit">户</div>
                    </div>
                </div>
                <div class="fl">
                    <!-- 企业类型总体分布 -->
                    <div id="main4" class="main4"></div>
                </div>
                <div class="fl">
                    <!-- 当月新增企业类型分布 -->
                    <div id="main5" class="main5"></div>
                </div>
            </div>
            <div class="r">
                <!-- 每周新增法人数量 -->
                <div id="main6" class="main6"></div>
            </div>
        </div>
        <div class="bg-blue clearfix mb10">
            <h3 class="title"><i class="handle-task-num-icon"></i>处理任务条数统计</h3>
            <!-- 处理任务条数统计 -->
            <div id="main7" class="fl main7"></div>
            <!-- 累计处理条数 -->
            <div class="fl cumulative-number">
                <div class="clearfix mb10">
                    <h3>累计处理条数</h3>
                    <div class="total"></div>
                </div>
                <div class="right-title">正确条数</div>
                <div class="error-title">错误条数</div>
                <div class="percentage-block mb10">
                    <div class="right"></div>
                    <div class="error"></div>
                </div>
                <div class="sum-flow list"><span class="txt">总处理流量</span><span class="num fr"></span></div>
                <div class="average list"><span class="txt">平均处理流量</span><span class="num fr"></span></div>
                <div class="sum-time list"><span class="txt">总处理时间</span><span class="num fr"></span></div>
            </div>
        </div>
        <div class="bg-blue">
            <!--  任务耗时分布统计 -->
            <div class="data-quality-box js-data-quality">
                <h3 class="title"><i class="task-time-icon"></i>任务耗时分布统计
                </h3>
                <div class="data-quality-chart js-data-quality-chart clearfix">
                    <div class="l"><span class="vc">1分钟内：<span class="l-num"></span></span></div>
                    <div class="c"><span class="vc">1-5分钟：<span class="c-num"></span></span></div>
                    <div class="r">
                        <div class="t"><span class="vc">5-10分钟：<span class="rt-num"></span></span></div>
                        <div class="b"><span class="vc">10分钟以上：<span class="rb-num"></span></span></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="wrap-r">
        <div class="bg-blue mb10">
            <h3 class="title"><i class="cur-processing-icon"></i>当前处理任务：<span class="current-task-title"></span></h3>
            <!-- 当前处理任务 -->
            <div class="task-progress-chart">
                <div class="next-task">
                    <div>下一项任务：<span class="next-task-title"></span></div>
                    <div>预计待启动时间：<span class="next-task-time">24</span>秒后</div>
                </div>
                <div class="task-progress-block">
                    <div class="progress-bar-title">总进度</div>
                    <div class="progress-bar">
                        <div class="percent total-percent"></div>
                        <div class="progressel-time"></div>
                        <div class="progressed"></div>

                    </div>
                    <div class="progress-bar-title">当前任务</div>
                    <div class="progress-bar">
                        <div class="percent cur-percent"></div>
                        <div class="time sub-time"></div>
                        <div class="progressed progressed2"></div>
                    </div>
                </div>
                <div class="task-table-wrap">
                    <table class="task-table js-task-table">
                        <thead>
                        <th>序号</th>
                        <th>任务名</th>
                        <th>开始执行<br/>时间</th>
                        <th>写入<br/>数量</th>
                        <th>读出<br/>数量</th>
                        <th>耗时</th>
                        <th>写入<br/>速度</th>
                        <th>失败<br/>数量</th>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="bg-blue">
            <h3 class="title"><i class="cur-processing-gather-icon"></i>当前处理任务集合</h3>
            <div class="task-progress-gather-chart">
                <div class="progress-tips">
                    <div class="clearfix">
                        <div class="item fl">当前集合总任务数：<span class="process-sum"></span></div>
                        <div class="item fr">已处理：<span class="processed-num"></span></div>
                    </div>
                    <div class="item">当前集合已处理时间：<span class="processed-time"></span>分钟</div>
                </div>
                <!-- 当前处理任务集合 -->
                <div id="main8" class="main8"></div>
            </div>
        </div>
    </div>
</div>
<script src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
<script src="/js/lib/echarts//echarts.min.js"></script>
<%--<script src="/js/lib/echarts//myecharts.js"></script>--%>
<script>
    var time = 60000;

    /**
     * echart配置
     */
    function chart(options) {
        var myChart = echarts.init(document.getElementById(options.el));
        myChart.showLoading();
        var opt;
        $.get(options.url + "?timestamp=" + new Date().getTime(), function (data) {
                    myChart.hideLoading();
                    if (options.el == "main8") {
                        opt = {
                            grid: {
                                top: 20,
                                left: '3%',
                                right: '4%',
                                bottom: '20',
                                containLabel: true
                            },
                            title: {
                                show: false
                            },
                            xAxis: {
                                data: data.data.line.categories,
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                }
                            },
                            yAxis: {
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                },
                                splitLine: { //坐标轴在 grid 区域中的分隔线
                                    lineStyle: {
                                        color: ['#182659']
                                    }
                                }
                            },
                            series: [{
                                // 根据名字对应到相应的系列
                                type: 'bar',
                                barWidth: 70,
                                color: ['#0066cc'],
                                label: {
                                    normal: { //柱形图上方的文字
                                        show: true,
                                        position: 'top',
                                        textStyle: {
                                            color: '#87a5ff'
                                        }
                                    }
                                },
                                markLine: {
                                    data: [
                                        {
                                            type: 'average', name: '平均值', lineStyle: {
                                            normal: {
                                                color: "blue"
                                            }
                                        }
                                        }
                                    ],
                                    symbol: ['circle', 'triangle']//symbol标线两端的标记类型
                                },
                                data: data.data.line.data.map(function (item) {
                                return item
                            }),
                            }]
                        }
                    }
                    else if (options.el == "main7") {
                        opt = {
                            grid: {
                                top: 10,
                                left: '3%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            tooltip: {},
                            color: ['#33ccff'],
                            xAxis: {
                                data: data.data.line.categories.map(function (item) {
                                    return item
                                }),
                                axisLabel: {  //坐标轴刻度标签的显示间隔
                                    interval: 1
                                },
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                }
                            },
                            yAxis: {
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                },
                                splitLine: { //坐标轴在 grid 区域中的分隔线
                                    lineStyle: {
                                        color: ['#182659']
                                    }
                                }
                            },
                            series: [{
                                // 根据名字对应到相应的系列
                                name: '任务数',
                                type: 'bar',
                                barWidth: 28,
                                markLine: {
                                    data: [
                                        {
                                            type: 'average', name: '平均值', lineStyle: {
                                            normal: {
                                                color: "blue"
                                            }
                                        }
                                        }
                                    ],
                                    symbol: ['circle', 'triangle']//symbol标线两端的标记类型
                                },
                                data: data.data.line.data.map(function (item) {
                                    return item
                                }),
                            }]
                        }
                    }
                    else if (options.el == "main6") {
                        opt = {
                            title: {
                                text: '每周新增法人数量',
                                left: 'center',
                                textStyle: {
                                    fontSize: '14px',
                                    color: "#fff"
                                }
                            },
                            tooltip: {},
                            grid: {
                                top: 38,
                                left: '20%',
                                right: '4%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis: {
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                },
                                splitLine: {
                                    show: false
                                },
                                axisTick: {
                                    show: false
                                },
                                axisLabel: {
                                    show: false
                                }
                            },
                            yAxis: {
                                type: 'category',
                                boundaryGap: false,
                                data: data.data.line.map(function (item) {
                                    return item[0];
                                }),
                                axisLine: {onZero: false},
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    }
                                },
                                axisTick: {
                                    show: false
                                }
                            },
                            series: [
                                {
                                    type: 'line',
                                    smooth: true,
                                    data: data.data.line.map(function (item) {
                                        return item[1];
                                    }),
                                    itemStyle: {
                                        normal: {
                                            color: '#3399ff',
                                        }
                                    },
                                    lineStyle: {
                                        normal: {
                                            width: '2'
                                        }
                                    },

                                }
                            ]
                        }
                    }
                    else if (options.el == "main5") {
                        opt = {
                            title: {
                                text: '当月新增企业类型分布',
                                textStyle: {
                                    fontSize: 14,
                                    color: "#fff",
                                    fontWeight: 'normal'
                                },
                                left: 'center'
                            },
                            tooltip: {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            color: ['#3399ff', '#ff6666', '#00cc00'],
                            legend: {
                                orient: 'horizontal',
                                left: 'center',
                                bottom: 0,
                                width: 210,
                                itemWidth: 8,
                                itemHeight: 8,
                                data: data.data.pie2.map(function (item) {
                                    return item.name
                                }),
                                textStyle: {
                                    color: '#48516c',
                                }
                            },
                            calculable: false,
                            series: [
                                {
                                    name: '访问来源',
                                    label: {
                                        normal: {
                                            position: 'inner',
                                            formatter: '{d}%'
                                        }
                                    },
                                    type: 'pie',
                                    radius: '70%',
                                    center: ['50%', '82px'],
                                    data: data.data.pie2.map(function (item) {
                                        return item
                                    }),
                                    itemStyle: {
                                        emphasis: {
                                            shadowBlur: 10,
                                            shadowOffsetX: 0,
                                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                                        }
                                    }
                                }
                            ]
                        }
                    }
                    else if (options.el == "main4") {
                        opt = {
                            title: {
                                text: '企业类型总体分布',
                                textStyle: {
                                    fontSize: 14,
                                    color: "#fff",
                                    fontWeight: 'normal'
                                },
                                left: 'center'
                            },
                            tooltip: {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            color: ['#3399ff', '#ff6666', '#00cc00'],
                            legend: {
                                orient: 'horizontal',
                                left: 'center',
                                bottom: 0,
                                width: 210,
                                itemGap: 2,
                                itemWidth: 8,
                                itemHeight: 8,
                                data: data.data.pie1.map(function (item) {
                                    return item.name
                                }),
                                textStyle: {
                                    color: '#48516c',
                                }
                            },
                            series: [
                                {
                                    name: '访问来源',
                                    label: {
                                        normal: {
                                            position: 'inner',
                                            formatter: '{d}%'
                                        }
                                    },
                                    type: 'pie',
                                    radius: '70%',
                                    center: ['50%', '82px'],
                                    data: data.data.pie1.map(function (item) {
                                        return item
                                    }),
                                    itemStyle: {
                                        emphasis: {
                                            shadowBlur: 10,
                                            shadowOffsetX: 0,
                                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                                        }
                                    }
                                }
                            ]
                        }
                    }
                    else if (options.el == "main3") {
                        opt = {
                            grid: {
                                top: 48
                            },
                            title: {
                                text: '读入读出情况(万)',
                                left: 'center',
                                textStyle: {
                                    color: '#fff',
                                    fontSize: 14,
                                    fontWeight: 'normal'
                                }
                            },
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                                    type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                },
//                                formatter: '{a}: {b}<br />{c}'
                            },
                            color: ['#3399ff', '#5d20cf', '#00ffff'],
                            legend: {
                                top: '30px',
                                right: '0',
                                data: [{
                                    name: '读出',
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                }, {
                                    name: '读入',
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                }, {
                                    name: '读写速度',
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                }
                                ]
                            },
                            grid: {
                                left: '3%',
                                right: '6%',
                                bottom: '3%',
                                containLabel: true
                            },
                            xAxis: [
                                {
                                    type: 'value',
                                    axisLabel: {
                                        textStyle: {
                                            color: '#87a5ff'
                                        }
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#596388'
                                        },
                                    },
                                    splitLine: { //坐标轴在 grid 区域中的分隔线
                                        show: true,
                                        lineStyle: {
                                            color: ['#182659']
                                        }
                                    }
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'category',
                                    axisTick: {show: false},
                                    data: data.data.map(function (item) {
                                        var str = item.taskTime;
                                        var m = str.substr(5, 2);
                                        if (m.substr(0, 1) == 0) {
                                            m = str.substr(6, 1);
                                        }
                                        var d = str.substr(8, 2);
                                        return m + '月' + d + '日'

                                    }),
                                    axisLabel: {
                                        textStyle: {
                                            color: '#87a5ff'
                                        }
                                    },
                                    axisLine: {
                                        lineStyle: {
                                            color: '#596388'
                                        }
                                    },
                                    splitLine: { //坐标轴在 grid 区域中的分隔线
                                        show: true,
                                        lineStyle: {
                                            color: ['#182659']
                                        }
                                    }
                                }
                            ],
                            series: [
                                {
                                    name: '读入',
                                    type: 'bar',
                                    stack: '总量',
                                    label: {
                                        normal: {
                                            show: true,
                                            position: 'top',
                                            textStyle: {
                                                color: '#87a5ff'
                                            }
                                        }
                                    },
                                    itemStyle: {
                                        normal: {
                                            barBorderRadius: [10, 10, 10, 10]
                                        }
                                    },
                                    barWidth: 4,
                                    data: data.data.map(function (item) {
                                        return item.taskWriteTotal/10000
                                    })
                                },
                                {
                                    name: '读出',
                                    type: 'bar',
                                    stack: '总量',
                                    label: {
                                        normal: {
                                            show: true,
                                            position: 'bottom',
                                            textStyle: {
                                                color: '#87a5ff'
                                            }
                                        }
                                    },
                                    barWidth: 4,
                                    data: data.data.map(function (item) {
                                        return item.taskReadTotal/10000
                                    })
                                },
                                {
                                    name: '读写速度',
                                    type: 'bar',
                                    label: {
                                        normal: {
                                            show: false
                                        }
                                    },
                                    barWidth: 17,
                                    data: data.data.map(function (item) {
                                        return item.taskWriteSpeed/10000
                                    })
                                }
                            ]
                        }
                    }
                    else if (options.el == "main2") {
                        opt = {
                            grid: {
                                top: 48,
                                bottom: 10,
                                left: '3%',
                                containLabel: true
                            },
                            title: {
                                text: '每日处理流量（M）',
                                left: 'center',
                                textStyle: {
                                    color: '#fff',
                                    fontSize: 14,
                                    fontWeight: 'normal'
                                }
                            },
                            tooltip: {
                                trigger: 'axis', //坐标轴触发,主要在柱状图，折线图等会使用类目轴的图表中使用
                                axisPointer: { //坐标轴指示器配置项
                                    type: 'cross',
                                    label: {
                                        backgroundColor: '#ccc',
                                        borderColor: '#aaa',
                                        borderWidth: 1,
                                        shadowBlur: 0,
                                        shadowOffsetX: 0,
                                        shadowOffsetY: 0,
                                        textStyle: {
                                            color: '#222'
                                        }
                                    }
                                }
                            },
                            xAxis: {
                                data: data.data.map(function (item) {
                                    return item.taskTime
                                }),
                                axisLabel: {},
                                splitLine: {
                                    show: false
                                },
                                boundaryGap: false,
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                }
                            },
                            yAxis: {
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                },
                                splitLine: {
                                    lineStyle: {
                                        color: ['#182659']
                                    }
                                }
                            },
                            series: [{
                                name: '日处理流量',
                                type: 'line',
                                showSymbol: false,
                                hoverAnimation: false,
                                markLine: {
                                    data: [
                                        {
                                            type: 'average',
                                            name: '平均值',
                                            lineStyle: {
                                                normal: {
                                                    color: "blue"
                                                }
                                            }
                                        }
                                    ]
                                },
                                itemStyle: {
                                    normal: {
                                        color: '#5820c7'
                                    }
                                },
                                lineStyle: {
                                    normal: {
                                        width: '4'
                                    }
                                },
                                data: data.data.map(function (item) {
                                    return item.taskFlow
                                }),
                            }]
                        }
                    }
                    else if (options.el == "main1") {
                        opt = {
                            grid: {
                                top: 48,
                                left: '3%',
                                right: '4%',
                                bottom: '10',
                                containLabel: true,
                            },
                            title: {
                                text: '每日任务数统计（万条数）',
                                left: 'center',
                                textStyle: {
                                    color: '#fff',
                                    fontSize: 14,
                                    fontWeight: 'normal'
                                }
                            },
                            tooltip: {
                            },
                            xAxis: {
                                data: data.data.map(function (item) {
                                    return item.taskTime
                                }),
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff',
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#5e688c'
                                    }
                                }
                            },
                            yAxis: {
                                axisLabel: {
                                    textStyle: {
                                        color: '#87a5ff'
                                    }
                                },
                                axisLine: {
                                    lineStyle: {
                                        color: '#596388'
                                    },
                                },
                                splitLine: { //坐标轴在grid区域中的分隔线
                                    lineStyle: {
                                        color: ['#182659']
                                    }
                                }
                            },
                            series: [{
                                // 根据名字对应到相应的系列
                                name: '任务数',
                                type: 'bar',
                                barWidth: 15,
                                barGap: '1%',
                                itemStyle: {
                                    normal: {
                                        color: '#5d20cf'
                                    }
                                },
                                markLine: {
                                    data: [
                                        {
                                            type: 'average',
                                            name: '平均值',
                                            lineStyle: {
                                                normal: {
                                                    color: "blue"
                                                }
                                            }
                                        }
                                    ],
                                    symbol: ['circle', 'triangle']//symbol标线两端的标记类型
                                },
                                data: data.data.map(function (item) {
                                    return item.taskWriteTotal/10000
                                }),
                            }]
                        }
                    }
                    myChart.setOption(option = opt);
                }
        );
    }

    /**
     * echart传参
     */
    function dailyTaskNumber() {
        chart({
            el: "main1",
            url: "/data/dtprocesslog/viewdaydbclearcount.json"
        });
    }
    function dailyProcessingFlow() {
        chart({
            el: "main2",
            url: "/data/dtprocesslog/viewdaydbclearcount.json"
        });
    }
    function readWriteSpeed() {
        chart({
            el: "main3",
            url: "/data/dtprocesslog/viewdaydbclearcount.json"
        });
    }
    function companyType() {
        chart({
            el: "main4",
            url: "/data/dtprocesslog/legalpersoncount.json"
        });
    }
    function newCompanyType() {
        chart({
            el: "main5",
            url: "/data/dtprocesslog/legalpersoncount.json"
        });
    }
    function newLegalPerson() {
        chart({
            el: "main6",
            url: "/data/dtprocesslog/legalpersoncount.json"
        });
    }
    function handleTaskNumber() {
        chart({
            el: "main7",
            url: "/data/dtprocesslog/taskprocesscount.json"
        });
    }
    function curTaskgather() {
        chart({
            el: "main8",
            url: "/data/dtprocesslog/currentprocesstask.json"
        });
    }


    /**
     * ajax请求
     */
    var defaultOpt = {
        async: true,
        dataType: 'json',
        type: 'get',
        cache: false,
        //serializable: false
    };

    function generateHttpParam(options) {
        var opt = $.extend({}, defaultOpt, options);
        opt.url = options.url;
        opt.success = function (data) {
            options.success && options.success(data);
        }
        opt.error = function (jqXHR, textStatus, errorThrown) {
            options.error && options.error(jqXHR, textStatus, errorThrown);
        }
        return opt;
    }

    function httpRequest(options) {
        var ajax = $.ajax(generateHttpParam(options));
    }


    /**
     * 获取当前日期时间及星期
     */
    function getNowFormatDate() {
        var show_day = new Array('星期一', '星期二', '星期三', '星期四', '星期五', '星期六', '星期日');
        var date = new Date();
        var seperator2 = ":";
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        var hour = date.getHours();
        var minute = date.getMinutes();
        var second = date.getSeconds();
        if (minute >= 1 && minute <= 9) {
            minute = "0" + minute;
        } else if (minute == 0) {
            minute = "00";
        }
        if (second >= 1 && second <= 9) {
            second = "0" + second;
        } else if (second == 0) {
            second = "00";
        }
        var day = date.getDay();
        var currentdate = year + "年" + month + "月" + strDate + "日"
                + " " + hour + seperator2 + minute
                + seperator2 + second + " " + show_day[day - 1];
        $('.js-data-week').text(currentdate);
    }


    /**
     * 法人数量动态统计
     */
    function legalPersonNumber() {
        httpRequest({
            url: "/data/datacount/TypeCounting.json",
            success: function (data) {
                var data = data.data.Sum.toString();
                var j = $(".js-person-number li").length;
                var l = j - data.length;
                var k = l - 1;
                for (var i = 0; i < j; i++) {
                    var item = data.charAt(i);
                    if (l < j) {
                        $(".js-person-number li").eq(l++).text(item);
                    }
                    else {
                        $(".js-person-number li").eq(k--).text("");
                    }
                }
            },
            error: function (jqXHR) {
                alert("出错");
            }
        });
    }


    /**
     * 累计处理条数
     */
    function handleNumeral() {
        httpRequest({
            url: "/data/dtprocesslog/taskprocesscount.json",
            success: function (data) {
                var total = $(".total");
                var rightnum = $(".percentage-block .right");
                var errornum = $(".percentage-block .error");
                var monthly = $(".monthly .num");
                var flow = $(".sum-flow .num");
                var average = $(".average .num");
                var time = $(".sum-time .num");

                var rightpre = parseInt(data.data.num2 / data.data.num1 * 100);
                var errorpre = 100 - rightpre;
                total.text(data.data.num1 + "条");
                rightnum.text(data.data.num2  + "条, " + rightpre + "%").css("width", rightpre + "%").attr("title", rightnum.text());
                errornum.text(data.data.num1  - data.data.num2 + "条, " + errorpre + "%").css("width", errorpre + "%").attr("title", errornum.text());

                monthly.text(data.data.num3 + "条");
                flow.text(data.data.num4 + "M");
                average.text(data.data.num5 + "M/S");
                time.text(data.data.num6 + "S");
            },
            error: function (jqXHR) {
                alert("出错");
            }
        });
    }


    /**
     * 任务耗时分布统计
     */
    function qualityComparison() {
        httpRequest({
            url: "/data/dtprocesslog/tasktimecount.json",
            success: function (data) {
                var lnum = $(".js-data-quality-chart .l-num");
                var cnum = $(".js-data-quality-chart .c-num");
                var rtnum = $(".js-data-quality-chart .rt-num");
                var rbnum = $(".js-data-quality-chart .rb-num");

                //total可能为0
                if(data.data[0]){
                    var lnumV = data.data[0].total;
                }else var lnumV = 0;

                if(data.data[1]){
                    var cnumV = data.data[1].total;
                }else var cnumV = 0;

                if(data.data[2]){
                    var rtnumV = data.data[2].total;
                }else var rtnumV = 0;

                if(data.data[3]){
                    var rbnumV = data.data[3].total;
                }else var rbnumV = 0;
                var numV = lnumV + cnumV + rtnumV + rbnumV;

                var lnumP = (lnumV / numV * 100).toFixed(2);
                var cnumP = (cnumV / numV * 100).toFixed(2);
                var rtnumP = (rtnumV / numV * 100).toFixed(2);
                var rbnumP = (rbnumV / numV * 100).toFixed(2);

                lnum.text(lnumP + "%");
                cnum.text(cnumP + "%");
                rtnum.text(rtnumP + "%");
                rbnum.text(rbnumP + "%");
            },
            error: function (jqXHR) {
                alert("出错");
            }
        });
    }


    /**
     * 当前处理任务和当前处理任务集合
     */
    function handleTask() {
        httpRequest({
            url: "/data/dtprocesslog/currentprocesstask.json",
            success: function (data) {
                $('.current-task-title').text(data.data.dtRwjdxx.dqrw);
                $('.next-task-title').text(data.data.dtRwjdxx.rwXxrw);
                $('.next-task-time').text(data.data.dtRwjdxx.rwYjsj - data.data.dtRwjdxx.rwDqyxsj);
                $('.total-percent').text(data.data.dtRwjdxx.rwZtjd + "%");
                $('.cur-percent').text(data.data.dtRwjdxx.rwDqjd + "%");
                $('.js-next-task-name').text(data.data.dtRwjdxx.rwXxrw);
                $('.progress-bar .progressed').css("width", data.data.dtRwjdxx.rwZtjd + "%");
                $('.progress-bar .progressed2').css("width", data.data.dtRwjdxx.rwDqjd + "%");


                $('.process-sum').text(data.data.currentProSum == null ? 0 : data.data.currentProSum);
                $('.processed-num').text(data.data.dtRwjdxx.rwXh == null ? 0 : data.data.dtRwjdxx.rwXh);
                $('.processed-time').text(data.data.dtRwjdxx.rwRwjhs == null ? 0 : data.data.dtRwjdxx.rwRwjhs / 60);


                var html2 = "";
                var l = data.data.dtProcessLogDtoList.length;
                for (var i = 0; i < l; i++) {
                    var html = "<tr><td>" + data.data.dtProcessLogDtoList[i].id + "</td><td>" + data.data.dtProcessLogDtoList[i].taskName + "</td><td>" + data.data.dtProcessLogDtoList[i].taskTime.slice(11) + "</td><td>" +
                            data.data.dtProcessLogDtoList[i].taskReadTotal + "</td><td>" + data.data.dtProcessLogDtoList[i].taskReadTotal + "</td><td>" + data.data.dtProcessLogDtoList[i].taskLong + "S</td><td>" + data.data.dtProcessLogDtoList[i].taskWriteSpeed + "R/S</td><td>" + data.data.dtProcessLogDtoList[i].taskFailTotal + "</td></tr>";
                    var html2 = html2 + html;
                }
                $("table tbody").html(html2);
            },
            error: function (jqXHR) {
                alert("出错");
            }
        });
    }

    dailyTaskNumber();
    dailyProcessingFlow();
    readWriteSpeed();
    companyType();
    newCompanyType();
    newLegalPerson();
    handleTaskNumber();
    curTaskgather();
    legalPersonNumber();
    handleNumeral();
    qualityComparison();
    handleTask();
    getNowFormatDate();

    setInterval(function () {
        dailyTaskNumber();
        dailyProcessingFlow();
        readWriteSpeed();
        companyType();
        newCompanyType();
        newLegalPerson();
        handleTaskNumber();
        curTaskgather();
        legalPersonNumber();
        handleNumeral();
        qualityComparison();
        handleTask();
    }, time);

    setInterval(function () {
        getNowFormatDate();
    }, 1000);

</script>
</body>
</html>