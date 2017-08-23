/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.system.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.tools.utils.WebUtils;
import com.icinfo.frk.support.Constants;
import com.icinfo.frk.support.util.RequestUtil;
import com.icinfo.frk.system.mapper.SysLogMapper;
import com.icinfo.frk.system.model.SysLog;
import com.icinfo.frk.system.model.SysUser;
import com.icinfo.frk.system.service.ISysLogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: 系统操作日志sys_log 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月22日
 */
@Service
public class SysLogServiceImpl extends MyBatisServiceSupport implements ISysLogService {
    /**
     * 日志记录器
     * private static final Logger logger = LoggerFactory.getLogger(FcfLogServiceImpl.class);
     */

    @Autowired
    private SysLogMapper sysLogMapper;
    
	/**
	 * 查询信息列表
	 * 
	 * @author zhuyong
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public List<SysLog> queryByPage(PageRequest request) throws Exception{
		PageHelper.startPage(request.getPageNum(), request.getLength());
		return sysLogMapper.selectFrkLogList(request.getParams());
	}
    
    
    /**
	 * 保存日志信息
	 * 
	 * @author zhuyong
	 * @param logLoc
	 * @param logType
	 * @param logRemark
	 * @return
	 * @throws Exception
	 */
	public int save(String logType) throws Exception{
		return save( logType,"");
	}
	
	
	/**
	 * 保存日志信息
	 * 
	 * @author zhuyong
	 * @param logLoc
	 * @param logType
	 * @param logRemark
	 * @return
	 * @throws Exception
	 */
	public int save(String logType,String logRemark) throws Exception{
		String logUser = ((SysUser) RequestUtil.getSession().getAttribute(Constants.SESSION_LOG_KEY)).getUsername();
		
		String logIp = WebUtils.getIpAddress(RequestUtil.getRequest());
		
		return sysLogMapper.insert(new SysLog(logUser, logType, logRemark, logIp));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}