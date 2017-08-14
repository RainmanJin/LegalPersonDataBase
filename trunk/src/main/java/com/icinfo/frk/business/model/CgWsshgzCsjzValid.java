package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.cg_wsshgz_csjz_valid")
public class CgWsshgzCsjzValid implements java.io.Serializable {

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
  private java.lang.String dwmc;
  //
  private java.lang.String zzjgdm;
  //
  private java.lang.String jzxmmc;
  //
  private Long jzje;
  //
  private java.lang.String sldw;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date jzrq;
  //
  private java.lang.String bz;
  //
  private java.lang.String datasrdep;
  //
  private java.lang.String datasource;
  //
  private java.lang.String datakeycontent;
  //
  private java.lang.String createtime;
  //
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

  public java.lang.String getDwmc() {
    return this.dwmc;
  }

  public void setDwmc(java.lang.String value) {
    this.dwmc = value;
  }

  public java.lang.String getZzjgdm() {
    return this.zzjgdm;
  }

  public void setZzjgdm(java.lang.String value) {
    this.zzjgdm = value;
  }

  public java.lang.String getJzxmmc() {
    return this.jzxmmc;
  }

  public void setJzxmmc(java.lang.String value) {
    this.jzxmmc = value;
  }

  public Long getJzje() {
    return this.jzje;
  }

  public void setJzje(Long value) {
    this.jzje = value;
  }

  public java.lang.String getSldw() {
    return this.sldw;
  }

  public void setSldw(java.lang.String value) {
    this.sldw = value;
  }

  public java.util.Date getJzrq() {
    return this.jzrq;
  }

  public void setJzrq(java.util.Date value) {
    this.jzrq = value;
  }

  public java.lang.String getBz() {
    return this.bz;
  }

  public void setBz(java.lang.String value) {
    this.bz = value;
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

