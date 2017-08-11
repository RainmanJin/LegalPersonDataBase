package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.*;
import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-08-10 11:07:49
 **/



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.cf_ss_nsjl_ds_valid")
public class CfSsNsjlDsValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String nsrmc;
	//
	private java.lang.String shxydm;
	//
	private java.lang.String zzjgdm;
	//
	private java.lang.String nsrsbh;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date skssqs;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date skssqz;
	//
	private java.lang.String dszsxm;
	//
	private java.lang.String dsskzl;
	//
	private Long dssje;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date dsrkrq;
	//
	private java.lang.String datasrdep;
	//
	private java.lang.String datasource;
	//
	private java.lang.String datakeycontent;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date createtime;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date updatetime;
	//columns END

	private String frmc;

	/**
	 * @return frmc
	 */
	public String getFrmc() {
		return frmc;
	}

	/**
	 * @param frmc
	 */
	public void setFrmc(String frmc) {
		this.frmc = frmc;
	}



	public void setId(java.lang.String value) {
		this.id = value;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setHashUnique(java.lang.String value) {
		this.hashUnique = value;
	}

	public java.lang.String getHashUnique() {
		return this.hashUnique;
	}

	public void setFrwybs(java.lang.String value) {
		this.frwybs = value;
	}

	public java.lang.String getFrwybs() {
		return this.frwybs;
	}

	public void setNsrmc(java.lang.String value) {
		this.nsrmc = value;
	}

	public java.lang.String getNsrmc() {
		return this.nsrmc;
	}

	public void setShxydm(java.lang.String value) {
		this.shxydm = value;
	}

	public java.lang.String getShxydm() {
		return this.shxydm;
	}

	public void setZzjgdm(java.lang.String value) {
		this.zzjgdm = value;
	}

	public java.lang.String getZzjgdm() {
		return this.zzjgdm;
	}

	public void setNsrsbh(java.lang.String value) {
		this.nsrsbh = value;
	}

	public java.lang.String getNsrsbh() {
		return this.nsrsbh;
	}

	public void setSkssqs(java.util.Date value) {
		this.skssqs = value;
	}

	public java.util.Date getSkssqs() {
		return this.skssqs;
	}

	public void setSkssqz(java.util.Date value) {
		this.skssqz = value;
	}

	public java.util.Date getSkssqz() {
		return this.skssqz;
	}

	public void setDszsxm(java.lang.String value) {
		this.dszsxm = value;
	}

	public java.lang.String getDszsxm() {
		return this.dszsxm;
	}

	public void setDsskzl(java.lang.String value) {
		this.dsskzl = value;
	}

	public java.lang.String getDsskzl() {
		return this.dsskzl;
	}

	public void setDssje(Long value) {
		this.dssje = value;
	}

	public Long getDssje() {
		return this.dssje;
	}

	public void setDsrkrq(java.util.Date value) {
		this.dsrkrq = value;
	}

	public java.util.Date getDsrkrq() {
		return this.dsrkrq;
	}

	public void setDatasrdep(java.lang.String value) {
		this.datasrdep = value;
	}

	public java.lang.String getDatasrdep() {
		return this.datasrdep;
	}

	public void setDatasource(java.lang.String value) {
		this.datasource = value;
	}

	public java.lang.String getDatasource() {
		return this.datasource;
	}

	public void setDatakeycontent(java.lang.String value) {
		this.datakeycontent = value;
	}

	public java.lang.String getDatakeycontent() {
		return this.datakeycontent;
	}

	public void setCreatetime(java.util.Date value) {
		this.createtime = value;
	}

	public java.util.Date getCreatetime() {
		return this.createtime;
	}

	public void setUpdatetime(java.util.Date value) {
		this.updatetime = value;
	}

	public java.util.Date getUpdatetime() {
		return this.updatetime;
	}

}

