require(['component/iframeLayer', 'common/util', 'jquery.serialize'], function (layer, util) {

    init();
    /**
     * 初始化函数集合
     */
    function init() {
        _bind();
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
