require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'handlebars', 'jquery','jquery.serialize','laydate','jquery.validate','pagination'], function (layer, dataTable, util, http,handlebars) {
	init();
	function init(){
		_bind();
	};
	
	function _bind() {
        util.bindEvents([
            {
                el: '.btn-vf',
                event: 'click',
                handler: function () {
                   $(this).addClass('cur').siblings().removeClass('cur');
                }
            },
          {
            el: '#entSearch',
            event: 'click',
            handler: function () {
              $("#tab_mltj").show();
            }
          },
          {
            el: '#entCancle',
            event: 'click',
            handler: function () {
              $("#tab_mltj").hide();
            }
          },
          {
            el: '#allSearch',
            event: 'click',
            handler: function () {
              $(".all").show();
            }
          },
          {
            el: '#weekSerach',
            event: 'click',
            handler: function () {
              $(".all").hide();
              $(".week").show();
            }
          },
          {
            el: '#monthSerach',
            event: 'click',
            handler: function () {
              $(".all").hide();
              $(".month").show();
            }
          }
        ])
    }
	
});
