package com.icinfo.frk.search.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CaCxBgxxValid;
import com.icinfo.frk.business.model.CaCyCyxxValid;
import com.icinfo.frk.business.model.CaCyFddbrValid;
import com.icinfo.frk.business.service.ICaCxBgxxValidService;
import com.icinfo.frk.business.service.ICaCyCyxxValidService;
import com.icinfo.frk.business.service.ICaCyFddbrValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/data/basic")
public class BasicController extends BaseController {


  @Autowired
  private ICaCyFddbrValidService caCyFddbrValidService;


  @Autowired
  private ICaCyCyxxValidService caCyCyxxValidService;


  @Autowired
  private ICaCxBgxxValidService caCxBgxxValidService;


  @RequestMapping(value = "/fddbr")
  @ResponseBody
  public PageResponse<CaCyFddbrValid> getFddbrDetail(PageRequest request) throws Exception {
    PageResponse<CaCyFddbrValid> list = caCyFddbrValidService.getFddbrList(request);
    return list;
  }


  @RequestMapping(value = "/cydwxx")
  @ResponseBody
  public PageResponse<CaCyCyxxValid> getCydwxxDetail(PageRequest request) throws Exception {
    PageResponse<CaCyCyxxValid> list = caCyCyxxValidService.getCydwxxList(request);
    return list;
  }


  @RequestMapping(value = "/frbgxx")
  @ResponseBody
  public PageResponse<CaCxBgxxValid> getFrbgxxDetail(PageRequest request) throws Exception {
    PageResponse<CaCxBgxxValid> list = caCxBgxxValidService.getFrbgxxList(request);
    return list;
  }


}
