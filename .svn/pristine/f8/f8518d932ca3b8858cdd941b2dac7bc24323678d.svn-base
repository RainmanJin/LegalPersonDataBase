/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.api.mapper.CaCyFddbrValidMapper;
import com.icinfo.frk.api.model.CaCyFddbrValid;
import com.icinfo.frk.api.service.ICaCyFddbrValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_cy_fddbr_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@Service
public class CaCyFddbrValidServiceImpl extends MyBatisServiceSupport implements ICaCyFddbrValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyFddbrValidServiceImpl.class);

    @Autowired
    private CaCyFddbrValidMapper caCyFddbrValidMapper;

    /**
     * 获取法定代表人信息
     *
     * @param map 参数map
     * @return 法人登记证列表
     */
    @Override
    public List<CaCyFddbrValid> getList(Map<String, Object> map) {
        return caCyFddbrValidMapper.selectList(map);
    }
}