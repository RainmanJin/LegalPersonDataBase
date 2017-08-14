/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.AssetDto;
import com.icinfo.frk.business.dto.CdZbGqxxValidDto;
import com.icinfo.frk.business.model.CdGdBdcxxValid;
import com.icinfo.frk.business.model.CdGdDcdyrValid;
import com.icinfo.frk.business.model.CdQtSwzcValid;
import com.icinfo.frk.business.model.CdWxzcCksyqxxValid;
import com.icinfo.frk.business.model.CdWxzcGtsyqxxValid;
import com.icinfo.frk.business.model.CdWxzcLysyqxxValid;
import com.icinfo.frk.business.model.CdWxzcZscqxxValid;
import com.icinfo.frk.business.model.CdZbGdczxxValid;

/**
 * 描述:    dt_frfl_tj 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public interface IAssetSearchService extends BaseService {

  PageResponse<AssetDto> getDetail1(PageRequest request) throws Exception;

  PageResponse<CdZbGdczxxValid> getDetail2(PageRequest request) throws Exception;

  PageResponse<CdZbGqxxValidDto> getDetail3(PageRequest request) throws Exception;

  PageResponse<CdZbGqxxValidDto> getDetail4(PageRequest request) throws Exception;

  PageResponse<CdZbGqxxValidDto> getDetail5(PageRequest request) throws Exception;

  PageResponse<CdGdBdcxxValid> getDetail6(PageRequest request) throws Exception;

  PageResponse<CdGdDcdyrValid> getDetail7(PageRequest request) throws Exception;

  PageResponse<CdWxzcZscqxxValid> getDetail8(PageRequest request) throws Exception;

  PageResponse<CdWxzcGtsyqxxValid> getDetail9(PageRequest request) throws Exception;

  PageResponse<CdWxzcCksyqxxValid> getDetail10(PageRequest request) throws Exception;

  PageResponse<CdWxzcLysyqxxValid> getDetail11(PageRequest request) throws Exception;

  PageResponse<CdQtSwzcValid> getDetail12(PageRequest request) throws Exception;
}