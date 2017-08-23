/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChBlQdjlValidDto;
import com.icinfo.frk.business.mapper.ChBlQdjlValidMapper;
import com.icinfo.frk.business.model.ChBlQdjlValid;
import com.icinfo.frk.business.service.IChBlQdjlValidService;
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
public class ChBlQdjlValidServiceImpl extends MyBatisServiceSupport implements
    IChBlQdjlValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChBlQdjlValidMapper ChBlQdjlValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChBlQdjlValid> getList(String frwybs) throws Exception {
    ChBlQdjlValid ChBlQdjlValidimpl = new ChBlQdjlValid();
    ChBlQdjlValidimpl.setFrwybs(frwybs);
    return ChBlQdjlValidMapperimpl.select(ChBlQdjlValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChBlQdjlValidDto> findQdjlMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChBlQdjlValidDto> list = ChBlQdjlValidMapperimpl.findQdjlMsg(request.getParams());
    list.remove(null);
    if (null != list && list.size() > 0) {
      for (ChBlQdjlValid chBlQdjlValid : list) {
        String originFrwybs = chBlQdjlValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          chBlQdjlValid.setFrwybs(frwybs);
        }


      }
    }
    return new PageResponse<ChBlQdjlValidDto>(list);
  }

  @Override
  public PageResponse<ChBlQdjlValid> getQdjlDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChBlQdjlValid> list = ChBlQdjlValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChBlQdjlValid>(list);
  }

}
