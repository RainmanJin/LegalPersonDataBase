/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CeRyRyxxValid;
import com.icinfo.frk.business.model.CeXkzBaxxValid;
import com.icinfo.frk.business.model.CeXkzXzxkxxValid;
import com.icinfo.frk.business.model.CeZzZzxxValid;

/**
 * 描述:    dt_frfl_tj 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public interface IAdmissionSearchService extends BaseService {

  PageResponse<CeXkzXzxkxxValid> getDetail1(PageRequest request) throws Exception;

  PageResponse<CeXkzBaxxValid> getDetail2(PageRequest request) throws Exception;

  PageResponse<CeZzZzxxValid> getDetail3(PageRequest request) throws Exception;

  PageResponse<CeRyRyxxValid> getDetail4(PageRequest request) throws Exception;
}