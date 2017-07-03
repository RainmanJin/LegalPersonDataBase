/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.frk.api.model.CaCyCyxx;
import com.icinfo.frk.api.service.ICaCyCyxxService;
import com.icinfo.frk.common.response.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_cy_cyxx 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月28日
 */
@Controller("apiCaCyCyxxController")
@RequestMapping("/api/cacycyxx")
public class CaCyCyxxController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyCyxxController.class);

    @Autowired
    private ICaCyCyxxService caCyCyxxService;

    /**
     * 分页获取成员单位信息
     *
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getPage.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ApiResponse getPage(@RequestParam(name = "pageNum", required = true) int pageNum,
                                     @RequestParam(name = "pageSize", required = true) int pageSize) throws Exception {
        Map<String, Object> map = new HashMap<>();
        List<CaCyCyxx> list = caCyCyxxService.getPage(map, pageNum, pageSize);
        return new ApiResponse(new PageInfo<>(list));
    }
}