/**
 * Created by Administrator on 2017/7/4.
 */

require(['layer1', 'common/http', 'common/util', 'handlebars', 'common/hbsHelper', 'pagination'], function (layer, http, util, handlebars) {
   
/*------------------------------------------------------------------------------------*/
	var pageSize = 10;
	init();
    function init() {
        _bind();
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
                	
                	_getJbxxList(0);
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
   
/*---------------------------------------------------------------------------------------------------------------------*/
    /**
     * 描述：获取基本信息列表
     * @private
     */
    var table;
    function _getJbxxList(pageNum) {
        var Name = $.trim($('#Name').val());
        var UnitedID = $.trim($('#UnitedID').val());
        var MediName = $.trim($('#MediName').val());
        var MediPrmiID = $.trim($('#MediPrmiID').val());
        var PrintName = $.trim($('#PrintName').val());
        var TransName = $.trim($('#TransName').val());
        var ImportName = $.trim($('#ImportName').val());
        var InvestName = $.trim($('#InvestName').val());
        var DevName = $.trim($('#DevName').val());
        var GovInvestName = $.trim($('#GovInvestName').val());
        var SciProName = $.trim($('#SciProName').val());
        var CharityName = $.trim($('#CharityName').val());
        var StockID = $.trim($('#StockID').val());
        var ConstrucName = $.trim($('#ConstrucName').val());
        var Range = $.trim($('#Range').val());
        if(Name=="" && UnitedID =="" && MediName=="" 
			&& MediPrmiID=="" && PrintName =="" && TransName=="" 
			&& ImportName==""&& InvestName =="" && DevName=="" 
			&& GovInvestName==""&& SciProName =="" && CharityName=="" 
			&& StockID=="" && ConstrucName=="" && Range=="")
		alert("请输入查询条件");
	else
       http.httpRequest({
            url:  window.__FRK__.root_url + "data/search/producesearch.json",
            data: {Name: Name,
            	UnitedID:UnitedID,
            	MediName:MediName,
            	MediPrmiID: MediPrmiID,
            	PrintName:PrintName,
            	TransName:TransName,
            	ImportName: ImportName,
            	InvestName:InvestName,
            	DevName:DevName,
            	GovInvestName: GovInvestName,
            	SciProName:SciProName,
            	CharityName:CharityName,
            	StockID: StockID,
            	ConstrucName:ConstrucName,
            	Range: Range,
            	   pageNum: pageNum, 
            	   pageSize: pageSize},
            success: function (data) {
                layer.closeAll();
                var total = data.ajaxResult.data.total;
                if( total == 0) alert("没有找到相关结果");
                else{
                //创建模板
                var template = handlebars.compile($('#listTemplate').html());
                //拼接数据
                var list = {list: data.ajaxResult.data.list};
                //插入模板
                $('.js-template').html(template(list));

                
                //分页
                _pagination(total, pageNum);

                //若查询总条数为0 隐藏分页条
                if (total == '0') {
                    $("#js-pagination").hide();
                } else {
                    $("#js-pagination").show();
                }}
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