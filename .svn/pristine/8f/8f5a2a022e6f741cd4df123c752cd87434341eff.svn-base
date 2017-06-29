/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:    类.<br>
 * WARNING：不是表中字段的属性必dt_rwjdxx 对应的实体须加@Transient注解
 * @author framework generator
 * @date 2017年05月11日
 */
@Table(name = "frk.dt_rwjdxx")
public class DtRwjdxx implements Serializable {
    @Id
    @Column(name = "id")
    @Before
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator="select replace(uuid(), '-', '')")
    private Integer id;

    /**
     * 当前任务
     */
    @Column(name = "dqrw")
    private String dqrw;

    /**
     * 任务进度
     */
    @Column(name = "rw_dqjd")
    private String rwDqjd;

    /**
     * 任务总体进度
     */
    @Column(name = "rw_ztjd")
    private String rwZtjd;

    /**
     * 任务预计时间（s）
     */
    @Column(name = "rw_yjsj")
    private Integer rwYjsj;

    /**
     * 当前运行时间
     */
    @Column(name = "rw_dqyxsj")
    private Integer rwDqyxsj;

    /**
     * 下一项任务
     */
    @Column(name = "rw_xxrw")
    private String rwXxrw;

    /**
     * 任务运行日期
     */
    @Column(name = "rw_yxrq")
    private Date rwYxrq;

    /**
     * 任务序号
     */
    @Column(name = "rw_xh")
    private Integer rwXh;
    /**
     * 当前任务集耗时（s）
     */
    @Column(name = "rw_rwjhs")
    private Integer rwRwjhs;

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
     * 获取当前任务
     *
     * @return dqrw - 当前任务
     */
    public String getDqrw() {
        return dqrw;
    }

    /**
     * 设置当前任务
     *
     * @param dqrw 当前任务
     */
    public void setDqrw(String dqrw) {
        this.dqrw = dqrw;
    }

    /**
     * 获取任务进度
     *
     * @return rw_dqjd - 任务进度
     */
    public String getRwDqjd() {
        return rwDqjd;
    }

    /**
     * 设置任务进度
     *
     * @param rwDqjd 任务进度
     */
    public void setRwDqjd(String rwDqjd) {
        this.rwDqjd = rwDqjd;
    }

    /**
     * 获取任务总体进度
     *
     * @return rw_ztjd - 任务总体进度
     */
    public String getRwZtjd() {
        return rwZtjd;
    }

    /**
     * 设置任务总体进度
     *
     * @param rwZtjd 任务总体进度
     */
    public void setRwZtjd(String rwZtjd) {
        this.rwZtjd = rwZtjd;
    }

    /**
     * 获取任务预计时间（s）
     *
     * @return rw_yjsj - 任务预计时间（s）
     */
    public Integer getRwYjsj() {
        return rwYjsj;
    }

    /**
     * 设置任务预计时间（s）
     *
     * @param rwYjsj 任务预计时间（s）
     */
    public void setRwYjsj(Integer rwYjsj) {
        this.rwYjsj = rwYjsj;
    }

    /**
     * 获取当前运行时间
     *
     * @return rw_dqyxsj - 当前运行时间
     */
    public Integer getRwDqyxsj() {
        return rwDqyxsj;
    }

    /**
     * 设置当前运行时间
     *
     * @param rwDqyxsj 当前运行时间
     */
    public void setRwDqyxsj(Integer rwDqyxsj) {
        this.rwDqyxsj = rwDqyxsj;
    }

    /**
     * 获取下一项任务
     *
     * @return rw_xxrw - 下一项任务
     */
    public String getRwXxrw() {
        return rwXxrw;
    }

    /**
     * 设置下一项任务
     *
     * @param rwXxrw 下一项任务
     */
    public void setRwXxrw(String rwXxrw) {
        this.rwXxrw = rwXxrw;
    }

    /**
     * 获取任务运行日期
     *
     * @return rw_yxrq - 任务运行日期
     */
    public Date getRwYxrq() {
        return rwYxrq;
    }

    /**
     * 设置任务运行日期
     *
     * @param rwYxrq 任务运行日期
     */
    public void setRwYxrq(Date rwYxrq) {
        this.rwYxrq = rwYxrq;
    }

    /**
     * 获取任务序号
     *
     * @return rw_xh - 任务序号
     */
    public Integer getRwXh() {
        return rwXh;
    }

    /**
     * 设置任务序号
     *
     * @param rwXh 任务序号
     */
    public void setRwXh(Integer rwXh) {
        this.rwXh = rwXh;
    }

	public Integer getRwRwjhs() {
		return rwRwjhs;
	}

	public void setRwRwjhs(Integer rwRwjhs) {
		this.rwRwjhs = rwRwjhs;
	}
    
    
}