/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:  ca_dj_jbxx 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年06月27日
 */

public class Status implements Serializable {
    @Column(name = "fr_content")
    private String fr_content;


  

    private static final long serialVersionUID = 1L;

    /**
     * @return hash_unique
     */
    public String getFr_content() {
        return fr_content;
    }

    /**
     * @param hashUnique
     */
    public void setfr_content(String fr_content) {
        this.fr_content = fr_content;
    }

  
}