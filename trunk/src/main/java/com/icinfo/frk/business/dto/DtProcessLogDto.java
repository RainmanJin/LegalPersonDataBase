/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.DtProcessLog;

/**
 * 描述: dt_process_log 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年05月08日
 */
public class DtProcessLogDto extends DtProcessLog {

	private static final long serialVersionUID = -8942676221907618290L;

	private String taskMonth;

	private double total;

	private double hsfl;

	private double successSum;

	private double falseSum;

	public String getTaskMonth() {
		return taskMonth;
	}

	public void setTaskMonth(String taskMonth) {
		this.taskMonth = taskMonth;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getHsfl() {
		return hsfl;
	}

	public void setHsfl(double hsfl) {
		this.hsfl = hsfl;
	}

	public double getSuccessSum() {
		return successSum;
	}

	public void setSuccessSum(double successSum) {
		this.successSum = successSum;
	}

	public double getFalseSum() {
		return falseSum;
	}

	public void setFalseSum(double falseSum) {
		this.falseSum = falseSum;
	}

}