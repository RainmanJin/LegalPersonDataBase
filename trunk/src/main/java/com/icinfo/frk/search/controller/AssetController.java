package com.icinfo.frk.search.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.AssetDto;
import com.icinfo.frk.business.dto.CdZbGqxxValidDto;
import com.icinfo.frk.business.mapper.CaDjJbxxMapper;
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
import com.icinfo.frk.business.service.ICdGdDcdyrValidService;
import com.icinfo.frk.business.service.ICdQtSwzcValidService;
import com.icinfo.frk.business.service.ICdWxzcCksyqxxValidService;
import com.icinfo.frk.business.service.ICdWxzcGtsyqxxValidService;
import com.icinfo.frk.business.service.ICdWxzcLysyqxxValidService;
import com.icinfo.frk.business.service.ICdWxzcZscqxxValidService;
import com.icinfo.frk.business.service.ICdZbGdczxxValidService;
import com.icinfo.frk.business.service.ICdZbGqxxValidService;
import com.icinfo.frk.common.utils.AESEUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:  资本资产对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Controller
@RequestMapping("/data/asset")
public class AssetController extends BaseController {

  @Autowired
  private CaDjJbxxMapper caDjJbxxMapper;

  /**
   * 车辆信息服务
   */
  @Autowired
  private ICdDcClxxValidService cdDcClxxValidService;

  /**
   * 不动产信息服务
   */
  @Autowired
  private ICdGdBdcxxValidService cdGdBdcxxValidService;

  /**
   * 拖拉机信息服务
   */
  @Autowired
  private ICdDcTljxxValidService cdDcTljxxValidService;

  /**
   * 船舶信息服务
   */
  @Autowired
  private ICdDcCbxxValidService cdDcCbxxValidService;

  /**
   * 股东及出资信息服务
   */
  @Autowired
  private ICdZbGdczxxValidService cdZbGdczxxValidService;

  /**
   * 股权信息服务
   */
  @Autowired
  private ICdZbGqxxValidService cdZbGqxxValidService;

  /**
   * 动产抵押信息服务
   */
  @Autowired
  private ICdGdDcdyrValidService cdGdDcdyrValidService;

  /**
   * 知识产权信息服务
   */
  @Autowired
  private ICdWxzcZscqxxValidService cdWxzcZscqxxValidService;

  /**
   * 土地使用权信息服务
   */
  @Autowired
  private ICdWxzcGtsyqxxValidService cdWxzcGtsyqxxValidService;

  /**
   * 采矿权信息服务
   */
  @Autowired
  private ICdWxzcCksyqxxValidService cdWxzcCksyqxxValidService;

  /**
   * 林业使用权信息服务
   */
  @Autowired
  private ICdWxzcLysyqxxValidService cdWxzcLysyqxxValidService;

  /**
   * 生物资产信息服务
   */
  @Autowired
  private ICdQtSwzcValidService cdQtSwzcValidService;


  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/zcqkhz")
  @ResponseBody
  public PageResponse<AssetDto> getzcqkhzDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<AssetDto> list = caDjJbxxMapper.GetAssetDto(frwybs);
    for (AssetDto dto : list) {
      dto.setcarnum(cdDcClxxValidService.getCountByFrwybs(frwybs));
      dto.sethousenum(cdGdBdcxxValidService.getCountByFrwybs(frwybs));
      dto.settractornum(cdDcTljxxValidService.getCountByFrwybs(frwybs));
      dto.setboatnum(cdDcCbxxValidService.getCountByFrwybs(frwybs));
    }
    return new PageResponse<AssetDto>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/gdcz")
  @ResponseBody
  public PageResponse<CdZbGdczxxValid> getgdczDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdZbGdczxxValid> list = cdZbGdczxxValidService.getList(frwybs);
    return new PageResponse<CdZbGdczxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/gqbg")
  @ResponseBody
  public PageResponse<CdZbGqxxValidDto> getgqbgDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdZbGqxxValidDto> list = cdZbGqxxValidService.getListChange(frwybs);
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/gqcz")
  @ResponseBody
  public PageResponse<CdZbGqxxValidDto> getgqczDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdZbGqxxValidDto> list = cdZbGqxxValidService.getListSold(frwybs);
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/gqdj")
  @ResponseBody
  public PageResponse<CdZbGqxxValidDto> getgqdjDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdZbGqxxValidDto> list = cdZbGqxxValidService.getListFrozen(frwybs);
    return new PageResponse<CdZbGqxxValidDto>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/bdccf")
  @ResponseBody
  public PageResponse<CdGdBdcxxValid> getbdccfDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdGdBdcxxValid> list = cdGdBdcxxValidService.getList(frwybs);
    return new PageResponse<CdGdBdcxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/dcdy")
  @ResponseBody
  public PageResponse<CdGdDcdyrValid> getdcdyDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdGdDcdyrValid> list = cdGdDcdyrValidService.getList(frwybs);
    return new PageResponse<CdGdDcdyrValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/zscq")
  @ResponseBody
  public PageResponse<CdWxzcZscqxxValid> getzscqDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdWxzcZscqxxValid> list = cdWxzcZscqxxValidService.getList(frwybs);
    return new PageResponse<CdWxzcZscqxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/tdsyq")
  @ResponseBody
  public PageResponse<CdWxzcGtsyqxxValid> gettdsyqDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdWxzcGtsyqxxValid> list = cdWxzcGtsyqxxValidService.getList(frwybs);
    return new PageResponse<CdWxzcGtsyqxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/ckq")
  @ResponseBody
  public PageResponse<CdWxzcCksyqxxValid> getckqDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdWxzcCksyqxxValid> list = cdWxzcCksyqxxValidService.getList(frwybs);
    return new PageResponse<CdWxzcCksyqxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/lysyq")
  @ResponseBody
  public PageResponse<CdWxzcLysyqxxValid> getlysyqDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdWxzcLysyqxxValid> list = cdWxzcLysyqxxValidService.getList(frwybs);
    return new PageResponse<CdWxzcLysyqxxValid>(list);
  }

  /**
   *
   * @param request
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/swzc")
  @ResponseBody
  public PageResponse<CdQtSwzcValid> getswzcDetail(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    String frwybs = (String) request.getParams().get("frwybs");
    if (null != frwybs && !"".equals(frwybs)) {
      frwybs = AESEUtil.decodeCorpid(frwybs);
    }
    List<CdQtSwzcValid> list = cdQtSwzcValidService.getList(frwybs);
    return new PageResponse<CdQtSwzcValid>(list);
  }


}
