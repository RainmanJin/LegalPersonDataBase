package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgGcZytzxmValidDto;
import com.icinfo.frk.business.model.CgGcZytzxmValid;

/**
 * @author Guanzhou Song
 */
public interface ICgGcZytzxmValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  PageResponse<CgGcZytzxmValid> getList(PageRequest request) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;

  /**
   * 中央投资项目信息
   */
  PageResponse<CgGcZytzxmValidDto> getZytzDetail(PageRequest request)
      throws Exception;
}
