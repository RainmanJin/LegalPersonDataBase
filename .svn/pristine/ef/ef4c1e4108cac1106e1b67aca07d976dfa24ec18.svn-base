require([ 'component/iframeLayer', 'component/dataTable', 'common/util',
		'common/http', 'handlebars', 'echarts', 'zhejiang', 'jquery',
		'jquery.serialize' ], function(layer, dataTable, util, http,
		handlebars, echarts) {
	/*handlebars.registerHelper("eachFunction",function(value){
		getCityDetail();
	 });*/
	init();
	/**
	 * 初始化函数集合
	 */
	function init() {
		
		getCityDetail();
	}
	
	function getCityDetail(){
		http.httpRequest({
            url: '/data/datacount/getCityDetail.json',
            serializable: false,
            data: {},
            success: function (data) {
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
					fontWeight:'normal',
					color : '#00ccff'
				}

			},
			tooltip : {
				trigger : 'item',
				formatter: '{a}</br>&nbsp;&nbsp;&nbsp;&nbsp;{b}: {c}'
			},
			visualMap : {
				min : 0,
				max : 1000000,
				left : '10px',
				bottom:'10px',
				text : [ '高', '低' ], // 文本，默认为数值文本
				color : [ '#0f7ae2', '#5a94e4' ],
				calculable : true
			},
			series : [ {
				name:'法人数量',
				type : 'map',
				mapType : 'zhejiang',
				top:'27px',
				bottom:'8px',
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
					value :  data['舟山市']
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

});