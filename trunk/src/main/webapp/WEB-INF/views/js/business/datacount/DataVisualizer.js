require([ 'component/iframeLayer', 'component/dataTable', 'common/util',
		'common/http', 'handlebars', 'echarts', 'zhejiang', 'jquery',
		'jquery.serialize' ], function(layer, dataTable, util, http,
		handlebars, echarts) {
	/*
	 * handlebars.registerHelper("eachFunction",function(value){
	 * getCityDetail(); });
	 */
	init();
	/**
	 * 初始化函数集合
	 */
	function init() {
		pieAmount();
		departTop();
		getNowFormatDate();
		getCityDetail();
		departWd();
		legalPersonNumber();
		//StatisticHandler()
	}
	setInterval(function() {
		pieAmount();
		departTop();
		getNowFormatDate();
		getCityDetail();
		departWd();
		legalPersonNumber();
		//StatisticHandler()
	}, 6000);
	/**
	 * 获取当前日期时间及星期
	 */
	function getNowFormatDate() {
		var show_day = new Array('星期一', '星期二', '星期三', '星期四', '星期五', '星期六',
				'星期日');
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
		var currentdate = year + "年" + month + "月" + strDate + "日" + " " + hour
				+ seperator2 + minute + seperator2 + second + " "
				+ show_day[day - 1];
		$('.js-date-week').text(currentdate);
	}

	// 法人数量动态统计
	function legalPersonNumber() {
		httpRequest({
			url : "/data/datacount/DynamicStatistic.json",
			success : function(data) {
				var energy = data.data.Sum.toString();
				var lp = $(".legalperson");
				lp.text(energy + "条");
				var j = $(".js-person-number i").length;
				var l = j - energy.length;
				var k = l - 1;
				for (var i = 0; i < j; i++) {
					var item = energy.charAt(i);
					if (l < j) {
						$(".js-person-number i").eq(l++).text(item);
					} else {
						$(".js-person-number i").eq(k--).text("0");
					}
				}

				var add = $(".add .light");
				var sub = $(".sub .light");
				add.text(data.data.Add);
				sub.text(data.data.Sub);
			},
			error : function(jqXHR) {
				layer.msg("出错");
			}
		});
	}

	// 部门调用数量TOP10(条数)
	function departTop() {
		var myChart = echarts.init(document.getElementById('depart-top'));
		myChart.showLoading();

		var option = {
			tooltip : {
				show : false,
				confine : true
			// trigger: 'axis',
			// axisPointer: {
			// type: 'shadow'
			// }
			},
			grid : {
				left : '7%',
				right : '7%',
				bottom : '20',
				top : '40',
				containLabel : true
			},
			xAxis : {
				show : false
			},
			yAxis : {
				boundaryGap : false,
				axisTick : {
					show : false
				},
				axisLine : {
					lineStyle : {
						color : '#fff',
						opacity : 0.2
					}
				},
				axisLabel : {
					textStyle : {
						color : '#fff'
					}
				},
				splitLine : { // 坐标轴在 grid 区域中的分隔线
					show : true,
					lineStyle : {
						color : [ '#182659' ],
						width : 20
					}
				},
				type : 'category',
				data : [ '国土局', '国税局', '人社局', '编办', '地税局', '质监局', '教育局', '文广局',
						'工商局', '发改委' ]
			},
			series : [ {
				barWidth : 20,
				legendHoverLink : false,
				silent : true,
				color : [ '#0066cc' ],
				label : {
					normal : { // 柱形图上方的文字
						show : true,
						position : [ 10, 2 ],
						textStyle : {
							color : '#fefeff'
						}
					}
				},
				itemStyle : {
					normal : {
						barBorderRadius : [ 0, 10, 10, 0 ]
					}
				},
				type : 'bar',
				data : [ 122354, 121546, 120215, 198215, 197651, 196542,
						195542, 183542, 180542, 178542 ]
			} ]
		};

		myChart.hideLoading();
		myChart.setOption(option);
	}
	// 法人类型数量分布
	function pieAmount() {
		$.get("/data/datacount/TypeCounting.json", function(data) {
			var myChart = echarts.init(document.getElementById('amount'));
			myChart.showLoading();
			var option = {
				tooltip : {
					trigger : 'item',
					formatter : "{b}:</br>{d}%",
					confine : true
				},
				legend : {
					orient : 'vertical',
					left : '60%',
					top : '20px',
					itemGap : 9,
					icon : 'rect',
					itemWidth : 8,
					itemHeight : 8,
					formatter : function(name) {
						return name.substring(0, name.indexOf("("));
					},
					data : data.data.pie1.map(function(item) {
						return item
					}),
					textStyle : {
						color : '#fff'
					}
				},
				series : [ {
					name : '法人类型数量分布',
					type : 'pie',
					radius : [ '40%', '80%' ],
					center : [ '32%', '50%' ],
					avoidLabelOverlap : true,
					color : [ '#5b9bd5', '#ed7d31', '#636363', '#ffc000',
							'#a6a6a6', '#70ad47', '#2e75b6', '#ff5151',
							'#8a48c8', '#ff2651' ],
					label : {
						normal : {
							position : 'inner',
							formatter : '{d}%'
						},
						emphasis : {
							show : true,
							textStyle : {
								fontSize : '25',
								fontWeight : 'bold'
							}
						}
					},
					labelLine : {
						normal : {
							show : false
						}
					},
					data : data.data.pie1.map(function(item) {
						return item
					})
				} ]
			};
			myChart.hideLoading();
			myChart.setOption(option);
		});
	}

	// 部门调用法人类型维度
	function departWd() {
		var myChart = echarts.init(document.getElementById('depart-wd'));
		myChart.showLoading();

		var option = {
			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)",
				confine : true
			},
			series : [ {
				name : '部门调用法人类型维度',
				type : 'pie',
				radius : '45%',
				center : [ '55%', '50%' ],
				color : [ '#3b8bff', '#fe7528', '#797979', '#ffb300' ],
				data : [ {
					value : 335,
					name : '企业法人'
				}, {
					value : 311,
					name : '个体工商户'
				}, {
					value : 234,
					name : '农民专业合作社'
				}, {
					value : 135,
					name : '其他非法人团体/组织'
				} ],
				label : {
					normal : {
						// formatter:"{b} {d}%",
						textStyle : {
							color : '#fff'
						}
					}
				},
				labelLine : {
					normal : {
						lineStyle : {
							color : '#fff'
						}
					}
				},
				itemStyle : {
					emphasis : {
						shadowBlur : 10,
						shadowOffsetX : 0,
						shadowColor : 'rgba(0, 0, 0, 0.5)'
					}
				}
			} ]
		};

		myChart.hideLoading();
		myChart.setOption(option);
	}
	/**
	 * 获得各地区相对应的数据
	 */
	function getCityDetail() {
		http.httpRequest({
			url : '/data/datacount/getCityDetail.json',
			serializable : false,
			data : {},
			success : function(data) {
				showzjmap(data);
			}
		})
	}

	/**
	 * 显示浙江地图
	 */
	function showzjmap(data) {
		var chart = echarts.init(document.getElementById('zjmap'));
		option = {
			title : {
				text : "浙江省各地市法人数量分布",
				left : 'center',
				textStyle : {
					fontWeight : 'normal',
					color : '#00ccff'
				}

			},
			tooltip : {
				trigger : 'item',
				formatter : '{a}</br>&nbsp;&nbsp;&nbsp;&nbsp;{b}: {c}'
			},
			visualMap : {
				min : 0,
				max : 1000000,
				left : '10px',
				bottom : '10px',
				text : [ '高', '低' ], // 文本，默认为数值文本
				color : [ '#0f7ae2', '#5a94e4' ],
				calculable : true
			},
			series : [ {
				name : '法人数量',
				type : 'map',
				mapType : 'zhejiang',
				top : '50px',
				left:'100px',
				bottom : '8px',
				label : {
					normal : {
						show : true,
						textStyle : {
							color : '#fff'
						}
					},
					emphasis : {
						textStyle : {
							color : '#fff'
						}
					}
				},
				itemStyle : {

					normal : {
						borderColor : '#389BB7',
						areaColor : '#fff',
					},
					emphasis : {
						areaColor : '#389BB7',
						borderWidth : 0
					}
				},
				animation : false,
				data : [ {
					name : '湖州市',
					value : data['湖州市']
				}, {
					name : '嘉兴市',
					value : data['嘉兴市']
				}, {
					name : '绍兴市',
					value : data['绍兴市']
				}, {
					name : '杭州市',
					value : data['杭州市']
				}, {
					name : '宁波市',
					value : data['宁波市']
				}, {
					name : '舟山市',
					value : data['舟山市']
				}, {
					name : '金华市',
					value : data['金华市']
				}, {
					name : '衢州市',
					value : data['衢州市']
				}, {
					name : '丽水市',
					value : data['丽水市']
				}, {
					name : '台州市',
					value : data['台州市']
				}, {
					name : '温州市',
					value : data['温州市']
				} ]
			} ],

		};
		chart.setOption(option);
	}

	/*
	 * 业务数据沉淀量分类统计
	 */
	/*function StatisticHandler() {
		httpRequest({
			url : "/data/datacount/DimTotal.json",
			success : function(data) {
				var total = 0;
				for (var i = 1; i < 10; i++) {
					total = total + data.data.Map[i];
				}
				;
				for (var i = 1; i < 10; i++) {
					var DimTotal = $(".Numid" + i.toString());
					var energy = data.data.Map[i];
					DimTotal.text(energy + "条");
					var w = energy / total;
					var Div = document.getElementById("id" + i.toString());
					Div.style.width = (w * 100).toString() + "%";
				}
				;
			},
			error : function() {
				layer.msg("业务数据沉淀量分类统计 出错");
			}
		});
	}*/

	/**
	 * ajax请求
	 */
	var defaultOpt = {
		async : true,
		dataType : 'json',
		type : 'get',
		cache : false,
	// serializable: false
	};

	function generateHttpParam(options) {
		var opt = $.extend({}, defaultOpt, options);
		opt.url = options.url;
		opt.success = function(data) {
			options.success && options.success(data);
		}
		opt.error = function(jqXHR, textStatus, errorThrown) {
			options.error && options.error(jqXHR, textStatus, errorThrown);
		}
		return opt;
	}

	function httpRequest(options) {
		var ajax = $.ajax(generateHttpParam(options));
	}

});