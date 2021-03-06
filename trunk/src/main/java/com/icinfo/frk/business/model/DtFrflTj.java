/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 描述:    dt_frfl_tj 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 *
 * @author framework generator
 * @date 2017年05月10日
 */
@Table(name = "frk.dt_frfl_tj")
public class DtFrflTj implements Serializable {

  private static final long serialVersionUID = 1L;
  @Column(name = "id")
  private Integer id;
  /**
   * 法人分类，见编码表
   */
  @Column(name = "frfl")
  private Integer frfl;
  /**
   * 统计数量
   */
  @Column(name = "frfl_sl")
  private Integer frflSl;
  /**
   * 统计时间
   */
  @Column(name = "frfl_tjrq")
  private Date frflTjrq;
  /**
   * 类别1：总数，2：最近月份
   */
  @Column(name = "frfl_lb")
  private String frflLb;
  //法人类型名称
  @Column(name = "fr_content")
  private String TypeName;

  /**
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 获取法人分类，见编码表
   *
   * @return frfl - 法人分类，见编码表
   */
  public Integer getFrfl() {
    return frfl;
  }

  /**
   * 设置法人分类，见编码表
   *
   * @param frfl 法人分类，见编码表
   */
  public void setFrfl(Integer frfl) {
    this.frfl = frfl;
  }

  /**
   * 获取统计数量
   *
   * @return frfl_sl - 统计数量
   */
  public Integer getFrflSl() {
    return frflSl;
  }

  /**
   * 设置统计数量
   *
   * @param frflSl 统计数量
   */
  public void setFrflSl(Integer frflSl) {
    this.frflSl = frflSl;
  }

  /**
   * 获取统计时间
   *
   * @return frfl_tjrq - 统计时间
   */
  public Date getFrflTjrq() {
    return frflTjrq;
  }

  /**
   * 设置统计时间
   *
   * @param frflTjrq 统计时间
   */
  public void setFrflTjrq(Date frflTjrq) {
    this.frflTjrq = frflTjrq;
  }

  public String getFrflDesc() {
    if (this.frfl == 91) {
      return "个体户";
    }
    if (this.frfl == 16) {
      return "企业";
    }
    if (this.frfl == 17) {
      return "农专社";
    }
    return null;
  }

  /**
   * 获取类别1：总数，2：最近月份
   *
   * @return frfl_lb - 类别1：总数，2：最近月份
   */
  public String getFrflLb() {
    return frflLb;
  }

  /**
   * 设置类别1：总数，2：最近月份
   *
   * @param frflLb 类别1：总数，2：最近月份
   */
  public void setFrflLb(String frflLb) {
    this.frflLb = frflLb;
  }

  public String getTypeName() {
    return TypeName;
  }

  /**
   * 设置类型名称
   */
  public void setTypeName(String TypeName) {
    this.TypeName = TypeName;
  }


}