/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年05月09日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.dto.DtYwclNodesDto;
import com.icinfo.frk.business.model.DtYwclNodes;
import com.icinfo.frk.business.model.Jbxx;
import java.util.List;

/**
 * 描述:    dt_ywcl_nodes 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年05月09日
 */
public interface DtYwclNodesMapper extends Mapper<DtYwclNodes> {

  List<DtYwclNodesDto> doGetDtYwclNodesDtoList(String type);

  List<DtYwclNodesDto> doGetAllNodesList(String type);

  DtYwclNodesDto doGetPieChart(String id);

  List<Jbxx> selectCadjjbxx(String frmc);
}