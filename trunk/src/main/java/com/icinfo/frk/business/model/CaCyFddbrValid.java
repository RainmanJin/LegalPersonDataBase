/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 描述:  ca_cy_fddbr_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年06月30日
 */
@Table(name = "frk.ca_cy_fddbr_valid")
public class CaCyFddbrValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "nbxh")
    private String nbxh;

    @Column(name = "tyxydm")
    private String tyxydm;

    @Column(name = "xm")
    private String xm;

    @Column(name = "zjlx")
    private String zjlx;

    @Column(name = "zjhm")
    private String zjhm;

    @Column(name = "gj")
    private String gj;

    @Column(name = "zw")
    private String zw;

    @Column(name = "zwcsfs")
    private String zwcsfs;

    @Column(name = "bz_fzr")
    private String bzFzr;

    @Column(name = "rmf")
    private String rmf;

    @Column(name = "rzqsrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date rzqsrq;

    @Column(name = "rzjzrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date rzjzrq;

    @Column(name = "fzr_dh")
    private String fzrDh;

    @Column(name = "fzr_yddh")
    private String fzrYddh;

    @Column(name = "fzr_dy")
    private String fzrDy;

    @Column(name = "datasrdep")
    private String datasrdep;

    @Column(name = "datasource")
    private String datasource;

    @Column(name = "datakeycontent")
    private String datakeycontent;

    @Column(name = "createtime")
    private String createtime;

    @Column(name = "updatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

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
     * @return tyxydm
     */
    public String getTyxydm() {
        return tyxydm;
    }

    /**
     * @param tyxydm
     */
    public void setTyxydm(String tyxydm) {
        this.tyxydm = tyxydm;
    }

    /**
     * @return xm
     */
    public String getXm() {
        return xm;
    }

    /**
     * @param xm
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * @return zjlx
     */
    public String getZjlx() {
        return zjlx;
    }

    /**
     * @param zjlx
     */
    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    /**
     * @return zjhm
     */
    public String getZjhm() {
        return zjhm;
    }

    /**
     * @param zjhm
     */
    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    /**
     * @return gj
     */
    public String getGj() {
        return gj;
    }

    /**
     * @param gj
     */
    public void setGj(String gj) {
        this.gj = gj;
    }

    /**
     * @return zw
     */
    public String getZw() {
        return zw;
    }

    /**
     * @param zw
     */
    public void setZw(String zw) {
        this.zw = zw;
    }

    /**
     * @return zwcsfs
     */
    public String getZwcsfs() {
        return zwcsfs;
    }

    /**
     * @param zwcsfs
     */
    public void setZwcsfs(String zwcsfs) {
        this.zwcsfs = zwcsfs;
    }

    /**
     * @return bz_fzr
     */
    public String getBzFzr() {
        return bzFzr;
    }

    /**
     * @param bzFzr
     */
    public void setBzFzr(String bzFzr) {
        this.bzFzr = bzFzr;
    }

    /**
     * @return rmf
     */
    public String getRmf() {
        return rmf;
    }

    /**
     * @param rmf
     */
    public void setRmf(String rmf) {
        this.rmf = rmf;
    }

    /**
     * @return rzqsrq
     */
    public Date getRzqsrq() {
        return rzqsrq;
    }

    /**
     * @param rzqsrq
     */
    public void setRzqsrq(Date rzqsrq) {
        this.rzqsrq = rzqsrq;
    }

    /**
     * @return rzjzrq
     */
    public Date getRzjzrq() {
        return rzjzrq;
    }

    /**
     * @param rzjzrq
     */
    public void setRzjzrq(Date rzjzrq) {
        this.rzjzrq = rzjzrq;
    }

    /**
     * @return fzr_dh
     */
    public String getFzrDh() {
        return fzrDh;
    }

    /**
     * @param fzrDh
     */
    public void setFzrDh(String fzrDh) {
        this.fzrDh = fzrDh;
    }

    /**
     * @return fzr_yddh
     */
    public String getFzrYddh() {
        return fzrYddh;
    }

    /**
     * @param fzrYddh
     */
    public void setFzrYddh(String fzrYddh) {
        this.fzrYddh = fzrYddh;
    }

    /**
     * @return fzr_dy
     */
    public String getFzrDy() {
        return fzrDy;
    }

    /**
     * @param fzrDy
     */
    public void setFzrDy(String fzrDy) {
        this.fzrDy = fzrDy;
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