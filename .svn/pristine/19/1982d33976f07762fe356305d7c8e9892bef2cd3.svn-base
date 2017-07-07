/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CaCyDzxxValidMapper;
import com.icinfo.frk.business.model.CaCyDzxxValid;
import com.icinfo.frk.business.service.ICaCyDzxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:  ca_cs_dzxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月05日
 */
@Service
public class CaCyDzxxValidServiceImpl extends MyBatisServiceSupport implements ICaCyDzxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyDzxxValidServiceImpl.class);

    @Autowired
    private CaCyDzxxValidMapper caCyDzxxValidMapper;


    /**
     * 根据法人唯一标识获取地址信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public CaCyDzxxValid getByFrwybs(String frwybs) throws Exception {
        CaCyDzxxValid caCyDzxxValid = new CaCyDzxxValid();
        caCyDzxxValid.setFrwybs(frwybs);
        return caCyDzxxValidMapper.selectOne(caCyDzxxValid);
    }
}