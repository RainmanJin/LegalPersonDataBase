require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 
	'handlebars', 'jquery','jquery.serialize','laydate','jquery.validate','pagination'], 
	function (layer, dataTable, util, http,handlebars) {
	var params = $("#produce-form").serializeObject();
	var table_fddbr,table_cydwxx,table_frbgxx;
	
	
	init();
	
  /**
   * 初始化函数集合
   */
  function init() {
    var errormsg =  $("#errormsg").val();
    if(errormsg != null && errormsg != ""){
    	initSSFlex();
    	layer.msg(errormsg);
    }else{
  	  	_bind();
  	  	init_basic();
    }
  }
    
    function init_basic(){
    	if((table_fddbr+'')=='undefined'){
    		initDataTable_fddbr();
    	}
    	if((table_cydwxx+'')=='undefined'){
    		initDataTable_cydwxx();
    	}
    	
    	if((table_frbgxx+'')=='undefined'){
    		initDataTable_frbgxx();
    	}
    }
    //展开与收缩
    function initAddflex(yrinfo_li){ 
    	 $("#"+yrinfo_li).parent().next().hide();
         $("#"+yrinfo_li).attr("class","flex-icon on")
   }
    //初始化异常全部收缩
    function initSSFlex(){
    	$("table").hide();
    }
    //法定代表人_高管
    function initDataTable_fddbr() {
    	table_fddbr = dataTable.load({
		el : '#table_fddbr',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/basic/fddbr' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'xm'},
			{data:'zjlx'},
			{data:'zjhm'},
			{data:'zw'},
			{data:'rmf'},
			{data:'rzqsrq'},
			{data:'rzjzrq'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_fddbr.on('init.dt',function(e,settings,json){
    		if(json.recordsTotal <= 5){
    			$('#table_fddbr_wrapper .bottom').hide();
    		}else{
    			$('#table_fddbr_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_fddbr_icon");
    		}
        })
	}
    
    
  //成员单位信息
    function initDataTable_cydwxx() {
    	table_cydwxx = dataTable.load({
		el : '#table_cydwxx',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/basic/cydwxx' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'xm'},
			{data:'zjlx'},
			{data:'zjhm'},
			{data:'szbm'},
			{data:'rzrq'},
			{data:'lzrq'},
			{data:'zgzmc'},
			{data:'zgzbfrq'},
			{data:'zgzbfbm'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_cydwxx.on('init.dt',function(e,settings,json){
    		if(json.recordsTotal <= 5){
    			$('#table_cydwxx_wrapper .bottom').hide();
    		}else{
    			$('#table_cydwxx_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_cydwxx_icon");
    		}
        })
	}
    
    
    
  //法人变更信息
    function initDataTable_frbgxx() {
    	table_frbgxx = dataTable.load({
		el : '#table_frbgxx',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/basic/frbgxx' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'bgsx'},
			{data:'bgyy'},
			{data:'bgqnr'},
			{data:'bghnr',className:'white-space-n'},
			{data:'hzrq'}
		],
		columnDefs : [
		
				 ]
	  });
    	table_frbgxx.on('init.dt',function(e,settings,json){
    		if(json.recordsTotal <= 5){
    			$('#table_frbgxx_wrapper .bottom').hide();
    		}else{
    			$('#table_frbgxx_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_frbgxx_icon");
    		}
        })
	}

  
    /**
     * 事件绑定
     * @private
     */
    function _bind() {
        util.bindEvents([
            {
                el: '.flex-icon',
                event: 'click',
                handler: function () {
                    // 隐藏table
                    $(this).parent().next().hide();
                    $(this).attr("class","flex-icon on")
                }
            },
            {
                el: '.on',
                event: 'click',
                handler: function () {
                    // 显示table
                    $(this).parent().next().show();
                    $(this).attr("class","flex-icon");
                }
            }
        ])
    }
});
