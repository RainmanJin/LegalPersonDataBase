/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdDcTljxxValidMapper;
import com.icinfo.frk.business.model.CdDcTljxxValid;
import com.icinfo.frk.business.service.ICdDcTljxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:  cd_dc_tljxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdDcTljxxValidServiceImpl extends MyBatisServiceSupport implements ICdDcTljxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdDcTljxxValidServiceImpl.class);

    //拖拉机信息mapper注入
    @Autowired
    private CdDcTljxxValidMapper cdDcTljxxValidMapper;

    /**
     * 根据法人唯一标识查询拖拉机数量
     *
     * @param frwybs 法人唯一标识
     * @return 拖拉机数量
     * @throws Exception 异常
     */
    @Override
    public int getCountByFrwybs(String frwybs) throws Exception {
        CdDcTljxxValid q = new CdDcTljxxValid();
        q.setFrwybs(frwybs);
        return cdDcTljxxValidMapper.selectCount(q);
    }
}