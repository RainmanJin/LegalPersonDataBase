package com.icinfo.frk.business.service;

import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.GlvStatDto;
import com.icinfo.frk.business.model.GlvStat;

/**
 * 数据治理
 * @author hujianping
 *
 */
public interface DataGovernService {
	
	    /**
	     * 数据已入库统计
	     * @param request
	     * @return
	     * @throws Exception
	     */
		PageResponse<GlvStat> getMltj(PageRequest request) throws Exception;
		/**
		 * 数据目录统计
		 * @param request
		 * @return
		 */
		PageResponse<GlvStat> getStatisticsDetail(PageRequest request);
		
		/**
		 * 获取关联分析数据
		 */
		PageResponse<GlvStatDto> getRelationAnalysis(PageRequest request);
}
