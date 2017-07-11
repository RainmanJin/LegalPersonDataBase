/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgGcChdlxmValidMapper;
import com.icinfo.frk.business.model.CgGcChdlxmValid;
import com.icinfo.frk.business.service.ICgGcChdlxmValidService;
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
public class CgGcChdlxmValidServiceImpl extends MyBatisServiceSupport implements ICgGcChdlxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgGcChdlxmValidMapper CgGcChdlxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CgGcChdlxmValid> getList(String frwybs) throws Exception {
    	CgGcChdlxmValid CgGcChdlxmValidimpl = new CgGcChdlxmValid();
    	CgGcChdlxmValidimpl.setFrwybs(frwybs);
        return CgGcChdlxmValidMapperimpl.select(CgGcChdlxmValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
