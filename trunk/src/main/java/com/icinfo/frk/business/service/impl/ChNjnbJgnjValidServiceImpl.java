/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChNjnbJgnjValidDto;
import com.icinfo.frk.business.mapper.ChNjnbJgnjValidMapper;
import com.icinfo.frk.business.model.ChNjnbJgnjValid;
import com.icinfo.frk.business.service.IChNjnbJgnjValidService;
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
public class ChNjnbJgnjValidServiceImpl extends MyBatisServiceSupport implements
    IChNjnbJgnjValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChNjnbJgnjValidMapper ChNjnbJgnjValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChNjnbJgnjValid> getList(String frwybs) throws Exception {
    ChNjnbJgnjValid ChNjnbJgnjValidimpl = new ChNjnbJgnjValid();
    ChNjnbJgnjValidimpl.setFrwybs(frwybs);
    return ChNjnbJgnjValidMapperimpl.select(ChNjnbJgnjValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChNjnbJgnjValidDto> findJgnjMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChNjnbJgnjValidDto> list = ChNjnbJgnjValidMapperimpl.findJgnjMsg(request.getParams());
    list.remove(null);
    if (null != list && list.size() > 0) {
      for (ChNjnbJgnjValid chNjnbJgnjValid : list) {
        String originFrwybs = chNjnbJgnjValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          chNjnbJgnjValid.setFrwybs(frwybs);
        }


      }
    }
    return new PageResponse<ChNjnbJgnjValidDto>(list);
  }

  @Override
  public PageResponse<ChNjnbJgnjValid> getJgnjDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChNjnbJgnjValid> list = ChNjnbJgnjValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChNjnbJgnjValid>(list);
  }

}
