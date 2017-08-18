/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.${table.className}Mapper;
import com.icinfo.frk.business.model.${table.className};
import com.icinfo.frk.business.service.I${table.className}Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class ${table.className}ServiceImpl extends MyBatisServiceSupport implements I${table.className}Service {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private ${table.className}Mapper ${table.className}Mapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<${table.className}> getList(String frwybs) throws Exception {
    	${table.className} ${table.className}impl = new ${table.className}();
    	${table.className}impl.setFrwybs(frwybs);
        return ${table.className}Mapperimpl.select(${table.className}impl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
