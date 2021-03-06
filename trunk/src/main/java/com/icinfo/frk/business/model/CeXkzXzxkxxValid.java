/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Table;


/**
 * 描述:  cd_gd_bdcxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.ce_xkz_xzxkxx_valid")
public class CeXkzXzxkxxValid implements Serializable {

  private static final long serialVersionUID = 1L;
  @Column(name = "id")
  private String id;
  @Column(name = "frwybs")
  private String frwybs;
  @Column(name = "dwmc")
  private String dwmc;
  @Column(name = "tyshxydm")
  private String tyshxydm;
  @Column(name = "zzjgdm")
  private String zzjgdm;
  @Column(name = "jgmc")
  private String jgmc;
  @Column(name = "xlmc")
  private String xlmc;
  @Column(name = "xkzsbh")
  private String xkzsbh;
  @Column(name = "xknr")
  private String xknr;
  @Column(name = "xkjg")
  private String xkjg;
  @Column(name = "xkrq")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date xkrq;
  @Column(name = "xkzt")
  private String xkzt;
  @Column(name = "xkqs")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date xkqs;
  @Column(name = "xkjz")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date xkjz;
  @Column(name = "xkqtxx")
  private String xkqtxx;
  @Column(name = "datasrdep")
  private String datasrdep;
  @Column(name = "datasource")
  private String datasource;
  @Column(name = "datakeycontent")
  private String datakeycontent;
  @Column(name = "createtime")
  private String createtime;
  @Column(name = "updatetime")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date updatetime;
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

  /**
   * @return
   */
  public String getid() {
    return id;
  }

  /**
   * @param
   */
  public void setid(String id) {
    this.id = id;
  }

  /**
   * @return
   */
  public String getfrwybs() {
    return frwybs;
  }

  /**
   * @param
   */
  public void setfrwybs(String frwybs) {
    this.frwybs = frwybs;
  }

  /**
   * @return
   */
  public String getdwmc() {
    return dwmc;
  }

  /**
   * @param
   */
  public void setdwmc(String dwmc) {
    this.dwmc = dwmc;
  }

  /**
   * @return
   */
  public String gettyshxydm() {
    return tyshxydm;
  }

  /**
   * @param
   */
  public void settyshxydm(String tyshxydm) {
    this.tyshxydm = tyshxydm;
  }

  /**
   * @return
   */
  public String getzzjgdm() {
    return zzjgdm;
  }

  /**
   * @param
   */
  public void setzzjgdm(String zzjgdm) {
    this.zzjgdm = zzjgdm;
  }

  /**
   * @return
   */
  public String getjgmc() {
    return jgmc;
  }

  /**
   * @param
   */
  public void setjgmc(String jgmc) {
    this.jgmc = jgmc;
  }

  /**
   * @return
   */
  public String getxlmc() {
    return xlmc;
  }

  /**
   * @param
   */
  public void setxlmc(String xlmc) {
    this.xlmc = xlmc;
  }

  /**
   * @return
   */
  public String getxkzsbh() {
    return xkzsbh;
  }

  /**
   * @param
   */
  public void setxkzsbh(String xkzsbh) {
    this.xkzsbh = xkzsbh;
  }

  /**
   * @return
   */
  public String getxknr() {
    return xknr;
  }

  /**
   * @param
   */
  public void setxknr(String xknr) {
    this.xknr = xknr;
  }

  /**
   * @return
   */
  public String getxkjg() {
    return xkjg;
  }

  /**
   * @param
   */
  public void setxkjg(String xkjg) {
    this.xkjg = xkjg;
  }

  /**
   * @return
   */
  public Date getxkrq() {
    return xkrq;
  }

  /**
   * @param
   */
  public void setxkrq(Date xkrq) {
    this.xkrq = xkrq;
  }

  /**
   * @return
   */
  public String getxkzt() {
    return xkzt;
  }

  /**
   * @param
   */
  public void setxkzt(String xkzt) {
    this.xkzt = xkzt;
  }

  /**
   * @return
   */
  public Date getxkqs() {
    return xkqs;
  }

  /**
   * @param
   */
  public void setxkqs(Date xkqs) {
    this.xkqs = xkqs;
  }

  /**
   * @return
   */
  public Date getxkjz() {
    return xkjz;
  }

  /**
   * @param
   */
  public void setxkjz(Date xkjz) {
    this.xkjz = xkjz;
  }

  /**
   * @return
   */
  public String getxkqtxx() {
    return xkqtxx;
  }

  /**
   * @param
   */
  public void setxkqtxx(String xkqtxx) {
    this.xkqtxx = xkqtxx;
  }


}