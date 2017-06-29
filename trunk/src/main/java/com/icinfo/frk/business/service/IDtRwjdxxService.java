/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.DtRwjdxx;

/**
 * 描述:    dt_rwjdxx 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月11日
 */
public interface IDtRwjdxxService extends BaseService {
	/**
     * 获取当前任务信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	DtRwjdxx doGetCurrentProcessTask() throws Exception;
	
}