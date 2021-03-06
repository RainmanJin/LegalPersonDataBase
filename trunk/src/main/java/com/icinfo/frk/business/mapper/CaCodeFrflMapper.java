package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CaCodeFrfl;
import java.util.List;

/**
 * 描述:  ca_code_frfl 对应的Service接口.<br>
 *
 * @author hujianping
 */
public interface CaCodeFrflMapper extends Mapper<CaCodeFrfl> {

  /**
   * 获取法人类型
   */
  List<CaCodeFrfl> getFrContent();

}
