/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年05月11日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.DtRwjdxx;

/**
 * 描述:    dt_rwjdxx 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年05月11日
 */
public interface DtRwjdxxMapper extends Mapper<DtRwjdxx> {
	
	DtRwjdxx doGetCurrentProcessTask();
}