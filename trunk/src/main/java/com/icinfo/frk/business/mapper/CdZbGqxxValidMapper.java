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
import com.icinfo.frk.business.dto.CdZbGqxxValidDto;
import com.icinfo.frk.business.model.CdZbGqxxValid;
import java.util.List;
import java.util.Map;

/**
 * 描述:  cd_zb_gqxx_valid 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface CdZbGqxxValidMapper extends Mapper<CdZbGqxxValid> {

  /**
   * 查询股权信息列表
   *
   * @param map 参数
   * @return 股权信息列表
   */
  List<CdZbGqxxValidDto> selectListChange(Map<String, Object> map) throws Exception;

  List<CdZbGqxxValidDto> selectListSold(Map<String, Object> map) throws Exception;

  List<CdZbGqxxValidDto> selectListFrozen(Map<String, Object> map) throws Exception;

  List<CdZbGqxxValidDto> selectListByMapChange(Map<String, Object> map) throws Exception;

  List<CdZbGqxxValidDto> selectListByMapSold(Map<String, Object> map) throws Exception;

  List<CdZbGqxxValidDto> selectListByMapFrozen(Map<String, Object> map) throws Exception;
}