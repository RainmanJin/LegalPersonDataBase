require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'jquery.validate', 'common/validateRules',
      'common/ajaxfileupload'],
   function (layer, dataTable, util, http, busUtil, handlebars) {
		var entTable;
		init();
		function init(){
			bind();
		}
		
		
		function initStatisticsTable() {
			entTable = dataTable.load({
				// 需要初始化dataTable的dom元素
				el : '#tab_mltj',
				showIndex : true,
				scrollX : true,
				aLengthMenu : [ 5, 10, 20, 50, 100 ],
				ajax : {
					url : '/data/datagovern/statisticsDetail',
					data : function(d) {
						d.params = $("#form_mltj").serializeObject();
					}
				},
				columns : [ {
					data : null,
					defaultContent : 1,
				}, {
					data : "datasrdep"
				}, {
					data : "tablename"
				},{
					data : "numAft"
				}, {
					data : "stroageType"
				}, {
					data : "createtime"
				}],
				columnDefs : [{
					
				}]
			});
			entTable.on('xhr.dt',function(e,settings,json,xhr){
				if(json.recordsTotal <= 5){$('#tab_mltj_wrapper .bottom').hide();}else{$('#tab_mltj_wrapper .bottom').show();}
			})
		}
		
		function bind() {
			util.bindEvents([ {
				el : '#entSearch',
				event : 'click',
				handler : function() {
					 var startTime = $("#ruku_startTime").val();
		              var endTime = $("#ruku_endTime").val();
		              if (endTime != ""&& endTime != null && startTime > endTime) {
		                layer.msg("开始日期不能大于结束日期");
		                return false;
		              }
					var tr = $("#tab_mltj tbody tr:first").text();
					if(tr=="" || tr==null ){
						initStatisticsTable();
					}else{
					entTable.ajax.reload();
				}}
			}])
		}
})