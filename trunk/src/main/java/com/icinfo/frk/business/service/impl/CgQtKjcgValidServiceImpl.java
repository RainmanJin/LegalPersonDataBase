/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CgQtKjcgValidMapper;
import com.icinfo.frk.business.model.CgQtKjcgValid;
import com.icinfo.frk.business.service.ICgQtKjcgValidService;
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
public class CgQtKjcgValidServiceImpl extends MyBatisServiceSupport implements
		ICgQtKjcgValidService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CfSsSwdjxxValidServiceImpl.class);

	@Autowired
	private CgQtKjcgValidMapper CgQtKjcgValidMapperimpl;

	/**
	 * 获取
	 *
	 * @param frwybs
	 *            法人唯一标识
	 */
	@Override
	public PageResponse<CgQtKjcgValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgQtKjcgValid> kgcgDetail = CgQtKjcgValidMapperimpl
				.getList(params);
		return new PageResponse<CgQtKjcgValid>(kgcgDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 科技成果
	 */
	@Override
	public PageResponse<CgQtKjcgValid> getKgcgDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgQtKjcgValid> kgcgDetail = CgQtKjcgValidMapperimpl
				.selectKgcgDetail(params);
		if (kgcgDetail.size() > 0) {
			for (CgQtKjcgValid kgcg : kgcgDetail) {
				if (null != kgcg) {
					String corpid = kgcg.getFrwybs();
					if (null != corpid && !"".equals(corpid)) {
						String frwybs = AESEUtil.encodeCorpid(corpid);
						kgcg.setFrwybs(frwybs);
					}
				}
			}
		}
		return new PageResponse<CgQtKjcgValid>(kgcgDetail);
	}

}
