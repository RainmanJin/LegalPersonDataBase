/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年05月10日
 * @version 2.0
 */
package com.icinfo.frk.search.mapper;
import java.util.List;
import java.util.Map;
import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.search.dto.AdmissionInfoDto;
import com.icinfo.frk.search.dto.AssetInfoDto;

/**
 * 描述:    dt_frfl_tj 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public interface AdmissionSearchMapper extends Mapper<AdmissionInfoDto> {
	List<AdmissionInfoDto> selectAllList(Map<String, Object> params);
}