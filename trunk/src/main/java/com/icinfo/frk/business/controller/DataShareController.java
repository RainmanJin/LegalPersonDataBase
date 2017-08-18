package com.icinfo.frk.business.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.DataImplVaild;
import com.icinfo.frk.business.service.DataShareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 数据共享
 *
 * @author hzhb
 */
@Controller
@RequestMapping("/data/dataShare")
public class DataShareController extends BaseController {

	@Autowired
	private DataShareService dataShareService;
  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(DataShareController.class);
  
  
  /**
   * 跳转到基本接口页面
   * @return
   * @throws Exception
   */
  @RequestMapping(value = "/baseImpl")
  public String baseImpl() throws Exception {
    return "business/datashare/baseImplQuery";
  }
  
  
  /**
   * 根据接口名去查询相对应的接口
   */
  @RequestMapping(value = "/getBaseImpl")
  @ResponseBody
  public PageResponse<DataImplVaild> getBaseImpl(PageRequest request) throws Exception {
    PageResponse<DataImplVaild> list = dataShareService.getBaseImpl(request);
    return list;
  }
  
  /**
   * 进入法人登记基本信息查询
   */
  @RequestMapping(value = "/frDjMsgQuery")
  public String frDjMsgQuery() throws Exception {
    return "business/datashare/frDjMsgQuery";
  }


  /**
   * 进入成员单位信息查询
   */
  @RequestMapping(value = "/cyDeptMsgQuery")
  public String cyDeptMsgQuery() throws Exception {
    return "business/datashare/cyDeptMsgQuery";
  }

  /**
   * 进入法人校验
   */
  @RequestMapping(value = "/frCheck")
  public String frCheck() throws Exception {
    return "business/datashare/frCheck";
  }
}
