/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgAqscYhjlValidMapper;
import com.icinfo.frk.business.model.CgAqscYhjlValid;
import com.icinfo.frk.business.service.ICgAqscYhjlValidService;
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
public class CgAqscYhjlValidServiceImpl extends MyBatisServiceSupport implements ICgAqscYhjlValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgAqscYhjlValidMapper CgAqscYhjlValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CgAqscYhjlValid> getList(String frwybs) throws Exception {
    	CgAqscYhjlValid CgAqscYhjlValidimpl = new CgAqscYhjlValid();
    	CgAqscYhjlValidimpl.setFrwybs(frwybs);
        return CgAqscYhjlValidMapperimpl.select(CgAqscYhjlValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
