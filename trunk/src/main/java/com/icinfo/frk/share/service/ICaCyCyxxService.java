/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.share.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.share.model.CaCyCyxx;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_cy_cyxx 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年06月28日
 */
public interface ICaCyCyxxService extends BaseService {

    /**
     * 分页获取成员单位信息
     *
     * @param map      查询条件
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return
     */
    List<CaCyCyxx> doGetCyxxList(Map<String, Object> map, int pageNum, int pageSize);
}