/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.business.service.ICaDjJbxxService;
import com.icinfo.frk.business.service.IPageLoadingService;

import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Controller
@RequestMapping("/data/frdetail")
public class PageLoadingController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(PageLoadingController.class);

    @Autowired
    private IPageLoadingService pageLoadingService;

     /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/admission/{frwybs}", method = RequestMethod.GET)
    public String entAdmission(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("xkxx", pageLoadingService.getAdmissionInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        System.out.println("okoka");
        return "business/dataquery/frAdmission";
    }
    
    /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/comment/{frwybs}", method = RequestMethod.GET)
    public String entComment(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("comment", pageLoadingService.getCommentInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        return "business/dataquery/frComment";
    }
    
    /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/lawenforce/{frwybs}", method = RequestMethod.GET)
    public String entLawEnforce(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("lawenforce", pageLoadingService.getLawEnforceInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        return "business/dataquery/frLawEnforce";
    }
    
    /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/lawinfo/{frwybs}", method = RequestMethod.GET)
    public String entLawInfo(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("lawinfo", pageLoadingService.getLawInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        return "business/dataquery/frLawInfo";
    }
    
    /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/produce/{frwybs}", method = RequestMethod.GET)
    public String entProduce(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("produce", pageLoadingService.getProduceInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        return "business/dataquery/frProduce";
    }
    
    /**
     * 进入页
     *
     * @param frwybs 法人唯一标识
     * @param model  model
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/tax/{frwybs}", method = RequestMethod.GET)
    public String entTax(@PathVariable(value = "frwybs") String frwybs, Model model) throws Exception {
        model.addAttribute("tax", pageLoadingService.getTaxInfo(frwybs));
        model.addAttribute("frwybs", frwybs);
        return "business/dataquery/frTax";
    }

}