/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CaCyCyxxValid;
import com.icinfo.frk.business.model.CfSsNsjlValid;
import com.icinfo.frk.business.service.ICaCyCyxxValidService;
import com.icinfo.frk.business.service.ICfSsNsjlValidService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述:  ca_cy_cyxx_valid 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年07月04日
 */
@Controller
@RequestMapping("/data/CfSsNsjl")
public class CfSsNsjlValidController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsNsjlValidController.class);

    @Autowired
    private ICfSsNsjlValidService cfSsNsjlValidService;


    /**
     * 描述: 查询成员单位列表.
     *
     * @param request 请求信息
     * @return
     * @throws Exception
     * @date 2017年3月15日
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public PageResponse<CfSsNsjlValid> getList(PageRequest request) throws Exception {
        List<CfSsNsjlValid> list = cfSsNsjlValidService.getList(request);
        return new PageResponse<CfSsNsjlValid>(list);
    }
}