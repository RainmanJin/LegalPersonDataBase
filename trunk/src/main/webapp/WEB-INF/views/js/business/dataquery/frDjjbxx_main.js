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
			{data:'xm',cut : {length : 20,repalce : '...'}},
			{data:'zjlx',cut : {length : 20,repalce : '...'}},
			{data:'zjhm',cut : {length : 20,repalce : '...'}},
			{data:'zw',cut : {length : 20,repalce : '...'}},
			{data:'rmf',cut : {length : 20,repalce : '...'}},
			{data:'datasrdep',cut : {length : 20,repalce : '...'}}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_fddbr.on('init.dt',function(e,settings,json){
    		var fddbrNum = json.recordsTotal;
    		if(fddbrNum <= 5){
    			$('#table_fddbr_wrapper .bottom').hide();
    		}else{
    			$('#table_fddbr_wrapper .bottom').show();
    		}
    		if(fddbrNum == 0){
    			initAddflex("table_fddbr_icon");
    		}
    		if(fddbrNum > 0){
    			$("#ggryxx").text(fddbrNum);
    			$("#ggryxx").css("color","red");
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
		    {data:'dwmc',cut : {length : 30,repalce : '...'}},
			{data:'xm',cut : {length : 30,repalce : '...'}},
			{data:'zjhm',cut : {length : 30,repalce : '...'}},
			{data:'zgzmc',cut : {length : 30,repalce : '...'}},
			{data:'zgzbh',cut : {length : 30,repalce : '...'}},
			{data:'zgzbfbm',cut : {length : 30,repalce : '...'}}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_cydwxx.on('init.dt',function(e,settings,json){
    		var cydwxxNum = json.recordsTotal;
    		if(cydwxxNum <= 5){
    			$('#table_cydwxx_wrapper .bottom').hide();
    		}else{
    			$('#table_cydwxx_wrapper .bottom').show();
    		}
    		if(cydwxxNum == 0){
    			initAddflex("table_cydwxx_icon");
    		}
    		if(cydwxxNum > 0){
    			$("#cydwxx").text(cydwxxNum);
    			$("#cydwxx").css("color","red");
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
			{data:'bgsx',cut : {length : 20,repalce : '...'}},
			{data:'bgyy',cut : {length : 20,repalce : '...'}},
			{data:'bgqnr',cut : {length : 20,repalce : '...'}},
			{data:'bghnr',cut : {length : 20,repalce : '...'}},
			{data:'hzrq',cut : {length : 20,repalce : '...'}}
		],
		columnDefs : [
		
				 ]
	  });
    	table_frbgxx.on('init.dt',function(e,settings,json){
    		var frbgxxNum = json.recordsTotal;
    		if(frbgxxNum <= 5){
    			$('#table_frbgxx_wrapper .bottom').hide();
    		}else{
    			$('#table_frbgxx_wrapper .bottom').show();
    		}
    		if(frbgxxNum == 0){
    			initAddflex("table_frbgxx_icon");
    		}
    		if(frbgxxNum > 0){
    			$("#frbgxx").text(frbgxxNum);
    			$("#frbgxx").css("color","red");
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
