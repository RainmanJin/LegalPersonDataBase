/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.search.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  dt_process_log 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年05月08日
 */
@Table(name = "frk.ca_dj_jbxx")
public class LegalPerson implements Serializable {
    
    /**
     * 法人名称
     */
    @Column(name = "frmc")
    private String name;

    /**
     * 法定代表人
     */
    @Column(name = "fddbr")
    private String legalperson;
   
    /**
     * 统一信用代码
     */
    @Column(name = "tyxydm")
    private String trustcode;

   
    /**
     * 成立日期
     */
    @Column(name = "jyqsrq")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date CreationDate;
    
    /**
     * 行业
     */
    @Column(name = "hydm")
    private String category;
    
    
    
    /**
     * 获取法人名称
     *
     * @return 
     */
    public String getname() {
        return name;
    }

    /**
     * 设置法人名称
     *
     * @param 
     */
    public void setname(String name ) {
        this.name = name;
    }
    
    /**
     * 获取法定代表人
     *
     * @return 
     */
    public String getlegalperson() {
        return legalperson;
    }

    /**
     * 设置法定代表人
     *
     * @param 
     */
    public void setlegalperson(String legalperson) {
        this.legalperson =legalperson ;
    }
    
    /**
     * 获取统一信用代码
    *
    * @return 
    */
   public String gettrustcode() {
       return trustcode;
   }

   /**
    * 设置统一信用代码
    *
    * @param 
    */
   public void settrustcode(String trustcode) {
       this.trustcode = trustcode;
   }
   
   /**
    * 获取成立日期
   *
   * @return 
   */
  public Date getCreationDate() {
      return CreationDate;
  }

  /**
   * 设置成立日期
   *
   * @param 
   */
  public void setCreationDate(Date CreationDate) {
      this.CreationDate = CreationDate;
  }
  
  /**
   * 获取行业代码
  *
  * @return 
  */
 public String getcategory() {
     return category;
 }

 /**
  * 设置行业代码
  *
  * @param 
  */
 public void setcategory(String category) {
     this.category = category;
 }

   
}