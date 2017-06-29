/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.model.DayLogCount;
import com.icinfo.frk.business.model.DepData;

/**
 * 描述:    dt_frfl_tj 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public interface IDtFrflTjService extends BaseService {
	
	/**
     * 获取法人信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	List<DtFrflTjDto> doGetDtFrflTjDtoList() throws Exception;
	/**
     * 获取piejsonobject
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	JSONObject doGetPiesJosnObject() throws Exception;
	
	/**
     * 获取法人分类与对应数量
     * @throws Exception
     * @auther gzs
     * @date 2017年6月22日
     */
	JSONObject doGetAllTypeNameAndNumJosnObject() throws Exception;
	
	/**
     * 获取部门交换数据量
     * @throws Exception
     * @auther gzs
     * @date 2017年6月22日
     */
	List<DtFrflTjDto> doGetAllTypeNameAndNum();
	
	/**
     *获得各部分数据交换量List
     * @throws Exception
     * @auther gzs
     * @date 2017年6月22日
     */
	public List<DepData> doGetAllDepExchangeCountingList(Map<String, Object> paraMap) throws Exception;
	
	/**
    *获得各维度业务数据沉淀量分类统计
    * @throws Exception
    * @auther gzs
    * @date 2017年6月22日
    */
	DtFrflTjDto doGetDimTotal(String id) throws Exception;
	
	/**
    *获得交换条数总数
    * @throws Exception
    * @auther gzs
    * @date 2017年6月22日
    */
	DepData doGetExchangeSum() throws Exception;
	
	/**
    *获得法人总数
    * @throws Exception
    * @auther gzs
    * @date 2017年6月22日
    */
	DtFrflTjDto doGetLegalPersonCount() throws Exception;
}