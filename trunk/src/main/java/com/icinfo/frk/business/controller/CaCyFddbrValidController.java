/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CaCyFddbrValid;
import com.icinfo.frk.business.service.ICaCyFddbrValidService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:  ca_cy_fddbr_valid 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@RequestMapping("/data/fddbr")
@Controller
public class CaCyFddbrValidController extends BaseController {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CaCyFddbrValidController.class);

  @Autowired
  private ICaCyFddbrValidService caCyFddbrValidService;

  @RequestMapping(value = "/getlist", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
  @ResponseBody
  public PageResponse<CaCyFddbrValid> getList(PageRequest request) throws Exception {

    List<CaCyFddbrValid> list = caCyFddbrValidService.getList(request);
    return new PageResponse<>(list);
  }
}