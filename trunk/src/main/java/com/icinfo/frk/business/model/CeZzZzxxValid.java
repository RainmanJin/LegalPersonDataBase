/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_gd_bdcxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.ce_zz_zzxx_valid")
public class CeZzZzxxValid implements Serializable {
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

    @Column(name = "zzlb")
    private String zzlb;

    @Column(name = "zzmc")
    private String zzmc;

    @Column(name = "zzdj")
    private String zzdj;

    @Column(name = "zzzsbh")
    private String zzzsbh;

    @Column(name = "zzwh")
    private String zzwh;

    @Column(name = "zzjg")
    private String zzjg;

    @Column(name = "zzrq")
    private Date zzrq;

    @Column(name = "zzzt")
    private String zzzt;

    @Column(name = "zzqs")
    private String zzqs;

    @Column(name = "zzjz")
    private Date zzjz;

    @Column(name = "zzfw")
    private String zzfw;

    @Column(name = "zzqtxx")
    private String zzqtxx;

    @Column(name = "datasource")
    private String datasource;
    
    @Column(name = "datasrdep")
    private String datasrdep;
    
    @Column(name = "datakeycontent")
    private String datakeycontent;
    
    @Column(name = "createtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;

    @Column(name = "updatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;

   
    private static final long serialVersionUID = 1L;

    
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
    public String getzzlb() {
        return zzlb;
    }

    /**
     * @param 
     */
    public void setzzlb(String zzlb) {
        this.zzlb = zzlb;
    }
    
    /**
     * @return 
     */
    public String getzzmc() {
        return zzmc;
    }

    /**
     * @param 
     */
    public void setzzmc(String zzmc) {
        this.zzmc = zzmc;
    }
    
    /**
     * @return 
     */
    public String getzzdj() {
        return zzdj;
    }

    /**
     * @param 
     */
    public void setzzdj(String zzdj) {
        this.zzdj = zzdj;
    }
    
    /**
     * @return 
     */
    public String getzzjg() {
        return zzjg;
    }

    /**
     * @param 
     */
    public void setzzjg(String zzjg) {
        this.zzjg = zzjg;
    }
    
    /**
     * @return 
     */
    public Date getzzrq() {
        return zzrq;
    }

    /**
     * @param 
     */
    public void setzzrq(Date zzrq) {
        this. zzrq= zzrq;
    }
    
    /**
     * @return 
     */
    public String getzzzt() {
        return zzzt;
    }

    /**
     * @param 
     */
    public void setzzzt(String zzzt) {
        this.zzzt = zzzt;
    }
    
    /**
     * @return 
     */
    public String getzzqs() {
        return zzqs;
    }

    /**
     * @param 
     */
    public void setzzqs(String zzqs) {
        this.zzqs = zzqs;
    }
    
    /**
     * @return 
     */
    public Date getzzjz() {
        return zzjz;
    }

    /**
     * @param 
     */
    public void setzzjz(Date zzjz) {
        this.zzjz = zzjz;
    }

}