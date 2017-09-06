require(['layer1',
         'component/dataTable',
         'common/util',
         'common/http',
         'jquery',
         'jquery.serialize',
         'handlebars',
         'jquery','laydate', 'jquery.validate', 'common/validateRules'], function (layer, dataTable, util, http, handlebars) {
	
	var tab_mltj,mltj_flag=0;
	init();
	function init(){
		bind();
	}
	
	function initTableMltj(){
		tab_mltj = dataTable.load({
			el:'#tab_mltj',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/datagovern/getMltj',
				data:function(d){
					d.params=$("#form_mltj").serializeObject();
				
				}
			},
			columns:[{data:null,defaultContent:1},
				{data:'datasrdep'},
				{data:'rksj'},
				{data:'rksjbsl'}
			]
		})
		tab_mltj.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#tab_mltj_wrapper .bottom').hide();}else{$('#tab_mltj_wrapper .bottom').show();}
		})
	}
	
	function bind(){
		util.bindEvents([{
			el:'#entSearch',
			event:'click',
			handler:function(){
				if(mltj_flag==0){					
					initTableMltj();mltj_flag = 1;
				}else{
					tab_mltj.ajax.reload();
				}
			}
		}
		])
		}
	
	
	
})