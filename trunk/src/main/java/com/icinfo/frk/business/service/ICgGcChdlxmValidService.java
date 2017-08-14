package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CgGcChdlxmValid;

/**
 * @author Guanzhou Song
 */
public interface ICgGcChdlxmValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  PageResponse<CgGcChdlxmValid> getList(PageRequest request) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;

  /**
   * 获取测绘与地理详细
   */
  PageResponse<CgGcChdlxmValid> getChuiDetail(PageRequest request)
      throws Exception;
}
