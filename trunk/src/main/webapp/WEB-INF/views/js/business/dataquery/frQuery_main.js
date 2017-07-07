/**
 * Created by Administrator on 2017/7/4.
 */
require(['layer1', 'common/http', 'common/util', 'handlebars', 'common/hbsHelper', 'pagination'], function (layer, http, util, handlebars) {
    var pageSize = 10;

    init();

    function init() {
        //事件绑定
        _bind();
    }

    /**
     * 描述：事件绑定
     * @private
     */
    function _bind() {
        util.bindEvents([
            {
                el: '.js-search',
                event: 'click',
                handler: function () {
                    _getJbxxList(0);
                }
            },{
                el: '#queryParam',
                event: 'keypress',
                handler: function () {
                    if (event.keyCode == 13) {
                        $('.js-search').click();
                    }
                }
            }
        ])
    }

    /**
     * 描述：获取基本信息列表
     * @private
     */
    function _getJbxxList(pageNum) {
        var queryParam = $.trim($('#queryParam').val());

        if(queryParam==null || queryParam == ""){
            return;
        }

        http.httpRequest({
            url: window.__FRK__.root_url + "data/frdetail/getpage",
            data: {keyword: queryParam, pageNum: pageNum, pageSize: pageSize},
            beforeSend: function () {
                layer.load(2, {
                    shade: [0.1, '#d9d9d9'],
                    type: 3
                });
            },
            success: function (data) {
                layer.closeAll();

                //创建模板
                var template = handlebars.compile($('#listTemplate').html());
                //拼接数据
                var list = {list: data.data.list};
                //插入模板
                $('.js-template').html(template(list));

                var total = data.data.total;
                //分页
                _pagination(total, pageNum);

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
});