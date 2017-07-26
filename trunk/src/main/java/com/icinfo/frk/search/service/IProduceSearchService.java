/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.search.dto.ProduceInfoDto;

/**
 * 描述:    dt_frfl_tj 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public interface IProduceSearchService extends BaseService {

	PageResponse<ProduceInfoDto> getDetail(PageRequest request) throws Exception;
}