/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.Page;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.frk.search.dto.BasicInfoDto;
import com.icinfo.frk.search.mapper.BasicSearchMapper;
import com.icinfo.frk.search.service.IBasicSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("BasicSearchService")
public class BasicSearchServiceImpl extends MyBatisServiceSupport implements IBasicSearchService {

	    /**
	     * 日志记录器
	     */
	    private static final Logger logger = LoggerFactory.getLogger(BasicSearchServiceImpl.class);

	    @Autowired
	    private BasicSearchMapper basicSearchMapper;

	    /**
	    * 描述：
	    * @author gqf
	    * @param
	    * @return 
	     *@date 2017/7/13 
	    */
	    @Override
	    public PageInfo<BasicInfoDto> doGetDefinedPage(Map<String, Object> map, int pageNum, int pageSize) throws Exception {
	        PageHelper.startPage(pageNum, pageSize);
	        Page<BasicInfoDto> page = (Page<BasicInfoDto>) basicSearchMapper.selectAllList(map);
	        return page.toPageInfo();
	    }
}