/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgGcZytzxmValidMapper;
import com.icinfo.frk.business.model.CgGcZytzxmValid;
import com.icinfo.frk.business.service.ICgGcZytzxmValidService;
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
public class CgGcZytzxmValidServiceImpl extends MyBatisServiceSupport implements ICgGcZytzxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgGcZytzxmValidMapper CgGcZytzxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CgGcZytzxmValid> getList(String frwybs) throws Exception {
    	CgGcZytzxmValid CgGcZytzxmValidimpl = new CgGcZytzxmValid();
    	CgGcZytzxmValidimpl.setFrwybs(frwybs);
        return CgGcZytzxmValidMapperimpl.select(CgGcZytzxmValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
