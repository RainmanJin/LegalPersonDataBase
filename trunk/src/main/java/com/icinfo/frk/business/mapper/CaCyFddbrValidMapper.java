/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年06月30日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.dto.CaCyFddbrValidDto;
import com.icinfo.frk.business.model.CaCyFddbr;
import com.icinfo.frk.business.model.CaCyFddbrValid;
import java.util.List;
import java.util.Map;

/**
 * 描述: ca_cy_fddbr_valid 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
public interface CaCyFddbrValidMapper extends Mapper<CaCyFddbrValid> {

  /**
   * 获取法定代表人信息
   */
  List<CaCyFddbrValid> selectList(Map<String, Object> params);

  List<CaCyFddbrValid> GetList(String frwybs);

  int getPersonCount(CaCyFddbr caCyFddbr);

  //获取Frwybs总数
  int getFrwybsCount(String zjhm);

  // 查询基本信息
  List<CaCyFddbr> getPersonList(CaCyFddbr caCyFddbr);

  // 查询基本信息
  List<CaCyFddbrValid> getPerson(CaCyFddbrValidDto caCyFddbr);

  // 根据姓名获取证件号数量
  int getZjhmCount(String xm);


  List<CaCyFddbrValid> getCaCyFddbr(Map<String, Object> params);


  List<CaCyFddbrValid> getFddbrList(Map<String, Object> qryMap);

}