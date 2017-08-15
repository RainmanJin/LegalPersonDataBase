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

	//案件信息查询
	function initTableAjxx(){
		ajxx_table = dataTable.load({
			el:'#ajxx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getChSfajAjxxValid',
				data:function(d){
					d.params=$("#ajxx_form").serializeObject();
				
				}
			},
			columns:[{data:null,defaultContent:1,className:'center',width:"10px;"},
				{data:'ajdsrmc',className:'center',width:"150px;",cut:{length:20,repalce:'...'}},
				{data:'ah',className:'center',width:"150px;",cut:{length:20,repalce:'...'}},
				{data:'ay',className:'center',width:"150px;",cut:{length:20,repalce:'...'}},
				{data:'jarq',className:'center',width:"100px;",cut:{length:20,repalce:'...'}},
				{data:'pjjg',className:'center',width:"100px;",cut:{length:20,repalce:'...'}},
				{data:'sxrq',className:'center',width:"50px;",cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybsBzx+"'>"+row.ajdsrmc+"</a>";
					}
				}]
		})
		ajxx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#ajxx_tab .dataTables_wrapper .bottom').hide();}else{$('#ajxx_tab .dataTables_wrapper .bottom').show();}
		})
	}

	//案件当事人信息查询
	function initTableAjdsrxx(){
		ajdsrxx_table = dataTable.load({
			el:'#ajdsrxx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getChSfajAjdsrxx',
				data:function(d){
					d.params=$("#ajdsrxx_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dsrmc',className:'center',cut:{length:20,repalce:'...'}},
				{data:'sfzjhm',className:'center',cut:{length:20,repalce:'...'}},
				{data:'dsrlx',className:'center',cut:{length:20,repalce:'...'}},
				{data:'datasrdep',className:'center',cut:{length:20,repalce:'...'}},
				{data:'ssdw',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dsrmc+"</a>";
					}
				}]
		})
		ajdsrxx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#ajdsrxx_tab .dataTables_wrapper .bottom').hide();}else{$('#ajdsrxx_tab .dataTables_wrapper .bottom').show();}
		})
	}

	//单位未履行生效裁判信息查询
	function initTableDwwlx(){
		dwwlx_table =  dataTable.load({
			el:'#dwwlx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getChSfajDwwlxxsxxx',
				data:function(d){
					d.params=$("#dwwlx_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'zxfy',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zxyj',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zxay',className:'center',cut:{length:20,repalce:'...'}},
				{data:'lxsj',className:'center',cut:{length:20,repalce:'...'}},
				{data:'wzxje',className:'center',cut:{length:20,repalce:'...'}},
				{data:'wzxxw',className:'center',cut:{length:20,repalce:'...'}},
				{data:'wzxwp',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						if(row.zxfy != null){
							return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.zxfy+"</a>";
						}
					}
				}]
		})
		dwwlx_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#dwwlx_tab .dataTables_wrapper .bottom').hide();}else{$('#dwwlx_tab .dataTables_wrapper .bottom').show();}
		})
	}

	//失信被执行人查询
	function initTableSxbzxr(){
		sxbzxr_table=dataTable.load({
			el:'#sxbzxr_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getChSfajSxbzxr',
				data:function(d){
					d.params=$("#sxbzxr_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'bzxrmc',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zxfy',className:'center',cut:{length:20,repalce:'...'}},
				{data:'lasj',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zczxyjdw',className:'center',cut:{length:20,repalce:'...'}},
				{data:'bzxrlxqk',className:'center',cut:{length:20,repalce:'...'}},
				{data:'fbsj',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				{
					targets:1,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.bzxrwybs+"'>"+row.bzxrmc+"</a>";
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
				if(sxbzxr_flag==0){
					initTableSxbzxr();sxbzxr_flag = 1;
				}else{
					sxbzxr_table.ajax.reload();
				}
			}
		}
		,
		{ el:'.look', event:'click', handler:function(){
			 var corpid =$(this).attr('corpid');
			 if(corpid != null && corpid != ""){
				 window.open("/data/frdetail/lawinfo/"+corpid,"_blank");
			 }else{
				 layer.msg("没有查到相关数据");
			 }
			 
			 } 
		}
		])
	}
})
