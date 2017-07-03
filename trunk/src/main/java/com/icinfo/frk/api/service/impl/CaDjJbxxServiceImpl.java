/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.frk.api.mapper.CaDjJbxxMapper;
import com.icinfo.frk.api.model.CaDjJbxx;
import com.icinfo.frk.api.service.ICaDjJbxxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Service
public class CaDjJbxxServiceImpl extends MyBatisServiceSupport implements ICaDjJbxxService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaDjJbxxServiceImpl.class);

    @Autowired
    private CaDjJbxxMapper caDjJbxxMapper;

    /**
     * 分页获取法人登记基本信息。
     *
     * @param map      参数map
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return
     */
    @Override
    public List<CaDjJbxx> getPage(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return caDjJbxxMapper.selectList(map);
    }

    /**
     * 获取法人登记证基本信息列表
     * @param map 参数map
     * @return 法人登记证列表
     */
    @Override
    public List<CaDjJbxx> getList(Map<String, Object> map) {
        return caDjJbxxMapper.selectList(map);
    }
}