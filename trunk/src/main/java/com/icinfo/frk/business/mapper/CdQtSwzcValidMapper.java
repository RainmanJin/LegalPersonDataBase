/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年07月06日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CdQtSwzcValid;
import java.util.List;
import java.util.Map;

/**
 * 描述:  cd_qt_swzc_valid 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface CdQtSwzcValidMapper extends Mapper<CdQtSwzcValid> {

  List<CdQtSwzcValid> selectList(String frwybs);

  List<CdQtSwzcValid> selectListByMap(Map<String, Object> paramsMap);
}