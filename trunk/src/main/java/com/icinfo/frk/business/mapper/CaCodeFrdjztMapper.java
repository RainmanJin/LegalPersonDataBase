package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CaCodeFrdjzt;
import java.util.List;

/**
 * 描述:  ca_code_frdjzt 对应的Service接口.<br>
 *
 * @author hujianping
 */
public interface CaCodeFrdjztMapper extends Mapper<CaCodeFrdjzt> {

  /**
   * 查询登记状态
   */
  List<String> selectCxzts();

}
