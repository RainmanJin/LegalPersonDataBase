/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;
import javax.persistence.Column;
import java.io.Serializable;

/**
 * 描述:  ca_dj_jbxx 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年06月27日
 */

public class InsuranceCount implements Serializable {
    
	@Column(name = "yl_count")
    private Integer yl_count;

	@Column(name = "yb_count")
    private Integer yb_count;
	
	@Column(name = "syu_count")
    private Integer syu_count;
	
	@Column(name = "gs_count")
    private Integer gs_count;
	
	@Column(name = "sye_count")
    private Integer sye_count;
	
	@Column(name = "gjj_count")
    private Integer gjj_count;
  

    private static final long serialVersionUID = 1L;


    public Integer getyl_count() {
        return yl_count;
    }

    public void setyl_count(Integer yl_count) {
        this. yl_count= yl_count;
    }
    
    public Integer getyb_count() {
        return yb_count;
    }

    public void setyb_count(Integer yb_count) {
        this.yb_count = yb_count;
    }
    
    public Integer getsyu_count() {
        return syu_count;
    }

    public void setsyu_count(Integer syu_count) {
        this. syu_count= syu_count;
    }
    
    public Integer getgs_count() {
        return gs_count;
    }

    public void setgs_count(Integer gs_count) {
        this. gs_count= gs_count;
    }
    
    public Integer getsye_count() {
        return sye_count;
    }

    public void setsye_count(Integer sye_count) {
        this. sye_count= sye_count;
    }
    
    public Integer getgjj_count() {
        return gjj_count;
    }

    public void setgjj_count(Integer gjj_count) {
        this. gjj_count= gjj_count;
    }
    
    

    
   
}