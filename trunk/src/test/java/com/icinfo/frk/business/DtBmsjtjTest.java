package com.icinfo.frk.business;

import com.icinfo.framework.core.test.SpringTxTestCase;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.mapper.DtBmsjtjMapper;
import com.icinfo.frk.business.model.DtBmsjtj;
import com.icinfo.frk.business.service.IDtBmsjtjService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by FENG on 2017/7/12.
 * icinfo inc
 */
@SuppressWarnings("all")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/entry/dev/spring-entry.xml" })
public class DtBmsjtjTest extends SpringTxTestCase {
    @Autowired
    DtBmsjtjMapper dtBmsjtjMapper;
    @Autowired
    IDtBmsjtjService dtBmsjtjService;

    @Test
    public void test() throws Exception{
//        Map<String, Object> map = new HashMap<String,Object>();
//        map.put("keyword", "张玮兰");
        PageRequest request = new PageRequest();
        List<DtBmsjtj> dtBmsjtjList = dtBmsjtjService.doGetPageDtBmsjtj(request);
        System.out.println(dtBmsjtjList.size());
        for (DtBmsjtj dtbm:dtBmsjtjList){
            System.out.println("部门名称：："+dtbm.getBmmc());
        }
    }
}
