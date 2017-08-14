/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.ChBlHmdxxValidMapper;
import com.icinfo.frk.business.model.ChBlHmdxxValid;
import com.icinfo.frk.business.service.IChBlHmdxxValidService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class ChBlHmdxxValidServiceImpl extends MyBatisServiceSupport implements
    IChBlHmdxxValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChBlHmdxxValidMapper ChBlHmdxxValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChBlHmdxxValid> getList(String frwybs) throws Exception {
    ChBlHmdxxValid ChBlHmdxxValidimpl = new ChBlHmdxxValid();
    ChBlHmdxxValidimpl.setFrwybs(frwybs);
    return ChBlHmdxxValidMapperimpl.select(ChBlHmdxxValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

}
