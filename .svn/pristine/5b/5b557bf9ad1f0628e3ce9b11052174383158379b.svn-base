/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.tools.utils.StringUtils;
import com.icinfo.frk.api.model.CaCyFddbrValid;
import com.icinfo.frk.api.model.CaDjJbxx;
import com.icinfo.frk.api.service.ICaCyFddbrValidService;
import com.icinfo.frk.common.response.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

/**
 * 描述:  ca_cy_fddbr_valid 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@Controller("apiCaCyFddbrValidController")
@RequestMapping("/api/cacyfddbr")
public class CaCyFddbrValidController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyFddbrValidController.class);

    @Autowired
    private ICaCyFddbrValidService caCyFddbrValidService;

    /**
     * 根据统一社会信用代码获取法定代表人信息
     *
     * @param tyxydm 统一社会信用代码
     * @return 查询结果
     * @throws Exception 异常
     */
    @RequestMapping(value = "/get.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ApiResponse get(@RequestParam(name = "tyxydm", required = true) final String tyxydm) throws Exception {
        if (StringUtils.isBlank(tyxydm)) {
            return new ApiResponse(ApiResponse.FAIL_MISS_PARAM_CODE, ApiResponse.FAIL_MISS_PARAM_MSG);
        }

        // 传参执行查询
        List<CaCyFddbrValid> caCyFddbrValids = caCyFddbrValidService.getList(new HashMap<String, Object>() {{
            this.put("tyxydm", tyxydm);
        }});

        return new ApiResponse(caCyFddbrValids);
    }
}