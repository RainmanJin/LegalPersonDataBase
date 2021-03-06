package com.icinfo.frk.business.model;

import javax.persistence.Table;


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.cg_ky_ghgl_valid")
public class CgKyGhglValid implements java.io.Serializable {

  private static final long serialVersionUID = 5454155825314635342L;

  //columns START
  //
  private java.lang.String id;
  //
  private java.lang.String hashUnique;
  //
  private java.lang.String frwybs;
  //
  private java.lang.String ldkxxbgbxdw;
  //
  private java.lang.String lydcghsjzz;
  //
  private java.util.Date ldkxxbgbzrq;
  //
  private java.lang.String ldsykxxjl;
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

  public java.lang.String getLdkxxbgbxdw() {
    return this.ldkxxbgbxdw;
  }

  public void setLdkxxbgbxdw(java.lang.String value) {
    this.ldkxxbgbxdw = value;
  }

  public java.lang.String getLydcghsjzz() {
    return this.lydcghsjzz;
  }

  public void setLydcghsjzz(java.lang.String value) {
    this.lydcghsjzz = value;
  }

  public java.util.Date getLdkxxbgbzrq() {
    return this.ldkxxbgbzrq;
  }

  public void setLdkxxbgbzrq(java.util.Date value) {
    this.ldkxxbgbzrq = value;
  }

  public java.lang.String getLdsykxxjl() {
    return this.ldsykxxjl;
  }

  public void setLdsykxxjl(java.lang.String value) {
    this.ldsykxxjl = value;
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

