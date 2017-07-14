/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * 描述:  dt_bm_sjtj 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月12日
 */
@Table(name = "frk.dt_bm_sjtj")
public class DtBmsjtj implements Serializable {
    @Column(name = "id")
    private Integer id;

    @Column(name = "bmmc")
    private String bmmc;

    @Column(name = "zwbm")
    private String zwbm;

    @Column(name = "bmc")
    private String bmc;

    @Column(name = "cjksl")
    private Integer cjksl;

    @Column(name = "qxksl")
    private Integer qxksl;

    @Column(name = "pcwgsl")
    private Integer pcwgsl;

    @Column(name = "frksl")
    private Integer frksl;

    @Column(name = "ppbl")
    private BigDecimal ppbl;

    private static final long serialVersionUID = 1L;

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
     * @return bmmc
     */
    public String getBmmc() {
        return bmmc;
    }

    /**
     * @param bmmc
     */
    public void setBmmc(String bmmc) {
        this.bmmc = bmmc;
    }

    /**
     * @return zwbm
     */
    public String getZwbm() {
        return zwbm;
    }

    /**
     * @param zwbm
     */
    public void setZwbm(String zwbm) {
        this.zwbm = zwbm;
    }

    /**
     * @return bmc
     */
    public String getBmc() {
        return bmc;
    }

    /**
     * @param bmc
     */
    public void setBmc(String bmc) {
        this.bmc = bmc;
    }

    /**
     * @return cjksl
     */
    public Integer getCjksl() {
        return cjksl;
    }

    /**
     * @param cjksl
     */
    public void setCjksl(Integer cjksl) {
        this.cjksl = cjksl;
    }

    /**
     * @return qxksl
     */
    public Integer getQxksl() {
        return qxksl;
    }

    /**
     * @param qxksl
     */
    public void setQxksl(Integer qxksl) {
        this.qxksl = qxksl;
    }

    /**
     * @return pcwgsl
     */
    public Integer getPcwgsl() {
        return pcwgsl;
    }

    /**
     * @param pcwgsl
     */
    public void setPcwgsl(Integer pcwgsl) {
        this.pcwgsl = pcwgsl;
    }

    /**
     * @return frksl
     */
    public Integer getFrksl() {
        return frksl;
    }

    /**
     * @param frksl
     */
    public void setFrksl(Integer frksl) {
        this.frksl = frksl;
    }

    /**
     * @return ppbl
     */
    public BigDecimal getPpbl() {
        return ppbl;
    }

    /**
     * @param ppbl
     */
    public void setPpbl(BigDecimal ppbl) {
        this.ppbl = ppbl;
    }
}