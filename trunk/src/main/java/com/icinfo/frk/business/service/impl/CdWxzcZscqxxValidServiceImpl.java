/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdWxzcZscqxxValidMapper;
import com.icinfo.frk.business.model.CdWxzcZscqxxValid;
import com.icinfo.frk.business.service.ICdWxzcZscqxxValidService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: 无形资产-知识产权 cd_wxzc_zscqxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdWxzcZscqxxValidServiceImpl extends MyBatisServiceSupport implements
    ICdWxzcZscqxxValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CdWxzcZscqxxValidServiceImpl.class);

  /**
   * 注入知识产权信息Mapper
   */
  @Autowired
  private CdWxzcZscqxxValidMapper cdWxzcZscqxxValidMapper;

  /**
   * 获取知识产权信息列表
   *
   * @param frwybs 法人唯一标识
   * @return 知识产权信息列表
   */
  @Override
  public List<CdWxzcZscqxxValid> getList(String frwybs) throws Exception {
    return cdWxzcZscqxxValidMapper.selectList(frwybs);
  }
}