/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.sso.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.sso.model.SsoUser;

/**
 * 描述:  sso_user 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年11月01日
 */
public interface ISsoUserService extends BaseService {

    /**
     * 描述: 保存用户信息
     * 
     * @author zhuyong
     * @return
     * @throws Exception
     */
    public void save(SsoUser ssoUser) throws Exception;
    /**
     * 描述: 保存用户信息
     * 
     * @author zhuyong
     * @return
     * @throws Exception
     */
    public void update(SsoUser ssoUser) throws Exception;
    
    /**
     * 描述: 删除
     * 
     * @author zhuyong
     * @return
     * @throws Exception
     */
    public void deleteByLoginName(String loginName) throws Exception;


}