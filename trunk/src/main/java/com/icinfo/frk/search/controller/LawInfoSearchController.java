/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.ChSfajAjdsrxxValid;
import com.icinfo.frk.business.model.ChSfajAjxxValid;
import com.icinfo.frk.business.model.ChSfajDwwlxxsxxxValid;
import com.icinfo.frk.business.model.ChSfajSxbzxrValid;
import com.icinfo.frk.business.service.IChSfajAjdsrxxValidService;
import com.icinfo.frk.business.service.IChSfajAjxxValidService;
import com.icinfo.frk.business.service.IChSfajDwwlxxsxxxValidService;
import com.icinfo.frk.business.service.IChSfajSxbzxrValidService;
import com.icinfo.frk.search.dto.LawInfoDto;
import com.icinfo.frk.search.service.ILawInfoSearchService;
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
public class LawInfoSearchController extends BaseController {

  @Autowired
  private ILawInfoSearchService searchService;
  @Autowired
  private IChSfajAjxxValidService chSfajAjxxValidService;
  @Autowired
  private IChSfajAjdsrxxValidService chSfajAjdsrxxValidService;
  @Autowired
  private IChSfajDwwlxxsxxxValidService chSfajDwwlxxsxxxValidService;
  @Autowired
  private IChSfajSxbzxrValidService chSfajSxbzxrValidService;

  @RequestMapping(value = "/LawInfoSearch")
  public String entTaxQuery(Model model) throws Exception {
    return "search/LawInfoSearch/lawinfosearch";
  }

  @RequestMapping(value = "/lawinfosearch.json")
  @ResponseBody
  public PageResponse<LawInfoDto> getTaxDetail(PageRequest request) throws Exception {
    PageResponse<LawInfoDto> list = searchService.getDetail(request);
    return list;
  }

  @RequestMapping(value = "/getChSfajAjxxValid")
  @ResponseBody
  public PageResponse<ChSfajAjxxValid> getChSfajAjxxValid(PageRequest request) throws Exception {
    PageResponse<ChSfajAjxxValid> list = chSfajAjxxValidService.getChSfajAjxxValid(request);
    return list;
  }


  @RequestMapping(value = "/getChSfajAjdsrxx")
  @ResponseBody
  public PageResponse<ChSfajAjdsrxxValid> getChSfajAjdsrxx(PageRequest request) throws Exception {
    PageResponse<ChSfajAjdsrxxValid> list = chSfajAjdsrxxValidService.getChSfajAjdsrxx(request);
    return list;
  }


  @RequestMapping(value = "/getChSfajDwwlxxsxxx")
  @ResponseBody
  public PageResponse<ChSfajDwwlxxsxxxValid> getChSfajDwwlxxsxxx(PageRequest request)
      throws Exception {
    PageResponse<ChSfajDwwlxxsxxxValid> list = chSfajDwwlxxsxxxValidService
        .getChSfajDwwlxxsxxx(request);
    return list;
  }


  @RequestMapping(value = "/getChSfajSxbzxr")
  @ResponseBody
  public PageResponse<ChSfajSxbzxrValid> getChSfajSxbzxr(PageRequest request) throws Exception {
    PageResponse<ChSfajSxbzxrValid> list = chSfajSxbzxrValidService.getChSfajSxbzxr(request);
    return list;
  }

}