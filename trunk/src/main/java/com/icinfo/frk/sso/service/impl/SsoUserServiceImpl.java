/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.sso.service.impl;

import com.ctc.wstx.util.StringUtil;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.mapper.entity.Example;
import com.icinfo.frk.sso.mapper.SsoUserMapper;
import com.icinfo.frk.sso.model.SsoUser;
import com.icinfo.frk.sso.service.ISsoUserService;
import com.icinfo.frk.support.util.UUIDUtil;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: sso_user 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年11月01日
 */
@Service
public class SsoUserServiceImpl extends MyBatisServiceSupport implements ISsoUserService {

	@Autowired
	private SsoUserMapper ssoUserMapper;

	/**
	 * 描述: 保存用户信息
	 * 
	 * @author zhuyong
	 * @return
	 * @throws Exception
	 */
	@Override
	public void save(SsoUser ssoUser) throws Exception {
		if(ssoUser != null && StringUtils.isBlank(ssoUser.getId())){
			ssoUser.setId(UUIDUtil.getUuid());
		}
		ssoUserMapper.insert(ssoUser);
	}

	/**
	 * 描述: 修改用户信息
	 * 
	 * @author zhuyong
	 * @return
	 * @throws Exception
	 */
	@Override
	public void update(SsoUser ssoUser) throws Exception {
	}

	/**
     * 描述: 删除
     * 
     * @author zhuyong
     * @return
     * @throws Exception
     */
    public void deleteByLoginName(String loginName) throws Exception{
    	if(StringUtils.isNotBlank(loginName)){
    		Example example = new Example(SsoUser.class);
    		example.createCriteria().andEqualTo("loginname",loginName);
    		ssoUserMapper.deleteByExample(example);
    	}
    }
}