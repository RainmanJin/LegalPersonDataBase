require(['component/iframeLayer',
    'component/dataTable',
    'common/util',
    'jquery.serialize'], function (layer, dataTable,util) {

    init();
    /**
     * 初始化函数集合
     */
    function init() {
        _initDataTable();
        _bind();
    }

    var table;

    /**
     * 初始化dataTable
     */
    function _initDataTable() {
        table = dataTable.load({
            //需要初始化dataTable的dom元素
            el: '#metadata-table',
            showIndex: true,
            ajax: {
                url: window.__FRK__.root_url + 'data/cacycyxx/getlist',
                data: function (d) {
                    d.params = {"frwybs": $("#frwybs").val()}
                }
            },
            //需注意如果data没有对应的字段的，请设置为null，不然ie下会出错;
            //className不要写成class
            columns: [
                {data: null, defaultContent: '', width: '30px'},
                {data: 'xm', width: '80px'},
                {data: 'zjlx', width: '100px'},
                {data: 'zjhm', width: '150px'},
                {data: 'szbm', width: '200px'},
                {data: 'rzrq', width: '100px'},
                {data: 'lzrq', width: '100px'},
                {data: 'zgzmc', width: '100px'},
                {data: 'zgzbfrq', width: '120px'},
                {data: 'zgzbfbm'}
            ]
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
