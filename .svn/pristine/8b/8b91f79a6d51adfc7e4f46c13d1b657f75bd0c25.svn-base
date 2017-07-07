/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.service.ICaDjJbxxService;
import com.icinfo.frk.search.dto.LegalPersonDto;
import com.icinfo.frk.search.mapper.SearchMapper;
import com.icinfo.frk.search.service.SearchService;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

	@Controller
	@RequestMapping({"data/search/"})
	public class SearchController extends BaseController {
	
		@Autowired
		private ICaDjJbxxService searchService;
		/**
		    * 获取法人类型数量分布以及法人总数
		    * @author gzs
		    * @param  
		    * @return 
		     *@date 2017/6/26 
		*/
		@RequestMapping(value = "/basicsearch.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	    public AjaxResult BasicSearch(@RequestParam(name = "name", required = false) String name,
	                              	  @RequestParam(name = "trustCode", required = false) String trustCode,
	                              	  @RequestParam(name = "category", required = false) String category,
	                              	  @RequestParam(name = "pageNum", required = true) int pageNum,
	                                  @RequestParam(name = "pageSize", required = true) int pageSize) throws Exception {
			JSONArray resp = new JSONArray();
			Map<String, Object> qMap = new HashedMap();
	            qMap.put("frmc", name);
	            qMap.put("tyxydm", trustCode);
	            qMap.put("ywfw", category);
			return AjaxResult.success("成功", searchService.getBasic(qMap, pageNum, pageSize));
		}
		
		@RequestMapping(value = "/assetsearch.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	    public AjaxResult BasicSearch(@RequestParam(name = "ShareholderName", required = false) String ShareholderName,
	                              	  @RequestParam(name = "assetL", required = false) String assetL,
	                              	  @RequestParam(name = "assetH", required = false) String assetH,
	                              	@RequestParam(name = "CarNum", required = false) String CarNum,
	                              	@RequestParam(name = "BoatNum", required = false) String BoatNum,
	                              	@RequestParam(name = "HouseNum", required = false) String HouseNum,
	                              	@RequestParam(name = "TractorNum", required = false) String TractorNum,
	                              	  @RequestParam(name = "pageNum", required = true) int pageNum,
	                                  @RequestParam(name = "pageSize", required = true) int pageSize) throws Exception {
			JSONArray resp = new JSONArray();
			Map<String, Object> qMap = new HashedMap();
	            qMap.put("ShareholderName", ShareholderName);
	            qMap.put("assetL", assetL);
	            qMap.put("assetH", assetH);
	            qMap.put("CarNum", CarNum);
	            qMap.put("BoatNum", BoatNum);
	            qMap.put("HouseNum", HouseNum);
	            qMap.put("TractorNum", TractorNum);
			return AjaxResult.success("成功", searchService.getBasic(qMap, pageNum, pageSize));
		}


}