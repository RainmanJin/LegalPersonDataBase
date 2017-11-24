package com.icinfo.frk.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.ChBlHmdxxValid;
import com.icinfo.frk.business.model.ChBlJyycmlValid;
import com.icinfo.frk.business.model.ChBlQdjlValid;
import com.icinfo.frk.business.service.IChBlHmdxxValidService;
import com.icinfo.frk.business.service.IChBlJyycmlValidService;
import com.icinfo.frk.business.service.IChBlQdjlValidService;

@Controller
@RequestMapping("/data/search/comment")
public class CommentSearchController extends BaseController {
	@Autowired
	private IChBlHmdxxValidService chBlHmdxxValidService;
	@Autowired
	private IChBlJyycmlValidService chBlJyycmlValidService;
	@Autowired
	private IChBlQdjlValidService chBlQdjlValidService;

	/**
	 * 进入评价查询页面
	 * @return
	 */
	@RequestMapping("/enCommentSearch")
	public ModelAndView enCommentSearch(){
		ModelAndView mv = new ModelAndView("search/CommentSearch/commentSearch");
		return mv;
	}
	
	

	/**
	 * 获取黑名单list
	 * @author liuguangju
	 * @date 2017年11月2日
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping({"doGetChBlHmdxxValidList.json"})
	@ResponseBody
	public PageResponse<ChBlHmdxxValid> getChBlHmdxxValidList(PageRequest request) throws Exception{
		List<ChBlHmdxxValid> data = chBlHmdxxValidService.findMsg(request);
		return new PageResponse<ChBlHmdxxValid>(data);
	}
	
	/**
	 * 获取异常经营名录list
	 * @author liuguangju
	 * @date 2017年11月2日
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping({"doGetChBlJyycmlValidList.json"})
	@ResponseBody
	public PageResponse<ChBlJyycmlValid> getChBlJyycmlValidList(PageRequest request) throws Exception{
		List<ChBlJyycmlValid> data = chBlJyycmlValidService.findMsg(request);
		return new PageResponse<ChBlJyycmlValid>(data);
	}
	
	/**
	 * 获取窃电信息list
	 * @author liuguangju
	 * @date 2017年11月2日
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping({"doGetChBlQdjlValidList.json"})
	@ResponseBody
	public PageResponse<ChBlQdjlValid> getChBlQdjlValidList(PageRequest request) throws Exception{
		List<ChBlQdjlValid> data = chBlQdjlValidService.findMsg(request);
		return new PageResponse<ChBlQdjlValid>(data);
	}
}
