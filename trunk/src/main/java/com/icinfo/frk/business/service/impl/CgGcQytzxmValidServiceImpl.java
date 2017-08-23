/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgGcQytzxmValidDto;
import com.icinfo.frk.business.mapper.CgGcQytzxmValidMapper;
import com.icinfo.frk.business.model.CgGcQytzxmValid;
import com.icinfo.frk.business.service.ICgGcQytzxmValidService;
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
public class CgGcQytzxmValidServiceImpl extends MyBatisServiceSupport implements
		ICgGcQytzxmValidService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CfSsSwdjxxValidServiceImpl.class);

	@Autowired
	private CgGcQytzxmValidMapper CgGcQytzxmValidMapperimpl;

	/**
	 * 获取
	 *
	 * @param frwybs
	 *            法人唯一标识
	 */
	@Override
	public PageResponse<CgGcQytzxmValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcQytzxmValid> qytzDetail = CgGcQytzxmValidMapperimpl
				.getList(params);
		return new PageResponse<CgGcQytzxmValid>(qytzDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageResponse<CgGcQytzxmValidDto> getQytzDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcQytzxmValidDto> qytzDetail = CgGcQytzxmValidMapperimpl
				.selectQytzDetail(params);
		if (qytzDetail.size() > 0) {
			for (CgGcQytzxmValid qytz : qytzDetail) {
				if (null != qytz) {
					String corpid = qytz.getFrwybs();
					if (null != corpid && !"".equals(corpid)) {
						String frwybs = AESEUtil.encodeCorpid(corpid);
						qytz.setFrwybs(frwybs);
					}
				}
			}
		}
		return new PageResponse<CgGcQytzxmValidDto>(qytzDetail);
	}

}
