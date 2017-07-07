/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdWxzcLysyqxxValidMapper;
import com.icinfo.frk.business.model.CdWxzcLysyqxxValid;
import com.icinfo.frk.business.service.ICdWxzcLysyqxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:  cd_wxzc_lysyqxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdWxzcLysyqxxValidServiceImpl extends MyBatisServiceSupport implements ICdWxzcLysyqxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdWxzcLysyqxxValidServiceImpl.class);

    @Autowired
    private CdWxzcLysyqxxValidMapper cdWxzcLysyqxxValidMapper;


    /**
     * 描述:根据法人唯一标识 获取无形资产-林业使用权列表
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CdWxzcLysyqxxValid> getList(String frwybs) throws Exception {
        CdWxzcLysyqxxValid cdWxzcLysyqxxValid = new CdWxzcLysyqxxValid();
        cdWxzcLysyqxxValid.setFrwybs(frwybs);
        return cdWxzcLysyqxxValidMapper.select(cdWxzcLysyqxxValid);
    }
}