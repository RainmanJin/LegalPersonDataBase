/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.search.dto.ProduceInfoDto;
import com.icinfo.frk.search.service.IProduceSearchService;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

	@Controller
	@RequestMapping("/data/search")
	public class ProduceSearchController extends BaseController {
		@RequestMapping(value = "/ProduceSearch")
	    public String entProduceQuery( Model model) throws Exception {
	        return "search/ProduceSearch/producesearch";
	    }

	    @RequestMapping(value = "/producesearch.json")
	    @ResponseBody
	    public PageResponse<ProduceInfoDto>  getProduceDetail(PageRequest request) throws Exception {
	    	PageResponse<ProduceInfoDto> list = searchService.getDetail(request);
			return list;
	    }
	
		@Autowired
		private IProduceSearchService searchService;

}