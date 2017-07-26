package com.icinfo.frk.business.mapper;

import java.util.List;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CaCodeFrfl;

/**
 * 描述:  ca_code_frfl 对应的Service接口.<br>
 * @author hujianping
 *
 */
public interface CaCodeFrflMapper extends Mapper<CaCodeFrfl>{
	
	/**
	 *  获取法人类型
	 * @return
	 */
	List<CaCodeFrfl> getFrContent();

}
