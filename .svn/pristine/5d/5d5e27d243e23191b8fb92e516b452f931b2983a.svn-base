package com.icinfo.frk.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinfo.frk.business.mapper.CaCodeFrflMapper;
import com.icinfo.frk.business.model.CaCodeFrfl;
import com.icinfo.frk.business.service.ICaCodeFrfService;

/**
 * 描述:  ca_code_frfl 对应的Service接口.<br>
 * @author hujianping
 *
 */
@Service
public class CaCodeFrflServiceImpl implements ICaCodeFrfService {
	/**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaDjJbxxServiceImpl.class);
    
    @Autowired
    private CaCodeFrflMapper caCodeFrflVaildMapper;
    
    /**
     * 获取法人类型
     * @return
     */
	@Override
	public List<CaCodeFrfl> getFrStyes() {
		List<CaCodeFrfl> frContent = caCodeFrflVaildMapper.getFrContent();
		ArrayList<CaCodeFrfl> list = new ArrayList<CaCodeFrfl>();
		if(frContent.size()>0){	
			return frContent;
		}
		return list;
	}

}
