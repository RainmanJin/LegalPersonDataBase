/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CgZzYlqxzzValidMapper;
import com.icinfo.frk.business.model.CgZzYlqxzzValid;
import com.icinfo.frk.business.service.ICgZzYlqxzzValidService;
import com.icinfo.frk.common.utils.AESEUtil;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CgZzYlqxzzValidServiceImpl extends MyBatisServiceSupport implements
		ICgZzYlqxzzValidService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CfSsSwdjxxValidServiceImpl.class);

	@Autowired
	private CgZzYlqxzzValidMapper CgZzYlqxzzValidMapperimpl;

	/**
	 * 获取医疗器械详情
	 */
	@Override
	public PageResponse<CgZzYlqxzzValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgZzYlqxzzValid> ylqxDetail = CgZzYlqxzzValidMapperimpl
				.getList(params);
		return new PageResponse<CgZzYlqxzzValid>(ylqxDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 获取医疗器械详情
	 */
	@Override
	public PageResponse<CgZzYlqxzzValid> getYlqxDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgZzYlqxzzValid> ylqxDetail = CgZzYlqxzzValidMapperimpl
				.selectYlqxDetail(params);
		if (ylqxDetail.size() > 0) {
			for (CgZzYlqxzzValid ylqx : ylqxDetail) {
				if (null != ylqx) {
					String corpid = ylqx.getFrwybsWt();
					if (null != corpid && !"".equals(corpid)) {
						String frwybs = AESEUtil.encodeCorpid(corpid);
						ylqx.setFrwybsWt(frwybs);
					}
				}
			}
		}
		return new PageResponse<CgZzYlqxzzValid>(ylqxDetail);
	}

}
