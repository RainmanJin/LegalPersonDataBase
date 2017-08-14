package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChXzzfFljgValidDto;
import com.icinfo.frk.business.model.ChXzzfFljgValid;
import java.util.List;


/**
 * @author Guanzhou Song
 */
public interface IChXzzfFljgValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  List<ChXzzfFljgValid> getList(String frwybs) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;

  PageResponse<ChXzzfFljgValidDto> findFljgMsg(PageRequest request);

  PageResponse<ChXzzfFljgValid> getFljgDetail(PageRequest request);
}
