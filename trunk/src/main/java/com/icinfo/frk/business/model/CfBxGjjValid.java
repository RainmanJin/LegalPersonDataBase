/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2017
 */

package com.icinfo.frk.business.model;

import java.util.*;

import org.hibernate.validator.constraints.Length;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class CfBxGjjValid implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;




	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	@Length(max=2147483647)
	private java.lang.String id;
	@Length(max=2147483647)
	private java.lang.String hashUnique;
	@Length(max=2147483647)
	private java.lang.String frwybs;
	@Length(max=2147483647)
	private java.lang.String tyxydm;
	@Length(max=2147483647)
	private java.lang.String dwmc;
	@Length(max=2147483647)
	private java.lang.String zzjgdm;
	@Length(max=2147483647)
	private java.lang.String dwzh;
	@Length(max=2147483647)
	private java.lang.String grzh;
	
	private Long grjcjs;
	@Length(max=2147483647)
	private java.lang.String jgh;
	@Length(max=2147483647)
	private java.lang.String xm;
	@Length(max=2147483647)
	private java.lang.String xb;
	@Length(max=2147483647)
	private java.lang.String zjlx;
	@Length(max=2147483647)
	private java.lang.String zjhm;
	@Length(max=2147483647)
	private java.lang.String datasrdep;
	@Length(max=2147483647)
	private java.lang.String datasource;
	@Length(max=2147483647)
	private java.lang.String datakeycontent;
	@Length(max=2147483647)
	private java.lang.String createtime;
	
	private java.util.Date updatetime;
	//columns END



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

	public void setTyxydm(java.lang.String value) {
		this.tyxydm = value;
	}

	public java.lang.String getTyxydm() {
		return this.tyxydm;
	}

	public void setDwmc(java.lang.String value) {
		this.dwmc = value;
	}

	public java.lang.String getDwmc() {
		return this.dwmc;
	}

	public void setZzjgdm(java.lang.String value) {
		this.zzjgdm = value;
	}

	public java.lang.String getZzjgdm() {
		return this.zzjgdm;
	}

	public void setDwzh(java.lang.String value) {
		this.dwzh = value;
	}

	public java.lang.String getDwzh() {
		return this.dwzh;
	}

	public void setGrzh(java.lang.String value) {
		this.grzh = value;
	}

	public java.lang.String getGrzh() {
		return this.grzh;
	}

	public void setGrjcjs(Long value) {
		this.grjcjs = value;
	}

	public Long getGrjcjs() {
		return this.grjcjs;
	}

	public void setJgh(java.lang.String value) {
		this.jgh = value;
	}

	public java.lang.String getJgh() {
		return this.jgh;
	}

	public void setXm(java.lang.String value) {
		this.xm = value;
	}

	public java.lang.String getXm() {
		return this.xm;
	}

	public void setXb(java.lang.String value) {
		this.xb = value;
	}

	public java.lang.String getXb() {
		return this.xb;
	}

	public void setZjlx(java.lang.String value) {
		this.zjlx = value;
	}

	public java.lang.String getZjlx() {
		return this.zjlx;
	}

	public void setZjhm(java.lang.String value) {
		this.zjhm = value;
	}

	public java.lang.String getZjhm() {
		return this.zjhm;
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

	public void setCreatetime(java.lang.String value) {
		this.createtime = value;
	}

	public java.lang.String getCreatetime() {
		return this.createtime;
	}

	public void setUpdatetime(java.util.Date value) {
		this.updatetime = value;
	}

	public java.util.Date getUpdatetime() {
		return this.updatetime;
	}


}

