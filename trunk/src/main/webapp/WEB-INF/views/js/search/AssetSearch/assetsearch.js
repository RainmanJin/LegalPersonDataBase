require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'jquery.validate','common/validateRules', 'common/ajaxfileupload'],
    function (layer, dataTable, util, http, busUtil, handlebars) {

      var entTable1, entTable2, entTable3, entTable4, entTable5, entTable6;
      var entTable7, entTable8, entTable9, entTable10, entTable11, entTable12;
      init();

      function init() {
        bind();
        ZczbFormValidate();
        CzeFormValidate();
      }

      function ZczbFormValidate() {
        $('#search_form1').validate({
          rules: {
            assetL: {required: false, number: true},
            assetH: {required: false, number: true}
          },
          onkeyup: false,
          showErrors: function (errorMap) {
            for (var i in errorMap) {
              layer.tips(errorMap[i],
                  $('#search_form1 input[name=' + i + '],textarea[name=' + i
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

      function CzeFormValidate() {
        $('#search_form2').validate({
          rules: {
            SoldL: {required: false, number: true},
            SoldH: {required: false, number: true}
          },
          onkeyup: false,
          showErrors: function (errorMap) {
            for (var i in errorMap) {
              layer.tips(errorMap[i],
                  $('#search_form2 input[name=' + i + '],textarea[name=' + i
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



      function initDataTable1() {
        entTable1 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table1',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch1.json',
            data: function (d) {
              d.params = $("#search_form1").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zczb"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "carnum"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "housenum"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "tractornum"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "boatnum"
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
        entTable1.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table1_wrapper .bottom').hide();
          } else {
            $('#search_table1_wrapper .bottom').show();
          }
        })
      }

      function initDataTable2() {
        entTable2 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table2',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch2.json',
            data: function (d) {
              d.params = $("#search_form2").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gd"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rjcze"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rjczbl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "rjczrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "sjcze"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "sjczbl"
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
        entTable2.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table2_wrapper .bottom').hide();
          } else {
            $('#search_table2_wrapper .bottom').show();
          }
        })
      }

      function initDataTable3() {
        entTable3 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table3',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch3.json',
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
            data: "gd"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gqZre"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gqQrqbl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gqQrhbl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gqZrrq"
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
        entTable3.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table3_wrapper .bottom').hide();
          } else {
            $('#search_table3_wrapper .bottom').show();
          }
        })
      }

      function initDataTable4() {
        entTable4 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table4',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch4.json',
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
            data: "czCzr"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "czZqr"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "czSe"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "czDjrq"
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
        entTable4.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table4_wrapper .bottom').hide();
          } else {
            $('#search_table4_wrapper .bottom').show();
          }
        })
      }

      function initDataTable5() {
        entTable5 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table5',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch5.json',
            data: function (d) {
              d.params = $("#search_form5").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djZxfy"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djCdwh"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djZxsx"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djBzxr"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djQxqs"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "djQxjz"
          }],
          columnDefs: [{
            targets: 1,
            render: function (data, type, row, meta) {
              return "<a href='javascript:void(0)' class='frmc5' priPID='"
                  + row.frwybs + "'>" + row.frmc + "</a>";
            }
          }]
        });
        entTable5.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table5_wrapper .bottom').hide();
          } else {
            $('#search_table5_wrapper .bottom').show();
          }
        })
      }

      function initDataTable6() {
        entTable6 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table6',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch6.json',
            data: function (d) {
              d.params = $("#search_form6").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "fwsyqr"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "fwsyqdjsj"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "whFwcf"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "fwcfrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "sqfwcfdw"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ztFwcf"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc6' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable6.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table6_wrapper .bottom').hide();
          } else {
            $('#search_table6_wrapper .bottom').show();
          }
        })
      }

      function initDataTable7() {
        entTable7 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table7',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch7.json',
            data: function (d) {
              d.params = $("#search_form7").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dwmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dysfzx"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dyw"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dyrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dyje"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc7' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable7.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table7_wrapper .bottom').hide();
          } else {
            $('#search_table7_wrapper .bottom').show();
          }
        })
      }

      function initDataTable8() {
        entTable8 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table8',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch8.json',
            data: function (d) {
              d.params = $("#search_form8").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syzmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "bqdjh"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zpmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zplb"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "bqdjrq"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc8' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable8.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table8_wrapper .bottom').hide();
          } else {
            $('#search_table8_wrapper .bottom').show();
          }
        })
      }

      function initDataTable9() {
        entTable9 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table9',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch9.json',
            data: function (d) {
              d.params = $("#search_form9").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syzmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syqdjrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syqNx"
            , cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc9' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable9.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table9_wrapper .bottom').hide();
          } else {
            $('#search_table9_wrapper .bottom').show();
          }
        })
      }

      function initDataTable10() {
        entTable10 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table10',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch10.json',
            data: function (d) {
              d.params = $("#search_form10").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syzmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ckqzh"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "ckqksmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "nkcgm"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "yxqsrq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "yxdqrq"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc10' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable10.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table10_wrapper .bottom').hide();
          } else {
            $('#search_table10_wrapper .bottom').show();
          }
        })
      }

      function initDataTable11() {
        entTable11 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table11',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch11.json',
            data: function (d) {
              d.params = $("#search_form11").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "syzmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "xdm"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "slsyq"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "slzzq"
            , cut: {length: 20, repalce: '...'}
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc11' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable11.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table11_wrapper .bottom').hide();
          } else {
            $('#search_table11_wrapper .bottom').show();
          }
        })
      }

      function initDataTable12() {
        entTable12 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table12',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch12.json',
            data: function (d) {
              d.params = $("#search_form12").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "dwmc"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "czhong"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "cll"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "spcsl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "zcsl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "mcsl"
            , cut: {length: 20, repalce: '...'}
          }, {
            data: "gcsl"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc12' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
        entTable12.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#search_table12_wrapper .bottom').hide();
          } else {
            $('#search_table12_wrapper .bottom').show();
          }
        })
      }

      function bind() {
        util.bindEvents([{
          el: '#search1',
          event: 'click',
          handler: function () {
            if (!($('#search_form1').valid())) { //效验没有通过则不往下执行
              return false;
            } else {
            var Low = $("#assetL").val();
            var High = $("#assetH").val();

              var tr = $("#search_table1 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable1();
              } else {
                entTable1.ajax.reload();
              }

          }}
        },
          {
            el: '#search2',
            event: 'click',
            handler: function () {
              if (!($('#search_form2').valid())) { //效验没有通过则不往下执行
                return false;
              } else {
              var tr = $("#search_table2 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable2();
              } else {
                entTable2.ajax.reload();
              }
            }}
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
              var tr = $("#search_table4 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable4();
              } else {
                entTable4.ajax.reload();
              }
            }
          },
          {
            el: '#search5',
            event: 'click',
            handler: function () {
              var tr = $("#search_table5 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable5();
              } else {
                entTable5.ajax.reload();
              }
            }
          },
          {
            el: '#search6',
            event: 'click',
            handler: function () {
              var tr = $("#search_table6 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable6();
              } else {
                entTable6.ajax.reload();
              }
            }
          },
          {
            el: '#search7',
            event: 'click',
            handler: function () {
              var tr = $("#search_table7 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable7();
              } else {
                entTable7.ajax.reload();
              }
            }
          },
          {
            el: '#search8',
            event: 'click',
            handler: function () {
              var tr = $("#search_table8 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable8();
              } else {
                entTable8.ajax.reload();
              }
            }
          },
          {
            el: '#search9',
            event: 'click',
            handler: function () {
              var startTime = $("#Use_Date_Start").val();
              var endTime = $("#Use_Date_End").val();
              if (startTime != "" && startTime != null && endTime != ""
                  && endTime != null && startTime > endTime) {
                layer.msg("日期有误，确认后请重新输入");
              } else {
                var tr = $("#search_table9 tbody tr:first").text();
                if (tr == "" || tr == null) {
                  initDataTable9();
                } else {
                  entTable9.ajax.reload();
                }
              }
            }
          },
          {
            el: '#search10',
            event: 'click',
            handler: function () {
              var tr = $("#search_table10 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable10();
              } else {
                entTable10.ajax.reload();
              }
            }
          },
          {
            el: '#search11',
            event: 'click',
            handler: function () {
              var tr = $("#search_table11 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable11();
              } else {
                entTable11.ajax.reload();
              }
            }
          },
          {
            el: '#search12',
            event: 'click',
            handler: function () {
              var tr = $("#search_table12 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable12();
              } else {
                entTable12.ajax.reload();
              }
            }
          }, {
            el: '.frmc1',
            event: 'click',
            handler: function () {
              var data = entTable1.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
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
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
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
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
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
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc5',
            event: 'click',
            handler: function () {
              var data = entTable5.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc6',
            event: 'click',
            handler: function () {
              var data = entTable6.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc7',
            event: 'click',
            handler: function () {
              var data = entTable7.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc8',
            event: 'click',
            handler: function () {
              var data = entTable8.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc9',
            event: 'click',
            handler: function () {
              var data = entTable9.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc10',
            event: 'click',
            handler: function () {
              var data = entTable10.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc11',
            event: 'click',
            handler: function () {
              var data = entTable11.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
          {
            el: '.frmc12',
            event: 'click',
            handler: function () {
              var data = entTable12.row($(this).closest('td')).data();
              if (data.frwybs != null && data.frwybs != "") {
                window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
              } else {
                layer.msg("没有找到相关数据");
              }
            }
          },
        ])
      }
    });