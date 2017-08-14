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
@Table(name = "frk.ce_xkz_baxx_valid")
public class CeXkzBaxxValid implements Serializable {

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
  @Column(name = "bamc")
  private String bamc;
  @Column(name = "basbh")
  private String basbh;
  @Column(name = "banr")
  private String banr;
  @Column(name = "bajg")
  private String bajg;
  @Column(name = "barq")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date barq;
  @Column(name = "bazt")
  private String bazt;
  @Column(name = "baqs")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date baqs;
  @Column(name = "bajz")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date bajz;
  @Column(name = "baqtxx")
  private String baqtxx;
  @Column(name = "datasrdep")
  private String datasrdep;
  @Column(name = "datasource")
  private String datasource;
  @Column(name = "datakeycontent")
  private String datakeycontent;
  @Column(name = "createtime")
  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
  private Date createtime;
  @Column(name = "updatetime")
  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
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
  public String getbamc() {
    return bamc;
  }

  /**
   * @param
   */
  public void setbamc(String bamc) {
    this.bamc = bamc;
  }

  /**
   * @return
   */
  public String getbanr() {
    return banr;
  }

  /**
   * @param
   */
  public void setbanr(String banr) {
    this.banr = banr;
  }

  /**
   * @return
   */
  public String getbajg() {
    return bajg;
  }

  /**
   * @param
   */
  public void setbajg(String bajg) {
    this.bajg = bajg;
  }

  /**
   * @return
   */
  public Date getbarq() {
    return barq;
  }

  /**
   * @param
   */
  public void setbarq(Date barq) {
    this.barq = barq;
  }

  /**
   * @return
   */
  public String getbazt() {
    return bazt;
  }

  /**
   * @param
   */
  public void setbazt(String bazt) {
    this.bazt = bazt;
  }

  /**
   * @return
   */
  public Date getbaqs() {
    return baqs;
  }

  /**
   * @param
   */
  public void setbaqs(Date baqs) {
    this.baqs = baqs;
  }

  /**
   * @return
   */
  public Date getbajz() {
    return bajz;
  }

  /**
   * @param
   */
  public void setbajz(Date bajz) {
    this.bajz = bajz;
  }

}