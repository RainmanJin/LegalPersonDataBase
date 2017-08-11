package com.icinfo.frk.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


@Controller
@RequestMapping("/data/law")
public class LawInfoController extends BaseController {
	
	@Autowired
	private IChSfajAjxxValidService chSfajAjxxValidService;
	
	
	@Autowired
	private IChSfajDwwlxxsxxxValidService chSfajDwwlxxsxxxValidService;
	
	
	
	@Autowired
	private IChSfajAjdsrxxValidService chSfajAjdsrxxValidService;
	
	
	
	@Autowired
	private IChSfajSxbzxrValidService chSfajSxbzxrValidService;
	
	@RequestMapping(value = "/ajxx")
    @ResponseBody
    public PageResponse<ChSfajAjxxValid>  getAjxxDetail(PageRequest request) throws Exception {
    	
		PageResponse<ChSfajAjxxValid> list = chSfajAjxxValidService.getAjxxList(request); 
		return list;
    }
	
	
	
	
	@RequestMapping(value = "/wlx")
    @ResponseBody
    public PageResponse<ChSfajDwwlxxsxxxValid>  getWlxDetail(PageRequest request) throws Exception {
    	PageResponse<ChSfajDwwlxxsxxxValid> list = chSfajDwwlxxsxxxValidService.getWlxList(request); 
		return list;
    }
	
	
	
	
	@RequestMapping(value = "/ajdsrxx")
    @ResponseBody
    public PageResponse<ChSfajAjdsrxxValid>  getAjdsrDetail(PageRequest request) throws Exception {
    	PageResponse<ChSfajAjdsrxxValid> list = chSfajAjdsrxxValidService.getAjdsrList(request); 
		return list;
    }

	
	
	@RequestMapping(value = "/sx")
    @ResponseBody
    public PageResponse<ChSfajSxbzxrValid>  getSxDetail(PageRequest request) throws Exception {
    	PageResponse<ChSfajSxbzxrValid> list = chSfajSxbzxrValidService.getSxList(request); 
		return list;
    }
}
