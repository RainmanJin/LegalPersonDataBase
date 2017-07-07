/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdWxzcGtsyqxxValidMapper;
import com.icinfo.frk.business.model.CdWxzcGtsyqxxValid;
import com.icinfo.frk.business.service.ICdWxzcGtsyqxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:  cd_wxzc_gtsyqxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdWxzcGtsyqxxValidServiceImpl extends MyBatisServiceSupport implements ICdWxzcGtsyqxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdWxzcGtsyqxxValidServiceImpl.class);

    @Autowired
    private CdWxzcGtsyqxxValidMapper cdWxzcGtsyqxxValidMapper;

    /**
     * 描述：根据法人唯一标识，获取国土使用权信息列表
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CdWxzcGtsyqxxValid> getList(String frwybs) throws Exception {
        CdWxzcGtsyqxxValid cdWxzcGtsyqxxValid = new CdWxzcGtsyqxxValid();
        cdWxzcGtsyqxxValid.setFrwybs(frwybs);
        return cdWxzcGtsyqxxValidMapper.select(cdWxzcGtsyqxxValid);
    }
}