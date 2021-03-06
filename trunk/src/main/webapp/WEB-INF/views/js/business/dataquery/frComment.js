require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 
	'handlebars', 'jquery','jquery.serialize','laydate','jquery.validate','pagination'], 
	function (layer, dataTable, util, http,handlebars) {
	

	var params = $("#comment-form").serializeObject();
	var table_yzwfsxHmd,table_ycjyml,table_qdxx;

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
          init_product();
      }
       
    }
    
    function init_product(){
    	if((table_yzwfsxHmd+'')=='undefined'){
    		initDataTable_yzwfsxHmd();
    	}
    	if((table_ycjyml+'')=='undefined'){
    		initDataTable_ycjyml();
    	}
    	if((table_qdxx+'')=='undefined'){
    		initDataTable_qdxx();
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
    //严重违法失信(黑名单)
    function initDataTable_yzwfsxHmd() {
    	table_yzwfsxHmd = dataTable.load({
		el : '#table_yzwfsxHmd',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/search/comment/doGetChBlHmdxxValidList.json' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
		    {data:'hmdmc',cut:{length:20,repalce:'...'}},
			{data:'nyhzqyhdmyy',cut:{length:20,repalce:'...'}},
			{data:'lryzwfsxqymdyy',cut:{length:20,repalce:'...'}},
			{data:'lrhmdrq',cut:{length:20,repalce:'...'}},
			{data:'lrzcjdjg',cut:{length:20,repalce:'...'}}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_yzwfsxHmd.on('init.dt',function(e,settings,json){
    		var ajxxNum=json.recordsTotal;
    		if(ajxxNum <= 5){
    			$('#table_yzwfsxHmd_wrapper .bottom').hide();
    		}else{
    			$('#table_yzwfsxHmd_wrapper .bottom').show();
    		}
    		if(ajxxNum == 0){
    			initAddflex("table_yzwfsxHmd_icon");
    		}
    		
    		if(ajxxNum>0){  			
    			$("#yzwfsxHmdNumber").text(ajxxNum);
    			$("#yzwfsxHmdNumber").css("color","red");       		    			
    		}
    		
        })
	}
  //异常经营
    function initDataTable_ycjyml() {
    	table_ycjyml = dataTable.load({
		el : '#table_ycjyml',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/search/comment/doGetChBlJyycmlValidList.json' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
		    {data:'lrjyycmlyy',className:'center',cut:{length:20,repalce:'...'}},
			{data:'lrjyycmlrq',className:'center',cut:{length:20,repalce:'...'}},
			{data:'zclrjdjg',className:'center',cut:{length:20,repalce:'...'}},
			{data:'ycjyycmlyy',className:'center',cut:{length:20,repalce:'...'}},
			{data:'ycjyycmlrq',className:'center',cut:{length:20,repalce:'...'}},
			{data:'zcycjdjg',className:'center',cut:{length:20,repalce:'...'}}
		],
		columnDefs : [
				 ],
	    	    
	  });
    	table_ycjyml.on('init.dt',function(e,settings,json){
    		var WlxNum=json.recordsTotal;
    		if(WlxNum <= 5){
    			$('#table_ycjyml_wrapper .bottom').hide();
			}else{
				$('#table_ycjyml_wrapper .bottom').show();
			}
    		if(WlxNum == 0){
    			initAddflex("table_ycjyml_icon");
    		}
    		if(WlxNum>0){
    			$("#ycjymlNumber").text(WlxNum);
    			$("#ycjymlNumber").css("color","red");       		    			
    		}
    		
        })
	}
    
    
    function initDataTable_qdxx() {
    	table_qdxx = dataTable.load({
		el : '#table_qdxx',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/search/comment/doGetChBlQdjlValidList.json' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
		    {data:'ydhh',cut : {length : 20,repalce : '...'}},
			{data:'ydhm',cut : {length : 20,repalce : '...'}},
			{data:'yddz',cut : {length : 20,repalce : '...'}},
			{data:'qdl',cut : {length : 20,repalce : '...'}},
			{data:'qdsd',cut : {length : 20,repalce : '...'}},
			{data:'qdze',cut : {length : 20,repalce : '...'}}
		],
		columnDefs : [
				 ],
	    	    
	  });
    	table_qdxx.on('init.dt',function(e,settings,json){
    		var WlxNum=json.recordsTotal;
    		if(WlxNum <= 5){
    			$('#table_qdxx_wrapper .bottom').hide();
			}else{
				$('#table_qdxx_wrapper .bottom').show();
			}
    		if(WlxNum == 0){
    			initAddflex("table_qdxx_icon");
    		}
    		if(WlxNum>0){
    			$("#qdxxNumber").text(WlxNum);
    			$("#qdxxNumber").css("color","red");       		    			
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
