package com.icinfo.frk.business.service;

import java.util.List;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.entity.TreeDetail;



/**
 * 描述:   frk.ca_code_industry 对应的Service接口.<br>
 * @author hujianping
 *
 */
public interface ICaCodeIndustryService extends BaseService{
	
	/**
	 * 获取全部行业
	 * @return
	 */
	List<TreeDetail> getIndustrys();

}
