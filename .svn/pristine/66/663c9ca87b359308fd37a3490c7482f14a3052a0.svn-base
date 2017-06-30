/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.mapper.DtFrflTjMapper;
import com.icinfo.frk.business.model.DepData;
import com.icinfo.frk.business.service.IDtFrflTjService;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

	@Controller
	@RequestMapping({ "/data/datacount"})
	public class DtFrflTjController extends BaseController {
	
		@Autowired
		private IDtFrflTjService dtFrflTjService;
		
		@Autowired
		private DtFrflTjMapper dtFrflTjMapper;
	
		/**
		    * 获取法人类型数量分布以及法人总数
		    * @author gzs
		    * @param  
		    * @return 
		     *@date 2017/6/26 
		*/
		@RequestMapping("/TypeCounting.json")
		@ResponseBody
		public AjaxResult TypeCounting(HttpServletRequest req) throws Exception{
			JSONObject resp = new JSONObject();
			JSONObject pies = dtFrflTjService.doGetAllTypeNameAndNumJosnObject();
			resp.put("pie1", pies.get("pie1"));
			return AjaxResult.success("frtj222",resp);
		}

		@RequestMapping("/DynamicStatistic.json")
		@ResponseBody
		public AjaxResult DynamicStatistic(HttpServletRequest req) throws Exception{
			JSONObject resp = new JSONObject();
			DtFrflTjDto dto = dtFrflTjService.doGetLegalPersonCount();
			DtFrflTjDto dto1 = dtFrflTjMapper.doGetLegalPersonAdd();
			DtFrflTjDto dto2 = dtFrflTjMapper.doGetLegalPersonSub();
			resp.put("Add", dto1.getLegalPersonAdd());
			resp.put("Sub", dto2.getLegalPersonSub());
			resp.put("Sum", null==dto? new Integer(0):dto.getLegalPersonSum());
			return AjaxResult.success("resp",resp);
		}
	
		/**
		    * 部门数据交换情况汇总
		    * @author gzs
		    * @param  
		    * @return 
		     *@date 2017/6/26 
		*/
		@RequestMapping("/depdata.json")
		@ResponseBody
		public AjaxResult DepExchangeCounting(HttpServletRequest req) throws Exception{
			Map<String,Object> paramMap = new HashMap<String, Object>();
	        List<DepData> DepDataList = dtFrflTjService.doGetAllDepExchangeCountingList(paramMap);
	        JSONObject DepData = new JSONObject();
	        DepData dto = dtFrflTjService.doGetExchangeSum();
	        DepData.put("List", DepDataList);
	        DepData.put("Sum", dto.getSum());
	        return AjaxResult.success("DepData",DepData);
	    }
		
		/**
		    * 业务数据沉淀量分类统计
		    * @author gzs
		    * @param  
		    * @return 
		     *@date 2017/6/26 
		*/
		@RequestMapping("/DimTotal.json")
		@ResponseBody
		public AjaxResult DimTotal() throws Exception{
			JSONObject DimTotal =  new JSONObject();
			List<DtFrflTjDto> List = dtFrflTjService.doGetDimTotal();
			JSONArray array = new JSONArray();
			for(DtFrflTjDto dto : List){
				array.add(dto==null?0:dto.getDimTotal());
			}
			DimTotal.put("List",array);
	        return AjaxResult.success("DimTotal",DimTotal);
	    }
		

}