package com.icinfo.frk.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.system.model.SysLog;
import com.icinfo.frk.system.service.ISysLogService;


/**
 * 系统操作日志
 * 
 * @author zhuyong
 * @date 2017-02-22
 */
@Controller
@RequestMapping("/data/log")
public class FrkLogController extends BaseController{

	@Autowired
	private ISysLogService sysLogService;
	
	/**
	 * 进入日志管理页面
	 * 
	 * @author zhuyong
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/show")
	public String show() throws Exception{
		return "system/log/log_list";
	}
	
	/**
	 * 获取日志信息
	 * 
	 * @author zhuyong
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	@ResponseBody
	public PageResponse<SysLog> list(PageRequest request) throws Exception{
		List<SysLog> dataList = sysLogService.queryByPage(request);
		return new PageResponse<SysLog>(dataList);
	}

}
