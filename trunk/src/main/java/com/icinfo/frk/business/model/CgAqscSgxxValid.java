package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.cg_aqsc_sgxx_valid")
public class CgAqscSgxxValid implements java.io.Serializable {

  private static final long serialVersionUID = 5454155825314635342L;

  //columns START
  //
  private java.lang.String id;
  //
  private java.lang.String hashUnique;
  //
  private java.lang.String frwybs;
  //
  private java.lang.String tyxydm;
  //
  private java.lang.String zzjgdm;
  //
  private java.lang.String dwmc;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date sgfssj;
  //
  private java.lang.String sgdd;
  //
  private java.lang.String sglx;
  //
  private java.lang.String sgyy;
  //
  private java.lang.Integer swrs;
  //
  private java.lang.Integer zsrs;
  //
  private Long ccss;
  //
  private java.lang.String sgjyqk;
  //
  private java.lang.String datasrdep;
  //
  private java.lang.String datasource;
  //
  private java.lang.String datakeycontent;
  //
  private java.lang.String createtime;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date updatetime;
  //columns END

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String value) {
    this.id = value;
  }

  public java.lang.String getHashUnique() {
    return this.hashUnique;
  }

  public void setHashUnique(java.lang.String value) {
    this.hashUnique = value;
  }

  public java.lang.String getFrwybs() {
    return this.frwybs;
  }

  public void setFrwybs(java.lang.String value) {
    this.frwybs = value;
  }

  public java.lang.String getTyxydm() {
    return this.tyxydm;
  }

  public void setTyxydm(java.lang.String value) {
    this.tyxydm = value;
  }

  public java.lang.String getZzjgdm() {
    return this.zzjgdm;
  }

  public void setZzjgdm(java.lang.String value) {
    this.zzjgdm = value;
  }

  public java.lang.String getDwmc() {
    return this.dwmc;
  }

  public void setDwmc(java.lang.String value) {
    this.dwmc = value;
  }

  public java.util.Date getSgfssj() {
    return this.sgfssj;
  }

  public void setSgfssj(java.util.Date value) {
    this.sgfssj = value;
  }

  public java.lang.String getSgdd() {
    return this.sgdd;
  }

  public void setSgdd(java.lang.String value) {
    this.sgdd = value;
  }

  public java.lang.String getSglx() {
    return this.sglx;
  }

  public void setSglx(java.lang.String value) {
    this.sglx = value;
  }

  public java.lang.String getSgyy() {
    return this.sgyy;
  }

  public void setSgyy(java.lang.String value) {
    this.sgyy = value;
  }

  public java.lang.Integer getSwrs() {
    return this.swrs;
  }

  public void setSwrs(java.lang.Integer value) {
    this.swrs = value;
  }

  public java.lang.Integer getZsrs() {
    return this.zsrs;
  }

  public void setZsrs(java.lang.Integer value) {
    this.zsrs = value;
  }

  public Long getCcss() {
    return this.ccss;
  }

  public void setCcss(Long value) {
    this.ccss = value;
  }

  public java.lang.String getSgjyqk() {
    return this.sgjyqk;
  }

  public void setSgjyqk(java.lang.String value) {
    this.sgjyqk = value;
  }

  public java.lang.String getDatasrdep() {
    return this.datasrdep;
  }

  public void setDatasrdep(java.lang.String value) {
    this.datasrdep = value;
  }

  public java.lang.String getDatasource() {
    return this.datasource;
  }

  public void setDatasource(java.lang.String value) {
    this.datasource = value;
  }

  public java.lang.String getDatakeycontent() {
    return this.datakeycontent;
  }

  public void setDatakeycontent(java.lang.String value) {
    this.datakeycontent = value;
  }

  public java.lang.String getCreatetime() {
    return this.createtime;
  }

  public void setCreatetime(java.lang.String value) {
    this.createtime = value;
  }

  public java.util.Date getUpdatetime() {
    return this.updatetime;
  }

  public void setUpdatetime(java.util.Date value) {
    this.updatetime = value;
  }

}

