/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CaCxBgxxValid;
import com.icinfo.frk.business.model.CaCyCyxxValid;
import com.icinfo.frk.business.model.CaCyFddbrValid;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.service.ICaCxBgxxValidService;
import com.icinfo.frk.business.service.ICaCyCyxxValidService;
import com.icinfo.frk.business.service.ICaCyFddbrValidService;
import com.icinfo.frk.business.service.ICaDjJbxxService;
import com.icinfo.frk.search.dto.BasicInfoDto;
import com.icinfo.frk.search.service.IBasicSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

@Controller
@RequestMapping("/data/search")
public class BasicSearchController extends BaseController {

  @Autowired
  IBasicSearchService searchService;


  @Autowired
  ICaCyCyxxValidService caCyCyxxValidService;


  @Autowired
  ICaCxBgxxValidService caCxBgxxValidService;


  @Autowired
  ICaCyFddbrValidService caCyFddbrValidService;


  @Autowired
  ICaDjJbxxService caDjJbxxService;

		/*@RequestMapping(value = "/BasicSearch")
	    public String entBasicQuery( Model model) throws Exception {
	        return "search/BasicSearch/basicsearch";
	    }*/


  @RequestMapping(value = "/BasicSearch")
  public String entBasicQuery(Model model) throws Exception {
    return "search/BasicSearch/basicInfoSearch";
  }

  @RequestMapping(value = "/basicsearch.json")
  @ResponseBody
  public PageResponse<BasicInfoDto> getBasicDetail(PageRequest request) throws Exception {
    PageResponse<BasicInfoDto> list = searchService.getDetail(request);
    return list;
  }


  @RequestMapping(value = "/getCaCyFddbr")
  @ResponseBody
  public PageResponse<CaCyFddbrValid> getCaCyFddbr(PageRequest request) throws Exception {
    PageResponse<CaCyFddbrValid> list = caCyFddbrValidService.getCaCyFddbr(request);
    return list;
  }


  @RequestMapping(value = "/getCaCyCyxx")
  @ResponseBody
  public PageResponse<CaCyCyxxValid> getCaCyCyxx(PageRequest request) throws Exception {
    PageResponse<CaCyCyxxValid> list = caCyCyxxValidService.getCaCyCyxx(request);
    return list;
  }


  @RequestMapping(value = "/getCaCxBgxx")
  @ResponseBody
  public PageResponse<CaCxBgxxValid> getCaCxBgxx(PageRequest request) throws Exception {
    PageResponse<CaCxBgxxValid> list = caCxBgxxValidService.getCaCxBgxx(request);
    return list;
  }


  @RequestMapping(value = "/getCaDjJbxx")
  @ResponseBody
  public PageResponse<CaDjJbxx> getCaDjJbxx(PageRequest request) throws Exception {
    PageResponse<CaDjJbxx> list = caDjJbxxService.getCaDjJbxx(request);

    return list;
  }


}