/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年02月22日
 * @version 2.0
 */
package com.icinfo.frk.system.mapper;

import java.util.List;
import java.util.Map;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.system.model.SysLog;

/**
 * 描述: 系统操作日志sys_log 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年07月22日
 */
public interface SysLogMapper extends Mapper<SysLog> {
	
	List<SysLog> selectFrkLogList(Map<String,Object> map) throws Exception;
	
}