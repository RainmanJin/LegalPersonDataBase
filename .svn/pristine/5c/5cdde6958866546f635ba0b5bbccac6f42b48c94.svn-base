/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.search.dto.ProduceInfoDto;
import com.icinfo.frk.search.mapper.ProduceSearchMapper;
import com.icinfo.frk.search.service.IProduceSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("ProduceSearchService")
public class ProduceSearchServiceImpl extends MyBatisServiceSupport implements IProduceSearchService {

	    @Autowired
	    private ProduceSearchMapper SearchMapper;

	    /**
	    * 描述：
	    * @author guanzhou song
	    * @param
	    * @return 
	     *@date 2017/7/19 
	    */
	    @Override
		public PageResponse<ProduceInfoDto> getDetail(PageRequest request)
				throws Exception {
			PageHelper.startPage(request.getPageNum(), request.getLength());
			List<ProduceInfoDto> list = SearchMapper.selectDetail(request.getParams());
			return new PageResponse<ProduceInfoDto>(list);
		}
}