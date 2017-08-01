/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import java.util.List;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.frk.search.dto.LawEnforceInfoDto;
import com.icinfo.frk.search.dto.LawInfoDto;
import com.icinfo.frk.search.mapper.LawEnforceSearchMapper;
import com.icinfo.frk.search.mapper.LawInfoSearchMapper;
import com.icinfo.frk.search.service.ILawEnforceSearchService;
import com.icinfo.frk.search.service.ILawInfoSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("LawInfoSearchService")
public class LawInfoSearchServiceImpl extends MyBatisServiceSupport implements ILawInfoSearchService {


	    @Autowired
	    private LawInfoSearchMapper SearchMapper;

	    /**
	    * 描述：
	    * @author gqf
	    * @param
	    * @return 
	     *@date 2017/7/13 
	    */
	    @Override
	    public PageResponse<LawInfoDto> getDetail(PageRequest request) throws Exception {
			PageHelper.startPage(request.getPageNum(), request.getLength());
			List<LawInfoDto> list = SearchMapper.selectDetail(request.getParams());
			return new PageResponse<LawInfoDto>(list);
	    }
}