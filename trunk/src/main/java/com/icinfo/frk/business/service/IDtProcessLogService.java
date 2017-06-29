/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.dto.DtProcessLogDto;
import com.icinfo.frk.business.mapper.DtProcessLogMapper;
import com.icinfo.frk.business.model.DayLogCount;

import java.util.List;
import java.util.Map;

/**
 * 描述:  dt_process_log 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月08日
 */
public interface IDtProcessLogService extends BaseService {

     public List<DayLogCount> doGetDayTaskLogCountList(Map<String,Object> paraMap) throws Exception;
 	/**
      * 处理任务条数统计
      *
      * @throws Exception
      * @auther ylr
      * @date 2017年5月9日
      */
 	List<DtProcessLogDto> doGetTaskProcessList() throws Exception;
 	/**
     * 任务耗时统计
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	List<DtProcessLogDto> doGetTaskTimeList() throws Exception;
 	
 	/**
     * 累计处理条数
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetGrandDealNum() throws Exception;
	/**
     * 正确条数
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetTrueNum() throws Exception;
	/**
     * 错误条数
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetFalseNum() throws Exception;
	/**
     * 总流量
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetAllSum() throws Exception;
	/**
     * 平均总流量
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetAvgAllSum() throws Exception;
	/**
     * 总处理时间
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	Integer doGetAllDealTime() throws Exception;
	/**
     * 获取柱状图json
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	JSONObject dogetLineJson() throws Exception;
 	/**
     * 获取当前任务列表
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	List<DtProcessLogDto> doGetCurrentTaskList() throws Exception;
	/**
     * 获取当前任务成功失败数量
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	DtProcessLogDto doGetCurrentTaskSum() throws Exception;
	/**
     * 获取当前任务成功失败json
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	JSONObject doGetCurrentTaskLine() throws Exception;
	
	
	
     
}