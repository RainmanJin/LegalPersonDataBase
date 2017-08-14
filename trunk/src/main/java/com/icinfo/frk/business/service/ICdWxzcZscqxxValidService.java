/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CdWxzcZscqxxValid;
import java.util.List;

/**
 * 描述: 无形资产-知识产权 cd_wxzc_zscqxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICdWxzcZscqxxValidService extends BaseService {

  /**
   * 获取知识产权信息列表
   *
   * @param frwybs 法人唯一标识
   * @return 知识产权信息列表
   */
  List<CdWxzcZscqxxValid> getList(String frwybs) throws Exception;
}