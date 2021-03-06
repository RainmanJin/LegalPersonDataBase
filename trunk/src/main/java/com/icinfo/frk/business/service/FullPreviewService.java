package com.icinfo.frk.business.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.dto.GlvStatDto;
import com.icinfo.frk.business.model.FrCity;

/**
* @author hzboom-sw
* @date 2017年9月29日
* 类说明
*/
public interface FullPreviewService {

	DtFrflTjDto getLeagalPersonNum();

	DtFrflTjDto getLegalPersonAdd(String year);

	DtFrflTjDto getLegalPersonSub(String year);

	GlvStatDto getDataNum();

	JSONObject getFrTypeCounting();

	List<DtFrflTjDto> getFrAttrNum();

	List<FrCity> getCityDetail();

	JSONObject doGetAllLinksAndNodesJsonObject();

	Long getRegistLeagalPersonNum();

	Long getWeekIncreaseNum(Map<String, String> map);

}
