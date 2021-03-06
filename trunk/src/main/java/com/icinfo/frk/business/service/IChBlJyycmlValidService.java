package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.model.ChBlJyycmlValid;
import java.util.List;


/**
 * @author Guanzhou Song
 */
public interface IChBlJyycmlValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  List<ChBlJyycmlValid> getList(String frwybs) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;
  
  /**
   * 获取“异常经营名录”list
   * @author liuguangju
   * @date 2017年11月2日
   * @param request
   * @return
   * @throws Exception
   */
  List<ChBlJyycmlValid> findMsg(PageRequest request) throws Exception;
}
