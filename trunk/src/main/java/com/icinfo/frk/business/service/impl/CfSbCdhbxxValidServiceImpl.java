/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdGdBdcxxValidMapper;
import com.icinfo.frk.business.mapper.CeRyRyxxValidMapper;
import com.icinfo.frk.business.mapper.CeXkzXzxkxxValidMapper;
import com.icinfo.frk.business.model.CdGdBdcxxValid;
import com.icinfo.frk.business.model.CeRyRyxxValid;
import com.icinfo.frk.business.model.CeXkzXzxkxxValid;
import com.icinfo.frk.business.service.CeRyRyxxValidService;
import com.icinfo.frk.business.service.ICdGdBdcxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CeRyRyxxValidServiceImpl extends MyBatisServiceSupport implements CeRyRyxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CeRyRyxxValidServiceImpl.class);

    /**
     * 注入不动产信息Mapper
     */

    /**
     * 注入不动产信息Mapper
     */
    @Autowired
    private CeRyRyxxValidMapper ceRyRyxxValidMapper;

    /**
     * 获取不动产查封信息列表
     *
     * @param frwybs 法人唯一标识
     * @return 不动产查封信息列表
     * @throws Exception
     */
    @Override
    public List<CeRyRyxxValid> getList(String frwybs) throws Exception {
    	CeRyRyxxValid ceRyRyxxValid = new CeRyRyxxValid();
    	ceRyRyxxValid.setfrwybs(frwybs);
        return ceRyRyxxValidMapper.select(ceRyRyxxValid);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}