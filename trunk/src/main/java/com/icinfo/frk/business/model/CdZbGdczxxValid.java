/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 描述:  cd_zb_gdczxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_zb_gdczxx_valid")
public class CdZbGdczxxValid implements Serializable {

  private static final long serialVersionUID = 1L;
  @Column(name = "id")
  private String id;
  @Column(name = "hash_unique")
  private String hashUnique;
  @Column(name = "gdsfbs")
  private String gdsfbs;
  @Column(name = "nbxh")
  private String nbxh;
  @Column(name = "frwybs")
  private String frwybs;
  @Column(name = "gd")
  private String gd;
  @Column(name = "gd_lx")
  private String gdLx;
  @Column(name = "zjlx_gd")
  private String zjlxGd;
  @Column(name = "zjhm_gd")
  private String zjhmGd;
  @Column(name = "zzlx_gd")
  private String zzlxGd;
  @Column(name = "zzbh_gd")
  private String zzbhGd;
  @Column(name = "rjcze")
  private BigDecimal rjcze;
  @Column(name = "rjczbl")
  private BigDecimal rjczbl;
  @Column(name = "rjczrq")
  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
  private Date rjczrq;
  @Column(name = "rjczfs")
  private String rjczfs;
  @Column(name = "sjcze")
  private BigDecimal sjcze;
  @Column(name = "sjczbl")
  private BigDecimal sjczbl;
  @Column(name = "fq_rjczfs")
  private String fqRjczfs;
  @Column(name = "fq_rjcze")
  private BigDecimal fqRjcze;
  @Column(name = "fq_rjczrq")
  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
  private Date fqRjczrq;
  @Column(name = "fq_sjczfs")
  private String fqSjczfs;
  @Column(name = "fq_sjcze")
  private BigDecimal fqSjcze;
  @Column(name = "fq_sjczrq")
  @JsonFormat(pattern = "yyyy-MM-dd ", timezone = "GMT+8")
  private Date fqSjczrq;
  @Column(name = "datasrdep")
  private String datasrdep;
  @Column(name = "datasource")
  private String datasource;
  @Column(name = "datakeycontent")
  private String datakeycontent;
  @Column(name = "createtime")
  private String createtime;
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
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return hash_unique
   */
  public String getHashUnique() {
    return hashUnique;
  }

  /**
   * @param hashUnique
   */
  public void setHashUnique(String hashUnique) {
    this.hashUnique = hashUnique;
  }

  /**
   * @return gdsfbs
   */
  public String getGdsfbs() {
    return gdsfbs;
  }

  /**
   * @param gdsfbs
   */
  public void setGdsfbs(String gdsfbs) {
    this.gdsfbs = gdsfbs;
  }

  /**
   * @return nbxh
   */
  public String getNbxh() {
    return nbxh;
  }

  /**
   * @param nbxh
   */
  public void setNbxh(String nbxh) {
    this.nbxh = nbxh;
  }

  /**
   * @return frwybs
   */
  public String getFrwybs() {
    return frwybs;
  }

  /**
   * @param frwybs
   */
  public void setFrwybs(String frwybs) {
    this.frwybs = frwybs;
  }

  /**
   * @return gd
   */
  public String getGd() {
    return gd;
  }

  /**
   * @param gd
   */
  public void setGd(String gd) {
    this.gd = gd;
  }

  /**
   * @return gd_lx
   */
  public String getGdLx() {
    return gdLx;
  }

  /**
   * @param gdLx
   */
  public void setGdLx(String gdLx) {
    this.gdLx = gdLx;
  }

  /**
   * @return zjlx_gd
   */
  public String getZjlxGd() {
    return zjlxGd;
  }

  /**
   * @param zjlxGd
   */
  public void setZjlxGd(String zjlxGd) {
    this.zjlxGd = zjlxGd;
  }

  /**
   * @return zjhm_gd
   */
  public String getZjhmGd() {
    return zjhmGd;
  }

  /**
   * @param zjhmGd
   */
  public void setZjhmGd(String zjhmGd) {
    this.zjhmGd = zjhmGd;
  }

  /**
   * @return zzlx_gd
   */
  public String getZzlxGd() {
    return zzlxGd;
  }

  /**
   * @param zzlxGd
   */
  public void setZzlxGd(String zzlxGd) {
    this.zzlxGd = zzlxGd;
  }

  /**
   * @return zzbh_gd
   */
  public String getZzbhGd() {
    return zzbhGd;
  }

  /**
   * @param zzbhGd
   */
  public void setZzbhGd(String zzbhGd) {
    this.zzbhGd = zzbhGd;
  }

  /**
   * @return rjcze
   */
  public BigDecimal getRjcze() {
    return rjcze;
  }

  /**
   * @param rjcze
   */
  public void setRjcze(BigDecimal rjcze) {
    this.rjcze = rjcze;
  }

  /**
   * @return rjczbl
   */
  public BigDecimal getRjczbl() {
    return rjczbl;
  }

  /**
   * @param rjczbl
   */
  public void setRjczbl(BigDecimal rjczbl) {
    if (rjczbl != null) {
      this.rjczbl = rjczbl.setScale(2, BigDecimal.ROUND_DOWN);
    } else {
      this.rjczbl = BigDecimal.ZERO;
    }
  }

  /**
   * @return rjczrq
   */
  public Date getRjczrq() {
    return rjczrq;
  }

  /**
   * @param rjczrq
   */
  public void setRjczrq(Date rjczrq) {
    this.rjczrq = rjczrq;
  }

  /**
   * @return rjczfs
   */
  public String getRjczfs() {
    return rjczfs;
  }

  /**
   * @param rjczfs
   */
  public void setRjczfs(String rjczfs) {
    this.rjczfs = rjczfs;
  }

  /**
   * @return sjcze
   */
  public BigDecimal getSjcze() {
    return sjcze;
  }

  /**
   * @param sjcze
   */
  public void setSjcze(BigDecimal sjcze) {
    this.sjcze = sjcze;
  }

  /**
   * @return sjczbl
   */
  public BigDecimal getSjczbl() {
    return sjczbl;
  }

  /**
   * @param sjczbl
   */
  public void setSjczbl(BigDecimal sjczbl) {
    this.sjczbl = sjczbl;
  }

  /**
   * @return fq_rjczfs
   */
  public String getFqRjczfs() {
    return fqRjczfs;
  }

  /**
   * @param fqRjczfs
   */
  public void setFqRjczfs(String fqRjczfs) {
    this.fqRjczfs = fqRjczfs;
  }

  /**
   * @return fq_rjcze
   */
  public BigDecimal getFqRjcze() {
    return fqRjcze;
  }

  /**
   * @param fqRjcze
   */
  public void setFqRjcze(BigDecimal fqRjcze) {
    this.fqRjcze = fqRjcze;
  }

  /**
   * @return fq_rjczrq
   */
  public Date getFqRjczrq() {
    return fqRjczrq;
  }

  /**
   * @param fqRjczrq
   */
  public void setFqRjczrq(Date fqRjczrq) {
    this.fqRjczrq = fqRjczrq;
  }

  /**
   * @return fq_sjczfs
   */
  public String getFqSjczfs() {
    return fqSjczfs;
  }

  /**
   * @param fqSjczfs
   */
  public void setFqSjczfs(String fqSjczfs) {
    this.fqSjczfs = fqSjczfs;
  }

  /**
   * @return fq_sjcze
   */
  public BigDecimal getFqSjcze() {
    return fqSjcze;
  }

  /**
   * @param fqSjcze
   */
  public void setFqSjcze(BigDecimal fqSjcze) {
    this.fqSjcze = fqSjcze;
  }

  /**
   * @return fq_sjczrq
   */
  public Date getFqSjczrq() {
    return fqSjczrq;
  }

  /**
   * @param fqSjczrq
   */
  public void setFqSjczrq(Date fqSjczrq) {
    this.fqSjczrq = fqSjczrq;
  }

  /**
   * @return datasrdep
   */
  public String getDatasrdep() {
    return datasrdep;
  }

  /**
   * @param datasrdep
   */
  public void setDatasrdep(String datasrdep) {
    this.datasrdep = datasrdep;
  }

  /**
   * @return datasource
   */
  public String getDatasource() {
    return datasource;
  }

  /**
   * @param datasource
   */
  public void setDatasource(String datasource) {
    this.datasource = datasource;
  }

  /**
   * @return datakeycontent
   */
  public String getDatakeycontent() {
    return datakeycontent;
  }

  /**
   * @param datakeycontent
   */
  public void setDatakeycontent(String datakeycontent) {
    this.datakeycontent = datakeycontent;
  }

  /**
   * @return createtime
   */
  public String getCreatetime() {
    return createtime;
  }

  /**
   * @param createtime
   */
  public void setCreatetime(String createtime) {
    this.createtime = createtime;
  }

  /**
   * @return updatetime
   */
  public Date getUpdatetime() {
    return updatetime;
  }

  /**
   * @param updatetime
   */
  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }
}