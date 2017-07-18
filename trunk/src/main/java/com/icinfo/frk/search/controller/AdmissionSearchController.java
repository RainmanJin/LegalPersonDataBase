/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import java.util.Map;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.search.service.IAdmissionSearchService;
import com.icinfo.frk.search.service.IAssetSearchService;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

	@Controller
	@RequestMapping({"/data/search/"})
	public class AdmissionSearchController extends BaseController {
		
	    @RequestMapping("/AdmissionSearch")
	    public String doDtbmsjtjUrl() throws Exception {
	        return "search/AdmissionSearch/admissionsearch";
	    }
	
		@Autowired
		private IAdmissionSearchService searchService;


		    
		@RequestMapping(value = "/admissionsearch.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	    public AjaxResult BasicSearch(@RequestParam(name = "AdmissionName", required = false) String AdmissionName,
            	  @RequestParam(name = "AdmissionContent", required = false) String AdmissionContent,
            	  @RequestParam(name = "QualificationName", required = false) String QualificationName,
            	@RequestParam(name = "AwardtName", required = false) String AwardtName,
            	  @RequestParam(name = "pageNum", required = true) int pageNum,
                @RequestParam(name = "pageSize", required = true) int pageSize) throws Exception {
			Map<String, Object> qMap = new HashedMap();
			qMap.put("AdmissionName", AdmissionName);
            qMap.put("AdmissionContent", AdmissionContent);
            qMap.put("QualificationName", QualificationName);
            qMap.put("AwardtName", AwardtName);
	            pageNum++;
			return AjaxResult.success("成功", searchService.doGetDefinedPage(qMap, pageNum, pageSize));
		}


}