/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_qt_swzc_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_qt_swzc_valid")
public class CdQtSwzcValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "dwmc")
    private String dwmc;

    @Column(name = "czhong")
    private Integer czhong;

    @Column(name = "cll")
    private Integer cll;

    @Column(name = "spcsl")
    private Integer spcsl;

    @Column(name = "zcsl")
    private Integer zcsl;

    @Column(name = "mcsl")
    private Integer mcsl;

    @Column(name = "gcsl")
    private Integer gcsl;

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
     * @return dwmc
     */
    public String getDwmc() {
        return dwmc;
    }

    /**
     * @param dwmc
     */
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    /**
     * @return czhong
     */
    public Integer getCzhong() {
        return czhong;
    }

    /**
     * @param czhong
     */
    public void setCzhong(Integer czhong) {
        this.czhong = czhong;
    }

    /**
     * @return cll
     */
    public Integer getCll() {
        return cll;
    }

    /**
     * @param cll
     */
    public void setCll(Integer cll) {
        this.cll = cll;
    }

    /**
     * @return spcsl
     */
    public Integer getSpcsl() {
        return spcsl;
    }

    /**
     * @param spcsl
     */
    public void setSpcsl(Integer spcsl) {
        this.spcsl = spcsl;
    }

    /**
     * @return zcsl
     */
    public Integer getZcsl() {
        return zcsl;
    }

    /**
     * @param zcsl
     */
    public void setZcsl(Integer zcsl) {
        this.zcsl = zcsl;
    }

    /**
     * @return mcsl
     */
    public Integer getMcsl() {
        return mcsl;
    }

    /**
     * @param mcsl
     */
    public void setMcsl(Integer mcsl) {
        this.mcsl = mcsl;
    }

    /**
     * @return gcsl
     */
    public Integer getGcsl() {
        return gcsl;
    }

    /**
     * @param gcsl
     */
    public void setGcsl(Integer gcsl) {
        this.gcsl = gcsl;
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