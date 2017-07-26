package com.icinfo.frk.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icinfo.framework.core.web.BaseController;

/**
 * 数据共享
 * @author hzhb
 *
 */
@Controller
@RequestMapping("/data/dataShare")
public class DataShareController extends BaseController {
	
	/**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(DataShareController.class);
    
    /**
     * 进入法人登记基本信息查询
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/frDjMsgQuery")
    public String frDjMsgQuery() throws Exception {
        return "business/dataquery/frDjMsgQuery";
    }
    
    
    
    /**
     * 进入成员单位信息查询
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/cyDeptMsgQuery")
    public String cyDeptMsgQuery() throws Exception {
        return "business/dataquery/cyDeptMsgQuery";
    }
    
    /**
     * 进入法人校验
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/frCheck")
    public String frCheck() throws Exception {
        return "business/dataquery/frCheck";
    }
}
