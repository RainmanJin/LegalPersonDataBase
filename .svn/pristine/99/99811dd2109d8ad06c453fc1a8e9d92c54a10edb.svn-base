<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>各维度业务数据处理</title>
    <link rel="stylesheet" href="/css/frk.css">
    <script src="/js/lib/d3/d3.min.js"></script>
    <script src="/js/lib/d3/d3pie.js"></script>
    <script src="/js/lib/d3/sankey.js"></script>
</head>
<body class="bg102a42">

<div class="wrap">
    <div class="border-tl"></div>
    <div class="border-tr"></div>
    <div class="border-bl"></div>
    <div class="border-br"></div>
    <div class="side-bar">
        <div class="title">法人库一级分类</div>
        <ul>
            <li class="js-side-item cur" data-type="1">基本信息</li>
            <li class="js-side-item" data-type="2">资本与资产</li>
            <li class="js-side-item" data-type="3">纳税、参保与缴费</li>
            <li class="js-side-item" data-type="4">生产与经营</li>
            <li class="js-side-item" data-type="5">许可、资质与荣誉</li>
            <li class="js-side-item" data-type="6">行政执法</li>
            <li class="js-side-item" data-type="7">司法信息</li>
            <li class="js-side-item" data-type="8">评价信息</li>
            <li class="js-side-item" data-type="9">其他</li>
        </ul>
    </div>
    <div class="main">
        <div class="panel">
            <div class="chart-hd">
                <div class="table">
                    <div class="title">校验成功率</div>
                    <div>
                        <div class="row1">表序号</div>
                        <div class="row2">
                            <div class="row-item">
                                <div class="item">0%</div>
                            </div>
                            <div class="row-item">
                                <div class="item">25%</div>
                            </div>
                            <div class="row-item">
                                <div class="item">50%</div>
                            </div>
                            <div class="row-item">
                                <div class="item">75%</div>
                            </div>
                            <div class="row-item">
                                <div class="item">100%</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="table-list">
                    <%--<div class="table-select-box">--%>
                    <%--请选择表单：--%>
                    <%--<select name="" id="" class="js-table-list"></select>--%>
                    <%--<input type="button" value="重置" class="js-reset">--%>
                    <%--</div>--%>
                    <ul class="js-table-list">
                        <li></li>
                    </ul>
                </div>
            </div>
            <div style="overflow-y: scroll" class="chart-content">
                <div id="chart-table">
                    <hr/>
                </div>
                <div id="chart-sankey"></div>
            </div>

            <div id="chart-pie-box" class="hide">
                <div class="chart-pie" id="chart-pie"></div>
                <div class="chart-pie" id="chart-pie-sub"></div>
            </div>

        </div>
    </div>
</div>
<script src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
<script src="/js/lib/layer/layer.js"></script>
<script>

    //sankey start
    var margin = {top: 1, right: 1, bottom: 6, left: 1},
            width = 740 - margin.left - margin.right,
            height = 646 - margin.top - margin.bottom,
            link, sankey, data2 = [], node2;

    function sanKeyDraw(energy) {

        d3.select("#chart-sankey").selectAll("svg").remove();

        var formatNumber = d3.format(",.0f"),
                format = function (d) {
                    return formatNumber(d) + " TWh";
                },
                color = d3.scaleOrdinal(d3.schemeCategory20);
//            color = d3.scale.category20();
		
		//Set height based on Node_count
		height = 646 - margin.top - margin.bottom;
		if(energy.nodes.length>100) height=height*3;
		else if(energy.nodes.length>50) height=height*2;
       
		var svg = d3.select("#chart-sankey").append("svg")
                .attr("width", width + margin.left + margin.right)
                .attr("height", height + margin.top + margin.bottom)
                .append("g")
                .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        sankey = d3.sankey()
                .nodeWidth(15)
                .nodePadding(10)
                .size([width, height]);

        var path = sankey.link();

        sankey.nodes(energy.nodes)
                .links(energy.links)
                .layout(32);

        link = svg.append("g").selectAll(".link")
                .data(energy.links)
                .enter().append("path")
                .attr("class", "link")
                .attr("d", path)
                .style("stroke", function (d) {
                    return d.color = color(d.source.name.replace(/ .*/, ""));
                })
                .style("stroke-width", function (d) {
                    return Math.max(1, d.dy) + 'px';
                })
                .sort(function (a, b) {
                    return b.dy - a.dy;
                });

        link.append("title")
                .text(function (d) {
                    return d.source.name + " → " + d.target.name + "\n" + format(d.value);
                });

        var node = svg.append("g").selectAll(".node")
                .data(energy.nodes)
                .enter().append("g")
                .attr("class", "node")
                .attr("transform", function (d) {
                    return "translate(" + d.x + "," + d.y + ")";
                });

        node.append("rect")
                .attr("height", function (d) {
                    return d.dy;
                })
                .attr("class", "rect")
                .attr("width", sankey.nodeWidth())
                .style("fill", function (d) {
                    return d.color = color(d.name.replace(/ .*/, ""));
                })
                .style("stroke", function (d) {
                    return d3.rgb(d.color).darker(2).toString();
                })
                .append("title")
                .text(function (d) {
                    return d.name + "\n" + format(d.value);
                });

        var tableFrom;
        d3.selectAll(".rect").filter(function (d) {
            return !!d.targetLinks.length;
        }).on("click", function (d) {
            tableFrom = [];
            layer.alert(getTableSoruce(d));
        });

        function getTableSoruce(dr) {
            if (dr.targetLinks.length) {
                dr.targetLinks.forEach(function (d) {
                    tableFrom.push(d.source.name);
                    getTableSoruce(d.source);
                })
            }
            return tableFrom.join(",");
        }

        node.append("text")
                .attr("x", -6)
                .attr("y", function (d) {
                    return d.dy / 2;
                })
                .attr("dy", ".35em")
                .attr("text-anchor", "end")
                .attr("transform", null)
                .text(function (d) {
                    if (d.targetLinks.length) {
                        return d.name;
                    }
                })
                .filter(function (d) {
                    return d.x < width / 2;
                })
                .attr("x", 6 + sankey.nodeWidth())
                .attr("text-anchor", "start");
    }


    function tableDraw(energy) {

        d3.select("#chart-table").select("svg").remove();
        data2 = [];

        var width2 = 240, height2 = 646;
        if(energy.nodes.length>100) height2=height2*3;
		else if(energy.nodes.length>50) height2=height2*2;
        var svg = d3.select("#chart-table").append("svg")
                .attr("width", width2 + margin.left + margin.right - 2)
                .attr("height", height2 + margin.top + margin.bottom)
                .append("g")
                .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        energy.nodes.filter(function (value, index) {
            if (!value.targetLinks.length) {
                data2.push(value);
            }
        });

        function compare(property) {
            return function (a, b) {
                var value1 = a[property];
                var value2 = b[property];
                return value1 - value2;
            }
        }

        data2.sort(compare('y'));

        node2 = svg.append("g").selectAll(".node2")
                .data(data2)
                .enter().append("g")
                .attr("class", "node2")
                .attr("transform", function (d) {
                    return "translate(" + d.x + "," + d.y + ")";
                })
                .on("click", function (dr) {
                    node2.classed("cur", false);
                    d3.select(this).classed("cur", true);
                    link.classed("cur", false);
                    getLinks(dr);
                    d3.json("/data/ywclnode/doGetPieChart.json?id=" + dr.id, function (d) {
                        var area;
                        chartPie.updateProp("data.content", d.data);
                        if (d.data[0].reason.length) {
                            $('#chart-pie-sub').show();
                            area = ["800px", "400px"]
                            chartPieSub.updateProp("data.content", d.data[0].reason);
                        } else {
                            $('#chart-pie-sub').hide();
                            area = ["400px", "400px"]
                        }
                        layer.open({
                            type: 1,
                            title: d.data[2].title + '校验结果统计',
                            area: area,
                            skin: "layer-ext-chart",
                            shade: 0.1,
                            content: $("#chart-pie-box")
                        });
                    })
                });

        node2.append("line")
                .attr("x1", "38")
                .attr("x2", "237")
                .attr("y1", function (d) {
                    return d.dy / 2;
                })
                .attr("y2", function (d) {
                    return d.dy / 2;
                })
                .attr("fill", "none")
                .attr("class", "line");

        node2.append("text")
                .attr("x", 12)
                .attr("y", function (d) {
                    return d.dy / 2 + 4;
                })
                .text(function (d, i) {
                    return i + 1;
                });

        node2.append("title")
                .text(function (d) {
                    return d.name;
                });

        node2.append("circle")
                .attr("r", 4)
                .attr("cx", function (d) {
                    return 200 / 100 * (d.sourceLinks[0].value2) + 40 - 7;
                })
                .attr("cy", function (d) {
                    return d.dy / 2;
                })
                .attr("class", "circle");
    }

    function pieInit(options) {
        var defaultData = [{label: "name", value: 100}];
        var pie = new d3pie(options.el, {
            header: {
                title: {
                    text: options.title
                }
            },
            size: {
                canvasWidth: options.width,
                canvasHeight: options.height
            },
            labels: {
                inner: {
                    format: "percentage"
                },
                formatter: function(context){
                    var label = context.label;
                    var value = context.value;

                    // if it's a single bird seen, add an exclamation mark to the outer label
                    if (context.section === 'inner') {
                        label = value + ',' + label + '%';
                    }
                    return label;
                }
            },
            data: {
                content: options.data || defaultData
            },
            tooltips: {
                enabled: true,
                string: "{label}: {value}，{percentage}%"
            },
            misc: {
                canvasPadding: {
                    top: options.top
                }
            }
        });
        return pie;
    }

    //类目初始化
    function tableColumnInit() {
        var sel = document.querySelector(".js-table-list");
        d3.select(".js-table-list").selectAll("*").remove();
        var html = '';
        for (var i = 0; i < data2.length; i++) {
            var value = data2[i].name;
            var index = i + 1;
            html += '<li class="js-list-item"><i>' + index + '.</i><em>' + value + '</em></li>';
        }
        sel.innerHTML = html;
        d3.selectAll(".js-list-item").on('click',function(){
            var dr = {};
            var j = parseInt(d3.select(this).select('i').text(),10);
            dr.name = d3.select(this).select('em').text();
            link.classed("cur", false);
            getLinks(dr);
            node2.classed("cur", function (d, k) {
                if (j - 1 == k) {
                    return true;
                }
                return false;
            })
        });
//        var html = "<option>请选择</option>";
//        for (var i = 0; i < data2.length; i++) {
//            var value = data2[i].name;
//            html += '<option class="js-list" value="' + value + '">' + value + '</option>';
//        }
//        $(".js-table-list").html(html);
//        sel.onchange = function () {
//            var j = this.selectedIndex, dr = {};
//            dr.name = this.options[j].value;
//            link.classed("cur", false);
//            getLinks(dr);
//            node2.classed("cur", function (d, k) {
//                if (j - 1 == k) {
//                    return true;
//                }
//                return false;
//            })
//        };
    }

    //递归取得相关联的数据
    function getLinks(dr) {
        link.each(function (d) {
            if (dr.name == d.source.name) {
                d3.select(this).classed("cur", true);
                getLinks(d.target);
            }
        })
    }

    //pie初始化
    var chartPie = pieInit({
        el: "chart-pie",
        title: "成功/失败占比",
        width: 400,
        height: 300
    });
    var chartPieSub = pieInit({
        el: "chart-pie-sub",
        title: "失败原因占比",
        width: 400,
        height: 300
    });


    //重置
    //    function reset() {
    //        d3.select(".js-reset").on("click", function () {
    //            node2.classed("cur", false);
    //            link.classed("cur", false);
    //            document.querySelector(".js-table-list").options[0].selected = true;
    //        })
    //    }
    function drawChart(type) {
        d3.json("/data/ywclnode/doGetNodeAndLink.json?type=" + type, function (energy) {

            //绘制桑基图
            sanKeyDraw(energy.data);

            //绘制表格
            tableDraw(energy.data);

            //类目初始化
            tableColumnInit();

        });
    }

    //重置
    //    reset();
    //绘制图表
    drawChart(1);

    d3.selectAll(".js-side-item").on("click", function () {
        d3.selectAll(".js-side-item").classed("cur", false);
        d3.select(this).classed("cur", true);
        var type = d3.select(this).attr("data-type");
		
        drawChart(type);
    });

</script>
</body>
</html>