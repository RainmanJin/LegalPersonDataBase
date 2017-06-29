/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.icinfo.framework.mybatis.mapper.annotation.Before;
import com.icinfo.frk.support.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:    dt_frxz_tj 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年05月10日
 */
@Table(name = "frk.dt_frxz_tj")
public class DtFrxzTj implements Serializable {
    @Column(name = "id")
    private Integer id;

    /**
     * 统计日期
     */
    @Column(name = "xztj_rq")
    private Date xztjRq;

    /**
     * 数量
     */
    @Column(name = "xztj_sl")
    private Integer xztjSl;

    /**
     * 生成日期
     */
    @Column(name = "xztj_scrq")
    private Date xztjScrq;

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
     * 获取统计日期
     *
     * @return xztj_rq - 统计日期
     */
    public Date getXztjRq() {
        return xztjRq;
    }
    
    public String getXztjRqForWeek() {
        return DateUtil.getWeekForDate(this.xztjRq);
    }

    /**
     * 设置统计日期
     *
     * @param xztjRq 统计日期
     */
    public void setXztjRq(Date xztjRq) {
        this.xztjRq = xztjRq;
    }

    /**
     * 获取数量
     *
     * @return xztj_sl - 数量
     */
    public Integer getXztjSl() {
        return xztjSl;
    }

    /**
     * 设置数量
     *
     * @param xztjSl 数量
     */
    public void setXztjSl(Integer xztjSl) {
        this.xztjSl = xztjSl;
    }

    /**
     * 获取生成日期
     *
     * @return xztj_scrq - 生成日期
     */
    public Date getXztjScrq() {
        return xztjScrq;
    }

    /**
     * 设置生成日期
     *
     * @param xztjScrq 生成日期
     */
    public void setXztjScrq(Date xztjScrq) {
        this.xztjScrq = xztjScrq;
    }
}