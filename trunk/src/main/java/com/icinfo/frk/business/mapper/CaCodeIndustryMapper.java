package com.icinfo.frk.business.mapper;

import java.util.List;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CaCodeIndustry;

/**
 * 描述:   frk.ca_code_industry 对应的Service接口.<br>
 * @author hujianping
 *
 */
public interface CaCodeIndustryMapper extends Mapper<CaCodeIndustry>{
	
	List<CaCodeIndustry> getIndustrys();

}
