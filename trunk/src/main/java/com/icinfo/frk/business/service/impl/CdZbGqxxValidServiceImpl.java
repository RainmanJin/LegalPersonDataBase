/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.dto.CdZbGqxxValidDto;
import com.icinfo.frk.business.mapper.CdZbGqxxValidMapper;
import com.icinfo.frk.business.service.ICdZbGqxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述: 资本-股权情况 cd_zb_gqxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdZbGqxxValidServiceImpl extends MyBatisServiceSupport implements ICdZbGqxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdZbGqxxValidServiceImpl.class);

    /**
     * 注入股权信息Mapper
     */
    @Autowired
    private CdZbGqxxValidMapper cdZbGqxxValidMapper;

    /**
     * 获取股权信息列表
     *
     * @param frwybs 法人唯一标识
     * @return 股权信息列表
     * @throws Exception
     */
    @Override
    public List<CdZbGqxxValidDto> getList(String frwybs) throws Exception {
        Map<String, Object>map = new HashMap<>();
        map.put("frwybs", frwybs);
        return cdZbGqxxValidMapper.selectList(map);
    }
}