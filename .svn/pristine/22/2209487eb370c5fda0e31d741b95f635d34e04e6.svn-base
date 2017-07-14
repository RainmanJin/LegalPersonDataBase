/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.mapper.entity.Example;
import com.icinfo.framework.mybatis.pagehelper.Page;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.mapper.DtBmsjtjMapper;
import com.icinfo.frk.business.model.DtBmsjtj;
import com.icinfo.frk.business.service.IDtBmsjtjService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:  dt_bm_sjtj 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月12日
 */
@Service
public class DtBmsjtjServiceImpl extends MyBatisServiceSupport implements IDtBmsjtjService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(DtBmsjtjServiceImpl.class);

    @Autowired
    private DtBmsjtjMapper dtBmsjtjMapper;
    /**
    * 描述：
    * @author gqf
    * @param  
    * @return 
     *@date 2017/7/13 
    */
    
    @Override
    public List<DtBmsjtj> doGetPageDtBmsjtj(PageRequest request) throws Exception {
        PageHelper.startPage(request.getPageNum(), request.getLength());
        return dtBmsjtjMapper.selectAll();
    }
    /**
    * 描述：
    * @author gqf
    * @param
    * @return 
     *@date 2017/7/13 
    */
    @Override
    public PageInfo<DtBmsjtj> doGetDefinedPage(Map<String, Object> map, int pageNum, int pageSize) throws Exception {
        Example example = new Example(DtBmsjtj.class);
        PageHelper.startPage(pageNum, pageSize);
        example.setOrderByClause("frksl desc");
        Page<DtBmsjtj> dtBmsjtjPage = (Page<DtBmsjtj>)dtBmsjtjMapper.selectByExample(example);
       // Page<DtBmsjtj> dtBmsjtjPage = (Page<DtBmsjtj>)dtBmsjtjMapper.selectAll();
        return dtBmsjtjPage.toPageInfo();
    }
}