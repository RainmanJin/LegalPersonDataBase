/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

/**
 * 描述: 系统操作日志 sys_log 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月22日
 */
@Table(name = "frk.sys_opt_log")
public class SysLog implements Serializable {
    @Column(name = "UID")
    @Before
    private String UID;

    /**
     * 操作人ID
     */
    @Column(name = "LogUser")
    private String logUser;

    /**
     * 操作类型
     */
    @Column(name = "LogType")
    private String logType;

    /**
     * 操作状态
     */
    @Column(name = "LogStatue")
    private String logStatue;

    /**
     * 备注
     */
    @Column(name = "LogRemark")
    private String logRemark;

    /**
     * 客户端地址
     */
    @Column(name = "LogIp")
    private String logIp;

    /**
     * 操作时间
     */
    @Column(name = "LogTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date logTime;


    private static final long serialVersionUID = 1L;
    
	/**
     * 无参构造器
     * 
     * @author zhuyong
     */
    public SysLog() {
		super();
	}

	/**
     * 含参构造器
     * 
     * @author zhuyong
     * @param logUserID
     * @param logType
     * @param logRemark
     * @param logIp
     */
    public SysLog(String logUser, String logType,  String logRemark, String logIp) {
		super();
		this.UID = UUID.randomUUID().toString().replaceAll("-", "");
		this.logUser = logUser;
		this.logType = logType;
		this.logRemark = logRemark;
		this.logIp = logIp;
		this.logTime = new Date();
	}


    /**
     * @return UID
     */
    public String getUID() {
        return UID;
    }

    /**
     * @param UID
     */
    public void setUID(String UID) {
        this.UID = UID;
    }

    /**
     * 获取操作人ID
     *
     * @return LogUserID - 操作人ID
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * 设置操作人ID
     *
     * @param logUserID 操作人ID
     */
    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }

    /**
     * 获取操作类型
     *
     * @return LogType - 操作类型
     */
    public String getLogType() {
        return logType;
    }

    /**
     * 设置操作类型
     *
     * @param logType 操作类型
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * 获取操作状态
     *
     * @return LogStatue - 操作状态
     */
    public String getLogStatue() {
        return logStatue;
    }

    /**
     * 设置操作状态
     *
     * @param logStatue 操作状态
     */
    public void setLogStatue(String logStatue) {
        this.logStatue = logStatue;
    }

    /**
     * 获取备注
     *
     * @return LogRemark - 备注
     */
    public String getLogRemark() {
        return logRemark;
    }

    /**
     * 设置备注
     *
     * @param logRemark 备注
     */
    public void setLogRemark(String logRemark) {
        this.logRemark = logRemark;
    }

    /**
     * 获取客户端地址
     *
     * @return LogIp - 客户端地址
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     * 设置客户端地址
     *
     * @param logIp 客户端地址
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    /**
     * 获取操作时间
     *
     * @return LogTime - 操作时间
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * 设置操作时间
     *
     * @param logTime 操作时间
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

}