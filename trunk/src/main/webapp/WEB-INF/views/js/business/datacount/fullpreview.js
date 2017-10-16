require([ 'component/iframeLayer', 'component/dataTable', 'common/util',
		'common/http', 'handlebars', 'echarts', 'zhejiang', 'jquery',
		'jquery.serialize' ], function(layer, dataTable, util, http,
		handlebars, echarts) {

	init();
	/**
	 * 初始化函数集合
	 */
	function init() {
		// 在册法人主体数量
		legalPersonNum();
		// 数据总览
		dataShowAll();
		// 法人类型数量分布
		pieAmount();
		// 在册法人地区分布情况
		getCityDetail()
		// 法人属性分类
		getFrAttr();
		// 部门调用数量top10
		departTop();
		// 接口调用数量top10
		interfaceTop();
		// 法人地区调用情况
		getFrAreaNum();
		//数据整合
		dataGather();
	}

	// 在册法人主体数量统计
	function legalPersonNum() {
		httpRequest({
			url : "/admin/fullpreview/getLeagalPersonNum",
			success : function(data) {
				var num_str = data.data.Sum.toString();
				var num_len = num_str.length;
				var li_len = $(".all-num li").length;
				if (num_len <= li_len) {
					for (var i = li_len - 1; i >= 0; i--) {
						if (num_len < 0) {
							$(".all-num li").eq(i).text("0");
						} else {
							var item = num_str.charAt(--num_len);
							$(".all-num li").eq(i).text(item);
						}
					}
				} else {
					layer.msg("数据量超出显示区域请联系管理员");
				}

			},
			error : function(jqXHR) {
				layer.msg("忘络不稳定");
			}
		});
	}
	// 数据总览
	function dataShowAll() {
		httpRequest({
			url : "/admin/fullpreview/dataShowAll",
			success : function(data) {
				var json_data = data.data;
				var collectNum = json_data.collectNum;
				var importNum = json_data.importNum;
				collectNum.toString().length > 5 ? collectNum = Math
						.round(collectNum / 10000) : collectNum = collectNum;
				importNum.toString().length > 5 ? importNum = Math
						.round(importNum / 10000) : importNum = importNum;
				$(".data-pandect li").eq(0).children().text(
						json_data.dataSource + "（家）")
				$(".data-pandect li").eq(1).children()
						.text(collectNum + "（万条）")
				$(".data-pandect li").eq(2).children().text(importNum + "（万条）")
				$(".data-pandect li").eq(3).children().text(
						json_data.weekAdd + "（条）")
				$(".data-pandect li").eq(4).children().text(
						json_data.yearAdd + "（条）")
				$(".data-pandect li").eq(5).children().text(
						json_data.yearSub + "（条）")
			},
			error : function(jqXHR) {
				layer.msg("忘络不稳定");
			}
		});
	}
	// 法人类型数量分布
	function pieAmount() {
		$.get("/admin/fullpreview/frTypeCounting", function(data) {
			var myChart = echarts.init(document.getElementById('amount'));
			var total = 0;
			var num = data.data.pie
			var percentArr = {};
			for(var index in num){
				var key = num[index].name;
				percentArr[key]=num[index].value;
				total+=num[index].value;
			}
			myChart.showLoading();
			var option = {
				tooltip : {
					trigger : 'item',
					formatter : "{b}:</br>{d}%"
				},
				legend : {
					orient : 'vertical',
					left : '50%',
					top : '20px',
					itemGap : 8,
					icon : 'rect',
					itemWidth : 10,
					itemHeight : 10,
					textStyle : {
						color : '#fff'
					},
					formatter:function(params){
						return Math.round(percentArr[params]/total*10000)/100+"% "+params
					},
					data : data.data.pie.map(function(item) {
						return item
					})

				},
				series : [ {
					type : 'pie',
					radius : [ '60%', '80%' ],
					center : [ '32%', '50%' ],
					avoidLabelOverlap : true,
					/*
					 * color : [ '#5b9bd5', '#ed7d31', '#636363', '#ffc000',
					 * '#a6a6a6', '#70ad47', '#2e75b6', '#ff5151', '#8a48c8',
					 * '#ff2651' ],
					 */
					labelLine : {
						normal : {
							show : false
						}
					},
					label : {
						normal : {
							show : false
						}
					},
					data : data.data.pie.map(function(item) {
						return item
					})
				} ]
			};
			myChart.hideLoading();
			myChart.setOption(option);
		});
	}
	/**
	 * 获得各地区相对应的数据
	 */
	function getCityDetail() {
		http.httpRequest({
			url : '/admin/fullpreview/getCityDetail',
			serializable : false,
			data : {},
			success : function(data) {
				showZjMap(data.data);
			}
		})
	}
	
	function showZjMap(data) {
		console.log(data)
		var myChart2 = echarts.init(document.getElementById('fr-speard'));
		var geoCoordMap = {
			'丽水市' : [ 119.5642, 28.1854 ],
			'台州市' : [ 121.1353, 28.6688 ],
			'宁波市' : [ 121.5967, 29.6466 ],
			'杭州市' : [ 119.5313, 29.8773 ],
			'绍兴市' : [ 120.564, 29.7565 ],
			'舟山市' : [ 122.2559, 30.2234 ],
			'衢州市' : [ 118.6853, 28.8666 ],
			'金华市' : [ 120.0037, 29.1028 ],
			'温州市' : [ 120.498, 27.8119 ],
			'嘉兴市' : [ 120.9155, 30.6354 ],
			'湖州市' : [ 119.8608, 30.7782 ]
		};
		var top = function (data){
			var topData = [];
			 topData.push(data[0]);
			return topData;
		}
		var convertData = function(data) {
			var res = [];
			for (var i = 0; i < data.length; i++) {
				var geoCoord = geoCoordMap[data[i].name];
				if (geoCoord) {
					res.push({
						name : data[i].name,
						value : geoCoord.concat(data[i].value)
					});
				}
			}
			return res;
		};
		var options = {
				tooltip : {

					show : true,
					trigger : 'item',
					formatter : function(params){
						return "法人数量地区分布</br>"+params.name+":"+params.value[2]
					}
				},
			
				geo : {
					map : 'zhejiang',
					left:'10%',
					right:'10%',
					top:20,
					bottom:20,
					label : {
						emphasis : {
							show : false
						}
					},
					roam : false,
					itemStyle : {
						 normal: {
				              borderColor: '#3DC7E3',
				              borderWidth: 1.5,
				              areaColor:'rgba(11,18,44,0)'
				              
				            
				          },
				          emphasis : {
				          	 areaColor:'rgba(11,18,44,0)'
				          }
					}
				},
				series : [

				{
					name : '法人数量',
					type : 'scatter',
					coordinateSystem : 'geo',
					data : convertData(data),
					symbol:'image:///img/bigscreen/province-icon.png',
					symbolSize:20,
					label : {
						normal : {
							color:'#fff',
							fontWeight:'bolder',
							fontFamily:'Microsoft YaHei',
							formatter : '{b}',
							position : 'right',
							show : true
						},
						emphasis : {
							color:'#fff',
							fontWeight:'bolder',
							fontFamily:'Microsoft YaHei',
							show : true
						}
					},
					itemStyle : {
						normal : {
							color : '#fff'
						}
					}
				}, {
					name : 'Top 3',
					type : 'effectScatter',
					coordinateSystem : 'geo',
					data : convertData(top(data)),
					symbolSize : 30,
					showEffectOn : 'render',
					rippleEffect : {
						brushType : 'fill'
					},
					hoverAnimation : true,
					label : {
						normal : {
							show : false
						}
					},
					itemStyle : {
						normal : {
							color : 'rgba(217,0,0,0.5)',
							shadowBlur : 10,
							shadowColor : '#333'
						}
					},
					zlevel : 1
				} ]
			}
	
		myChart2.setOption(options);
		var index = 0;
		setInterval(function(){
			var myData = [];
			if(index == data.length-1)
				index = 0;
			myData.push(data[index++]);
			options.series[1].data=convertData(myData);
			myChart2.setOption(options);
			$(".tip-box").children().eq(0).text(myData[0].value);
			$(".tip-box").children().eq(1).text(myData[0].name);
		},2000)
	}
	// 法人属性分类
	function getFrAttr() {
		$.get("/admin/fullpreview/getFrAttr", function(data) {
			var myChart = echarts.init(document.getElementById('fr_attr'));
			var jsonObj = data.data.map;
			var array = [];
			for(var num in jsonObj ){
				array.push(jsonObj[num]);
			}
			var options = {

				tooltip : {
					trigger : 'axis',
					axisPointer:{
						type:'cross'
					}
				},
				grad:{
					show:true
				},
				xAxis : {

					type : 'category',
					nameLocation:'center',
					axisLine:{
						lineStyle:{
							color:'#298280'
						}
						
					},
				
					axisLabel:{
						show:true,
						textStyle:{
							color:'#fff'
						},
						interval:0
					},
					data : [ '基本信息', '资本与资产', '许可 资质\n与荣誉', '纳税 参保\n与缴费', '生产经营',
							'行政执法', '司法信息', '评价信息', '其他' ]
				},

				yAxis : {
					type : 'value',
					splitLine:{
						show:false
					},
					axisLine:{
						lineStyle:{
							color:'#298280'
						}
					}
				},
				series : [ {
					name : '数量',
					type : 'bar',
					itemStyle:{
						normal:{
							color:'rgba(27,74,92,0.6)'
						}
					},
					label:{
						normal:{
							show:true,
							position:'top',
							textStyle:{
								color:'#fff'
							}
						}
					},
					barCategoryGap:'35',
					data : array
				/*
				 * markPoint : { data : [ {type : 'max', name: '最大值'}, {type :
				 * 'min', name: '最小值'} ] }, markLine : { data : [ {type :
				 * 'average', name: '平均值'} ] }
				 */
				} ]
			};

			myChart.setOption(options);
		})
	}
	// 部门调用数量top10
	function departTop(){
		$.get("/admin/fullpreview/getDepartTop", function(data) {
			var myChart = echarts.init(document.getElementById('depart_top'));
			var options = {
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
						right : '18%',
						bottom : '0',
						top : '15',
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
								color : '#51FFFE',
								opacity : 0.2
							}
						},
						axisLabel : {
							textStyle : {
								color : '#51FFFE'
							}
						},
						splitLine : { // 坐标轴在 grid 区域中的分隔线
							show : true,
							lineStyle : {
								color : 'rgba(33,90,109,0.5)',
								width : 15
							}
						},
						type : 'category',
						data : [ '国土局', '国税局', '人社局', '编办', '地税局', '质监局', '教育局', '文广局',
								'工商局', '发改委' ]
					},
					series : [ {
						barWidth : 15,
						legendHoverLink : false,
						silent : true,
						color : [ '#51FFFE' ],
						label : {
							normal : { // 柱形图上方的文字
								show : true,
								position : [215,0],
								textStyle : {
									color : '#B97F13'
								}
							}
						},
						
						type : 'bar',
						data : [ 172354, 131526, 120412, 188215, 197651, 126542,
								135542, 163542, 180542, 108522 ]
					} ]
				};

			
			myChart.setOption(options);
		})
	}
	// 接口调用数量top10
	function interfaceTop(){
		$.get("/admin/fullpreview/getInterTop", function(data) {
			var myChart = echarts.init(document.getElementById('inter_top'));
			var options = {
					tooltip : {
						show : false,
						confine : true
					// trigger: 'axis',
					// axisPointer: {
					// type: 'shadow'
					// }
					},
					grid : {
						left :'7%',
						right : '18%',
						bottom : '0',
						top : '15',
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
								color : '#51FFFE',
								opacity : 0.2
							}
						},
						axisLabel : {
							textStyle : {
								color : '#51FFFE'
							}
						},
						splitLine : { // 坐标轴在 grid 区域中的分隔线
							show : true,
							lineStyle : {
								color : 'rgba(33,90,109,0.5)',
								width : 15
							}
						},
						type : 'category',
						data : [ '企业基本信息', '吊销企业查询', '股权变更信息', '基金会法人证', '股权出资', '动产抵押查询',
							'行政许可查询', '行政处罚查询','股东或投资人', '动产抵押权人' ]
					},
					series : [ {
						barWidth : 15,
						legendHoverLink : false,
						silent : true,
						color : [ '#51FFFE' ],
						label : {
							normal : { // 柱形图上方的文字
								show : true,
								position : [180,0],
								textStyle : {
									color : '#B97F13'
								}
							}
						},
						
						type : 'bar',
						data : [ 122354, 121546, 120215, 198215, 197651, 196542,
								195542, 183542, 180542, 17852 ]
					} ]
				};

			
			myChart.setOption(options);
		})
	}
	// 法人地区调用情况
	function getFrAreaNum(){
		$.get("/admin/fullpreview/getFrAreaNum", function(data) {
			var myChart = echarts.init(document.getElementById('area_num'));
			myChart.showLoading();
			var option = {
				tooltip : {
					trigger : 'item',
					formatter : "{b}:</br>{d}%"
				},
				legend : {
					orient : 'vertical',
					left : '40%',
					top : '10px',
					itemGap : 8,
					icon : 'rect',
					itemWidth : 10,
					itemHeight : 10,
					textStyle : {
						color : '#fff'
					},
					data :['台州','衢州','舟山','丽水','宁波','杭州','温州','绍兴','金华','湖州','嘉兴']

				},
				series : [ {
					type : 'pie',
					radius : [ '60%', '80%' ],
					center : [ '22%', '50%' ],
					avoidLabelOverlap : true,
					color : [ '#FFAD00', '#5155FF', '#51FE7E', '#FF4900',
							'#B750FF', '#B6FF50', '#51FFFE', '#FF52C8',
							'#215A6E', '#52A3FF','#FF5152' ],
					labelLine : {
						normal : {
							show : false
						}
					},
					label : {
						normal : {
							show : false
						}
					},
					 data: [
			              {name: '台州', value: 100},
			              {name: '衢州', value: 200},
			              {name: '舟山', value: 300},
			              {name: '丽水', value: 400},
			              {name: '宁波', value: 500},
			              {name: '杭州', value: 1200},
			              {name: '温州', value: 600},
			              {name: '绍兴', value: 700},
			              {name: '金华', value: 800},
			              {name: '湖州', value: 1000},
			              {name: '嘉兴', value: 1100}

			          ]
				} ]
			};
			myChart.hideLoading();
			myChart.setOption(option);
		});
	}
	//数据整合
	function dataGather(){
		$.get("/admin/fullpreview/dataGather" , function(data) {
			var myChart = echarts.init($('.first-map')[0]);
		    var nodes = data.data.nodes;
		    var links = data.data.links;
		    //source(源节点)和target(目标节点)颜色
		    var colors = ['{"normal":{"color":"rgb(34,157,215)"}}','{"normal":{"color":"#51a3ff"}}',
		    			'{"normal":{"color":"#5155ff"}}','{"normal":{"color":"#b751ff"}}',
		    			'{"normal":{"color":"#ff51c8"}}','{"normal":{"color":"#ff5151"}}',
		    			'{"normal":{"color":"#51ff7e"}}','{"normal":{"color":"#b7ff51"}}',
		    			'{"normal":{"color":"#ffd851"}}','{"normal":{"color":"#ff8e51"}}',
		    			'{"normal":{"color":"#51ffff"}}','{"normal":{"color":"#51a3ff"}}',
		    			'{"normal":{"color":"#f4a702"}}'
		    	];
		   
		    for(var key in nodes){
		    	 //采用率显示
		    	var total = 0;
		    	var success = 0;
		    	var percent = 0;
		    	for(var lkey in links){
		    		if(nodes[key].name == links[lkey].source){
		    			total+=100;
		    			success+=links[lkey].success
		    		}
		    	}
		    	if(total!=0)
		    		percent = Math.round(success/total*100);
		    	switch(nodes[key].name){
		    		case "省工商局-法定代表人信息":
		    			nodes[key].x=20;
		    			nodes[key].y=31;
		    			nodes[key].itemStyle=JSON.parse(colors[0]);
		    			$(".right").eq(0).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省民政厅-基金会登记":
		    			nodes[key].x=20;
		    			nodes[key].y=52;
		    			nodes[key].itemStyle=JSON.parse(colors[1]);
		    			$(".right").eq(1).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省民政厅-民非登记":
		    			nodes[key].x=20;
		    			nodes[key].y=73;
		    			nodes[key].itemStyle=JSON.parse(colors[2]);
		    			$(".right").eq(2).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省民政厅-社团登记注册":
		    			nodes[key].x=20;
		    			nodes[key].y=94;
		    			nodes[key].itemStyle=JSON.parse(colors[3]);
		    			$(".right").eq(3).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省编办-行政单位":
		    			nodes[key].x=20;
		    			nodes[key].y=115;
		    			nodes[key].itemStyle=JSON.parse(colors[4]);
		    			$(".right").eq(4).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省编办-事业单位":
		    			nodes[key].x=20;
		    			nodes[key].y=136;
		    			nodes[key].itemStyle=JSON.parse(colors[5]);
		    			$(".right").eq(5).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省司法厅-基层法律服务信息":
		    			nodes[key].x=20;
		    			nodes[key].y=157;
		    			nodes[key].itemStyle=JSON.parse(colors[6]);
		    			$(".right").eq(6).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		
		    		case "省司法厅-公证机构基本信息":
		    			nodes[key].x=20;
		    			nodes[key].y=178;
		    			nodes[key].itemStyle=JSON.parse(colors[7]);
		    			$(".right").eq(7).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省司法厅-律师事务所信息":
		    			nodes[key].x=20;
		    			nodes[key].y=199;
		    			nodes[key].itemStyle=JSON.parse(colors[8]);
		    			$(".right").eq(8).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "省工商局-企业基本信息":
		    			nodes[key].x=20;
		    			nodes[key].y=221;
		    			nodes[key].itemStyle=JSON.parse(colors[9]);
		    			$(".right").eq(9).html("采用率<strong>"+percent+"%</strong></span>");
		    			break;
		    		case "主要人员信息临时表":
		    			nodes[key].x=262;
		    			nodes[key].y=51;
		    			nodes[key].symbolSize=[12,60];
		    			nodes[key].itemStyle=JSON.parse(colors[10]);
		    			break;
		    		case "地址信息临时表":
		    			nodes[key].x=262;
		    			nodes[key].y=126;
		    			nodes[key].symbolSize=[12,60];
		    			nodes[key].itemStyle=JSON.parse(colors[11]);
		    			break;
		    		case "基本登记信息临时表":
		    			nodes[key].x=262;
		    			nodes[key].y=201;
		    			nodes[key].symbolSize=[12,60];
		    			nodes[key].itemStyle=JSON.parse(colors[12]);
		    			break;
		    			
		    	}
		    	 //线条颜色显示
		    	for(var lkey in links){
		    		if(nodes[key].name == links[lkey].source){
		    			links[lkey].lineStyle=nodes[key].itemStyle;
		    		}
		    	}
		    }
		    console.log(data.data)
			var option = {
		        series: [
		            {
		                type: 'graph',
		                layout: 'none',
		                symbol: 'rect',
		                tooltip: {
		                    trigger: 'none'
		                },
		                symbolSize: 12,
		                height: '79%',
		                symbolOffset: [0, 4],
		                label: {
		                    normal: {
		                        show: false
		                    },
		                    emphasis: {
		                        show: false
		                    }
		                },
		                edgeSymbol: ['none', 'none'],

		                edgeLabel: {
		                    normal: {
		                        textStyle: {
		                            fontSize: 20
		                        }
		                    }
		                },
		                data: data.data.nodes,
		                links:data.data.links,
		                lineStyle: {
		                    normal: {
		                        opacity: 0.9,
		                        width: 2,
		                        curveness: 0
		                    }
		                }
		            }
		        ]
		    };
		    myChart.setOption(option);
		})
	}
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
})