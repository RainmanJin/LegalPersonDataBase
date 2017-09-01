/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.reg.controller;

import com.icinfo.frk.business.service.ICaDjJbxxService;
import com.icinfo.frk.common.utils.AESEUtil;
import com.icinfo.frk.reg.model.CorpLink;
import com.icinfo.frk.reg.model.CorpNode;
import com.icinfo.frk.reg.service.IRelationNetAllService;
import com.icinfo.frk.support.Constants;
import com.icinfo.frk.support.LogTypeEnum;
import com.icinfo.frk.support.util.RequestUtil;
import com.icinfo.frk.system.model.SysUser;
import com.icinfo.frk.system.service.ISysLogService;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;

import net.sf.json.JSONArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 描述: frk_relation_net_all 对应的Controller类.<br>
 * Echarts3 获取数据
 * 
 * @author framework generator
 * @date 2017年07月12日
 */
@Controller
@RequestMapping("/data/relationnetall") // @RequestMapping({"/reg/server/rptyr/relationnetall"})
public class RelationNetAllController extends BaseController {
	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory.getLogger(RelationNetAllController.class);

	@Autowired
	private IRelationNetAllService relationNetAllService;
	@Autowired
	private ICaDjJbxxService caDjJbxxService;
	@Autowired
	private ISysLogService sysLogService;
	
	/**
	 * @描述： 关系图页面
	 * 
	 * @author: wangjin
	 * @date 2017-07-12 11:02
	 * @return
	 */
	@RequestMapping("/relationShow")
	public String relationShow(String priPID, Model model) throws UnsupportedEncodingException {
		priPID = AESEUtil.decodeCorpid(priPID);
		try {
			sysLogService.save(
					LogTypeEnum.SEARCH.toString(),
					"访问了法人库关系图查询详情页面  用户名："
							+ ((SysUser) RequestUtil.getSession().getAttribute(
									Constants.SESSION_LOG_KEY)).getUsername());
		} catch (Exception e) {
			return "redirect:/";
		}
		// MidBaseInfoDto midBaseInfoDto =
		// entSearchService.selectByPripid(priPID);
		// view.addObject("midBaseInfo", midBaseInfoDto);
		try {
			model.addAttribute("jbxx", caDjJbxxService.getFrJbxxbyDatakeycontent(priPID));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "reg/relation-view";
	}

	/**
	 * @描述： 获取数据
	 * 
	 * @author: wangjin
	 * @date 2017-07-12 15:58
	 * @return
	 */
	@RequestMapping(value = "/getJsonData", method = RequestMethod.POST)
	@ResponseBody
	public AjaxResult getJsonData(PageRequest request) throws Exception {

		Map<String, Object> paramMap = request.getParams();
        String corpid = paramMap.get("corpid").toString();
        if(corpid == null || corpid.trim().equals("")){
        	return AjaxResult.error("未查询到数据");
        }
		
		Map<String, Object> mapData = relationNetAllService.select_result(request);
		if (!mapData.isEmpty()) {
			List<CorpNode> nodeList = (List<CorpNode>) mapData.get("nodeList");
			List<CorpLink> linkList = (List<CorpLink>) mapData.get("linkList");

			List<Object> listData = new ArrayList<Object>();
			listData.add(JSONArray.fromObject(nodeList));
			listData.add(JSONArray.fromObject(linkList));
			return AjaxResult.success("获取结果集", listData);
		}
		return AjaxResult.error("未查询到数据");
	}

}