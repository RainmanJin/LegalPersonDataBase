require(['layer1',
         'component/dataTable',
         'common/util',
         'common/http',
         'jquery',
         'jquery.serialize',
         'handlebars',
         'jquery','laydate', 'jquery.validate', 'common/validateRules'], function (layer, dataTable, util, http, handlebars) {
	
	var yzwfsxHmd_table,ycjyml_table,yzwfsxHmd_flag=0,ycjyml_flag=0;
//	,sxbzxr_table,ajdsrxx_flag=0,sxbzxr_flag=0
	init();
	
	function init(){
		bind();
	}
	
	//严重违法失信黑名单
	function initTableYzwfsxHmd(){
		yzwfsxHmd_table = dataTable.load({
			el:'#yzwfsxHmd_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/comment/doGetChBlHmdxxValidList.json',
				data:function(d){
					d.params=$("#yzwfsxHmd_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1},
				{data:'hmdmc',cut:{length:20,repalce:'...'}},
				{data:'nyhzqyhdmyy',cut:{length:20,repalce:'...'}},
				{data:'lryzwfsxqymdyy',cut:{length:20,repalce:'...'}},
				{data:'lrhmdrq',cut:{length:20,repalce:'...'}},
				{data:'lrzcjdjg',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				]
		})
	}

	//异常经营名录
	function initTableYcjyml(){
		ycjyml_table = dataTable.load({
			el:'#ycjyml_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/comment/doGetChBlJyycmlValidList.json',
				data:function(d){
					d.params=$("#ycjyml_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'lrjyycmlyy',className:'center',cut:{length:20,repalce:'...'}},
				{data:'lrjyycmlrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zclrjdjg',className:'center',cut:{length:20,repalce:'...'}},
				{data:'ycjyycmlyy',className:'center',cut:{length:20,repalce:'...'}},
				{data:'ycjyycmlrq',className:'center',cut:{length:20,repalce:'...'}},
				{data:'zcycjdjg',className:'center',cut:{length:20,repalce:'...'}}
			],
			columnDefs:[
				]
		})
	}



	function bind(){
		util.bindEvents([{
			el:'#yzwfsxHmd_search',
			event:'click',
			handler:function(){
				if(yzwfsxHmd_flag==0){
					initTableYzwfsxHmd();yzwfsxHmd_flag = 1;
				}else{
					yzwfsxHmd_table.ajax.reload();
				}
			}
		},{
			el:'#ycjyml_search',
			event:'click',
			handler:function(){
				if(ycjyml_flag==0){
					initTableYcjyml();ycjyml_flag=1;
				}else{
					ycjyml_table.ajax.reload();
				}
				
			}
		},{ 
			el:'.mytab', 
			event:'click', 
			handler:function(){
				var tabIndex=$(this).index();
				$(".mytab").removeClass("current");
				$(".mytab").eq(tabIndex).addClass("current");
				$(".tabbale").hide();
				$(".tabbale").eq(tabIndex).show();
			} 

			}
		
		])
	}
})
