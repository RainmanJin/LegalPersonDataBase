/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChCcjcZdjgValidDto;
import com.icinfo.frk.business.mapper.ChCcjcZdjgValidMapper;
import com.icinfo.frk.business.model.ChCcjcZdjgValid;
import com.icinfo.frk.business.service.IChCcjcZdjgValidService;
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
public class ChCcjcZdjgValidServiceImpl extends MyBatisServiceSupport implements
    IChCcjcZdjgValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChCcjcZdjgValidMapper ChCcjcZdjgValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChCcjcZdjgValid> getList(String frwybs) throws Exception {
    ChCcjcZdjgValid ChCcjcZdjgValidimpl = new ChCcjcZdjgValid();
    ChCcjcZdjgValidimpl.setFrwybs(frwybs);
    return ChCcjcZdjgValidMapperimpl.select(ChCcjcZdjgValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChCcjcZdjgValidDto> findZdjgMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcZdjgValidDto> list = ChCcjcZdjgValidMapperimpl.findZdjgMsg(request.getParams());
    list.remove(null);
    if (null != list && list.size() > 0) {
      for (ChCcjcZdjgValid ccjcZdjgValid : list) {
        String originFrwybs = ccjcZdjgValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          ccjcZdjgValid.setFrwybs(frwybs);
        }


      }
    }
    return new PageResponse<ChCcjcZdjgValidDto>(list);
  }

  @Override
  public PageResponse<ChCcjcZdjgValid> getZdjgDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcZdjgValid> list = ChCcjcZdjgValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChCcjcZdjgValid>(list);
  }

}
