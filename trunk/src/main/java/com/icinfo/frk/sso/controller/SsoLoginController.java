package com.icinfo.frk.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.commnetsoft.proxy.SsoClient;
import com.commnetsoft.proxy.model.CallResult;
import com.commnetsoft.proxy.model.UserInfo;
import com.commnetsoft.proxy.util.ConfigHelper;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.security.shiro.LoginToken;
import com.icinfo.framework.security.shiro.UserProfile;
import com.icinfo.frk.support.Constants;
import com.icinfo.frk.support.LogTypeEnum;
import com.icinfo.frk.system.model.SysUser;
import com.icinfo.frk.system.service.ISysLogService;
import com.icinfo.frk.system.service.ISysUserService;

/**
 * 统一用户登录
 * 
 * @author zhuyong
 */
@Controller
@RequestMapping("/ssoLogin")
public class SsoLoginController extends BaseController {
	
	@Autowired
	ISysUserService sysUserService;
	
	@Autowired
	ISysLogService sysLogService;

	 /**
     * 单点登陆回调
     *
     * @param session
     * @param request
     * @return
     */
    @SuppressWarnings("static-access")
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public ModelAndView doLogin(HttpSession session, HttpServletResponse response, HttpServletRequest request) throws Exception {
    	//获取参数
    	String ticket = request.getParameter("ticket");//获取票据
//        String sp = request.getParameter("sp");//具体事项页面地址 如http://aa.com/item?id=3232
        SsoClient client = SsoClient.getInstance();//单点登录工具
        client.initConfig("frk","frkpwd","https://guser.zjzwfw.gov.cn/sso");
        //登录认证
        CallResult cr = client.login(request, ticket);
        //认证成功登录系统
        if("0".equals(cr.getResult())){
            UserInfo user = client.getUser(request);
            System.out.println("登陆成功！");
            SysUser sysUser = sysUserService.selectByUserName(user.getLoginname());
            LoginToken loginToken = new LoginToken(sysUser.getUsername(), "123qwe");
            Subject subject = SecurityUtils.getSubject();
            subject.login(loginToken);
            session.setAttribute(Constants.SESSION_SYS_USER_KEY, subject.getPrincipal());
            ModelAndView view = new ModelAndView("index");
            UserProfile userProfile = (UserProfile) session.getAttribute(Constants.SESSION_SYS_USER_KEY);
            if (userProfile != null) { //用户显示菜单
                view.addObject("menus", userProfile.getMenus());
                view.addObject("userProfile", userProfile);
            }
            session.setAttribute(Constants.SESSION_LOG_KEY, sysUser);
            sysLogService.save( LogTypeEnum.SSOLOGIN.toString(), "登陆成功  用户名："+sysUser.getUsername());
            return view;
        }else{//认证失败
            String url = ConfigHelper.getProperty("url");
            String servicecode = ConfigHelper.getProperty("servicecode");
            url = url+"usp.do?action=ssoLogin&servicecode="+servicecode;
            return null;
        }
    }
}
