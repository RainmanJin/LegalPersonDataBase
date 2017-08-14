/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChCcjcJcjkValidDto;
import com.icinfo.frk.business.mapper.ChCcjcJcjkValidMapper;
import com.icinfo.frk.business.model.ChCcjcJcjkValid;
import com.icinfo.frk.business.service.IChCcjcJcjkValidService;
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
public class ChCcjcJcjkValidServiceImpl extends MyBatisServiceSupport implements
    IChCcjcJcjkValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

  @Autowired
  private ChCcjcJcjkValidMapper ChCcjcJcjkValidMapperimpl;

  /**
   * 获取
   *
   * @param frwybs 法人唯一标识
   */
  @Override
  public List<ChCcjcJcjkValid> getList(String frwybs) throws Exception {
    ChCcjcJcjkValid ChCcjcJcjkValidimpl = new ChCcjcJcjkValid();
    ChCcjcJcjkValidimpl.setFrwybs(frwybs);
    return ChCcjcJcjkValidMapperimpl.select(ChCcjcJcjkValidimpl);
  }

  @Override
  public int getCountByFrwybs(String frwybs) throws Exception {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public PageResponse<ChCcjcJcjkValidDto> findJcjkMsg(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcJcjkValidDto> list = ChCcjcJcjkValidMapperimpl.findJcjkMsg(request.getParams());
    if (null != list && list.size() > 0) {
      for (ChCcjcJcjkValid chCcjcJcjkValid : list) {
        String originFrwybs = chCcjcJcjkValid.getFrwybs();
        if (!(originFrwybs == null || originFrwybs.trim().equals(""))) {
          String frwybs = AESEUtil.encodeCorpid(originFrwybs);
          chCcjcJcjkValid.setFrwybs(frwybs);
        }


      }
    }
    return new PageResponse<ChCcjcJcjkValidDto>(list);
  }

  @Override
  public PageResponse<ChCcjcJcjkValid> getJcjkDetail(PageRequest request) {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<ChCcjcJcjkValid> list = ChCcjcJcjkValidMapperimpl.getList(request.getParams());
    return new PageResponse<ChCcjcJcjkValid>(list);
  }

}
