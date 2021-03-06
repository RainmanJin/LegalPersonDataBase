package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:53
 **/


/**
 * @author Guanzhou Song
 */
@Table(name = "frk.ch_sfaj_sxbzxr_valid")
public class ChSfajSxbzxrValid implements java.io.Serializable {

  private static final long serialVersionUID = 5454155825314635342L;

  //columns START
  //
  private java.lang.String id;
  //
  private java.lang.String frwybs;
  //
  private java.lang.String hashUnique;
  //
  private java.lang.String bzxrwybs;
  //
  private java.lang.String bzxrmc;
  //
  private java.lang.String sfzjhm;
  //
  private java.lang.String zxfy;
  //
  private java.lang.String zxyjwh;
  //
  @JsonFormat(pattern = "yyyy-MM-dd  ", timezone = "GMT+8")
  private java.util.Date lasj;
  //
  private java.lang.String ah;
  //
  private java.lang.String zczxyjdw;
  //
  private java.lang.String sxflwsqdsj;
  //
  private java.lang.String bzxrlxqk;
  //
  @JsonFormat(pattern = "yyyy-MM-dd  ", timezone = "GMT+8")
  private java.util.Date fbsj;
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

  public java.lang.String getBzxrwybs() {
    return this.bzxrwybs;
  }

  public void setBzxrwybs(java.lang.String value) {
    this.bzxrwybs = value;
  }

  public java.lang.String getBzxrmc() {
    return this.bzxrmc;
  }

  public void setBzxrmc(java.lang.String value) {
    this.bzxrmc = value;
  }

  public java.lang.String getSfzjhm() {
    return this.sfzjhm;
  }

  public void setSfzjhm(java.lang.String value) {
    this.sfzjhm = value;
  }

  public java.lang.String getZxfy() {
    return this.zxfy;
  }

  public void setZxfy(java.lang.String value) {
    this.zxfy = value;
  }

  public java.lang.String getZxyjwh() {
    return this.zxyjwh;
  }

  public void setZxyjwh(java.lang.String value) {
    this.zxyjwh = value;
  }

  public java.util.Date getLasj() {
    return this.lasj;
  }

  public void setLasj(java.util.Date value) {
    this.lasj = value;
  }

  public java.lang.String getAh() {
    return this.ah;
  }

  public void setAh(java.lang.String value) {
    this.ah = value;
  }

  public java.lang.String getZczxyjdw() {
    return this.zczxyjdw;
  }

  public void setZczxyjdw(java.lang.String value) {
    this.zczxyjdw = value;
  }

  public java.lang.String getSxflwsqdsj() {
    return this.sxflwsqdsj;
  }

  public void setSxflwsqdsj(java.lang.String value) {
    this.sxflwsqdsj = value;
  }

  public java.lang.String getBzxrlxqk() {
    return this.bzxrlxqk;
  }

  public void setBzxrlxqk(java.lang.String value) {
    this.bzxrlxqk = value;
  }

  public java.util.Date getFbsj() {
    return this.fbsj;
  }

  public void setFbsj(java.util.Date value) {
    this.fbsj = value;
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

