package com.icinfo.frk.business.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.GlvStatDto;
import com.icinfo.frk.business.mapper.GlvStatMapper;
import com.icinfo.frk.business.model.GlvStat;
import com.icinfo.frk.business.service.DataGovernService;

/**
 * 数据治理
 * @author hzhb
 *
 */

@Service
public class DataGovernServiceImpl implements DataGovernService {

	@Autowired
    private GlvStatMapper glvStatMapper;
	
	@Override
	public PageResponse<GlvStat> getMltj(PageRequest request) throws Exception {
       PageHelper.startPage(request.getPageNum(), request.getLength());
		
		List<GlvStat> list = glvStatMapper.getMltj(request.getParams());
		return new PageResponse<GlvStat>(list);
	}
	
	@Override
	public PageResponse<GlvStat> getStatisticsDetail(PageRequest request) {
		// TODO Auto-generated method stub
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<GlvStat> list=glvStatMapper.getStatisticsDetail(request.getParams());
		return new PageResponse<GlvStat>(list);
	}
	
	@Override
	public PageResponse<GlvStatDto> getRelationAnalysis(PageRequest request) {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		String dataType = (java.lang.String) params.get("dataType");
		if(null !=  dataType && !"".equals(dataType) && "1".equals(dataType)){
			try {
				Calendar c = Calendar.getInstance();
				c.add(Calendar.WEEK_OF_YEAR, -1);
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				String startTime = sf.format(c.getTime());
				Date date = new Date();
				String endTime = sf.format(date);
				params.put("startTime", startTime);
				params.put("endTime", endTime);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(null !=  dataType && !"".equals(dataType) && "2".equals(dataType)){
			try {
				Calendar c = Calendar.getInstance();
				c.add(Calendar.MONTH, -1);
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				String startTime = sf.format(c.getTime());
				Date date = new Date();
				String endTime = sf.format(date);
				params.put("startTime", startTime);
				params.put("endTime", endTime);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		List<GlvStatDto> list= glvStatMapper.selectRelationAnalysis(params);
		return new PageResponse<GlvStatDto>(list);
	}

	
}
