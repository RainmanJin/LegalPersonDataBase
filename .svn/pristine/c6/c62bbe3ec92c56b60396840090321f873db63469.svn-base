/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.frk.api.mapper.CaCyCyxxMapper;
import com.icinfo.frk.api.model.CaCyCyxx;
import com.icinfo.frk.api.service.ICaCyCyxxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_cy_cyxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月28日
 */
@Service
public class CaCyCyxxServiceImpl extends MyBatisServiceSupport implements ICaCyCyxxService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyCyxxServiceImpl.class);

    @Autowired
    private CaCyCyxxMapper caCyCyxxMapper;

    /**
     * 分页获取成员单位信息
     *
     * @param map      查询条件
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return
     */
    @Override
    public List<CaCyCyxx> getPage(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return caCyCyxxMapper.selectList(map);
    }
}