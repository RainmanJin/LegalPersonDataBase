/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgKyGhglValidMapper;
import com.icinfo.frk.business.model.CgKyGhglValid;
import com.icinfo.frk.business.service.ICgKyGhglValidService;
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
public class CgKyGhglValidServiceImpl extends MyBatisServiceSupport implements
    ICgKyGhglValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private CgKyGhglValidMapper CgKyGhglValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<CgKyGhglValid> getList(String frwybs) throws Exception {
    CgKyGhglValid CgKyGhglValidimpl = new CgKyGhglValid();
    CgKyGhglValidimpl.setFrwybs(frwybs);
    return CgKyGhglValidMapperimpl.select(CgKyGhglValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

}
