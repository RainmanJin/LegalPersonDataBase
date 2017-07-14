/**
 * Created by Administrator on 2017/7/4.
 */
     var list;
require(['layer1', 'common/http', 'common/util', 'handlebars', 'common/hbsHelper', 'pagination'], function (layer, http, util, handlebars) {
   
/*------------------------------------------------------------------------------------*/
	var pageSize = 500;
	init();
    function init() {
        _bind();
        _getJbxxList(0);
    }

    /**
     * 描述：事件绑定
     * @private
     */
    function _bind() {
        util.bindEvents([
            {
                el: '.mr20',
                event: 'click',
                handler: function () {
                    //getLPname();
                	_getJbxxList(1);
                	 //_initDataTable();
                }
            },
            {
                el: '#reset',
                event: 'click',
                handler: function () {
                	$("#SearchTable  tr:not(:first)").html("");
                }
            }
        ])
    }
/*--------------------------------------------------------------------------------------------*/   
    /**
     * 初始化dataTable
     */
   
    
    function _initDataTable() {
        table = dataTable.load({
            //需要初始化dataTable的dom元素
            el: '#metadata-table',
            showIndex: true,
            ajax: {
                url: window.__FRK__.root_url + "data/dtbmsjtj/dtbmsjtjList.json",
                data: function (d) {
                    d.name= $("#LPname").val();
                    d.trustCode = {"TrustCode": $("#TrustCode").val()};
                    d.category = {"Range": $("#Range").val()};
                }
            },
            //需注意如果data没有对应的字段的，请设置为null，不然ie下会出错;
            //className不要写成class
            columns: [
                {data: null, defaultContent: '', width: '30px'},
                {data: 'frmc', width: '80px'},
                {data: 'tyxydm', width: '100px'},
                {data: 'fddbr', width: '100px'},
                {data: 'djrq', width: '200px'},
                {data: 'hydm', width: '100px'},
                {data: 'cxzt', width: '100px'}
                
            ]
        })
    }
    
    
    

    
/*---------------------------------------------------------------------------------------------------------------------*/
    /**
     * 描述：获取基本信息列表
     * @private
     */
    var table;
    function _getJbxxList(pageNum) {
        var LPname = $.trim($('#LPname').val());
        var TrustCode = $.trim($('#TrustCode').val());
        var Range = $.trim($('#Range').val());
        http.httpRequest({
            url:  window.__FRK__.root_url + "data/dtbmsjtj/dtbmsjtjList.json",
            data: {name: LPname, trustCode: TrustCode, category: Range,pageNum: pageNum+1, pageSize: pageSize},
            success: function (data) {

                layer.closeAll();
                var total = data.ajaxResult.data.total;
                if( total == 0) alert("没有找到相关结果");
                //创建模板
                var template = handlebars.compile($('#listTemplate').html());
                //拼接数据
                 list = {list: data.ajaxResult.data.list};
                //插入模板
                $('.js-template').html(template(list));
                var frksl = 0;
                var qxksl = 0;
                $.each(data.ajaxResult.data.list,function(i,n){
                    frksl=frksl+n.frksl;
                    qxksl=qxksl+n.qxksl;
                });
                $('.js-template tfoot th:eq(2)').html(qxksl);
                $('.js-template tfoot th:eq(3)').html(frksl);
                $('.js-template tfoot th:eq(4)').html((frksl/qxksl).toFixed(4)*100+"%");
                //分页
               // _pagination(total, pageNum);

                //若查询总条数为0 隐藏分页条
                if (total == '0') {
                    $("#js-pagination").hide();
                } else {
                    $("#js-pagination").show();
                }
            },
            error: function (jqXHR) {
                layer.alert('操作失败，请重试');
            }
        });
    }
    
    /**
     * 分页配置参数
     * @param total
     * @param index
     * @private
     */
    function _pagination(total, index) {
        $('#pagination').pagination(total, {
            prev_text: '上一页',
            next_text: '下一页',
            num_display_entries: 3,//主体页数
            num_edge_entries: 2,//边缘页数
            current_page: index,
            items_per_page: pageSize,
            link_to: 'javascript:void(0)',
            ellipse_text: '...',
            first_text: '首页',
            last_text: '末页',
            callback: _pageSelectCallback
        });
    }

    /**
     * 点击分页的回调函数
     * @param pageNum   当前点击的那个分页的页数索引值
     * @param jq        装载容器
     * @private
     */
    function _pageSelectCallback(pageNum, jq) {
        $('html,body').animate({scrollTop: 0}, 10);
        _getJbxxList(pageNum);
    }
/*----------------------------------------------------------------------------------------------------------------------*/
   
});