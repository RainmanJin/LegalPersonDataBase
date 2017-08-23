/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CgZzYsxxValidMapper;
import com.icinfo.frk.business.model.CgZzYsxxValid;
import com.icinfo.frk.business.service.ICgZzYsxxValidService;
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
public class CgZzYsxxValidServiceImpl extends MyBatisServiceSupport implements
		ICgZzYsxxValidService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CfSsSwdjxxValidServiceImpl.class);

	@Autowired
	private CgZzYsxxValidMapper CgZzYsxxValidMapperimpl;

	/**
	 * 获取
	 *
	 * @param frwybs
	 *            法人唯一标识
	 */
	@Override
	public PageResponse<CgZzYsxxValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgZzYsxxValid> yshDetail = CgZzYsxxValidMapperimpl.getList(params);
		return new PageResponse<CgZzYsxxValid>(yshDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 获取印刷详情
	 */
	@Override
	public PageResponse<CgZzYsxxValid> getYshDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgZzYsxxValid> yshDetail = CgZzYsxxValidMapperimpl
				.selectYshDetail(params);
		if (yshDetail.size() > 0) {
			for (CgZzYsxxValid ysxx : yshDetail) {
				if (null != ysxx) {
					String corpid = ysxx.getFrwybsWt();
					if (null != corpid && !"".equals(corpid)) {
						String frwybs = AESEUtil.encodeCorpid(corpid);
						ysxx.setFrwybsWt(frwybs);
					}
				}
			}
		}
		return new PageResponse<CgZzYsxxValid>(yshDetail);
	}

}
