/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChXzqzValidDto;
import com.icinfo.frk.business.mapper.ChXzqzValidMapper;
import com.icinfo.frk.business.model.ChXzqzValid;
import com.icinfo.frk.business.service.IChXzqzValidService;
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
public class ChXzqzValidServiceImpl extends MyBatisServiceSupport implements IChXzqzValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChXzqzValidMapper ChXzqzValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChXzqzValid> getList(String frwybs) throws Exception {
    ChXzqzValid ChXzqzValidimpl = new ChXzqzValid();
    ChXzqzValidimpl.setFrwybs(frwybs);
    return ChXzqzValidMapperimpl.select(ChXzqzValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChXzqzValidDto> findXzqzMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChXzqzValidDto> list = ChXzqzValidMapperimpl.findXzqzMsg(request.getParams());
    list.remove(null);
    if (null != list && list.size() > 0) {
      for (ChXzqzValid chXzqzValid : list) {
        String originFrwybs = chXzqzValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          chXzqzValid.setFrwybs(frwybs);
        }
      }
    }
    return new PageResponse<ChXzqzValidDto>(list);
  }

  @Override
  public PageResponse<ChXzqzValid> getXzqzDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChXzqzValid> list = ChXzqzValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChXzqzValid>(list);
  }

}
