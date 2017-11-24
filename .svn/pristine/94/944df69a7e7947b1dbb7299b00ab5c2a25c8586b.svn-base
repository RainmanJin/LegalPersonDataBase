package com.icinfo.frk.sso.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.frk.sso.dto.SsoResult;
import com.icinfo.frk.sso.model.SsoUser;
import com.icinfo.frk.sso.service.ISsoUserService;
import com.icinfo.frk.system.model.SysUser;
import com.icinfo.frk.system.service.ISysUserService;

/**
 * 统一用户 用户相关接口
 * 
 * @author zhuyong
 */
@Controller
@RequestMapping("/ssoUser")
public class SsoUserController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(SsoUserController.class);
	
	@Autowired
	ISsoUserService ssoUserService;
	@Autowired
	ISysUserService sysUserService;
	
	private static final String ROLE_ID = "be2578481c0c11e6af1500188b839ae9";
	
	

	/**
	 * http://115.238.48.66:7082/ssoUser/pushUser
	 * 测试地址
	 */

	/**
	 * 用户信息推送接口
	 * 
	 * @author zhuyong
	 * @param request
	 * @throws Exception
	 */
	@RequestMapping(value = "/pushUser", method = RequestMethod.POST)
	@ResponseBody
	public SsoResult pushUser(HttpServletRequest request) {
		try {
			logger.info("===========================start===============================");
			
			/**1  参数获取**/
			String syncType = request.getParameter("method");// 同步类型
			String userJson = new String((request.getParameter("args")).getBytes("ISO-8859-1"), "UTF-8");//获取用户json串
			String dataType = request.getParameter("datatype");// 接口数据类型
			
			/**2 接口参数校验 **/
			if(!checkReqParam(syncType, userJson, dataType)){
				return new SsoResult("1009");//参数非法
			}
			
			/**3 保存推送数据 **/
			if(!optUserData(syncType, userJson)){
				return new SsoResult("1099");//其他错误
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			return new SsoResult("1099");//其他错误
		}
		logger.info("===========================end===============================");
		return new SsoResult("0");//程序正常
	}
	
	
	/**
	 * 接口参数校验
	 * 
	 * @author zhuyong 
	 * @param syncType
	 * @param userJson
	 * @param dataType
	 * @return
	 * @throws Exception
	 */
	private boolean checkReqParam(String syncType,String userJson,String dataType){
		if(StringUtils.isBlank(syncType) || StringUtils.isBlank(userJson) || StringUtils.isBlank(dataType)){
			return false;
		}
		if(!"json".equalsIgnoreCase(dataType)){
			return false;
		}
		return true;
	}

	/**
	 * 操作用户数据方法
	 * 
	 * @author zhuyong
	 * @param syncType
	 * @param userJson
	 * @return
	 */
	private boolean optUserData(String syncType,String userJson) {
		try {
//			userJson = "{\"officefax\":\"\",\"birthday\":\"\",\"sex\":\"1\",\"telephone2\":\"\",\"idphoto\":\"\",\"memo\":\"isSyncToWas=false;modifyPwd=false;mkmodifyPwd=true;orgcoding_bak=001003067;InterfaceIP=59.202.28.75;InterfacePort=51992;InterfaceIP=59.202.28.75;InterfacePort=41847\",\"idtype\":\"1\",\"userid\":\"ff8080812c499597012c49e228010048\",\"cakey\":\"\",\"officialtype\":\"\",\"usertitle\":\"\",\"city\":\"杭州\",\"loginname\":\"hzyh2\",\"extendorderby\":\"\",\"username\":\"技术支持\",\"useable\":\"1\",\"loginpwd\":\"******\",\"province\":\"浙江\",\"official\":\"1\",\"homephone\":\"\",\"encryptiontype\":\"3\",\"authlevel\":\"\",\"orgcoding\":\"001003067\",\"mobile2\":\"\",\"extendorgcoding\":\"\",\"usertype\":\"3\",\"officeid\":\"\",\"postcode\":\"\",\"homeaddress\":\"\",\"country\":\"中国\",\"officenum\":\"\",\"officeaddress\":\"\",\"headpicture\":\"\",\"idnum\":\"\",\"email\":\"756129428@qq.com\",\"userposition\":\"\",\"orderby\":\"26808\",\"telephone\":\"\",\"virtualnum\":\"\",\"mobile\":\"13588843630\"}";
			SsoUser ssoUser = JSON.parseObject(userJson,SsoUser.class);
			if("synchronizeUser".equalsIgnoreCase(syncType)){//保存用户
				saveOrEditUserInfo(ssoUser);
			}
			if("deleteUser".equalsIgnoreCase(syncType)){//删除用户
				deleteUserInfo(ssoUser.getLoginname());
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	

	/**
	 * 保存 或者 新增用户
	 *	
	 * @author zhuyong 
	 * @param ssoUser
	 * @throws Exception
	 */
	private void saveOrEditUserInfo(SsoUser ssoUser) throws Exception {
		if(ssoUser == null || StringUtils.isBlank(ssoUser.getLoginname())){
			return ;
		}
		SysUser sysUser = sysUserService.selectByUserName(ssoUser.getLoginname());
		if(sysUser != null && StringUtils.isNotBlank(sysUser.getId())){
			return ;
		}
		ssoUserService.save(ssoUser);
		sysUserService.insert(convSsoUserToSysUser(ssoUser), new String[]{ROLE_ID});
	}

	/**
	 * 删除用户
	 *	
	 * @author zhuyong 
	 * @param ssoUser
	 * @throws Exception
	 */
	private void deleteUserInfo(String loginName) throws Exception {
		ssoUserService.deleteByLoginName(loginName);
		sysUserService.deleteByUserName(loginName);
	}
	
	/**
	 * 统一用户装换成系统用户
	 * 
	 * @author zhuyong
	 * @param ssoUser
	 * @return
	 * @throws Exception
	 */
	private SysUser convSsoUserToSysUser(SsoUser ssoUser) throws Exception{
		SysUser sysUser = new SysUser();
		sysUser.setUsername(ssoUser.getLoginname());
		sysUser.setRealName(ssoUser.getUsername());
		sysUser.setPassword("123qwe");
		sysUser.setCreateTime(new Date());
		return sysUser;
	}

}
