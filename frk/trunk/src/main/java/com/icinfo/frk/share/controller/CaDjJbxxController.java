/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.share.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.frk.common.response.ApiResponse;
import com.icinfo.frk.share.model.CaDjJbxx;
import com.icinfo.frk.share.service.ICaDjJbxxService;
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
 * 描述:  ca_dj_jbxx 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Controller
@RequestMapping("/share/cadjjbxx")
public class CaDjJbxxController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaDjJbxxController.class);

    @Autowired
    private ICaDjJbxxService caDjJbxxService;

    /**
     * 分页查询法人登记基本信息。
     *
     * @param frmc     法人名称
     * @param tyxydm   统一信用代码
     * @param ywfw     业务范围
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return
     */
    @RequestMapping(value = "/doGetBaseInfoList.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ApiResponse doGetBaseInfoList(@RequestParam(name = "frmc", required = false) String frmc,
                                         @RequestParam(name = "tyxydm", required = false) String tyxydm,
                                         @RequestParam(name = "ywfw", required = false) String ywfw,
                                         @RequestParam(name = "pageNum", required = true) int pageNum,
                                         @RequestParam(name = "pageSize", required = true) int pageSize) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("frmc", frmc);
        map.put("tyxydm", tyxydm);
        map.put("ywfw", ywfw);
        List<CaDjJbxx> list = caDjJbxxService.doGetBaseInfoList(map, pageNum, pageSize);
        return new ApiResponse(new PageInfo<>(list));
    }
}