/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChCcjcJdccValidDto;
import com.icinfo.frk.business.mapper.ChCcjcJdccValidMapper;
import com.icinfo.frk.business.model.ChCcjcJdccValid;
import com.icinfo.frk.business.service.IChCcjcJdccValidService;
import com.icinfo.frk.common.utils.AESEUtil;
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
public class ChCcjcJdccValidServiceImpl extends MyBatisServiceSupport implements
    IChCcjcJdccValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChCcjcJdccValidMapper ChCcjcJdccValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChCcjcJdccValid> getList(String frwybs) throws Exception {
    ChCcjcJdccValid ChCcjcJdccValidimpl = new ChCcjcJdccValid();
    ChCcjcJdccValidimpl.setFrwybs(frwybs);
    return ChCcjcJdccValidMapperimpl.select(ChCcjcJdccValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChCcjcJdccValidDto> findJdccMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcJdccValidDto> list = ChCcjcJdccValidMapperimpl.findJdccMsg(request.getParams());
    if (null != list && list.size() > 0) {
      for (ChCcjcJdccValid ccjcJdccValid : list) {
        String originFrwybs = ccjcJdccValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          ccjcJdccValid.setFrwybs(frwybs);
        }


      }
    }
    return new PageResponse<ChCcjcJdccValidDto>(list);
  }

  @Override
  public PageResponse<ChCcjcJdccValid> getJdccDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcJdccValid> list = ChCcjcJdccValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChCcjcJdccValid>(list);
  }

}
