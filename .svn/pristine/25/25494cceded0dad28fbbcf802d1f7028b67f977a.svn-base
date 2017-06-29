<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>浙江省法人库可视化界面</title>
    <link rel="stylesheet" href="/css/frk.css">
</head>
<body>
<div class="visual-panel">
    <div class="inner-top">
        <h2 class="h2-title">浙江省法人库可视化界面</h2>
        <div class="date js-date-week"></div>
    </div>
    <div class="clearfix visual-main">
        <div class="col-3">
            <div class="l-panel1 box">
                <p><label>当年新注册法人数：</label><em class="light">5342</em><span class="light">家</span></p>
                <p><label>当年注销法人数：</label><em class="light">4435</em><span class="light">家</span></p>
            </div>
            <div class="l-panel2 mb10">
                <div class="panel-title">
                    法人类型数量分布
                </div>
                <div class="box">
                    <div id="amount">

                    </div>
                </div>
            </div>
            <div class="l-panel3">
                <div class="panel-title">
                    数据关联情况统计
                </div>
                <div class="box">
                    <div class="data-gl-box">
                        <div class="data-gl-img"></div>
                        <div class="data-item1">
                            <p>已入库法人数据量</p>
                            <p>231631</p>
                        </div>
                        <div class="data-item2 data-item">
                            <div class="line-radius"></div>
                            <div class="data">
                                <p>已关联数据表</p>
                                <p>451张</p>
                            </div>
                        </div>
                        <div class="data-item3 data-item">
                            <div class="line-radius"></div>
                            <div class="data">
                                <p>有效数据表</p>
                                <p>451张</p>
                            </div>
                        </div>
                        <div class="data-item4 data-item">
                            <div class="line-radius"></div>
                            <div class="data">
                                <p>源数据</p>
                                <p>1025张</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="m-panel1 ml10">
                <div class="fr-total-hd">
                    <div class="l-radius fr-radius"></div>
                    <div class="r-radius fr-radius"></div>
                </div>
                <div class="fr-total-box">
                    <span class="name">法人总数</span>
                    <div class="fr-total">
                        <i>0</i>
                        <i>0</i>
                        <i>2</i>
                        <i>3</i>
                        <i>1</i>
                        <i>6</i>
                        <i>3</i>
                        <i>1</i>
                    </div>
                </div>
            </div>
            <div class="m-panel2 ml10 mb10">
                <div class="panel-title">
                    业务数据沉淀量分类统计（条数）
                </div>
                <div class="box">
                    <div class="tj-list clearfix">
                        <div class="tj-item" style="width: 21.2%;background-color: #2a81d1;">
                            <p>基本信息</p>
                            <p>251463条</p>
                        </div>
                        <div class="tj-item" style="width: 15%;background-color: #06a59f">
                            <p>资本与资产</p>
                            <p>15247条</p>
                        </div>
                        <div class="tj-item" style="width: 13%;background-color: #773ce5;">
                            <p>许可、资质<br>与荣誉</p>
                            <p>13542条</p>
                        </div>
                        <div class="tj-item" style="width: 12%;background-color: #f2a500;">
                            <p>纳税、参保<br>与缴费</p>
                            <p>12513条</p>
                        </div>
                        <div class="tj-item" style="width: 10%;background-color: #189ad2;">
                            <p>生产经营</p>
                            <p>11542条</p>
                        </div>
                        <div class="tj-item" style="width: 9%;background-color: #50a616;">
                            <p>行政执法</p>
                            <p>10251条</p>
                        </div>
                        <div class="tj-item" style="width: 9%;background-color: #3077f2;">
                            <p>司法<br>信息</p>
                            <p>9983条</p>
                        </div>
                        <div class="tj-item" style="width: 8%;background-color: #f56622;">
                            <p>评价<br>信息</p>
                            <p>8867条</p>
                        </div>
                        <div class="tj-item" style="background-color: #4e5255;">
                            <p>其他</p>
                            <p>65条</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="m-panel3 ml10">
                <div class="panel-title">
                    部门数据交换情况汇总
                </div>
                <div class="box">
                    <div class="title"><label>交换累计条数：</label><em class="light">23333333</em><span class="light">条</span>
                    </div>
                    <div id="depart-data">

                    </div>
                </div>
            </div>
        </div>
        <div class="col-3">
            <div class="r-panel1 ml10 mb10">
                <div class="panel-title">
                    部门调用数量TOP10(条数)
                </div>
                <div class="box">
                    <div id="depart-top">

                    </div>
                </div>
            </div>
            <div class="r-panel2 ml10">
                <div class="panel-title">
                    部门调用法人类型维度
                </div>
                <div class="box">
                    <div id="depart-wd">

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
<script src="/js/lib/echarts//echarts.min.js"></script>
<script>

    pieAmount();
    departData();
    departTop();
    departWd();
    getNowFormatDate();
    //    getTjList();

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
        $('.js-date-week').text(currentdate);
    }

    //法人类型数量分布
    function pieAmount() {
        var myChart = echarts.init(document.getElementById('amount'));
        myChart.showLoading();
        var option = {
            tooltip: {
                trigger: 'item',
                formatter: "{b}: {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: '60%',
                top: '20px',
                itemGap: 9,
                icon: 'rect',
                itemWidth: 8,
                itemHeight: 8,
                data: ['事业法人', '其他非法人团体/组织', '企业法人', '机关法人', '农民专业合作社', '民办非企业', '农村承包经营户', '社会团体', '个体工商户'],
                textStyle: {
                    color: '#fff'
                }
            },
            series: [
                {
                    name: '法人类型数量分布',
                    type: 'pie',
                    radius: ['40%', '80%'],
                    center: ['32%', '50%'],
                    avoidLabelOverlap: false,
                    color: ['#5b9bd5', '#ed7d31', '#a6a6a6', '#ffc000', '#8a48c8', '#70ad47', '#2e75b6', '#ff5151', '#636363'],
                    label: {
                        normal: {
                            position: 'inner',
                            formatter: '{d}%'
                        },
                        emphasis: {
                            show: true,
                            textStyle: {
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        }
                    },
                    labelLine: {
                        normal: {
                            show: false
                        }
                    },
                    data: [
                        {value: 335, name: '事业法人'},
                        {value: 310, name: '其他非法人团体/组织'},
                        {value: 234, name: '企业法人'},
                        {value: 135, name: '机关法人'},
                        {value: 1548, name: '农民专业合作社'},
                        {value: 1548, name: '民办非企业'},
                        {value: 1548, name: '农村承包经营户'},
                        {value: 1548, name: '社会团体'},
                        {value: 1548, name: '个体工商户'}
                    ]
                }
            ]
        };
        myChart.hideLoading();
        myChart.setOption(option);
    }

    //部门数据交换情况汇总
    function departData() {
        var myChart = echarts.init(document.getElementById('depart-data'));
        myChart.showLoading();
        var option = {
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    label: {
                        backgroundColor: '#283b56'
                    }
                }
            },
            grid: {
                left: '3%',
                right: '3%',
                bottom: '20',
                top: '40',
                containLabel: true
            },
            legend: {
                left: '3%',
                top: '5%',
                itemWidth: 14,
                itemHeight: 8,
                data: ['交换量', '交换数据匹配度'],
                textStyle: {
                    color: '#87a5ff'
                }
            },
            xAxis: [
                {
                    type: 'category',
                    axisLine: {
                        lineStyle: {
                            color: '#475072'
                        }
                    },
                    axisLabel: {
                        interval: 0,//横轴信息全部显示
                        textStyle: {
                            color: '#fff'
                        },
                        formatter: function (value) {
                            return value.split("").join("\n");
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: true,
                        lineStyle: {
                            color: ['#16214d']
                        }
                    },
                    nameRotate: 90,
                    boundaryGap: true,
                    data: ['省环保厅', '省新闻出', '新闻广电局', '省证监局', '省电力局', '省司法厅', '省林业厅', '省建设厅', '省海洋局', '省海洋局', '省发改委', '省地税局', '消防总队', '省民政']
                },
                {
                    show: false,
                    data: ['省环保厅', '省新闻出', '新闻广电局', '省证监局', '省电力局', '省司法厅', '省林业厅', '省建设厅', '省海洋局', '省海洋局', '省发改委', '省地税局', '消防总队', '省民政']
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    scale: true,
                    max: 1000,
                    min: 0,
                    splitNumber: 10,
                    boundaryGap: [0.2, 0.2],
                    axisLine: {
                        lineStyle: {
                            color: '#475072'
                        }
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#87a5ff'
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: true,
                        lineStyle: {
                            color: ['#16214d']
                        }
                    }
                },
                {
                    type: 'value',
                    scale: true,
                    max: '1000',
                    min: 0,
                    boundaryGap: [0.2, 0.2],
                    splitNumber: 10,
                    axisLine: {
                        lineStyle: {
                            color: '#475072'
                        }
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#87a5ff'
                        },
                        formatter: function (value) {
                            return value / 10 + '%';
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: true,
                        lineStyle: {
                            color: ['#16214d']
                        }
                    }
                }
            ],
            series: [
                {
                    name: '交换量',
                    barWidth: 20,
                    type: 'bar',
                    xAxisIndex: 1,
                    yAxisIndex: 1,
                    color: ['#5d20cf'],
                    data: ['500', '600', '400', '200', '700', '750', '780', '800', '810', '850', '860', '900', '920', '950']
                },
                {
                    name: '交换数据匹配度',
                    type: 'line',
                    lineStyle: {
                        normal: {
                            color: '#00ff00'
                        }
                    },
                    symbol: 'circle',
                    symbolSize: 6,
                    itemStyle: {
                        normal: {
//                            borderColor: '#00ff00',
                            color: '#00ff00'
                        }
                    },
                    data: ['400', '60', '400', '200', '700', '750', '780', '800', '810', '850', '860', '900', '920', '950']
                }
            ]
        };

        myChart.hideLoading();
        myChart.setOption(option);
    }

    //部门调用数量TOP10(条数)
    function departTop() {
        var myChart = echarts.init(document.getElementById('depart-top'));
        myChart.showLoading();

        var option = {
            tooltip: {
                show: false
//                trigger: 'axis',
//                axisPointer: {
//                    type: 'shadow'
//                }
            },
            grid: {
                left: '7%',
                right: '7%',
                bottom: '20',
                top: '40',
                containLabel: true
            },
            xAxis: {
                show: false
            },
            yAxis: {
                boundaryGap: false,
                axisTick: {
                    show: false
                },
                axisLine: {
                    lineStyle: {
                        color: '#fff',
                        opacity: 0.2
                    }
                },
                axisLabel: {
                    textStyle: {
                        color: '#fff'
                    }
                },
                splitLine: { //坐标轴在 grid 区域中的分隔线
                    show: true,
                    lineStyle: {
                        color: ['#182659'],
                        width: 20
                    }
                },
                type: 'category',
                data: ['国土局', '国税局', '人社局', '编办', '地税局', '质监局', '教育局', '文广局', '工商局', '发改委']
            },
            series: [
                {
                    barWidth: 20,
                    legendHoverLink: false,
                    silent: true,
                    color: ['#0066cc'],
                    label: {
                        normal: { //柱形图上方的文字
                            show: true,
                            position: [10, 2],
                            textStyle: {
                                color: '#fefeff'
                            }
                        }
                    },
                    itemStyle: {
                        normal: {
                            barBorderRadius: [0, 10, 10, 0]
                        }
                    },
                    type: 'bar',
                    data: [122354, 121546, 120215, 198215, 197651, 196542, 195542, 183542, 180542, 178542]
                }
            ]
        };

        myChart.hideLoading();
        myChart.setOption(option);
    }

    //部门调用法人类型维度
    function departWd() {
        var myChart = echarts.init(document.getElementById('depart-wd'));
        myChart.showLoading();

        var option = {
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            series: [
                {
                    name: '部门调用法人类型维度',
                    type: 'pie',
                    radius: '45%',
                    center: ['55%', '50%'],
                    color: ['#3b8bff', '#fe7528', '#797979', '#ffb300'],
                    data: [
                        {value: 335, name: '企业法人'},
                        {value: 310, name: '个体工商户'},
                        {value: 234, name: '农民专业合作社'},
                        {value: 135, name: '其他非法人团体/组织'}
                    ],
                    label: {
                        normal: {
//                            formatter:"{b} {d}%",
                            textStyle: {
                                color: '#fff'
                            }
                        }
                    },
                    labelLine: {
                        normal: {
                            lineStyle: {
                                color: '#fff'
                            }
                        }
                    },
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };

        myChart.hideLoading();
        myChart.setOption(option);
    }

    //业务数据沉淀量分类统计（条数）
    function getTjList() {
        var data = [{
            name: '基本信息',
            value: 151463
        }, {
            name: '资本与资产',
            value: 15247
        }, {
            name: '许可、资质与荣誉',
            value: 13542
        }, {
            name: '纳税、参保与缴费',
            value: 12513
        }, {
            name: '生产经营',
            value: 11542
        }, {
            name: '行政执法',
            value: 10251
        }, {
            name: '司法信息',
            value: 9983
        }, {
            name: '评价信息',
            value: 8867
        }, {
            name: '其他',
            value: 65
        }];

        var colors = ['#2a81d1', '#06a59f', '#773ce5', '#f2a500', '#189ad2', '#50a616', '#3077f2', '#f56622', '#4e5255'];

        var html = '', total = 0, len = data.length;
        for (var i = 0; i < len; i++) {
            total += data[i].value;
        }

        for (var j = 0; j < len; j++) {
            var value = data[j].value;
            var name = data[j].name;
            var percent = (value / total * 100).toFixed(2);
            html += '<div class="tj-item" style="width:' + percent + '%;background-color:' + colors[j] + '">' +
                    '<p>' + name + '</p>' +
                    '<p>' + value + '条</p>' +
                    '</div>';
        }
        $('.js-tj-list').html(html);
    }


    setInterval(function () {
        getNowFormatDate();
    }, 1000);

</script>
</body>
</html>