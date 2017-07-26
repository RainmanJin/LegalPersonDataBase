package com.icinfo.frk.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinfo.frk.business.entity.TreeDetail;
import com.icinfo.frk.business.mapper.CaCodeIndustryMapper;
import com.icinfo.frk.business.mapper.CaCodeIndustrytypeMapper;
import com.icinfo.frk.business.model.CaCodeIndustry;
import com.icinfo.frk.business.model.CaCodeIndustrytype;
import com.icinfo.frk.business.service.ICaCodeIndustryService;

/**
 * 描述: frk.ca_code_industry 对应的Service接口.<br>
 * 
 * @author hujianping
 *
 */
@Service
public class CaCodeIndustryServiceImpl implements ICaCodeIndustryService {

	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(CaDjJbxxServiceImpl.class);
	@Autowired
	private CaCodeIndustrytypeMapper codeIndustrytypeVaildMapper;
	@Autowired
	private CaCodeIndustryMapper codeIndustryVaildMapper;

	/**
	 * 获取全部行业
	 * 
	 * @return
	 */
	@Override
	public List<TreeDetail> getIndustrys() {
		List<CaCodeIndustrytype> industryTypes = codeIndustrytypeVaildMapper
				.getIndustryTypes();
		ArrayList<TreeDetail> list = new ArrayList<TreeDetail>();

		if (null != industryTypes && industryTypes.size() > 0) {
			for (CaCodeIndustrytype industryType : industryTypes) {
				String content = industryType.getContent();
				String code = industryType.getCode();
				TreeDetail tree1 = new TreeDetail();
				tree1.setId(code);
				tree1.setpId("0x0");
				tree1.setName(content);
				list.add(tree1);
			}
		}
		List<CaCodeIndustry> industrys = codeIndustryVaildMapper.getIndustrys();
		if (null != industrys && industrys.size() > 0) {
			for (CaCodeIndustry industry : industrys) {
				String hyContent = industry.getHyContent();
				String hySupcode = industry.getHySupcode();
				String hzCode = industry.getHzCode();
				TreeDetail tree2 = new TreeDetail();
				tree2.setName(hyContent);
				tree2.setId(hzCode);
				tree2.setpId(hySupcode);
				list.add(tree2);
			}
		}
		return list;
	}

}
