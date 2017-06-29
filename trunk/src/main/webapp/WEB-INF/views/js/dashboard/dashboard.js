require(['echarts'], function (echart) {

    init();

    /**
     * 初始化函数集合
     */
    function init() {
        pieAmount();
        departData();
    }

    //法人类型数量分布
    function pieAmount() {
        var myChart = echart.init(document.getElementById('index-amount'));
        myChart.showLoading();
        var option = {
            tooltip: {
                trigger: 'item',
                formatter: "{b}: {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: '56%',
                top: '20px',
                itemGap: 9,
                icon: 'rect',
                itemWidth: 8,
                itemHeight: 8,
                data: ['事业法人', '其他非法人团体/组织', '企业法人', '机关法人', '农民专业合作社', '民办非企业', '农村承包经营户', '社会团体', '个体工商户'],
                textStyle: {
                    color: '#666'
                }
            },
            series: [
                {
                    name: '法人类型数量分布',
                    type: 'pie',
                    radius: ['40%', '70%'],
                    center: ['28%', '50%'],
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
        var myChart = echart.init(document.getElementById('index-depart-data'));
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
                right: '3%',
                top: '5%',
                itemWidth: 14,
                itemHeight: 8,
                data: ['交换量', '交换数据匹配度'],
                textStyle: {
                    color: '#999'
                }
            },
            xAxis: [
                {
                    type: 'category',
                    axisLine: {
                        lineStyle: {
                            color: '#d7d7d7'
                        }
                    },
                    axisLabel: {
                        interval: 0,//横轴信息全部显示
                        textStyle: {
                            color: '#666'
                        },
                        formatter: function (value) {
                            return value.split("").join("\n");
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: false,
                        lineStyle: {
                            color: ['#d7d7d7']
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
                            color: '#d7d7d7'
                        }
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#999'
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: true,
                        lineStyle: {
                            color: ['#d7d7d7']
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
                            color: '#d7d7d7'
                        }
                    },
                    axisLabel: {
                        textStyle: {
                            color: '#999'
                        },
                        formatter: function (value) {
                            return value / 10 + '%';
                        }
                    },
                    splitLine: { //坐标轴在 grid 区域中的分隔线
                        show: false,
                        lineStyle: {
                            color: ['#d7d7d7']
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
                    color: ['#6eade6'],
                    data: ['500', '600', '400', '200', '700', '750', '780', '800', '810', '850', '860', '900', '920', '950']
                },
                {
                    name: '交换数据匹配度',
                    type: 'line',
                    lineStyle: {
                        normal: {
                            color: '#ffd557'
                        }
                    },
                    symbol: 'circle',
                    symbolSize: 6,
                    itemStyle: {
                        normal: {
//                            borderColor: '#00ff00',
                            color: '#ffd557'
                        }
                    },
                    data: ['400', '60', '400', '200', '700', '750', '780', '800', '810', '850', '860', '900', '920', '950']
                }
            ]
        };

        myChart.hideLoading();
        myChart.setOption(option);
    }
});