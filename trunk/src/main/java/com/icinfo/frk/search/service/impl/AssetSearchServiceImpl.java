/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.AssetDto;
import com.icinfo.frk.business.dto.CdZbGqxxValidDto;
import com.icinfo.frk.business.mapper.CaDjJbxxMapper;
import com.icinfo.frk.business.mapper.CdGdBdcxxValidMapper;
import com.icinfo.frk.business.mapper.CdGdDcdyrValidMapper;
import com.icinfo.frk.business.mapper.CdQtSwzcValidMapper;
import com.icinfo.frk.business.mapper.CdWxzcCksyqxxValidMapper;
import com.icinfo.frk.business.mapper.CdWxzcGtsyqxxValidMapper;
import com.icinfo.frk.business.mapper.CdWxzcLysyqxxValidMapper;
import com.icinfo.frk.business.mapper.CdWxzcZscqxxValidMapper;
import com.icinfo.frk.business.mapper.CdZbGdczxxValidMapper;
import com.icinfo.frk.business.mapper.CdZbGqxxValidMapper;
import com.icinfo.frk.business.model.CdGdBdcxxValid;
import com.icinfo.frk.business.model.CdGdDcdyrValid;
import com.icinfo.frk.business.model.CdQtSwzcValid;
import com.icinfo.frk.business.model.CdWxzcCksyqxxValid;
import com.icinfo.frk.business.model.CdWxzcGtsyqxxValid;
import com.icinfo.frk.business.model.CdWxzcLysyqxxValid;
import com.icinfo.frk.business.model.CdWxzcZscqxxValid;
import com.icinfo.frk.business.model.CdZbGdczxxValid;
import com.icinfo.frk.business.service.ICdDcCbxxValidService;
import com.icinfo.frk.business.service.ICdDcClxxValidService;
import com.icinfo.frk.business.service.ICdDcTljxxValidService;
import com.icinfo.frk.business.service.ICdGdBdcxxValidService;
import com.icinfo.frk.common.utils.AESEUtil;
import com.icinfo.frk.search.service.IAssetSearchService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("AssetSearchService")
public class AssetSearchServiceImpl extends MyBatisServiceSupport implements IAssetSearchService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(AssetSearchServiceImpl.class);

  @Autowired
  private CdZbGdczxxValidMapper cdZbGdczxxValidMapper;
  @Autowired
  private CaDjJbxxMapper caDjJbxxMapper;
  @Autowired
  private ICdDcClxxValidService cdDcClxxValidService;
  @Autowired
  private ICdGdBdcxxValidService cdGdBdcxxValidService;
  @Autowired
  private ICdDcTljxxValidService cdDcTljxxValidService;
  @Autowired
  private ICdDcCbxxValidService cdDcCbxxValidService;
  @Autowired
  private CdZbGqxxValidMapper cdZbGqxxValidMapper;
  @Autowired
  private CdGdBdcxxValidMapper cdGdBdcxxValidMapper;
  @Autowired
  private CdGdDcdyrValidMapper cdGdDcdyrValidMapper;
  @Autowired
  private CdWxzcZscqxxValidMapper cdWxzcZscqxxValidMapper;
  @Autowired
  private CdWxzcGtsyqxxValidMapper cdWxzcGtsyqxxValidMapper;
  @Autowired
  private CdWxzcCksyqxxValidMapper cdWxzcCksyqxxValidMapper;
  @Autowired
  private CdWxzcLysyqxxValidMapper cdWxzcLysyqxxValidMapper;
  @Autowired
  private CdQtSwzcValidMapper cdQtSwzcValidMapper;


  /**
   * 基本资产情况汇总
   */
  @Override
  public PageResponse<AssetDto> getDetail1(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<AssetDto> list = caDjJbxxMapper.selectListByMap(request.getParams());
    try {
      for (AssetDto dto : list) {
        String frwybs = dto.getFrwybs();
        if (null != frwybs && !"".equals(frwybs)) {
          dto.setcarnum(cdDcClxxValidService.getCountByFrwybs(frwybs));
          dto.sethousenum(cdGdBdcxxValidService.getCountByFrwybs(frwybs));
          dto.settractornum(cdDcTljxxValidService.getCountByFrwybs(frwybs));
          dto.setboatnum(cdDcCbxxValidService.getCountByFrwybs(frwybs));
          dto.setFrwybs(AESEUtil.encodeCorpid(frwybs));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    ;
    return new PageResponse<AssetDto>(list);
  }

  /**
   * 股东及出资信息
   */
  @Override
  public PageResponse<CdZbGdczxxValid> getDetail2(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdZbGdczxxValid> list = cdZbGdczxxValidMapper.selectListByMap(request.getParams());

    for (CdZbGdczxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdZbGdczxxValid>(list);
  }


  /**
   * 股权变更情况
   */
  @Override
  public PageResponse<CdZbGqxxValidDto> getDetail3(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdZbGqxxValidDto> list = cdZbGqxxValidMapper.selectListByMapChange(request.getParams());
    for (CdZbGqxxValidDto dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   * 股权出质情况
   */
  @Override
  public PageResponse<CdZbGqxxValidDto> getDetail4(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdZbGqxxValidDto> list = cdZbGqxxValidMapper.selectListByMapSold(request.getParams());
    for (CdZbGqxxValidDto dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   * 股权冻结情况
   */
  @Override
  public PageResponse<CdZbGqxxValidDto> getDetail5(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdZbGqxxValidDto> list = cdZbGqxxValidMapper.selectListByMapFrozen(request.getParams());
    for (CdZbGqxxValidDto dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   * 不动产查封信息
   */
  @Override
  public PageResponse<CdGdBdcxxValid> getDetail6(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdGdBdcxxValid> list = cdGdBdcxxValidMapper.selectListByMap(request.getParams());
    for (CdGdBdcxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdGdBdcxxValid>(list);
  }

  /**
   * 动产抵押信息
   */
  @Override
  public PageResponse<CdGdDcdyrValid> getDetail7(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdGdDcdyrValid> list = cdGdDcdyrValidMapper.selectListByMap(request.getParams());
    for (CdGdDcdyrValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdGdDcdyrValid>(list);
  }

  /**
   * 无形资产-知识产权信息
   */
  @Override
  public PageResponse<CdWxzcZscqxxValid> getDetail8(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdWxzcZscqxxValid> list = cdWxzcZscqxxValidMapper.selectListByMap(request.getParams());
    for (CdWxzcZscqxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdWxzcZscqxxValid>(list);
  }

  /**
   * 土地使用权信息
   */
  @Override
  public PageResponse<CdWxzcGtsyqxxValid> getDetail9(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdWxzcGtsyqxxValid> list = cdWxzcGtsyqxxValidMapper.selectListByMap(request.getParams());
    for (CdWxzcGtsyqxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdWxzcGtsyqxxValid>(list);
  }

  /**
   * 无形资产-采矿权
   */
  @Override
  public PageResponse<CdWxzcCksyqxxValid> getDetail10(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdWxzcCksyqxxValid> list = cdWxzcCksyqxxValidMapper.selectListByMap(request.getParams());
    for (CdWxzcCksyqxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdWxzcCksyqxxValid>(list);
  }

  /**
   * 无形资产-林业使用权
   */
  @Override
  public PageResponse<CdWxzcLysyqxxValid> getDetail11(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdWxzcLysyqxxValid> list = cdWxzcLysyqxxValidMapper.selectListByMap(request.getParams());
    for (CdWxzcLysyqxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdWxzcLysyqxxValid>(list);
  }

  /**
   * 其他资产-生物资产
   */
  @Override
  public PageResponse<CdQtSwzcValid> getDetail12(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CdQtSwzcValid> list = cdQtSwzcValidMapper.selectListByMap(request.getParams());
    for (CdQtSwzcValid dto : list) {
      String corpid = dto.getFrwybs();
      if (null != corpid && !"".equals(corpid)) {
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CdQtSwzcValid>(list);
  }

}