/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgWtWhfwValidMapper;
import com.icinfo.frk.business.model.CgWtWhfwValid;
import com.icinfo.frk.business.service.ICgWtWhfwValidService;
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
public class CgWtWhfwValidServiceImpl extends MyBatisServiceSupport implements
    ICgWtWhfwValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private CgWtWhfwValidMapper CgWtWhfwValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<CgWtWhfwValid> getList(String frwybs) throws Exception {
    CgWtWhfwValid CgWtWhfwValidimpl = new CgWtWhfwValid();
    CgWtWhfwValidimpl.setFrwybs(frwybs);
    return CgWtWhfwValidMapperimpl.select(CgWtWhfwValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

}
