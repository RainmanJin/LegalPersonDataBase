/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.ChNjnbQynbValidMapper;
import com.icinfo.frk.business.model.ChNjnbQynbValid;
import com.icinfo.frk.business.service.IChNjnbQynbValidService;
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
public class ChNjnbQynbValidServiceImpl extends MyBatisServiceSupport implements IChNjnbQynbValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private ChNjnbQynbValidMapper ChNjnbQynbValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<ChNjnbQynbValid> getList(String frwybs) throws Exception {
    	ChNjnbQynbValid ChNjnbQynbValidimpl = new ChNjnbQynbValid();
    	ChNjnbQynbValidimpl.setFrwybs(frwybs);
        return ChNjnbQynbValidMapperimpl.select(ChNjnbQynbValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
