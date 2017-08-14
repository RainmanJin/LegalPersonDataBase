package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:52
 **/


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.ch_sfaj_dwwlxxsxxx_valid")
public class ChSfajDwwlxxsxxxValid implements java.io.Serializable {

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
  private java.lang.String dwwybs;
  //
  private java.lang.String zxfy;
  //
  private java.lang.String ah;
  //
  private java.lang.String zxyj;
  //
  private java.lang.String zxay;
  //

  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
  private java.util.Date lxsj;
  //
  private Long zxje;
  //
  private java.lang.String zxxw;
  //
  private java.lang.String zxwp;
  //
  private Long wzxje;
  //
  private java.lang.String wzxxw;
  //
  private java.lang.String wzxwp;
  //
  private java.lang.String gtbzxr;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date bgrq;
  //
  private java.lang.String jbdh;
  //
  private java.lang.String jblxr;
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

  public java.lang.String getDwwybs() {
    return this.dwwybs;
  }

  public void setDwwybs(java.lang.String value) {
    this.dwwybs = value;
  }

  public java.lang.String getZxfy() {
    return this.zxfy;
  }

  public void setZxfy(java.lang.String value) {
    this.zxfy = value;
  }

  public java.lang.String getAh() {
    return this.ah;
  }

  public void setAh(java.lang.String value) {
    this.ah = value;
  }

  public java.lang.String getZxyj() {
    return this.zxyj;
  }

  public void setZxyj(java.lang.String value) {
    this.zxyj = value;
  }

  public java.lang.String getZxay() {
    return this.zxay;
  }

  public void setZxay(java.lang.String value) {
    this.zxay = value;
  }

  public java.util.Date getLxsj() {
    return this.lxsj;
  }

  public void setLxsj(java.util.Date value) {
    this.lxsj = value;
  }

  public Long getZxje() {
    return this.zxje;
  }

  public void setZxje(Long value) {
    this.zxje = value;
  }

  public java.lang.String getZxxw() {
    return this.zxxw;
  }

  public void setZxxw(java.lang.String value) {
    this.zxxw = value;
  }

  public java.lang.String getZxwp() {
    return this.zxwp;
  }

  public void setZxwp(java.lang.String value) {
    this.zxwp = value;
  }

  public Long getWzxje() {
    return this.wzxje;
  }

  public void setWzxje(Long value) {
    this.wzxje = value;
  }

  public java.lang.String getWzxxw() {
    return this.wzxxw;
  }

  public void setWzxxw(java.lang.String value) {
    this.wzxxw = value;
  }

  public java.lang.String getWzxwp() {
    return this.wzxwp;
  }

  public void setWzxwp(java.lang.String value) {
    this.wzxwp = value;
  }

  public java.lang.String getGtbzxr() {
    return this.gtbzxr;
  }

  public void setGtbzxr(java.lang.String value) {
    this.gtbzxr = value;
  }

  public java.util.Date getBgrq() {
    return this.bgrq;
  }

  public void setBgrq(java.util.Date value) {
    this.bgrq = value;
  }

  public java.lang.String getJbdh() {
    return this.jbdh;
  }

  public void setJbdh(java.lang.String value) {
    this.jbdh = value;
  }

  public java.lang.String getJblxr() {
    return this.jblxr;
  }

  public void setJblxr(java.lang.String value) {
    this.jblxr = value;
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

