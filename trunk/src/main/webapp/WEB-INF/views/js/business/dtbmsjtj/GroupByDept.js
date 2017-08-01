require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'common/busUtil', 'handlebars'], function(layer, dataTable, util, http,busUtil,handlebars) {

	var entTable;
	init();

	function init() {
		initDataTable();
	}
	

	function initDataTable() {
		entTable = dataTable.load({
			// 需要初始化dataTable的dom元素
			el : '#search_table',
			showIndex : true,
			scrollX : true,
			aLengthMenu : [ 10, 20, 50, 100 ],
			ajax : {
				url : '/data/dtbmsjtj/groupbydept.json'
				
			},
			columns : [ 
                {data: null, defaultContent: '', width: '30px'},
                {data: 'bmmc'},
                {data: 'qxksl'},
                {data: 'frksl'},
                {data: 'cyl'}
            ]
			
		});
	}
	
});