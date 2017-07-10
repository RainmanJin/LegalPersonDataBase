/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.frk.business.model.CaDjJbxx;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
public interface ICaDjJbxxService extends BaseService {
    /**
     * 分页获取法人登记基本信息。
     *
     * @param map      参数map
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return 法人登记证列表
     */
    PageInfo<CaDjJbxx> getByKeyword(Map<String, Object> map, int pageNum, int pageSize);

    /**
     * 获取法人登记证基本信息列表
     *
     * @param map 参数map
     * @return 法人登记证列表
     */
    List<CaDjJbxx> getList(Map<String, Object> map);


    /**
     * 获取法人基本信息
     *
     * @param frwybs 法人唯一标识
     * @return
     */
    Map<String, Object> getFrJbxx(String frwybs) throws Exception;

    /**
     * 获取法人资本与资产信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    Map<String, Object> getFrZbyzc(String frwybs) throws Exception;

    PageInfo<CaDjJbxx> getBasic(Map<String, Object> map, int pageNum, int pageSize);

	Map<String, Object> getAdmissionInfo(String frwybs) throws Exception;

	Map<String, Object> getCommentInfo(String frwybs) throws Exception;

	Map<String, Object> getLawEnforceInfo(String frwybs) throws Exception;

	Map<String, Object> getLawInfo(String frwybs) throws Exception;

	Map<String, Object> getProduceInfo(String frwybs) throws Exception;

	Map<String, Object> getTaxInfo(String frwybs) throws Exception;
}