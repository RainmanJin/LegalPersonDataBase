require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'handlebars', 'jquery','jquery.serialize','laydate'],
		function (layer, dataTable, util, http,handlebars) {
	var table;
	var searchParams=$("#hxForm").serializeObject();//查询参数声明!
    init();
    /**
     * 初始化函数集合
     */
    function init() {
        initDataTable();
    }
    /**
     * 初始化dataTable
     */
    function initDataTable(){
    	table = dataTable.load({
			el:'#hx-table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/log/list',
				data:function(d){
					/*d.params=searchParams;*/
				}
			},
			columns:[
			         {data:null,defaultContent:1,className:'center'},
			         {data: "logUser", className: 'center'},
		            	{data: "logType", className: 'center'},
		            	{data: "logIp", className: 'center'},
		            	{data: "logTime", className: 'center'},
		            	{data: "logRemark", className: 'center'}
			],
			columnDefs:[
			            
	            ]
		})
		table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#hx-table_wrapper .bottom').hide();}else{$('#hx-table_wrapper .bottom').show();}
		})
	}
});


