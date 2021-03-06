require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'common/validateRules', 'common/ajaxfileupload'],
    function (layer, dataTable, util, http, busUtil, handlebars) {

      var entTable1, entTable2, entTable3, entTable4;
      init();

      function init() {
        bind();
      }

      /**
       * 行政许可信息
       */
      function initDataTable1() {
        entTable1 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table1',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch1.json',
            data: function (d) {
              d.params = $("#search_form1").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkzsbh", cut: {length: 20, repalce: '...'}
          }, {
            data: "xknr", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkjg", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkrq", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkzt", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkqs", cut: {length: 20, repalce: '...'}
          }, {
            data: "xkjz", cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc1' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable1.on('xhr.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table1_wrapper .bottom').hide();
          } else {
            $('#search_table1_wrapper .bottom').show();
          }
        })
      }

      /**
       * 行政备案信息
       */
      function initDataTable2() {
        entTable2 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table2',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch2.json',
            data: function (d) {
              d.params = $("#search_form2").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc", cut: {length: 20, repalce: '...'}
          }, {
            data: "bamc", cut: {length: 20, repalce: '...'}
          }, {
            data: "banr", cut: {length: 20, repalce: '...'}
          }, {
            data: "bajg", cut: {length: 20, repalce: '...'}
          }, {
            data: "barq", cut: {length: 20, repalce: '...'}
          }, {
            data: "baqs", cut: {length: 20, repalce: '...'}
          }, {
            data: "bajz", cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc2' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable2.on('xhr.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table2_wrapper .bottom').hide();
          } else {
            $('#search_table2_wrapper .bottom').show();
          }
        })
      }

      /**
       * 资质信息
       */
      function initDataTable3() {
        entTable3 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table3',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch3.json',
            data: function (d) {
              d.params = $("#search_form3").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzlb"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzdj"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzjg"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzzt"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzqs"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zzjz"
            , cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc3' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable3.on('xhr.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table3_wrapper .bottom').hide();
          } else {
            $('#search_table3_wrapper .bottom').show();
          }
        })
      }

      /**
       * 荣誉信息
       */
      function initDataTable4() {
        entTable4 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table4',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch4.json',
            data: function (d) {
              d.params = $("#search_form4").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rylb"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rymc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ryjldx"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ryrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ryqs"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ryjz"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ryjg"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rynd"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rynr"
            , cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc4' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable4.on('xhr.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table4_wrapper .bottom').hide();
          } else {
            $('#search_table4_wrapper .bottom').show();
          }
        })
      }

      function hide_all(){
        $('.tabbale iframe-wrap').hide();
      }
      function bind() {
        util.bindEvents([{
          el: '#search1',
          event: 'click',
          handler: function () {
            var startTime = $("#Grant_Date_Start").val();
            var endTime = $("#Grant_Date_End").val();
            if (startTime != "" && startTime != null && endTime != "" && endTime
                != null && startTime > endTime) {
              layer.msg("日期有误，确认后请重新输入");
            } else {
              var tr = $("#search_table1 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable1();
              } else {
                entTable1.ajax.reload();
              }
            }
          }
        },
          {
            el: '#search2',
            event: 'click',
            handler: function () {
              var startTime = $("#Grant_Date_Start1").val();
              var endTime = $("#Grant_Date_End1").val();
              if (startTime != "" && startTime != null && endTime != ""
                  && endTime != null && startTime > endTime) {
                layer.msg("日期有误，确认后请重新输入");
              } else {
                var tr = $("#search_table2 tbody tr:first").text();
                if (tr == "" || tr == null) {
                  initDataTable2();
                } else {
                  entTable2.ajax.reload();
                }
              }
            }
          },
          {
            el: '#search3',
            event: 'click',
            handler: function () {
              var tr = $("#search_table3 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable3();
              } else {
                entTable3.ajax.reload();
              }
            }
          },
          {
            el: '#search4',
            event: 'click',
            handler: function () {
              var startTime = $("#Grant_Date_Start2").val();
              var endTime = $("#Grant_Date_End2").val();
              if (startTime != "" && startTime != null && endTime != ""
                  && endTime != null && startTime > endTime) {
                layer.msg("日期有误，确认后请重新输入");
              } else {
                var tr = $("#search_table4 tbody tr:first").text();
                if (tr == "" || tr == null) {
                  initDataTable4();
                } else {
                  entTable4.ajax.reload();
                }
              }
            }
          },
          {
            el: '.frmc1',
            event: 'click',
            handler: function () {
              var data = entTable1.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
//                window.open('/data/frdetail/admission/' + data.frwybs,
//                    '_blank');
            	  window.location.href="/data/frdetail/admission/"+ data.frwybs;
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc2',
            event: 'click',
            handler: function () {
              var data = entTable2.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
//                window.open('/data/frdetail/admission/' + data.frwybs,
//                    '_blank');
                window.location.href="/data/frdetail/admission/"+ data.frwybs;
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc3',
            event: 'click',
            handler: function () {
              var data = entTable3.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
//                window.open('/data/frdetail/admission/' + data.frwybs,
//                    '_blank');
            	  window.location.href="/data/frdetail/admission/"+ data.frwybs;
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
              el: '.frmc4',
              event: 'click',
              handler: function () {
                var data = entTable4.row($(this).closest('td')).data();
                if (data.frwybs != null && data.frwybs != "") {
//                  window.open('/data/frdetail/admission/' + data.frwybs,
//                      '_blank');
                	window.location.href="/data/frdetail/admission/"+ data.frwybs;
                } else {
                  layer.msg("没有找到相关数据");
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