package com.icinfo.frk.business;

import com.icinfo.framework.core.test.SpringTxTestCase;
import com.icinfo.frk.business.mapper.DtProcessLogMapper;
import com.icinfo.frk.business.model.DayLogCount;
import com.icinfo.frk.business.model.DtProcessLog;
import com.icinfo.frk.business.service.IDtProcessLogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by FENG on 2017/5/8.
 */
@SuppressWarnings("all")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/entry/dev/spring-entry.xml" })
public class DtProcessLogServiceTest extends SpringTxTestCase {

    @Autowired
    IDtProcessLogService dtProcessLogService;
    @Autowired
    DtProcessLogMapper dtProcessLogMapper;

    //@Test
    //@Rollback(false)
    public  void doGetDtProcessLogTest() throws Exception{
        DtProcessLog dtProcessLog = new DtProcessLog();
        dtProcessLog.setTaskName("test001");
        dtProcessLog.setTaskTime(new Date());
        dtProcessLog.setTaskFlow(new BigDecimal(20));
        dtProcessLog.setTaskFailTotal(25);
        dtProcessLog.setTaskStatus(1);
        dtProcessLog.setTaskReadTotal(500000);
        dtProcessLog.setTaskWriteTotal(400000);
        dtProcessLog.setTaskLong(400l);
        dtProcessLogMapper.insert(dtProcessLog);
    }

    @Test
    public  void  doGetDtProcessLogServiceTest() throws Exception{
        Map<String,Object> paraMap = new HashMap<String,Object>();
        List<DayLogCount>  dayLogList = dtProcessLogService.doGetDayTaskLogCountList(paraMap);
        System.out.print("大小::"+dayLogList.size());
        for (DayLogCount dayLogCount:dayLogList){
            System.out.println("日期：："+dayLogCount.getTaskTime());
        }
    }
}
