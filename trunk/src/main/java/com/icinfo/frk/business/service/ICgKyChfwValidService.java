package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CgKyChfwValid;
import java.util.List;


/**
 * @author Guanzhou Song
 */
public interface ICgKyChfwValidService extends BaseService {

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  List<CgKyChfwValid> getList(String frwybs) throws Exception;

  /**
   * 根据法人唯一标识查询
   *
   * @param frwybs 法人唯一标识
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;
}
