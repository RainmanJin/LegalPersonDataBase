require(['layer1',
         'component/dataTable',
         'common/util',
         'common/http',
         'jquery',
         'jquery.serialize',
         'handlebars',
         'jquery','laydate'], function (layer, dataTable, util, http, handlebars) {
	
	var ajxx_table,ajdsrxx_table,dwwlx_table,sxbzxr_table,ajxx_flag=0,ajdsrxx_flag=0,dwwlx_flag=0,sxbzxr_flag=0;
	
	init();
	
	function init(){
		bind();
	}

	//主体登记信息查询
	function initTableAjxx(){
		ajxx_table = dataTable.load({
			el:'#ajxx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getCaDjJbxx',
				data:function(d){
					d.params=$("#ajxx_form").serializeObject();
				
				}
			},
			columns:[{data:null,defaultContent:1},
				{data:'frmc',cut:{length:20,repalce:'...'}},
				{data:'fddbr',cut:{length:20,repalce:'...'}},
				{data:'zs',cut:{length:20,repalce:'...'}},
				{data:'djjg',cut:{length:20,repalce:'...'}},
				{data:'fr_content',cut:{length:20,repalce:'...'}},
				{data:'djrq',cut:{length:20,repalce:'...'}},
				{data:'ywfw',cut:{length:20,repalce:'...'}},
				{data:'hydm',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.frmc+"</a>";
					}
				}]
		})
		ajxx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#ajxx_tab .dataTables_wrapper .bottom').hide();}else{$('#ajxx_tab .dataTables_wrapper .bottom').show();}
		})
	}

	//法定代表人—高管查询
	function initTableAjdsrxx(){
		ajdsrxx_table = dataTable.load({
			el:'#ajdsrxx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getCaCyFddbr',
				data:function(d){
					d.params=$("#ajdsrxx_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'xm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zjlx',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zjhm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zw',className:'center',cut:{length:20,repalce:'...'}},
				{data:'rmf',className:'center',cut:{length:20,repalce:'...'}},
				{data:'rzqsrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'rzjzrq',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.xm+"</a>";
					}
				}]
		})
		ajdsrxx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#ajdsrxx_tab .dataTables_wrapper .bottom').hide();}else{$('#ajdsrxx_tab .dataTables_wrapper .bottom').show();}
		})
	}

	//成员单位信息查询
	function initTableDwwlx(){
		dwwlx_table  = dataTable.load({
			el:'#dwwlx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getCaCyCyxx',
				data:function(d){
					d.params=$("#dwwlx_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'xm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zjlx',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zjhm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'szbm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'rzrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'lzrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zgzmc',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zgzbfrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zgzbfbm',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.xm+"</a>";
					}
				}]
		})
		dwwlx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#dwwlx_tab .dataTables_wrapper .bottom').hide();}else{$('#dwwlx_tab .dataTables_wrapper .bottom').show();}
		})
	}


	//法人变更信息查询
	function initTableSxbzxr(){
		sxbzxr_table=dataTable.load({
			el:'#sxbzxr_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getCaCxBgxx',
				data:function(d){
					d.params=$("#sxbzxr_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'bgsx',className:'center',cut:{length:20,repalce:'...'}},
				{data:'bgyy',className:'center',cut:{length:20,repalce:'...'}},
				{data:'bgqnr',className:'center',cut:{length:20,repalce:'...'}},
				{data:'bghnr',className:'center',cut:{length:20,repalce:'...'}},
				{data:'hzrq',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.bgsx+"</a>";
					}
				}]
		})
		sxbzxr_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#sxbzxr_tab .dataTables_wrapper .bottom').hide();}else{$('#sxbzxr_tab .dataTables_wrapper .bottom').show();}
		})
	}

	function bind(){
		util.bindEvents([{
			el:'#ajxx_search',
			event:'click',
			handler:function(){
				if(ajxx_flag==0){					
					initTableAjxx();ajxx_flag = 1;
				}else{
					ajxx_table.ajax.reload();
				}
			}
		},{
			el:'#ajdsrxx_search',
			event:'click',
			handler:function(){
				if(ajdsrxx_flag==0){
					initTableAjdsrxx();ajdsrxx_flag = 1;
				}else{
					ajdsrxx_table.ajax.reload();
				}
			}
		},{
			el:'#dwwlx_search',
			event:'click',
			handler:function(){
				if(dwwlx_flag==0){
					initTableDwwlx();dwwlx_flag = 1;
				}else{
					dwwlx_table.ajax.reload();
				}
			}
		},{
			el:'#sxbzxr_search',
			event:'click',
			handler:function(){
		
				var startTime = $("#jtjs_startTime").val();
				var endTime = $("#jtjs_endTime").val();
				if(startTime !=""&& startTime != null && endTime !="" && endTime != null && startTime > endTime){
					layer.msg("日期有误，确认后请重新输入");
					return false;
				}
				
				
				if(sxbzxr_flag==0){
					initTableSxbzxr();sxbzxr_flag = 1;
				}else{
					sxbzxr_table.ajax.reload();
				}
			}
		},
		{ el:'.look', event:'click', handler:function(){
			 var corpid =$(this).attr('corpid');
			 if(corpid != null && corpid != ""){
				 window.open("/data/frdetail/djjbxx/"+corpid,"_blank");
				 
				 
			 }else{
				 layer.msg("没有查到相关数据");
			 }
			 
			 } 
		}
		
		])
	}
})
