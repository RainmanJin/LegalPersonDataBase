/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.Page;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
//import com.icinfo.frk.api.dto.FrCheckDto;
import com.icinfo.frk.business.dto.CeXkzXzxkxxVaildDto;
import com.icinfo.frk.business.mapper.CaDjJbxxMapper;
import com.icinfo.frk.business.mapper.CeRyRyxxValidMapper;
import com.icinfo.frk.business.mapper.CeXkzBaxxValidMapper;
import com.icinfo.frk.business.mapper.CeXkzXzxkxxValidMapper;
import com.icinfo.frk.business.mapper.CeZzZzxxValidMapper;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.model.CeXkzXzxkxxValid;
import com.icinfo.frk.business.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Service
public class PageLoadingServiceImpl extends MyBatisServiceSupport implements IPageLoadingService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(PageLoadingServiceImpl.class);

    @Autowired
    private CaDjJbxxMapper caDjJbxxMapper;
    
    @Autowired
    private ICeXkzXzxkxxValidService ceXkzXzxkxxValidService;

    @Autowired
    private ICeXkzBaxxValidService ceXkzBaxxValidService;

    @Autowired
    private ICeRyRyxxValidService ceRyRyxxValidService;

    @Autowired
    private ICeZzZzxxValidService ceZzZzxxValidService;
    
    @Autowired
    private ICfGgzfWxdValidService cfGgzfWxdValidServicev;
    
    @Autowired
    private ICfGgzfZyxxValidService cfGgzfZyxxValidService;
    
    @Autowired
    private ICfSbCdhbxxValidService cfSbCdhbxxValidService;
    
    @Autowired
    private ICfSsNsjlValidService cfSsNsjlValidService;
    
    @Autowired
    private ICfSsSwdjxxValidService cfSsSwdjxxValidService;
    
    @Autowired
    private ICgGcChdlxmValidService cgGcChdlxmValidService;
    
    @Autowired
    private ICgGcGjzscqyjjhxmValidService cgGcGjzscqyjjhxmValidService;
    
    @Autowired
    private ICgGcJtjsxmValidService cgGcJtjsxmValidService;
    
    @Autowired
    private ICgGcQytzxmValidService cgGcQytzxmValidService;
    
    @Autowired
    private ICgGcShfzxmValidService cgGcShfzxmValidService;
    
    @Autowired
    private ICgGcZdcyxmValidService cgGcZdcyxmValidService;
    
    @Autowired
    private ICgGcZytzxmValidService cgGcZytzxmValidService;
    
    @Autowired
    private ICgQtCjxmValidService cgQtCjxmValidService;
    
    @Autowired
    private ICgQtKjcgValidService cgQtKjcgValidService;
    
    @Autowired
    private ICgQtSsxxValidService cgQtSsxxValidService;
    
    @Autowired
    private ICgWsshgzCsjzValidService cgWsshgzCsjzValidService;
    
    @Autowired
    private ICgZzHxypzzValidService cgZzHxypzzValidService;
    
    @Autowired
    private ICgZzYlqxzzValidService cgZzYlqxzzValidService;
    
    @Autowired
    private ICgZzYsxxValidService cgZzYsxxValidService;

 
    
    /**
     * 获取法人许可信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> getAdmissionInfo(String frwybs) throws Exception {
        Map<String, Object> map = new HashMap<>();
        // 1.获取主体登记信息
        CaDjJbxx caDjJbxx = new CaDjJbxx();
        caDjJbxx.setFrwybs(frwybs);
        map.put("ztdj", caDjJbxxMapper.selectOne(caDjJbxx));
        // 2.获取行政许可信息
        map.put("xzxkxx", ceXkzXzxkxxValidService.getList(frwybs));

        // 3.获取行政备案信息
        map.put("xxbaxx", ceXkzBaxxValidService.getList(frwybs));

        // 4.获取资质信息
        map.put("zzxx", ceZzZzxxValidService.getList(frwybs));

        // 5.获取荣誉信息
        map.put("ryxx", ceRyRyxxValidService.getList(frwybs));

        return map;
    }

    @Override
    public Map<String, Object> getCommentInfo(String frwybs) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getLawEnforceInfo(String frwybs) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getLawInfo(String frwybs) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getProduceInfo(String frwybs) throws Exception {
    	Map<String, Object> map = new HashMap<>();
    	// 1.获取主体登记信息
    	CaDjJbxx caDjJbxx = new CaDjJbxx();
        caDjJbxx.setFrwybs(frwybs);
        map.put("ztdj", caDjJbxxMapper.selectOne(caDjJbxx));
        // .获取化学药品原料药制造
        map.put("hxyp", cgZzHxypzzValidService.getList(frwybs));
        // .获取医疗器械制造
        map.put("ylqx", cgZzYlqxzzValidService.getList(frwybs));
        // .获取印刷委托书备案信息
        map.put("yswts", cgZzYsxxValidService.getList(frwybs));
        // .获取测绘与地理项目信息
        map.put("chydl", cgGcChdlxmValidService.getList(frwybs));
        // .获取国家知识产权软科学研究计划项目信息
        map.put("zscq", cgGcGjzscqyjjhxmValidService.getList(frwybs));
        // .获取国家重大科学仪器设备开发专项计划项目信息
        map.put("kxyqsb", cgGcGjzscqyjjhxmValidService.getList(frwybs));
        // .获取国家重点新产品计划项目信息(暂无表格)
      //TODO map.put("xcpjh", cggcgjzdx.getList(frwybs));
        // .获取交通建设项目信息
        map.put("jtjs", cgGcJtjsxmValidService.getList(frwybs));
        // .获取重大产业项目信息
        map.put("zdcyxm", cgGcZdcyxmValidService.getList(frwybs));
        // .获取企业投资项目信息
        map.put("qytzxm", cgGcQytzxmValidService.getList(frwybs));
        // .获取社会发展项目信息
        map.put("shfzxm", cgGcShfzxmValidService.getList(frwybs));
        // .获取中央投资项目信息
        map.put("zytzxm", cgGcZytzxmValidService.getList(frwybs));
        // .获取农业会展企业信息信息
        //TODO map.put("nyhzqy", .getList(frwybs));
        // .获取科技成果
        map.put("kjcg",cgQtKjcgValidService.getList(frwybs));
        // .获取水利、环境和公共设施管理 废物治理
        //TODO map.put("sl", .getList(frwybs));
        // .获取慈善捐赠
        map.put("csjz", cgWsshgzCsjzValidService.getList(frwybs));
        // .获取上市信息
        map.put("ssxx", cgQtSsxxValidService.getList(frwybs));
        // .获取承建项目
        map.put("cjxm", cgQtCjxmValidService.getList(frwybs));
        
        return map;
    }

    @Override
    public Map<String, Object> getTaxInfo(String frwybs) throws Exception {
    	Map<String, Object> map = new HashMap<>();
    	// 1.获取主体登记信息
    	CaDjJbxx caDjJbxx = new CaDjJbxx();
        caDjJbxx.setFrwybs(frwybs);
        map.put("ztdj", caDjJbxxMapper.selectOne(caDjJbxx));
        // 2.获取税务交费情况
        map.put("swjfqk", cfSsNsjlValidService.getList(frwybs));
        // 3.获取纳税非正常户认定情况
        map.put("fzchrdqk", cfSsSwdjxxValidService.getList(frwybs));
        // 4.获取社保公积金参保情况
        //map.put("sbgjj", .getList(frwybs));
        // 5.获取船东互保情况
        map.put("cdhbqk", cfSbCdhbxxValidService.getList(frwybs));
        // 6.获取用电缴费情况
        map.put("ydjfqk", cfGgzfZyxxValidService.getList(frwybs));
        // 7.获取无线电频率占用费缴费情况
        map.put("wxd", cfGgzfWxdValidServicev.getList(frwybs));
        return map;
    }


}