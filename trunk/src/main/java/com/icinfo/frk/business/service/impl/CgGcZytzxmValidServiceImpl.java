/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgGcZytzxmValidDto;
import com.icinfo.frk.business.mapper.CgGcZytzxmValidMapper;
import com.icinfo.frk.business.model.CgGcZytzxmValid;
import com.icinfo.frk.business.service.ICgGcZytzxmValidService;
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
public class CgGcZytzxmValidServiceImpl extends MyBatisServiceSupport implements
		ICgGcZytzxmValidService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CfSsSwdjxxValidServiceImpl.class);

	@Autowired
	private CgGcZytzxmValidMapper CgGcZytzxmValidMapperimpl;

	/**
	 * 获取
	 *
	 * @param frwybs
	 *            法人唯一标识
	 */
	@Override
	public PageResponse<CgGcZytzxmValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcZytzxmValid> zytzDetail = CgGcZytzxmValidMapperimpl
				.getList(params);
		return new PageResponse<CgGcZytzxmValid>(zytzDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 中央投资项目信息
	 */
	@Override
	public PageResponse<CgGcZytzxmValidDto> getZytzDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcZytzxmValidDto> zytzDetail = CgGcZytzxmValidMapperimpl
				.selectZytzDetail(params);
		if (zytzDetail.size() > 0) {
			for (CgGcZytzxmValid zytz : zytzDetail) {
				if (null != zytz) {
					String corpid = zytz.getFrwybs();
					if (null != corpid && !"".equals(corpid)) {
						String frwybs = AESEUtil.encodeCorpid(corpid);
						zytz.setFrwybs(frwybs);
					}
				}
			}
		}
		return new PageResponse<CgGcZytzxmValidDto>(zytzDetail);
	}

}
