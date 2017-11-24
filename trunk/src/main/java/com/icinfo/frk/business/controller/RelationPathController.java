package com.icinfo.frk.business.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.dto.RelationLinkDto;
import com.icinfo.frk.business.dto.RelationNodeDto;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.service.ICaDjJbxxService;
import com.icinfo.frk.common.utils.HttpUtil;
import com.icinfo.frk.support.util.CardUtil;

import net.sf.json.JSONObject;


/**
 * 描述: 关系路径  对应的Controller类.<br>
 * 
 * @author hsh
 * @date 2017年11月03日
 */
@Controller
@RequestMapping("/frk/relationPath")
public class RelationPathController extends BaseController {
	
	@Autowired
	private ICaDjJbxxService caDjJbxxService;

	@Value("${relation.path.url}")
	private String RELATION_PATH_URL;
	
	/**
	 * 初始化页面
	 * 
	 * @return
	 */
	@RequestMapping("/initRelationPath")
	public ModelAndView initRelationPath() {
		ModelAndView mv = new ModelAndView("business/dataquery/relationPathQuery");
		return mv;
	}
	
	// 获取所需数据返回到页面
	@RequestMapping("/getJsonData")
	@ResponseBody
	public AjaxResult getJsonData(PageRequest pageRequest) {
		try {
			
			Map<String, Object> searchMap = pageRequest.getParams();
			Set<String> setKey = searchMap.keySet();
			for (String string : setKey) {
				Object v = searchMap.get(string);
				if(v == null || "".equals(v)) {
					return AjaxResult.error("查询条件不能有空值！");
				}
			}
			
			Set<Entry<String, Object>> setResEntry = searchMap.entrySet(); 
			Iterator<Entry<String, Object>> iter = setResEntry.iterator();
      Map<String, Object> paramap = new HashMap<>();
			String frwybs = "";
			while (iter.hasNext()) {
				Entry<String, Object> stringEntry = iter.next();
				String val = (String) stringEntry.getValue();
				if(val==null || val.isEmpty()) {
					continue;
				}
				CharSequence hh = val.subSequence(0, 1);
				if("0123456789".contains(hh)){
					boolean flagV = CardUtil.isCardNo(val);
					if(flagV) {
						frwybs += val+",";
						continue;
					}else {
						return AjaxResult.error("身份证号有误，请重输！");
					}					
				}
        paramap.put("frmc", val);
        List<CaDjJbxx> list = caDjJbxxService.getCurrentCorporateInfo(paramap);
        CaDjJbxx resObject = null;
        if (list.size() > 0) {
          resObject = list.get(0);
					frwybs = frwybs + resObject.getFrwybs()+",";
        }

			}
			
			if(frwybs!="") {
				frwybs = frwybs.substring(0, frwybs.length()-1);
			}
			
			Map<String, String> params = new HashMap<>();
//			String frwybs = "1,2,3";
			params.put("start", frwybs);

			String str = HttpUtil.sendPOSTRequest(RELATION_PATH_URL, params);
			System.out.println(str);

			JSONObject jsonObject = null;
			if(!str.isEmpty()) {
				jsonObject = JSONObject.fromObject(str);
				jsonObject.put("nodes", JSON.parseArray(jsonObject.get("nodes")+"", RelationNodeDto.class));
				jsonObject.put("links", JSON.parseArray(jsonObject.get("links")+"", RelationLinkDto.class));
				return AjaxResult.success("获取成功！", jsonObject);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return AjaxResult.error("未查询到数据，请检查输入是否有误！");
	}

	

}
