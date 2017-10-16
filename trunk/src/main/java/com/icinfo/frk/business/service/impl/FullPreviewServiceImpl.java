package com.icinfo.frk.business.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.dto.DtYwclNodesDto;
import com.icinfo.frk.business.dto.GlvStatDto;
import com.icinfo.frk.business.mapper.DtFrflTjMapper;
import com.icinfo.frk.business.mapper.DtYwclNodesMapper;
import com.icinfo.frk.business.mapper.FrCityMapper;
import com.icinfo.frk.business.mapper.FullPreviewMapper;
import com.icinfo.frk.business.model.FrCity;
import com.icinfo.frk.business.service.FullPreviewService;

/**
* @author hzboom-sw
* @date 2017年9月29日
* 类说明
*/
@Service
public class FullPreviewServiceImpl implements FullPreviewService {
	@Autowired
	private DtFrflTjMapper dtFrflTjMapper;
	@Autowired
	private FullPreviewMapper fullPreviewMapper;
	@Autowired
	 private FrCityMapper frCityMapper;
	@Autowired
	  private DtYwclNodesMapper dtYwclNodesMapper;
	@Override
	public DtFrflTjDto getLeagalPersonNum() {
		return dtFrflTjMapper.doGetLegalPersonSum();
	}
	@Override
	public DtFrflTjDto getLegalPersonAdd(String year) {
		return dtFrflTjMapper.doGetLegalPersonAdd(year);
	}
	@Override
	public DtFrflTjDto getLegalPersonSub(String year) {
		return dtFrflTjMapper.doGetLegalPersonSub(year);
	}
	@Override
	public GlvStatDto getDataNum() {
		return fullPreviewMapper.selectDataNum();
	}
	@Override
	public JSONObject getFrTypeCounting() {
		List<DtFrflTjDto> dtFrflTjDtoList = doGetAllTypeNameAndNum();
	    JSONObject object = new JSONObject();
	    JSONArray array1 = new JSONArray();
	    for (DtFrflTjDto dto : dtFrflTjDtoList) {
	      JSONObject obj1 = new JSONObject();
	      obj1.put("name", dto.getTypeName());
	      obj1.put("value", dto.getFrflSl());
	      array1.add(obj1);
	    }
	    object.put("pie", array1);
		return object;
	}
	/**
	 * 获取法人分类信息
	* @author hzboom-sw:
	* @datre 2017年9月29日
	* @return
	*
	 */
	 public List<DtFrflTjDto> doGetAllTypeNameAndNum() {
		  return dtFrflTjMapper.doGetAllTypeNameAndNum();
	 }
	@Override
	public List<DtFrflTjDto> getFrAttrNum() {
		return dtFrflTjMapper.doGetDimTotal();
	}
	@Override
	public List<FrCity> getCityDetail() {
		// TODO Auto-generated method stub
		return frCityMapper.getCityDetail();
	}
	@Override
	public JSONObject doGetAllLinksAndNodesJsonObject() {
		   JSONObject ret = new JSONObject();
		    List<DtYwclNodesDto> dtYwclNodesDtoList = doGetDtYwclNodesDtoList();
		    List<DtYwclNodesDto> NodesList = doGetAllNodesList();

		    //get links
		    JSONArray links = new JSONArray();
		    int size = dtYwclNodesDtoList.size();
		    for (int i = 0; i < size; i++) {
		      if (StringUtils.isBlank(dtYwclNodesDtoList.get(i).getLinkTargetName())) {
		        continue;
		      }
		      JSONObject objLink = new JSONObject();
		      objLink.put("source", doGetTargetNum(dtYwclNodesDtoList.get(i).getNodeName(), NodesList));
		      objLink
		          .put("target", doGetTargetNum(dtYwclNodesDtoList.get(i).getLinkTargetName(), NodesList));
		     // objLink.put("value", 50);
//						if("1".equals(dtYwclNodesDtoList.get(i).getNodeSrc()))
		      objLink.put("success", dtYwclNodesDtoList.get(i).getNodeSuccess());
		      links.add(objLink);
		    }
		    ret.put("links", links);

		    //get nodes
		    JSONArray nodes = new JSONArray();
		    for (DtYwclNodesDto node : NodesList) {
		      JSONObject objNode = new JSONObject();
		      //objNode.put("id", node.getId());
		      objNode.put("name", node.getNodeName());
		      nodes.add(objNode);
		    }
		    ret.put("nodes", nodes);

		    return ret;
	}
	private Object doGetTargetNum(String nodeName, List<DtYwclNodesDto> nodesList) {
		 String name = "";
		    int size = nodesList.size();
		    for (int i = 0; i < size; i++) {
		      if (nodeName.equals(nodesList.get(i).getNodeName())) {
		       name = nodeName;
		        break;
		      }
		    }
		    return name;
		  }
	
	private List<DtYwclNodesDto> doGetAllNodesList() {
		return dtYwclNodesMapper.getAllNodesList();
	}
	private List<DtYwclNodesDto> doGetDtYwclNodesDtoList() {
		// TODO Auto-generated method stub
		return dtYwclNodesMapper.getDtYwclNodesDtoList();
	}

}
