/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CaCyCyxxValidMapper;
import com.icinfo.frk.business.model.CaCyCyxxValid;
import com.icinfo.frk.business.service.ICaCyCyxxValidService;
import com.icinfo.frk.common.utils.AESEUtil;

/**
 * 描述:  ca_cy_cyxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月04日
 */
@Service
public class CaCyCyxxValidServiceImpl extends MyBatisServiceSupport implements
    ICaCyCyxxValidService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(CaCyCyxxValidServiceImpl.class);

  @Autowired
  private CaCyCyxxValidMapper caCyCyxxValidMapper;

  /**
   * 获取成员信息
   *
   * @param map 参数map
   * @return 成员信息列表
   */
  @Override
  public List<CaCyCyxxValid> getList(Map<String, Object> map) {
    return caCyCyxxValidMapper.selectList(map);
  }

  /**
   * 获取成员信息列表
   *
   * @param request 请求
   */
  @Override
  public List<CaCyCyxxValid> getList(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    CaCyCyxxValid caCyCyxxValid = new CaCyCyxxValid();
    caCyCyxxValid.setFrwybs(
        String.valueOf(AESEUtil.decodeCorpid((String) request.getParams().get("frwybs"))));
    return caCyCyxxValidMapper.select(caCyCyxxValid);
  }


  /**
   * 获取成员单位信息
   */
  public PageResponse<CaCyCyxxValid> getCaCyCyxx(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    Map<String, Object> params = request.getParams();
    List<CaCyCyxxValid> list = caCyCyxxValidMapper.getCaCyCyxx(params);
    if (list != null && list.size() > 0) {
      for (CaCyCyxxValid cacycyxx : list) {
        String frwybs = cacycyxx.getFrwybs();
        if (!(frwybs == null || frwybs.trim().equals(""))) {
          String frwybss = AESEUtil.encodeCorpid(frwybs);
          cacycyxx.setFrwybs(frwybss);
        }
      }
    }
    return new PageResponse<CaCyCyxxValid>(list);
  }


  @Override
  public PageResponse<CaCyCyxxValid> getCydwxxList(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    Map<String, Object> params = request.getParams();
    List<CaCyCyxxValid> list = caCyCyxxValidMapper.getCaCyCyxx(params);
    return new PageResponse<CaCyCyxxValid>(list);
  }


}