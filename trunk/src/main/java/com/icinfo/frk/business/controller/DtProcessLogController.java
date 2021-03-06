/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.business.dto.DtProcessLogDto;
import com.icinfo.frk.business.model.DayLogCount;
import com.icinfo.frk.business.model.DtRwjdxx;
import com.icinfo.frk.business.service.IDtFrflTjService;
import com.icinfo.frk.business.service.IDtFrxzTjService;
import com.icinfo.frk.business.service.IDtProcessLogService;
import com.icinfo.frk.business.service.IDtRwjdxxService;
import com.icinfo.frk.support.util.DateUtil;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:  dt_process_log 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月08日
 */
@Controller
@RequestMapping({"/data/dtprocesslog"})
public class DtProcessLogController extends BaseController {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(DtProcessLogController.class);

  @Autowired
  private IDtProcessLogService dtProcessLogService;
  @Autowired
  private IDtFrflTjService dtFrflTjService;
  @Autowired
  private IDtFrxzTjService dtFrxzTjService;
  @Autowired
  private IDtRwjdxxService dtRwjdxxService;

  /*
   * 每日访问统计
   * @anthor:gqf
   */
  @RequestMapping("/viewdaydbclearcount.json")
  @ResponseBody
  public AjaxResult viewDayDbClearCount(HttpServletRequest req) throws Exception {
    Map<String, Object> paramMap = new HashMap<String, Object>();
    List<DayLogCount> processLogList = dtProcessLogService.doGetDayTaskLogCountList(paramMap);
    return AjaxResult.success("processLogList", processLogList);
  }

  /*
   * 法人数量动态统计
   * @anthor:ylr
   */
  @RequestMapping("/legalpersoncount.json")
  @ResponseBody
  public AjaxResult legalPersonCount(HttpServletRequest req) throws Exception {
    JSONObject resp = new JSONObject();
    JSONObject pies = dtFrflTjService.doGetPiesJosnObject();
    Map<String,Object> map = new HashMap<String,Object>();
    
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_YEAR, -7);
    cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
    map.put("endTime", DateUtil.dateToString(cal.getTime(), "yyyy-MM-dd"));
    cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
    map.put("startTime", DateUtil.dateToString(cal.getTime(), "yyyy-MM-dd"));
    
    cal.add(Calendar.WEEK_OF_YEAR, 1);
    map.put("endTime_", DateUtil.dateToString(cal.getTime(), "yyyy-MM-dd"));
    
    JSONArray array3 = dtFrxzTjService.doGetFrxzJsonArray(map);

    resp.put("pie1", pies.get("pie1"));
    resp.put("pie2", pies.get("pie2"));
    resp.put("line", array3);
    resp.put("allSum", 12255547);

    return AjaxResult.success("frtj", resp);
  }

  /*
   * 处理任务条数统计
   * @anthor:ylr
   */
  @RequestMapping("/taskprocesscount.json")
  @ResponseBody
  public AjaxResult taskProcessCount(HttpServletRequest req) throws Exception {
    JSONObject resp = new JSONObject();
    JSONObject obj = dtProcessLogService.dogetLineJson();

    resp.put("line", obj);
    resp.put("num1", dtProcessLogService.doGetGrandDealNum());
    resp.put("num2", dtProcessLogService.doGetTrueNum());
    resp.put("num3", dtProcessLogService.doGetFalseNum());
    resp.put("num4", dtProcessLogService.doGetAllSum());
    resp.put("num5", dtProcessLogService.doGetAvgAllSum());
    resp.put("num6", dtProcessLogService.doGetAllDealTime());

    return AjaxResult.success("resp", resp);
  }

  /*
   * 任务耗时分布统计
   * @anthor:ylr
   */
  @RequestMapping("/tasktimecount.json")
  @ResponseBody
  public AjaxResult taskTimeCount(HttpServletRequest req) throws Exception {
    List<DtProcessLogDto> taskTimeList = dtProcessLogService.doGetTaskTimeList();
    return AjaxResult.success("taskTimeList", taskTimeList);
  }

  /*
   * 当前处理任务
   * @anthor:ylr
   */
  @RequestMapping("/currentprocesstask.json")
  @ResponseBody
  public AjaxResult currentProcessTask(HttpServletRequest req) throws Exception {
    DtRwjdxx dtRwjdxx = dtRwjdxxService.doGetCurrentProcessTask();
    List<DtProcessLogDto> dtProcessLogDtoList = dtProcessLogService.doGetCurrentTaskList();

    JSONObject resp = new JSONObject();
    resp.put("dtRwjdxx", dtRwjdxx);
    resp.put("dtProcessLogDtoList", dtProcessLogDtoList);
    resp.put("currentProSum", 74);
    resp.put("line", dtProcessLogService.doGetCurrentTaskLine());

    return AjaxResult.success("resp", resp);
  }
}