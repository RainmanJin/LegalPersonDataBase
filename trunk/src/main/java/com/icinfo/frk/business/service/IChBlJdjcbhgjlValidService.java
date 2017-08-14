package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChBlJdjcbhgjlValidDto;
import com.icinfo.frk.business.model.ChBlJdjcbhgjlValid;
import java.util.List;


/**
 * @author Guanzhou Song
 */
public interface IChBlJdjcbhgjlValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  List<ChBlJdjcbhgjlValid> getList(String frwybs) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;

  PageResponse<ChBlJdjcbhgjlValidDto> findBadRecordMsg(PageRequest request);

  PageResponse<ChBlJdjcbhgjlValid> getBadRecordDetail(PageRequest request);
}
