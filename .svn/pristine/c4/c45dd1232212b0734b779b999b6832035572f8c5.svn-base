/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdZbGdczxxValidMapper;
import com.icinfo.frk.business.model.CdZbGdczxxValid;
import com.icinfo.frk.business.service.ICdZbGdczxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:  cd_zb_gdczxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdZbGdczxxValidServiceImpl extends MyBatisServiceSupport implements ICdZbGdczxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdZbGdczxxValidServiceImpl.class);

    //投资人(股东)出资情况mapper注入
    @Autowired
    private CdZbGdczxxValidMapper cdZbGdczxxValidMapper;

    /**
     * 根据法人唯一标识查询股东出资信息
     *
     * @param frwybs 法人唯一标识
     * @return 股东出资信息
     * @throws Exception 异常
     */
    @Override
    public List<CdZbGdczxxValid> getList(String frwybs) throws Exception {
        CdZbGdczxxValid q = new CdZbGdczxxValid();
        q.setFrwybs(frwybs);
        return cdZbGdczxxValidMapper.select(q);
    }
}