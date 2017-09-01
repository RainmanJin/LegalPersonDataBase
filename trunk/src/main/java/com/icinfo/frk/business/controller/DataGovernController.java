package com.icinfo.frk.business.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.DataImplVaild;
import com.icinfo.frk.business.service.DataShareService;
import com.icinfo.frk.support.Constants;
import com.icinfo.frk.support.LogTypeEnum;
import com.icinfo.frk.support.util.RequestUtil;
import com.icinfo.frk.system.model.SysUser;
import com.icinfo.frk.system.service.ISysLogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 数据治理
 *
 * @author hujianping
 */
@Controller
@RequestMapping("/data/datagovern")
public class DataGovernController extends BaseController {

	
	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(DataGovernController.class);

	/**
	 * 跳转到数据目录统计页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/statistics")
	public String statistics() throws Exception {
		return "business/datagovern/statistics";
	}
	
	/**
	 * 跳转到部门已入库页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptInStroage")
	public String deptInStroage() throws Exception {
		return "business/datagovern/deptInStroage";
	}
	
	/**
	 * 跳转到部门未入库页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deptOutStroage")
	public String deptOutStroage() throws Exception {
		return "business/datagovern/deptOutStroage";
	}
	
	/**
	 * 跳转到关联分析页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/relationAnalysis")
	public String relationAnalysis() throws Exception {
		return "business/datagovern/relationAnalysis";
	}
	
	/**
	 * 跳转到法人库数据统计页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/dataStatistics")
	public String dataStatistics() throws Exception {
		return "business/datagovern/dataStatistics";
	}
	
	/**
	 * 跳转到注册资本页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/registeredCapital")
	public String registeredCapital() throws Exception {
		return "business/datagovern/registeredCapital";
	}
	
	/**
	 * 跳转到行业统计页面
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/industryDetail")
	public String industryDetail() throws Exception {
		return "business/datagovern/industryDetail";
	}
}
