/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.DtRwjdxxMapper;
import com.icinfo.frk.business.model.DtRwjdxx;
import com.icinfo.frk.business.service.IDtRwjdxxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    dt_rwjdxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年05月11日
 */
@Service("dtRwjdxxService")
public class DtRwjdxxServiceImpl extends MyBatisServiceSupport implements IDtRwjdxxService {
	@Autowired
	private DtRwjdxxMapper dtRwjdxxMapper;
	
	
	/**
     * 获取当前任务信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public DtRwjdxx doGetCurrentProcessTask() throws Exception{
		return dtRwjdxxMapper.doGetCurrentProcessTask();
	}
}