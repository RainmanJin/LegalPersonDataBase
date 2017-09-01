package com.icinfo.frk.business.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 描述:  glv_stat对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 *
 * @author framework generator
 * @date 2017年07月11日
 */
@Table(name = "frk.glv_stat")
public class GlvStat implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//表名
	@Column(name = "tablename")
	private String tablename;
	
	//部门名称
	@Column(name = "datasrdep")
	private String datasrdep;
	
	//数据来源
	@Column(name = "datasource")
	private String datasource;
	
	//入库前数量
	@Column(name = "num_bef")
	private Long numBef;
	
	//统计日期
	@Column(name = "createtime")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date createtime;
	
	//入库后数量
	@Column(name = "num_aft")
	private Long numAft;
	
	//关联率
	@Column(name = "glv")
	private double glv;
	
	//入库方式
	@Column(name = "stroage_type")
	private String stroageType;

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getDatasrdep() {
		return datasrdep;
	}

	public void setDatasrdep(String datasrdep) {
		this.datasrdep = datasrdep;
	}

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

	public Long getNumBef() {
		return numBef;
	}

	public void setNumBef(Long numBef) {
		this.numBef = numBef;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Long getNumAft() {
		return numAft;
	}

	public void setNumAft(Long numAft) {
		this.numAft = numAft;
	}

	public double getGlv() {
		return glv;
	}

	public void setGlv(double glv) {
		this.glv = glv;
	}

	public String getStroageType() {
		return stroageType;
	}

	public void setStroageType(String stroageType) {
		this.stroageType = stroageType;
	}

	
}
