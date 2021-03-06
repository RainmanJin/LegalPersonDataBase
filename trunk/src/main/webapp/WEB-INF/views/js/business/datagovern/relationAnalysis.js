require([ 'component/iframeLayer', 'component/dataTable', 'common/util',
		'common/http', 'handlebars', 'jquery', 'jquery.serialize', 'laydate',
		'jquery.validate', 'pagination' ], function(layer, dataTable, util,
		http, handlebars) {
	var entTable, glfx_flag = 0;

	init();
	function init() {
		_bind();
	}
	;

	function initDataTable() {
		entTable = dataTable.load(
					{
					// 需要初始化dataTable的dom元素
					el : '#tab_glfx',
					showIndex : true,
					scrollX : true,
					aLengthMenu : [ 10, 20, 50, 100 ],
					ajax : {
						url : '/data/datagovern/queryRelationAnalysis',
						data : function(d) {
							d.params = $("#form_glfx").serializeObject();

						}
					},
					columns : [ {
						data : null,
						defaultContent : 1,
					}, {
						data : "datasrdep"
					}, {
						data : "datasource"
					}, {
						data : "numBef"
					}, {
						data : "tablename"
					}, {
						data : "numAft"
					}, {
						data : "glv"
					} ],
					columnDefs : [

					]
				})
				entTable.on('xhr.dt', function(e, settings, json, xhr) {
					if (json.recordsTotal <= 5) {
						$('#tab_glfx_wrapper .bottom').hide();
					} else {
						$('#tab_glfx_wrapper .bottom').show();
					}
				})
	
	}

	function _bind() {
		util.bindEvents([ {
			el : '.btn-vf',
			event : 'click',
			handler : function() {
				$(this).addClass('cur').siblings().removeClass('cur');
			}
		}, {
			el : '#entSearch',
			event : 'click',
			handler : function() {
				$("#allSearch").click();
				if (glfx_flag == 0) {
					initDataTable();
					glfx_flag = 1;
				} else {
					entTable.ajax.reload();
				}
			}
		}, {
			el : '#allSearch',
			event : 'click',
			handler : function() {
				if (glfx_flag == 0) {
					initDataTable();
					glfx_flag = 1;
				} else {
					entTable.ajax.reload();
				}
			}
		}, {
			el : '#weekSerach',
			event : 'click',
			handler : function() {
				$("#dataType").val(1);
				if (glfx_flag == 0) {
					initDataTable();
					glfx_flag = 1;
				} else {
					entTable.ajax.reload();
				}
			}
		}, {
			el : '#monthSerach',
			event : 'click',
			handler : function() {
				$("#dataType").val(2);
				if (glfx_flag == 0) {
					initDataTable();
					glfx_flag = 1;
				} else {
					entTable.ajax.reload();
				}
			}
		}, {
			el : '#allSearch',
			event : 'click',
			handler : function() {
				$(".all").show();
			}
		}, {
			el : '#weekSerach',
			event : 'click',
			handler : function() {
				$(".all").hide();
				$(".week").show();
			}
		}, {
			el : '#monthSerach',
			event : 'click',
			handler : function() {
				$(".all").hide();
				$(".month").show();
			}
		} ])
	}
});
