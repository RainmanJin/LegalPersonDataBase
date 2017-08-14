package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CaCodeIndustrytype;
import java.util.List;

/**
 * 描述:  frk.ca_code_industrytype 对应的Service接口.<br>
 *
 * @author hujianping
 */
public interface CaCodeIndustrytypeMapper extends Mapper<CaCodeIndustrytype> {

  List<CaCodeIndustrytype> getIndustryTypes();

}
