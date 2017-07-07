/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CdQtSwzcValid;

import java.util.List;

/**
 * 描述:  cd_qt_swzc_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICdQtSwzcValidService extends BaseService {

    /**
     * 描述：根据法人唯一标识获取 其他生物资产列表
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    List<CdQtSwzcValid> getList(String frwybs) throws Exception;
}