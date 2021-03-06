package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;

/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:45
 **/


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.ch_bl_jdjcbhgjl_valid")
public class ChBlJdjcbhgjlValid implements java.io.Serializable {

  private static final long serialVersionUID = 5454155825314635342L;

  //columns START
  //
  private java.lang.String id;
  //
  private java.lang.String frwybs;
  //
  private java.lang.String hashUnique;
  //
  private java.lang.String qywybs;
  //
  private java.lang.String cpscdwwybs;
  //
  private java.lang.String bccspmc;
  //
  private java.lang.String bccspggxh;
  //
  private java.lang.String bccspscph;
  //
  private java.lang.String ccspfl;
  //
  private java.lang.String bhgypjply;
  //
  private java.lang.String bccypmc;
  //
  private java.lang.String bccypph;
  //
  private java.lang.String bccypgg;
  //
  private java.lang.String ypjyyj;
  //
  private java.lang.String ypjyjg;
  //
  private java.lang.String jdjcbhgxm;
  //
  private java.lang.String ccbhgcpmc;
  //
  private java.lang.String ccbhgcpfl;
  //
  private java.lang.String jyjl;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date ccrq;
  //
  private java.lang.String yxzz;
  //
  private java.lang.String jcrwxddw;
  //
  private java.lang.String bhgchxmmc;
  //
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date bhgjljybgrq;
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

  public java.lang.String getFrwybs() {
    return this.frwybs;
  }

  public void setFrwybs(java.lang.String value) {
    this.frwybs = value;
  }

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

  public java.lang.String getQywybs() {
    return this.qywybs;
  }

  public void setQywybs(java.lang.String value) {
    this.qywybs = value;
  }

  public java.lang.String getCpscdwwybs() {
    return this.cpscdwwybs;
  }

  public void setCpscdwwybs(java.lang.String value) {
    this.cpscdwwybs = value;
  }

  public java.lang.String getBccspmc() {
    return this.bccspmc;
  }

  public void setBccspmc(java.lang.String value) {
    this.bccspmc = value;
  }

  public java.lang.String getBccspggxh() {
    return this.bccspggxh;
  }

  public void setBccspggxh(java.lang.String value) {
    this.bccspggxh = value;
  }

  public java.lang.String getBccspscph() {
    return this.bccspscph;
  }

  public void setBccspscph(java.lang.String value) {
    this.bccspscph = value;
  }

  public java.lang.String getCcspfl() {
    return this.ccspfl;
  }

  public void setCcspfl(java.lang.String value) {
    this.ccspfl = value;
  }

  public java.lang.String getBhgypjply() {
    return this.bhgypjply;
  }

  public void setBhgypjply(java.lang.String value) {
    this.bhgypjply = value;
  }

  public java.lang.String getBccypmc() {
    return this.bccypmc;
  }

  public void setBccypmc(java.lang.String value) {
    this.bccypmc = value;
  }

  public java.lang.String getBccypph() {
    return this.bccypph;
  }

  public void setBccypph(java.lang.String value) {
    this.bccypph = value;
  }

  public java.lang.String getBccypgg() {
    return this.bccypgg;
  }

  public void setBccypgg(java.lang.String value) {
    this.bccypgg = value;
  }

  public java.lang.String getYpjyyj() {
    return this.ypjyyj;
  }

  public void setYpjyyj(java.lang.String value) {
    this.ypjyyj = value;
  }

  public java.lang.String getYpjyjg() {
    return this.ypjyjg;
  }

  public void setYpjyjg(java.lang.String value) {
    this.ypjyjg = value;
  }

  public java.lang.String getJdjcbhgxm() {
    return this.jdjcbhgxm;
  }

  public void setJdjcbhgxm(java.lang.String value) {
    this.jdjcbhgxm = value;
  }

  public java.lang.String getCcbhgcpmc() {
    return this.ccbhgcpmc;
  }

  public void setCcbhgcpmc(java.lang.String value) {
    this.ccbhgcpmc = value;
  }

  public java.lang.String getCcbhgcpfl() {
    return this.ccbhgcpfl;
  }

  public void setCcbhgcpfl(java.lang.String value) {
    this.ccbhgcpfl = value;
  }

  public java.lang.String getJyjl() {
    return this.jyjl;
  }

  public void setJyjl(java.lang.String value) {
    this.jyjl = value;
  }

  public java.util.Date getCcrq() {
    return this.ccrq;
  }

  public void setCcrq(java.util.Date value) {
    this.ccrq = value;
  }

  public java.lang.String getYxzz() {
    return this.yxzz;
  }

  public void setYxzz(java.lang.String value) {
    this.yxzz = value;
  }

  public java.lang.String getJcrwxddw() {
    return this.jcrwxddw;
  }

  public void setJcrwxddw(java.lang.String value) {
    this.jcrwxddw = value;
  }

  public java.lang.String getBhgchxmmc() {
    return this.bhgchxmmc;
  }

  public void setBhgchxmmc(java.lang.String value) {
    this.bhgchxmmc = value;
  }

  public java.util.Date getBhgjljybgrq() {
    return this.bhgjljybgrq;
  }

  public void setBhgjljybgrq(java.util.Date value) {
    this.bhgjljybgrq = value;
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

