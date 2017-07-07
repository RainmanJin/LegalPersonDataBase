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
 * 描述:  cd_wxzc_gtsyqxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_wxzc_gtsyqxx_valid")
public class CdWxzcGtsyqxxValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "syzmc")
    private String syzmc;

    @Column(name = "syzbh")
    private String syzbh;

    @Column(name = "tdzh")
    private String tdzh;

    @Column(name = "tdqlbh")
    private String tdqlbh;

    @Column(name = "qsxz")
    private String qsxz;

    @Column(name = "syqlx")
    private String syqlx;

    @Column(name = "syqdjrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date syqdjrq;

    @Column(name = "qszt")
    private String qszt;

    @Column(name = "syq_nx")
    private Integer syqNx;

    @Column(name = "syq_sfzx")
    private Integer syqSfzx;

    @Column(name = "djh")
    private String djh;

    @Column(name = "tdzl")
    private String tdzl;

    @Column(name = "mj")
    private BigDecimal mj;

    @Column(name = "zdmj")
    private BigDecimal zdmj;

    @Column(name = "jzmj")
    private BigDecimal jzmj;

    @Column(name = "jzzdmj")
    private BigDecimal jzzdmj;

    @Column(name = "syqmj")
    private BigDecimal syqmj;

    @Column(name = "dzsymj")
    private BigDecimal dzsymj;

    @Column(name = "gyftmj")
    private BigDecimal gyftmj;

    @Column(name = "jzwlx")
    private String jzwlx;

    @Column(name = "jzmd")
    private BigDecimal jzmd;

    @Column(name = "jzwqs")
    private String jzwqs;

    @Column(name = "tddj")
    private String tddj;

    @Column(name = "bddj")
    private BigDecimal bddj;

    @Column(name = "sbdj")
    private BigDecimal sbdj;

    @Column(name = "tdqsly")
    private String tdqsly;

    @Column(name = "tdyt")
    private String tdyt;

    @Column(name = "ghkh")
    private String ghkh;

    @Column(name = "fgzh")
    private String fgzh;

    @Column(name = "xjsj")
    private String xjsj;

    @Column(name = "tddcb")
    private String tddcb;

    @Column(name = "tddjlx")
    private String tddjlx;

    @Column(name = "tddjkh")
    private String tddjkh;

    @Column(name = "tddjksx")
    private String tddjksx;

    @Column(name = "tdflmj")
    private BigDecimal tdflmj;

    @Column(name = "jzxg")
    private BigDecimal jzxg;

    @Column(name = "fwldh")
    private String fwldh;

    @Column(name = "fwlch")
    private String fwlch;

    @Column(name = "fwqdfs")
    private String fwqdfs;

    @Column(name = "fwmj")
    private BigDecimal fwmj;

    @Column(name = "kcbh")
    private String kcbh;

    @Column(name = "qlslfs")
    private String qlslfs;

    @Column(name = "tdth")
    private String tdth;

    @Column(name = "gyzkh")
    private String gyzkh;

    @Column(name = "sftddjkyt")
    private Integer sftddjkyt;

    @Column(name = "fwszdy")
    private String fwszdy;

    @Column(name = "fczh")
    private String fczh;

    @Column(name = "dyfwmc")
    private String dyfwmc;

    @Column(name = "fwsyqx")
    private Integer fwsyqx;

    @Column(name = "sfdyq")
    private Integer sfdyq;

    @Column(name = "sffcq")
    private Integer sffcq;

    @Column(name = "jbzl")
    private String jbzl;

    @Column(name = "cjjg")
    private BigDecimal cjjg;

    @Column(name = "syqhtqdsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date syqhtqdsj;

    @Column(name = "zdbsm")
    private Integer zdbsm;

    @Column(name = "bz_dy")
    private Integer bzDy;

    @Column(name = "bz_cf")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date bzCf;

    @Column(name = "bz_dj")
    private Integer bzDj;

    @Column(name = "tdjyf")
    private BigDecimal tdjyf;

    @Column(name = "zxzcdjrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date zxzcdjrq;

    @Column(name = "ytdsyz")
    private String ytdsyz;

    @Column(name = "tdqzbfjg")
    private String tdqzbfjg;

    @Column(name = "dkbh")
    private String dkbh;

    @Column(name = "tdcrrbs")
    private String tdcrrbs;

    @Column(name = "tdsrrbs")
    private String tdsrrbs;

    @Column(name = "tdcrfs")
    private String tdcrfs;

    @Column(name = "dkzl")
    private String dkzl;

    @Column(name = "dksz")
    private String dksz;

    @Column(name = "dkyt")
    private String dkyt;

    @Column(name = "tdcrnx")
    private Integer tdcrnx;

    @Column(name = "tdcrmj")
    private BigDecimal tdcrmj;

    @Column(name = "tdrjl")
    private BigDecimal tdrjl;

    @Column(name = "tdlhl")
    private BigDecimal tdlhl;

    @Column(name = "hxbl")
    private String hxbl;

    @Column(name = "jzwxz")
    private String jzwxz;

    @Column(name = "tdhbyt")
    private String tdhbyt;

    @Column(name = "tdsycylb")
    private String tdsycylb;

    @Column(name = "tdcrhtbh")
    private String tdcrhtbh;

    @Column(name = "tdcrhtlx")
    private String tdcrhtlx;

    @Column(name = "tdcrhtqdrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date tdcrhtqdrq;

    @Column(name = "tdjdsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date tdjdsj;

    @Column(name = "tdsrydkgsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date tdsrydkgsj;

    @Column(name = "tdsrydjgsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date tdsrydjgsj;

    @Column(name = "tdsrhtzje")
    private BigDecimal tdsrhtzje;

    @Column(name = "tddyzbh")
    private String tddyzbh;

    @Column(name = "dyrbs")
    private String dyrbs;

    @Column(name = "dyqrbs")
    private String dyqrbs;

    @Column(name = "dydjrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dydjrq;

    @Column(name = "dyqxz")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dyqxz;

    @Column(name = "dyqxzh")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dyqxzh;

    @Column(name = "dyje")
    private BigDecimal dyje;

    @Column(name = "tdjg")
    private BigDecimal tdjg;

    @Column(name = "dysx")
    private String dysx;

    @Column(name = "cfwh")
    private String cfwh;

    @Column(name = "cffymc")
    private String cffymc;

    @Column(name = "cfqxz")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cfqxz;

    @Column(name = "cfqxzh")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cfqxzh;

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
     * @return syzmc
     */
    public String getSyzmc() {
        return syzmc;
    }

    /**
     * @param syzmc
     */
    public void setSyzmc(String syzmc) {
        this.syzmc = syzmc;
    }

    /**
     * @return syzbh
     */
    public String getSyzbh() {
        return syzbh;
    }

    /**
     * @param syzbh
     */
    public void setSyzbh(String syzbh) {
        this.syzbh = syzbh;
    }

    /**
     * @return tdzh
     */
    public String getTdzh() {
        return tdzh;
    }

    /**
     * @param tdzh
     */
    public void setTdzh(String tdzh) {
        this.tdzh = tdzh;
    }

    /**
     * @return tdqlbh
     */
    public String getTdqlbh() {
        return tdqlbh;
    }

    /**
     * @param tdqlbh
     */
    public void setTdqlbh(String tdqlbh) {
        this.tdqlbh = tdqlbh;
    }

    /**
     * @return qsxz
     */
    public String getQsxz() {
        return qsxz;
    }

    /**
     * @param qsxz
     */
    public void setQsxz(String qsxz) {
        this.qsxz = qsxz;
    }

    /**
     * @return syqlx
     */
    public String getSyqlx() {
        return syqlx;
    }

    /**
     * @param syqlx
     */
    public void setSyqlx(String syqlx) {
        this.syqlx = syqlx;
    }

    /**
     * @return syqdjrq
     */
    public Date getSyqdjrq() {
        return syqdjrq;
    }

    /**
     * @param syqdjrq
     */
    public void setSyqdjrq(Date syqdjrq) {
        this.syqdjrq = syqdjrq;
    }

    /**
     * @return qszt
     */
    public String getQszt() {
        return qszt;
    }

    /**
     * @param qszt
     */
    public void setQszt(String qszt) {
        this.qszt = qszt;
    }

    /**
     * @return syq_nx
     */
    public Integer getSyqNx() {
        return syqNx;
    }

    /**
     * @param syqNx
     */
    public void setSyqNx(Integer syqNx) {
        this.syqNx = syqNx;
    }

    /**
     * @return syq_sfzx
     */
    public Integer getSyqSfzx() {
        return syqSfzx;
    }

    /**
     * @param syqSfzx
     */
    public void setSyqSfzx(Integer syqSfzx) {
        this.syqSfzx = syqSfzx;
    }

    /**
     * @return djh
     */
    public String getDjh() {
        return djh;
    }

    /**
     * @param djh
     */
    public void setDjh(String djh) {
        this.djh = djh;
    }

    /**
     * @return tdzl
     */
    public String getTdzl() {
        return tdzl;
    }

    /**
     * @param tdzl
     */
    public void setTdzl(String tdzl) {
        this.tdzl = tdzl;
    }

    /**
     * @return mj
     */
    public BigDecimal getMj() {
        return mj;
    }

    /**
     * @param mj
     */
    public void setMj(BigDecimal mj) {
        this.mj = mj;
    }

    /**
     * @return zdmj
     */
    public BigDecimal getZdmj() {
        return zdmj;
    }

    /**
     * @param zdmj
     */
    public void setZdmj(BigDecimal zdmj) {
        this.zdmj = zdmj;
    }

    /**
     * @return jzmj
     */
    public BigDecimal getJzmj() {
        return jzmj;
    }

    /**
     * @param jzmj
     */
    public void setJzmj(BigDecimal jzmj) {
        this.jzmj = jzmj;
    }

    /**
     * @return jzzdmj
     */
    public BigDecimal getJzzdmj() {
        return jzzdmj;
    }

    /**
     * @param jzzdmj
     */
    public void setJzzdmj(BigDecimal jzzdmj) {
        this.jzzdmj = jzzdmj;
    }

    /**
     * @return syqmj
     */
    public BigDecimal getSyqmj() {
        return syqmj;
    }

    /**
     * @param syqmj
     */
    public void setSyqmj(BigDecimal syqmj) {
        this.syqmj = syqmj;
    }

    /**
     * @return dzsymj
     */
    public BigDecimal getDzsymj() {
        return dzsymj;
    }

    /**
     * @param dzsymj
     */
    public void setDzsymj(BigDecimal dzsymj) {
        this.dzsymj = dzsymj;
    }

    /**
     * @return gyftmj
     */
    public BigDecimal getGyftmj() {
        return gyftmj;
    }

    /**
     * @param gyftmj
     */
    public void setGyftmj(BigDecimal gyftmj) {
        this.gyftmj = gyftmj;
    }

    /**
     * @return jzwlx
     */
    public String getJzwlx() {
        return jzwlx;
    }

    /**
     * @param jzwlx
     */
    public void setJzwlx(String jzwlx) {
        this.jzwlx = jzwlx;
    }

    /**
     * @return jzmd
     */
    public BigDecimal getJzmd() {
        return jzmd;
    }

    /**
     * @param jzmd
     */
    public void setJzmd(BigDecimal jzmd) {
        this.jzmd = jzmd;
    }

    /**
     * @return jzwqs
     */
    public String getJzwqs() {
        return jzwqs;
    }

    /**
     * @param jzwqs
     */
    public void setJzwqs(String jzwqs) {
        this.jzwqs = jzwqs;
    }

    /**
     * @return tddj
     */
    public String getTddj() {
        return tddj;
    }

    /**
     * @param tddj
     */
    public void setTddj(String tddj) {
        this.tddj = tddj;
    }

    /**
     * @return bddj
     */
    public BigDecimal getBddj() {
        return bddj;
    }

    /**
     * @param bddj
     */
    public void setBddj(BigDecimal bddj) {
        this.bddj = bddj;
    }

    /**
     * @return sbdj
     */
    public BigDecimal getSbdj() {
        return sbdj;
    }

    /**
     * @param sbdj
     */
    public void setSbdj(BigDecimal sbdj) {
        this.sbdj = sbdj;
    }

    /**
     * @return tdqsly
     */
    public String getTdqsly() {
        return tdqsly;
    }

    /**
     * @param tdqsly
     */
    public void setTdqsly(String tdqsly) {
        this.tdqsly = tdqsly;
    }

    /**
     * @return tdyt
     */
    public String getTdyt() {
        return tdyt;
    }

    /**
     * @param tdyt
     */
    public void setTdyt(String tdyt) {
        this.tdyt = tdyt;
    }

    /**
     * @return ghkh
     */
    public String getGhkh() {
        return ghkh;
    }

    /**
     * @param ghkh
     */
    public void setGhkh(String ghkh) {
        this.ghkh = ghkh;
    }

    /**
     * @return fgzh
     */
    public String getFgzh() {
        return fgzh;
    }

    /**
     * @param fgzh
     */
    public void setFgzh(String fgzh) {
        this.fgzh = fgzh;
    }

    /**
     * @return xjsj
     */
    public String getXjsj() {
        return xjsj;
    }

    /**
     * @param xjsj
     */
    public void setXjsj(String xjsj) {
        this.xjsj = xjsj;
    }

    /**
     * @return tddcb
     */
    public String getTddcb() {
        return tddcb;
    }

    /**
     * @param tddcb
     */
    public void setTddcb(String tddcb) {
        this.tddcb = tddcb;
    }

    /**
     * @return tddjlx
     */
    public String getTddjlx() {
        return tddjlx;
    }

    /**
     * @param tddjlx
     */
    public void setTddjlx(String tddjlx) {
        this.tddjlx = tddjlx;
    }

    /**
     * @return tddjkh
     */
    public String getTddjkh() {
        return tddjkh;
    }

    /**
     * @param tddjkh
     */
    public void setTddjkh(String tddjkh) {
        this.tddjkh = tddjkh;
    }

    /**
     * @return tddjksx
     */
    public String getTddjksx() {
        return tddjksx;
    }

    /**
     * @param tddjksx
     */
    public void setTddjksx(String tddjksx) {
        this.tddjksx = tddjksx;
    }

    /**
     * @return tdflmj
     */
    public BigDecimal getTdflmj() {
        return tdflmj;
    }

    /**
     * @param tdflmj
     */
    public void setTdflmj(BigDecimal tdflmj) {
        this.tdflmj = tdflmj;
    }

    /**
     * @return jzxg
     */
    public BigDecimal getJzxg() {
        return jzxg;
    }

    /**
     * @param jzxg
     */
    public void setJzxg(BigDecimal jzxg) {
        this.jzxg = jzxg;
    }

    /**
     * @return fwldh
     */
    public String getFwldh() {
        return fwldh;
    }

    /**
     * @param fwldh
     */
    public void setFwldh(String fwldh) {
        this.fwldh = fwldh;
    }

    /**
     * @return fwlch
     */
    public String getFwlch() {
        return fwlch;
    }

    /**
     * @param fwlch
     */
    public void setFwlch(String fwlch) {
        this.fwlch = fwlch;
    }

    /**
     * @return fwqdfs
     */
    public String getFwqdfs() {
        return fwqdfs;
    }

    /**
     * @param fwqdfs
     */
    public void setFwqdfs(String fwqdfs) {
        this.fwqdfs = fwqdfs;
    }

    /**
     * @return fwmj
     */
    public BigDecimal getFwmj() {
        return fwmj;
    }

    /**
     * @param fwmj
     */
    public void setFwmj(BigDecimal fwmj) {
        this.fwmj = fwmj;
    }

    /**
     * @return kcbh
     */
    public String getKcbh() {
        return kcbh;
    }

    /**
     * @param kcbh
     */
    public void setKcbh(String kcbh) {
        this.kcbh = kcbh;
    }

    /**
     * @return qlslfs
     */
    public String getQlslfs() {
        return qlslfs;
    }

    /**
     * @param qlslfs
     */
    public void setQlslfs(String qlslfs) {
        this.qlslfs = qlslfs;
    }

    /**
     * @return tdth
     */
    public String getTdth() {
        return tdth;
    }

    /**
     * @param tdth
     */
    public void setTdth(String tdth) {
        this.tdth = tdth;
    }

    /**
     * @return gyzkh
     */
    public String getGyzkh() {
        return gyzkh;
    }

    /**
     * @param gyzkh
     */
    public void setGyzkh(String gyzkh) {
        this.gyzkh = gyzkh;
    }

    /**
     * @return sftddjkyt
     */
    public Integer getSftddjkyt() {
        return sftddjkyt;
    }

    /**
     * @param sftddjkyt
     */
    public void setSftddjkyt(Integer sftddjkyt) {
        this.sftddjkyt = sftddjkyt;
    }

    /**
     * @return fwszdy
     */
    public String getFwszdy() {
        return fwszdy;
    }

    /**
     * @param fwszdy
     */
    public void setFwszdy(String fwszdy) {
        this.fwszdy = fwszdy;
    }

    /**
     * @return fczh
     */
    public String getFczh() {
        return fczh;
    }

    /**
     * @param fczh
     */
    public void setFczh(String fczh) {
        this.fczh = fczh;
    }

    /**
     * @return dyfwmc
     */
    public String getDyfwmc() {
        return dyfwmc;
    }

    /**
     * @param dyfwmc
     */
    public void setDyfwmc(String dyfwmc) {
        this.dyfwmc = dyfwmc;
    }

    /**
     * @return fwsyqx
     */
    public Integer getFwsyqx() {
        return fwsyqx;
    }

    /**
     * @param fwsyqx
     */
    public void setFwsyqx(Integer fwsyqx) {
        this.fwsyqx = fwsyqx;
    }

    /**
     * @return sfdyq
     */
    public Integer getSfdyq() {
        return sfdyq;
    }

    /**
     * @param sfdyq
     */
    public void setSfdyq(Integer sfdyq) {
        this.sfdyq = sfdyq;
    }

    /**
     * @return sffcq
     */
    public Integer getSffcq() {
        return sffcq;
    }

    /**
     * @param sffcq
     */
    public void setSffcq(Integer sffcq) {
        this.sffcq = sffcq;
    }

    /**
     * @return jbzl
     */
    public String getJbzl() {
        return jbzl;
    }

    /**
     * @param jbzl
     */
    public void setJbzl(String jbzl) {
        this.jbzl = jbzl;
    }

    /**
     * @return cjjg
     */
    public BigDecimal getCjjg() {
        return cjjg;
    }

    /**
     * @param cjjg
     */
    public void setCjjg(BigDecimal cjjg) {
        this.cjjg = cjjg;
    }

    /**
     * @return syqhtqdsj
     */
    public Date getSyqhtqdsj() {
        return syqhtqdsj;
    }

    /**
     * @param syqhtqdsj
     */
    public void setSyqhtqdsj(Date syqhtqdsj) {
        this.syqhtqdsj = syqhtqdsj;
    }

    /**
     * @return zdbsm
     */
    public Integer getZdbsm() {
        return zdbsm;
    }

    /**
     * @param zdbsm
     */
    public void setZdbsm(Integer zdbsm) {
        this.zdbsm = zdbsm;
    }

    /**
     * @return bz_dy
     */
    public Integer getBzDy() {
        return bzDy;
    }

    /**
     * @param bzDy
     */
    public void setBzDy(Integer bzDy) {
        this.bzDy = bzDy;
    }

    /**
     * @return bz_cf
     */
    public Date getBzCf() {
        return bzCf;
    }

    /**
     * @param bzCf
     */
    public void setBzCf(Date bzCf) {
        this.bzCf = bzCf;
    }

    /**
     * @return bz_dj
     */
    public Integer getBzDj() {
        return bzDj;
    }

    /**
     * @param bzDj
     */
    public void setBzDj(Integer bzDj) {
        this.bzDj = bzDj;
    }

    /**
     * @return tdjyf
     */
    public BigDecimal getTdjyf() {
        return tdjyf;
    }

    /**
     * @param tdjyf
     */
    public void setTdjyf(BigDecimal tdjyf) {
        this.tdjyf = tdjyf;
    }

    /**
     * @return zxzcdjrq
     */
    public Date getZxzcdjrq() {
        return zxzcdjrq;
    }

    /**
     * @param zxzcdjrq
     */
    public void setZxzcdjrq(Date zxzcdjrq) {
        this.zxzcdjrq = zxzcdjrq;
    }

    /**
     * @return ytdsyz
     */
    public String getYtdsyz() {
        return ytdsyz;
    }

    /**
     * @param ytdsyz
     */
    public void setYtdsyz(String ytdsyz) {
        this.ytdsyz = ytdsyz;
    }

    /**
     * @return tdqzbfjg
     */
    public String getTdqzbfjg() {
        return tdqzbfjg;
    }

    /**
     * @param tdqzbfjg
     */
    public void setTdqzbfjg(String tdqzbfjg) {
        this.tdqzbfjg = tdqzbfjg;
    }

    /**
     * @return dkbh
     */
    public String getDkbh() {
        return dkbh;
    }

    /**
     * @param dkbh
     */
    public void setDkbh(String dkbh) {
        this.dkbh = dkbh;
    }

    /**
     * @return tdcrrbs
     */
    public String getTdcrrbs() {
        return tdcrrbs;
    }

    /**
     * @param tdcrrbs
     */
    public void setTdcrrbs(String tdcrrbs) {
        this.tdcrrbs = tdcrrbs;
    }

    /**
     * @return tdsrrbs
     */
    public String getTdsrrbs() {
        return tdsrrbs;
    }

    /**
     * @param tdsrrbs
     */
    public void setTdsrrbs(String tdsrrbs) {
        this.tdsrrbs = tdsrrbs;
    }

    /**
     * @return tdcrfs
     */
    public String getTdcrfs() {
        return tdcrfs;
    }

    /**
     * @param tdcrfs
     */
    public void setTdcrfs(String tdcrfs) {
        this.tdcrfs = tdcrfs;
    }

    /**
     * @return dkzl
     */
    public String getDkzl() {
        return dkzl;
    }

    /**
     * @param dkzl
     */
    public void setDkzl(String dkzl) {
        this.dkzl = dkzl;
    }

    /**
     * @return dksz
     */
    public String getDksz() {
        return dksz;
    }

    /**
     * @param dksz
     */
    public void setDksz(String dksz) {
        this.dksz = dksz;
    }

    /**
     * @return dkyt
     */
    public String getDkyt() {
        return dkyt;
    }

    /**
     * @param dkyt
     */
    public void setDkyt(String dkyt) {
        this.dkyt = dkyt;
    }

    /**
     * @return tdcrnx
     */
    public Integer getTdcrnx() {
        return tdcrnx;
    }

    /**
     * @param tdcrnx
     */
    public void setTdcrnx(Integer tdcrnx) {
        this.tdcrnx = tdcrnx;
    }

    /**
     * @return tdcrmj
     */
    public BigDecimal getTdcrmj() {
        return tdcrmj;
    }

    /**
     * @param tdcrmj
     */
    public void setTdcrmj(BigDecimal tdcrmj) {
        this.tdcrmj = tdcrmj;
    }

    /**
     * @return tdrjl
     */
    public BigDecimal getTdrjl() {
        return tdrjl;
    }

    /**
     * @param tdrjl
     */
    public void setTdrjl(BigDecimal tdrjl) {
        this.tdrjl = tdrjl;
    }

    /**
     * @return tdlhl
     */
    public BigDecimal getTdlhl() {
        return tdlhl;
    }

    /**
     * @param tdlhl
     */
    public void setTdlhl(BigDecimal tdlhl) {
        this.tdlhl = tdlhl;
    }

    /**
     * @return hxbl
     */
    public String getHxbl() {
        return hxbl;
    }

    /**
     * @param hxbl
     */
    public void setHxbl(String hxbl) {
        this.hxbl = hxbl;
    }

    /**
     * @return jzwxz
     */
    public String getJzwxz() {
        return jzwxz;
    }

    /**
     * @param jzwxz
     */
    public void setJzwxz(String jzwxz) {
        this.jzwxz = jzwxz;
    }

    /**
     * @return tdhbyt
     */
    public String getTdhbyt() {
        return tdhbyt;
    }

    /**
     * @param tdhbyt
     */
    public void setTdhbyt(String tdhbyt) {
        this.tdhbyt = tdhbyt;
    }

    /**
     * @return tdsycylb
     */
    public String getTdsycylb() {
        return tdsycylb;
    }

    /**
     * @param tdsycylb
     */
    public void setTdsycylb(String tdsycylb) {
        this.tdsycylb = tdsycylb;
    }

    /**
     * @return tdcrhtbh
     */
    public String getTdcrhtbh() {
        return tdcrhtbh;
    }

    /**
     * @param tdcrhtbh
     */
    public void setTdcrhtbh(String tdcrhtbh) {
        this.tdcrhtbh = tdcrhtbh;
    }

    /**
     * @return tdcrhtlx
     */
    public String getTdcrhtlx() {
        return tdcrhtlx;
    }

    /**
     * @param tdcrhtlx
     */
    public void setTdcrhtlx(String tdcrhtlx) {
        this.tdcrhtlx = tdcrhtlx;
    }

    /**
     * @return tdcrhtqdrq
     */
    public Date getTdcrhtqdrq() {
        return tdcrhtqdrq;
    }

    /**
     * @param tdcrhtqdrq
     */
    public void setTdcrhtqdrq(Date tdcrhtqdrq) {
        this.tdcrhtqdrq = tdcrhtqdrq;
    }

    /**
     * @return tdjdsj
     */
    public Date getTdjdsj() {
        return tdjdsj;
    }

    /**
     * @param tdjdsj
     */
    public void setTdjdsj(Date tdjdsj) {
        this.tdjdsj = tdjdsj;
    }

    /**
     * @return tdsrydkgsj
     */
    public Date getTdsrydkgsj() {
        return tdsrydkgsj;
    }

    /**
     * @param tdsrydkgsj
     */
    public void setTdsrydkgsj(Date tdsrydkgsj) {
        this.tdsrydkgsj = tdsrydkgsj;
    }

    /**
     * @return tdsrydjgsj
     */
    public Date getTdsrydjgsj() {
        return tdsrydjgsj;
    }

    /**
     * @param tdsrydjgsj
     */
    public void setTdsrydjgsj(Date tdsrydjgsj) {
        this.tdsrydjgsj = tdsrydjgsj;
    }

    /**
     * @return tdsrhtzje
     */
    public BigDecimal getTdsrhtzje() {
        return tdsrhtzje;
    }

    /**
     * @param tdsrhtzje
     */
    public void setTdsrhtzje(BigDecimal tdsrhtzje) {
        this.tdsrhtzje = tdsrhtzje;
    }

    /**
     * @return tddyzbh
     */
    public String getTddyzbh() {
        return tddyzbh;
    }

    /**
     * @param tddyzbh
     */
    public void setTddyzbh(String tddyzbh) {
        this.tddyzbh = tddyzbh;
    }

    /**
     * @return dyrbs
     */
    public String getDyrbs() {
        return dyrbs;
    }

    /**
     * @param dyrbs
     */
    public void setDyrbs(String dyrbs) {
        this.dyrbs = dyrbs;
    }

    /**
     * @return dyqrbs
     */
    public String getDyqrbs() {
        return dyqrbs;
    }

    /**
     * @param dyqrbs
     */
    public void setDyqrbs(String dyqrbs) {
        this.dyqrbs = dyqrbs;
    }

    /**
     * @return dydjrq
     */
    public Date getDydjrq() {
        return dydjrq;
    }

    /**
     * @param dydjrq
     */
    public void setDydjrq(Date dydjrq) {
        this.dydjrq = dydjrq;
    }

    /**
     * @return dyqxz
     */
    public Date getDyqxz() {
        return dyqxz;
    }

    /**
     * @param dyqxz
     */
    public void setDyqxz(Date dyqxz) {
        this.dyqxz = dyqxz;
    }

    /**
     * @return dyqxzh
     */
    public Date getDyqxzh() {
        return dyqxzh;
    }

    /**
     * @param dyqxzh
     */
    public void setDyqxzh(Date dyqxzh) {
        this.dyqxzh = dyqxzh;
    }

    /**
     * @return dyje
     */
    public BigDecimal getDyje() {
        return dyje;
    }

    /**
     * @param dyje
     */
    public void setDyje(BigDecimal dyje) {
        this.dyje = dyje;
    }

    /**
     * @return tdjg
     */
    public BigDecimal getTdjg() {
        return tdjg;
    }

    /**
     * @param tdjg
     */
    public void setTdjg(BigDecimal tdjg) {
        this.tdjg = tdjg;
    }

    /**
     * @return dysx
     */
    public String getDysx() {
        return dysx;
    }

    /**
     * @param dysx
     */
    public void setDysx(String dysx) {
        this.dysx = dysx;
    }

    /**
     * @return cfwh
     */
    public String getCfwh() {
        return cfwh;
    }

    /**
     * @param cfwh
     */
    public void setCfwh(String cfwh) {
        this.cfwh = cfwh;
    }

    /**
     * @return cffymc
     */
    public String getCffymc() {
        return cffymc;
    }

    /**
     * @param cffymc
     */
    public void setCffymc(String cffymc) {
        this.cffymc = cffymc;
    }

    /**
     * @return cfqxz
     */
    public Date getCfqxz() {
        return cfqxz;
    }

    /**
     * @param cfqxz
     */
    public void setCfqxz(Date cfqxz) {
        this.cfqxz = cfqxz;
    }

    /**
     * @return cfqxzh
     */
    public Date getCfqxzh() {
        return cfqxzh;
    }

    /**
     * @param cfqxzh
     */
    public void setCfqxzh(Date cfqxzh) {
        this.cfqxzh = cfqxzh;
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