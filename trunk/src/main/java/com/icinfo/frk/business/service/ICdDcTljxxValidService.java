/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;

/**
 * 描述:  cd_dc_tljxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICdDcTljxxValidService extends BaseService {

  /**
   * 根据法人唯一标识查询拖拉机数量
   *
   * @param frwybs 法人唯一标识
   * @return 拖拉机数量
   * @throws Exception 异常
   */
  int getCountByFrwybs(String frwybs) throws Exception;
}