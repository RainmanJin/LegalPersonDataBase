/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.business.service.ICdWxzcGtsyqxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 描述:  cd_wxzc_gtsyqxx_valid 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Controller
public class CdWxzcGtsyqxxValidController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdWxzcGtsyqxxValidController.class);

    @Autowired
    private ICdWxzcGtsyqxxValidService cdWxzcGtsyqxxValidService;
}