/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CeZzZzxxValidMapper;
import com.icinfo.frk.business.model.CeZzZzxxValid;
import com.icinfo.frk.business.service.ICeZzZzxxValidService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CeZzZzxxValidServiceImpl extends MyBatisServiceSupport implements
    ICeZzZzxxValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CeZzZzxxValidServiceImpl.class);

  /**
   * 注入不动产信息Mapper
   */
  @Autowired
  private CeZzZzxxValidMapper ceZzZzxxValidMapper;

  /**
   * 获取不动产查封信息列表
   *
   * @param frwybs 法人唯一标识
   * @return 不动产查封信息列表
   */
  @Override
  public List<CeZzZzxxValid> getList(String frwybs) throws Exception {
    CeZzZzxxValid ceZzZzxxValid = new CeZzZzxxValid();
    ceZzZzxxValid.setfrwybs(frwybs);
    return ceZzZzxxValidMapper.select(ceZzZzxxValid);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }


}