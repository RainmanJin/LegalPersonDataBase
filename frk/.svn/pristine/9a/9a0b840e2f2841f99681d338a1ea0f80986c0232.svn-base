package com.icinfo.frk.business;

import com.icinfo.framework.core.test.SpringTxTestCase;
import com.icinfo.frk.business.model.Jbxx;
import com.icinfo.frk.business.service.IDtYwclNodesService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by FENG on 2017/6/16.
 */

@SuppressWarnings("all")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/entry/dev/spring-entry.xml" })
public class FrkJbxxTest extends SpringTxTestCase {
     @Autowired
    IDtYwclNodesService iDtYwclNodesService;

    @Test
    public void doSearchTest() throws Exception{

      List<Jbxx> jbxxList = iDtYwclNodesService.doGetJbxxList("汇信科技");
        for ( Jbxx jbxx:jbxxList) {
            System.out.println("ff::"+jbxx.getFrmc());
        }

    }


}
