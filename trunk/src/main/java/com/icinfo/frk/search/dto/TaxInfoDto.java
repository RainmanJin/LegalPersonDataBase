/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.dto;
import com.icinfo.frk.search.model.BasicInfo;

/**
 * 描述:  ca_dj_jbxx 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
public class TaxInfoDto extends BasicInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nsrsbh;
	private String dlhh;
	
	/**
     * @return 
     */
    public String getnsrsbh() {
        return nsrsbh;
    }

    /**
     * @param 
     */
    public void setnsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }
    
    /**
     * @return 
     */
    public String getdlhh() {
        return dlhh;
    }

    /**
     * @param 
     */
    public void setdlhh(String dlhh) {
        this.dlhh = dlhh;
    }
	
}