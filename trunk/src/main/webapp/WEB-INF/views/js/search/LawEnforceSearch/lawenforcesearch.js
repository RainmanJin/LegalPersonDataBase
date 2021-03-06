require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'jquery.validate', 'common/validateRules',
      'common/ajaxfileupload'],
    function (layer, dataTable, util, http, busUtil, handlebars) {

	var entTable,xzcfTable,xzqzTable,zdjgTable,bhgjlTable,jgnjTable,qynbTable,
	ldbzTable,wxdnjTable,jcjkTable,qdjlTable,sgxxTable,yhjlTable,fljgTable,jdccTable,
	xzcf_flag=0,xzqz_flag=0,zdjg_flag=0,bhgjl_flag=0,jgnj_flag=0,qynb_flag=0,
	ldbz_flag=0,wxdnj_flag=0,jcjk_flag=0,qdjl_flag=0,sgxx_flag=0,yhjl_flag=0,
	fljg_flag=0,jdcc_flag=0;
	var xzcf_Form = $("#xzcf_form").serializeObject();
	var xzqz_Form = $("#xzqz_form").serializeObject();
	var zdjg_Form = $("#zdjg_form").serializeObject();
	var bhgjl_Form = $("#bhgjl_form").serializeObject();
	var jgnj_Form = $("#jgnj_form").serializeObject();
	var qynb_Form = $("#qynb_form").serializeObject();
	var ldbz_Form = $("#ldbz_form").serializeObject();
	var wxdnj_Form = $("#wxdnj_form").serializeObject();
	var jcjk_Form = $("#jcjk_form").serializeObject();
	var qdjl_Form = $("#qdjl_form").serializeObject();
	var sgxx_Form = $("#sgxx_form").serializeObject();
	var yhjl_Form = $("#yhjl_form").serializeObject();
	var fljg_Form = $("#fljg_form").serializeObject();
	var jdcc_Form = $("#jdcc_form").serializeObject();
	init();

	function init() {
		QdjlFormValidate();
		bind();
	}
  
    function QdjlFormValidate() {
        $('#qdjl_form').validate({
          rules: {
        	  qdlStart: {required: false, number: true},
        	  qdlEnd: {required: false, number: true}
          },
          onkeyup: false,
          showErrors: function (errorMap) {
            for (var i in errorMap) {
              layer.tips(errorMap[i],
                  $('#qdjl_form input[name=' + i + '],textarea[name=' + i
                      + ']'), {
                    tips: 3, tipsMore: true, ltype: 0
                  });
            }
          },
          onsubmit: false,
          messages: {},
          submitHandler: function () {
          }
        });
      }
	function initDataTable() {
		entTable = dataTable.load({
			// 需要初始化dataTable的dom元素
			el : '#search_table',
			showIndex : true,
			scrollX : true,
			aLengthMenu : [ 5, 10, 20, 50, 100 ],
			ajax : {
				url : '/data/search/lawenforcesearch.json',
				data : function(d) {
					d.params = $("#search_form").serializeObject();
				}
			},
			columns : [ {
				data : null,
				defaultContent : 1,
			}, {
				data : "frmc"
			}, {
				data : "frwybs"
			}, {
				data : "fddbr"
			}, {
				data : "djrq"
			}, {
				data : "hydm"
			}, {
				data : "cxzt"
			}],
			columnDefs : [{
				  targets : 2,
	           	  render : function(data, type, row, meta){
	           		  return "<a href='javascript:void(0)' class='tyxydm' priPID='"+row.tyxydm+"'>" + row.frwybs + "</a>";
	           	  }
			}]
		});
	}
	//行政处罚信息
	function initTableXzcf(){
		xzcfTable = dataTable.load({
			el:'#xzcf_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findXzcfMsg',
				data:function(d){
					d.params=xzcf_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'xzcfZfbm',className:'center',width:"100px;"},
				{data:'xzcfWh',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'xzcfQlsx',className:'center',width:"100px;"},
				{data:'xzcfRq',className:'center',width:"100px;"},
				{data:'datasrdep',className:'center',width:"100px;"}
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		xzcfTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#xzcf_table_wrapper .bottom').hide();}else{$('#xzcf_table_wrapper .bottom').show();}
		})
	}
	
	//行政强制信息
	function initTableXzqz(){
		xzqzTable = dataTable.load({
			el:'#xzqz_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findXzqzMsg',
				data:function(d){
					d.params=xzqz_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'xzqzLscsrq',className:'center',width:"100px;"},
				{data:'xzqzJcrq',className:'center',width:"100px;"},
				{data:'xzqzZxwh',className:'center',width:"100px;"},
				{data:'xzqzZxnr',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'xzqzZxrq',className:'center',width:"100px;"}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		xzqzTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#xzqz_table_wrapper .bottom').hide();}else{$('#xzqz_table_wrapper .bottom').show();}
		})
		
	}
	//监督抽查信息
	function initTableJdcc(){
		jdccTable = dataTable.load({
			el:'#jdcc_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/findJdccMsg',
				data:function(d){
					d.params=jdcc_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'bccdw',className:'center',width:"100px;"},
				{data:'ccchxmmc',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'jybgrq',className:'center',width:"100px;"},
				{data:'datasrdep',className:'center',width:"100px;"}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.bccdw+"</a>";
				} 
			}
			]
		})
		jdccTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#jdcc_table_wrapper .bottom').hide();}else{$('#jdcc_table_wrapper .bottom').show();}
		})
	}

	//重点监管信息
	function initTableZdjg(){
		zdjgTable = dataTable.load({
			el:'#zdjg_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findZdjgMsg',
				data:function(d){
					d.params=zdjg_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'lrzdjgyy',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'jgnr',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'lrsj',className:'center',width:"100px;"},
				{data:'jgjg',className:'center',width:"100px;"},
				{data:'cxsj',className:'center',width:"100px;"}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		zdjgTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#zdjg_table_wrapper .bottom').hide();}else{$('#zdjg_table_wrapper .bottom').show();}
		})
	}
	//不合格记录信息
	function initTableBhgjl(){
		bhgjlTable = dataTable.load({
			el:'#bhgjl_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findBadRecordMsg',
				data:function(d){
					d.params=bhgjl_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'cpscdwwybs',className:'center',width:"100px;"},
				{data:'bccspmc',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'bccypmc',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'jyjl',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'ccrq',className:'center',width:"100px;"},
				{data:'jcrwxddw',className:'center',width:"100px;"},
				{data:'bhgchxmmc',className:'center',width:"100px;"},
				{data:'bhgjljybgrq',className:'center',width:"100px;"}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.cpscdwwybs+"</a>";
				} 
			}
			]
		})
		bhgjlTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#bhgjl_table_wrapper .bottom').hide();}else{$('#bhgjl_table_wrapper .bottom').show();}
		})
	}
	//机构年检信息
	function initTableJgnj(){
		jgnjTable = dataTable.load({
			el:'#jgnj_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findJgnjMsg',
				data:function(d){
					d.params=jgnj_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'njnd',className:'center',width:"100px;"},
				{data:'njbg',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'pgqk',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		jgnjTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#jgnj_table_wrapper .bottom').hide();}else{$('#jgnj_table_wrapper .bottom').show();}
		})
	}
	//企业年报信息
	function initTableQynb(){
		qynbTable = dataTable.load({
			el:'#qynb_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findQynbMsg',
				data:function(d){
					d.params=qynb_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'qymc',className:'center',width:"100px;"},
				{data:'nbnd',className:'center',width:"100px;"},
				{data:'ndbgrq',className:'center',width:"100px;"},
				{data:'ndbgzt',className:'center',width:"100px;"},
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.qymc+"</a>";
				} 
			}
			]
		})
		qynbTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#qynb_table_wrapper .bottom').hide();}else{$('#qynb_table_wrapper .bottom').show();}
		})
	}
	
	//劳动保障书面审查信息
	function initTableLdbz(){
		ldbzTable = dataTable.load({
			el:'#ldbz_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findNdsmscMsg',
				data:function(d){
					d.params=ldbz_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dsfrmc',className:'center',width:"100px;"},
				{data:'smscnd',className:'center',width:"100px;"},
				{data:'pddj',className:'center',width:"100px;"},
				{data:'datasrdep',className:'center',width:"100px;"},
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dsfrmc+"</a>";
				} 
			}
			]
		})
		ldbzTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#ldbz_table_wrapper .bottom').hide();}else{$('#ldbz_table_wrapper .bottom').show();}
		})
	}
	//无线电台（站）年检信息
	function initTableWxdnj(){
		wxdnjTable = dataTable.load({
			el:'#wxdnj_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findWxdtMsg',
				data:function(d){
					d.params=wxdnj_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'datasrdep',className:'center',width:"100px;"},
				{data:'wxdznjnd',className:'center',width:"100px;"},
				{data:'njjg',className:'center',width:"100px;"}
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		wxdnjTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#wxdnj_table_wrapper .bottom').hide();}else{$('#wxdnj_table_wrapper .bottom').show();}
		})
	}
	//监测监控信息
	function initTableJcjk(){
		jcjkTable = dataTable.load({
			el:'#jcjk_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findJcjkMsg',
				data:function(d){
					d.params=jcjk_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'zdmc',className:'center',width:"100px;"},
				{data:'jcsj',className:'center',width:"100px;"},
				{data:'jczb',className:'center',width:"100px;"},
				{data:'jcjg',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'dbqk',className:'center',width:"100px;",cut:{length:20,replace:'...'}}
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		jcjkTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#jcjk_table_wrapper .bottom').hide();}else{$('#jcjk_table_wrapper .bottom').show();}
		})
	}
	//窃电记录信息
	function initTableQdjl(){
		qdjlTable = dataTable.load({
			el:'#qdjl_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findQdjlMsg',
				data:function(d){
					d.params=qdjl_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'ydhm',className:'center',width:"100px;"},
				{data:'yddz',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'qdl',className:'center',width:"100px;"},
				{data:'qdsd',className:'center',width:"100px;"},
				{data:'qdze',className:'center',width:"100px;"},
				{data:'datasrdep',className:'center',width:"100px;"}
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.ydhm+"</a>";
				} 
			}
			]
		})
		qdjlTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#qdjl_table_wrapper .bottom').hide();}else{$('#qdjl_table_wrapper .bottom').show();}
		})
	}
	//事故信息
	function initTableSgxx(){
		sgxxTable = dataTable.load({
			el:'#sgxx_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findSgxxMsg',
				data:function(d){
					d.params=sgxx_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'sgdd',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'sglx',className:'center',width:"100px;"},
				{data:'sgyy',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'sgfssj',className:'center',width:"100px;"},
				{data:'swrs',className:'center',width:"100px;"},
				{data:'zsrs',className:'center',width:"100px;"},
				{data:'ccss',className:'center',width:"100px;"},
				{data:'sgjyqk',className:'center',width:"100px;",cut:{length:20,replace:'...'}}
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		sgxxTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#sgxx_table_wrapper .bottom').hide();}else{$('#sgxx_table_wrapper .bottom').show();}
		})
	}
	//隐患信息
	function initTableYhjl(){
		yhjlTable = dataTable.load({
			el:'#yhjl_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findYhjlMsg',
				data:function(d){
					d.params=yhjl_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'rdsj',className:'center',width:"100px;"},
				{data:'rdyj',className:'center',width:"100px;",cut:{length:20,replace:'...'}},
				{data:'rdjg',className:'center',width:"100px;"},
				{data:'xasj',className:'center',width:"100px;"},
				{data:'czzdaqyhnr',className:'center',width:"100px;",cut:{length:20,replace:'...'}}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		yhjlTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#yhjl_table_wrapper .bottom').hide();}else{$('#yhjl_table_wrapper .bottom').show();}
		})
	}
	//分类监管信息
	function initTableFljg(){
		fljgTable = dataTable.load({
			el:'#fljg_table',
			showIndex:true,
			scrollX : true,
			lengthMenu:[10,20,30,50],
			ajax:{
				url:'/data/search/findFljgMsg',
				data:function(d){
					d.params=fljg_Form;
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'dwmc',className:'center',width:"100px;"},
				{data:'pjyj',className:'center',width:"100px;"},
				{data:'pjwh',className:'center',width:"100px;"},
				{data:'pjnd',className:'center',width:"100px;"},
				{data:'pjjg',className:'center',width:"100px;"},
				{data:'pjnr',className:'center',width:"100px;",cut:{length:20,replace:'...'}}
				
			],
			columnDefs:[{
				targets:1, render:function(data,type,row,meta){ 
            	return "<a href='javascript:void(0);' class='look' corpid='"+row.frwybs+"'>"+row.dwmc+"</a>";
				} 
			}
			]
		})
		fljgTable.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#fljg_table_wrapper .bottom').hide();}else{$('#fljg_table_wrapper .bottom').show();}
		})
	}
	
	function bind() {
		util.bindEvents([ {
			el : '#search',
			event : 'click',
			handler : function() {
				var tr = $("#search_table tbody tr:first").text();
				if(tr=="" || tr==null ){
					initDataTable();
				}else{
				entTable.ajax.reload();
			}}
		},{
        	el:'#reset',
        	event:'click',
        	handler:function(){
        		$("#Name").val("");
    			$("#UnitedID").val("");
    			$("#Range").val("");
    			$("#Surveillance").val("");
    			$("#RandomTest").val("");
    			$("#Food").val("");
    			$("#Medicine").val("");
    			$("#Rank").val("");
    			$("#Station").val("");
    			$("#Electro").val("");
    			$("#Abnormal").val("");
    			$("#Danger").val("");
        	}
        }, {
        	el: '.tyxydm',
            event: 'click',
            handler: function () {        	
                var data = entTable.row($(this).closest('td')).data();   
//                window.open('/data/frdetail/lawenforce/' + data.frwybs,'_blank');
                window.location.href="/data/frdetail/lawenforce/"+ data.frwybs;
            }
        },
        {
			el:'#xzcf_search',
			event:'click',
			handler:function(){
			  var startTime = $("#xzcf_time_start").val();
              var endTime = $("#xzcf_time_end").val();
              if (endTime != ""&& endTime != null && startTime > endTime) {
                layer.msg("开始日期不能大于结束日期");
              }else{
            	  xzcf_Form = $("#xzcf_form").serializeObject();
  				if(xzcf_flag==0){
  					initTableXzcf();xzcf_flag = 1;
  				}else{
  					xzcfTable.ajax.reload();
  				} 
              }
				
			}
		},
        {
			el:'#xzqz_search',
			event:'click',
			handler:function(){
				xzqz_Form = $("#xzqz_form").serializeObject();
				if(xzqz_flag==0){
					initTableXzqz();xzqz_flag = 1;
				}else{
					xzqzTable.ajax.reload();
				}
			}
		},
        {
			el:'#zdjg_search',
			event:'click',
			handler:function(){
				 var startTime = $("#zdjg_time_start").val();
	              var endTime = $("#zdjg_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	              }else{
	            	zdjg_Form = $("#zdjg_form").serializeObject();
	  				if(zdjg_flag==0){
	  					initTableZdjg();zdjg_flag = 1;
	  				}else{
	  					zdjgTable.ajax.reload();
	  				}
	              }
				
			}
		}
		,
        {
			el:'#bhgjl_search',
			event:'click',
			handler:function(){
				bhgjl_Form = $("#bhgjl_form").serializeObject();
				if(bhgjl_flag==0){
					initTableBhgjl();bhgjl_flag = 1;
				}else{
					bhgjlTable.ajax.reload();
				}
			}
		}
		,
        {
			el:'#jgnj_search',
			event:'click',
			handler:function(){
				var startTime = $("#jgnj_time").val();
				 var endTime = $("#jgnj_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	                return false;
	              }
				jgnj_Form = $("#jgnj_form").serializeObject();
				if(jgnj_flag==0){
					initTableJgnj();jgnj_flag = 1;
				}else{
					jgnjTable.ajax.reload();
				}
			}
		},
        {
			el:'#qynb_search',
			event:'click',
			handler:function(){
				var startTime = $("#qynb_time").val();
				 var endTime = $("#qynb_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	                return false;
	              }
				qynb_Form = $("#qynb_form").serializeObject();
				if(qynb_flag==0){
					initTableQynb();qynb_flag = 1;
				}else{
					qynbTable.ajax.reload();
				}
			}
		}
		,
        {
			el:'#ldbz_search',
			event:'click',
			handler:function(){
				var startTime = $("#ldbz_time").val();
				 var endTime = $("#ldbz_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	                return false;
	              }
				ldbz_Form = $("#ldbz_form").serializeObject();
				if(ldbz_flag==0){
					initTableLdbz();ldbz_flag = 1;
				}else{
					ldbzTable.ajax.reload();
				}
			}
		},
        {
			el:'#wxdnj_search',
			event:'click',
			handler:function(){
				var startTime = $("#wxt_time").val();
				 var endTime = $("#wxt_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	                return false;
	              }
				wxdnj_Form = $("#wxdnj_form").serializeObject();
				if(wxdnj_flag==0){
					initTableWxdnj();wxdnj_flag = 1;
				}else{
					wxdnjTable.ajax.reload();
				}
			}
		},
        {
			el:'#jcjk_search',
			event:'click',
			handler:function(){
				 var startTime = $("#jcjk_time_start").val();
	              var endTime = $("#jcjk_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	              }
	              else{
	            	  jcjk_Form = $("#jcjk_form").serializeObject();
	  				if(jcjk_flag==0){
	  					initTableJcjk();jcjk_flag = 1;
	  				}else{
	  					jcjkTable.ajax.reload();
	  				}
	              }
				
			}
		},
        {
			el:'#qdjl_search',
			event:'click',
			handler:function(){
				var qdlStart=$("#qdl_start").val();
				var qdlEnd=$("#qdl_end").val();
				qdjl_Form = $("#qdjl_form").serializeObject();
				 if (!($('#qdjl_form').valid())) { //效验没有通过则不往下执行
					 return false;
				 }
				 if(qdlStart.indexOf(".")!=-1||qdlEnd.indexOf(".")!=-1){
					 layer.msg("只能输入整数");
					 return false;
				 }
				if(qdlStart<0||qdlStart>2147483647||qdlEnd<0||qdlEnd>2147483647){
					layer.msg("输入范围请0~2000000000(20亿)之间")
					return false;
				}
				if(qdlStart!=""&&qdlEnd!=""&&qdlStart>qdlEnd){
					layer.msg("开始数据不能大于结束数据");
				}else{
					if(qdjl_flag==0){
						initTableQdjl();qdjl_flag = 1;
					}else{
						qdjlTable.ajax.reload();
					}
				}
				
			}
		},
        {
			el:'#sgxx_search',
			event:'click',
			handler:function(){
	        	sgxx_Form = $("#sgxx_form").serializeObject();
				if(sgxx_flag==0){
					initTableSgxx();sgxx_flag = 1;
				}else{
					sgxxTable.ajax.reload();
				}
	              
				
			}
		},
        {
			el:'#yhjl_search',
			event:'click',
			handler:function(){
				var startTime = $("#yhjl_time_start").val();
	              var endTime = $("#yhjl_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	              }else{
	            	  yhjl_Form = $("#yhjl_form").serializeObject();
	  				if(yhjl_flag==0){
	  					initTableYhjl();yhjl_flag = 1;
	  				}else{
	  					yhjlTable.ajax.reload();
	  				}
	              }
				
			}
		},
        {
			el:'#fljg_search',
			event:'click',
			handler:function(){
				var startTime = $("#fljg_time_start").val();
	              var endTime = $("#fljg_time_end").val();
	              if (endTime != ""&& endTime != null && startTime > endTime) {
	                layer.msg("开始日期不能大于结束日期");
	              }else{
	            	  fljg_Form = $("#fljg_form").serializeObject();
	  				if(fljg_flag==0){
	  					initTableFljg();fljg_flag = 1;
	  				}else{
	  					fljgTable.ajax.reload();
	  				}
	              }
				
			}
		},
        {
			el:'#jdcc_search',
			event:'click',
			handler:function(){
				jdcc_Form = $("#jdcc_form").serializeObject();
				if(jdcc_flag==0){
					initTableJdcc();jdcc_flag = 1;
				}else{
					jdccTable.ajax.reload();
				}
			}
		},{ 
			el:'.look', event:'click', handler:function(){
			 var corpid =$(this).attr('corpid');
			 if(corpid != null && corpid != ""){
//				 window.open("/data/frdetail/lawenforce/"+corpid,"_blank");
				 window.location.href="/data/frdetail/lawenforce/"+corpid;
			 }else{
				 layer.msg("没有查到相关数据");
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
});