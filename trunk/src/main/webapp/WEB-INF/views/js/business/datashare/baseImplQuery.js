require(['layer1',
         'component/dataTable',
         'common/util',
         'common/http',
         'jquery',
         'jquery.serialize',
         'handlebars',
         'jquery','laydate'
         ], function (layer, dataTable, util, http, handlebars) {
	
	init();
	var base_table;
	function init(){
		initBaseImpl();
		bind();
	}
	
	function initBaseImpl(){
		base_table = dataTable.load({
			el:'#base_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/dataShare/getBaseImpl',
				data:function(d){
					d.params=$("#base_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
			    {data:'implName',cut:{length:20,repalce:'...'}},
				{data:'descript',cut:{length:20,repalce:'...'}},
				{data:'status',cut:{length:20,repalce:'...'}},
				{data:null}
			],
			columnDefs:[
	            { 
	            	targets:4, render:function(data,type,row,meta){ 
		            	if(row.uri != null && row.uri != ""){
		            		return "<a href='javascript:void(0);' class='look' corpid='"+row.uri+"'>查看详细</a>";
		            	}
	            	}
	            }
				]
		})
		base_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#base_table_wrapper .bottom').hide();}else{$('#base_table_wrapper .bottom').show();}
		})
	}
	
	function bind(){
		util.bindEvents([{
			el:'#base_search',
			event:'click',
			handler:function(){
				base_table.ajax.reload();
			}
		},{ el:'.look', 
			event:'click', 
			handler:function(){
			 var corpid =$(this).attr('corpid');
			 if(corpid != null && corpid != ""){
				 window.open("/data/dataShare/"+corpid,"_blank");
			 }else{
				 layer.msg("没有查到相关数据");
			 }
			 
			 } 
		 }
	 ])
	}
})