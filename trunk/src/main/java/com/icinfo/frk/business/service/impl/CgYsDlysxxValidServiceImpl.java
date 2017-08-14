/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgYsDlysxxValidMapper;
import com.icinfo.frk.business.model.CgYsDlysxxValid;
import com.icinfo.frk.business.service.ICgYsDlysxxValidService;
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
public class CgYsDlysxxValidServiceImpl extends MyBatisServiceSupport implements
    ICgYsDlysxxValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private CgYsDlysxxValidMapper CgYsDlysxxValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<CgYsDlysxxValid> getList(String frwybs) throws Exception {
    CgYsDlysxxValid CgYsDlysxxValidimpl = new CgYsDlysxxValid();
    CgYsDlysxxValidimpl.setFrwybs(frwybs);
    return CgYsDlysxxValidMapperimpl.select(CgYsDlysxxValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

}
