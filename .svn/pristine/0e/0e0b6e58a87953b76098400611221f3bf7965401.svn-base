require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'handlebars', 'jquery','jquery.serialize','laydate','jquery.validate','pagination'], function (layer, dataTable, util, http,handlebars) {
	init();
	function init(){
		_bind();
	};
	
	function _bind() {
	  util.bindEvents([
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
      }
    ])
    }
	
});
