package com.icinfo.frk.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.DataImplVaildMapper;
import com.icinfo.frk.business.model.DataImplVaild;
import com.icinfo.frk.business.service.DataShareService;

@Service
public class DataShareServiceImpl implements DataShareService {
	
	@Autowired
	private DataImplVaildMapper dataImplVaildMapper;
	@Override
	public PageResponse<DataImplVaild> getBaseImpl(PageRequest request) {
		PageHelper.startPage(request.getPageNum(), request.getLength());
	    List<DataImplVaild> impls = dataImplVaildMapper.getAllImpl(request.getParams());
		return new PageResponse<DataImplVaild>(impls) ;
	}
}
