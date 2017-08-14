/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2017
 */

package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Table(name = "frk.cf_sb_cdhbxx_valid")
public class CfSbCdhbxxValid implements java.io.Serializable {

  private static final long serialVersionUID = 5454155825314635342L;


  //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
  //columns START
  @Length(max = 100)
  private java.lang.String id;
  @Length(max = 100)
  private java.lang.String hashUnique;
  @Length(max = 50)
  private java.lang.String frwybs;
  @Length(max = 50)
  private java.lang.String tbdh;
  @Length(max = 30)
  private java.lang.String dmHbyc;
  @Length(max = 50)
  private java.lang.String hbcm;
  @Length(max = 50)
  private java.lang.String hbch;
  @Length(max = 50)
  private java.lang.String bdh;
  @Length(max = 50)
  private java.lang.String dmCdhbbxcp;
  @Length(max = 50)
  private java.lang.String dmCbjg;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date bxqq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date bxzq;
  @Length(max = 50)
  private java.lang.String bbr;
  @Length(max = 50)
  private java.lang.String syr;

  private java.lang.Integer xbbz;

  private java.lang.Integer xubbz;
  @Length(max = 50)
  private java.lang.String ybdhpzh;

  private Long hl;

  private java.lang.Integer dqflfs;

  private Long dqflxs;

  private java.lang.Integer bfbz;

  private Long bfhj;

  private java.lang.Integer bebz;

  private Long behj;

  private Long fl;

  private Long pcxehj;

  private Long sxfbl;

  private Long ydtfbl;

  private Long wpyhbl;

  private Long wpyhje;

  private java.lang.Integer zyjjfs;
  @Length(max = 50)
  private java.lang.String zcjg;

  private java.lang.Integer fqfkbz;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date sqjfjzrq;

  private java.lang.Integer frywbz;

  private java.lang.Integer lfbz;

  private java.lang.Integer sbbz;

  private java.lang.Integer gbbz;

  private Long zlbl;

  private Long zlbe;

  private Long zlbf;

  private Long fbsxf;

  private java.lang.Integer pgcs;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date xcpghbrq;

  private java.lang.Integer pglx;

  private java.lang.Integer hbbz;
  @Length(max = 50)
  private java.lang.String dmHbr;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date hbrq;
  @Length(max = 50)
  private java.lang.String hbjg;

  private java.lang.Integer tbrlx;

  private java.lang.Integer jmbz;

  private java.lang.Integer tbrs;
  @Length(max = 50)
  private java.lang.String dqdm;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date tbrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date qdrq;
  @Length(max = 50)
  private java.lang.String dlr;
  @Length(max = 50)
  private java.lang.String dlxyh;
  @Length(max = 50)
  private java.lang.String sfgx;
  @Length(max = 10)
  private java.lang.String yzbm;
  @Length(max = 10)
  private java.lang.String zxtk;
  @Length(max = 2)
  private java.lang.String fxdj;

  private Long cbzle;

  private java.lang.Integer zbhbbz;

  private java.lang.Integer gzzetbfs;
  @Length(max = 100)
  private java.lang.String cchbdz;
  @Length(max = 20)
  private java.lang.String cchbjzny;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date tjhbsj;
  @Length(max = 2)
  private java.lang.String dqhbjb;
  @Length(max = 2)
  private java.lang.String zzhbjb;

  private Long zxbe;

  private Long yjbfwyh;

  private java.lang.Integer hbbzpd;
  @Length(max = 50)
  private java.lang.String ldjg;

  private java.lang.Integer cxbdzt;

  private java.lang.Integer bdhybfsfqf;

  private java.lang.Integer sfbs;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date sfrq;

  private java.lang.Integer wlpyhns;

  private java.lang.Integer sffsjsy;

  private java.lang.Integer sfycxff;

  private java.lang.Integer dwcbhysx;

  private java.lang.Integer scyzhyzyqy;

  private java.lang.Integer bdqywzcbz;

  private Long ycxbfssjdmpl;

  private Long ycxzecbxdmpl;

  private Long ceyhbl;

  private Long ceyhbf;

  private Long ychbqsxbf;

  private Long yjbf;

  private Long sjbf;

  private Long zybt;

  private java.lang.Integer zysfxfbt;
  @Length(max = 50)
  private java.lang.String zyph;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date zybkrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date zyfbrq;

  private Long sbt;

  private java.lang.Integer ssfxfbt;
  @Length(max = 50)
  private java.lang.String sph;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date sbkrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date sfbrq;

  private Long shbt;

  private java.lang.Integer shsfxfbt;

  private java.lang.Integer shph;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date shbkrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date shfbrq;

  private Long xbt;

  private java.lang.Integer xsfxfbt;
  @Length(max = 50)
  private java.lang.String xph;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date xbkrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date xfbrq;

  private Long xzbt;

  private java.lang.Integer xzsfxfbt;
  @Length(max = 50)
  private java.lang.String xzph;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date xzbkrq;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date xzfbrq;

  private Long gzzxbfhscbf;

  private Long gzzxbfhscbfbhz;
  @Length(max = 100)
  private java.lang.String datasrdep;
  @Length(max = 100)
  private java.lang.String datasource;
  @Length(max = 100)
  private java.lang.String datakeycontent;
  @Length(max = 100)
  private java.lang.String createtime;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private java.util.Date updatetime;
  private String frmc;

  /**
   * @return frmc
   */
  public String getFrmc() {
    return frmc;
  }

  /**
   * @param frmc
   */
  public void setFrmc(String frmc) {
    this.frmc = frmc;
  }
  //columns END

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String value) {
    this.id = value;
  }

  public java.lang.String getHashUnique() {
    return this.hashUnique;
  }

  public void setHashUnique(java.lang.String value) {
    this.hashUnique = value;
  }

  public java.lang.String getFrwybs() {
    return this.frwybs;
  }

  public void setFrwybs(java.lang.String value) {
    this.frwybs = value;
  }

  public java.lang.String getTbdh() {
    return this.tbdh;
  }

  public void setTbdh(java.lang.String value) {
    this.tbdh = value;
  }

  public java.lang.String getDmHbyc() {
    return this.dmHbyc;
  }

  public void setDmHbyc(java.lang.String value) {
    this.dmHbyc = value;
  }

  public java.lang.String getHbcm() {
    return this.hbcm;
  }

  public void setHbcm(java.lang.String value) {
    this.hbcm = value;
  }

  public java.lang.String getHbch() {
    return this.hbch;
  }

  public void setHbch(java.lang.String value) {
    this.hbch = value;
  }

  public java.lang.String getBdh() {
    return this.bdh;
  }

  public void setBdh(java.lang.String value) {
    this.bdh = value;
  }

  public java.lang.String getDmCdhbbxcp() {
    return this.dmCdhbbxcp;
  }

  public void setDmCdhbbxcp(java.lang.String value) {
    this.dmCdhbbxcp = value;
  }

  public java.lang.String getDmCbjg() {
    return this.dmCbjg;
  }

  public void setDmCbjg(java.lang.String value) {
    this.dmCbjg = value;
  }

  public java.util.Date getBxqq() {
    return this.bxqq;
  }

  public void setBxqq(java.util.Date value) {
    this.bxqq = value;
  }

  public java.util.Date getBxzq() {
    return this.bxzq;
  }

  public void setBxzq(java.util.Date value) {
    this.bxzq = value;
  }

  public java.lang.String getBbr() {
    return this.bbr;
  }

  public void setBbr(java.lang.String value) {
    this.bbr = value;
  }

  public java.lang.String getSyr() {
    return this.syr;
  }

  public void setSyr(java.lang.String value) {
    this.syr = value;
  }

  public java.lang.Integer getXbbz() {
    return this.xbbz;
  }

  public void setXbbz(java.lang.Integer value) {
    this.xbbz = value;
  }

  public java.lang.Integer getXubbz() {
    return this.xubbz;
  }

  public void setXubbz(java.lang.Integer value) {
    this.xubbz = value;
  }

  public java.lang.String getYbdhpzh() {
    return this.ybdhpzh;
  }

  public void setYbdhpzh(java.lang.String value) {
    this.ybdhpzh = value;
  }

  public Long getHl() {
    return this.hl;
  }

  public void setHl(Long value) {
    this.hl = value;
  }

  public java.lang.Integer getDqflfs() {
    return this.dqflfs;
  }

  public void setDqflfs(java.lang.Integer value) {
    this.dqflfs = value;
  }

  public Long getDqflxs() {
    return this.dqflxs;
  }

  public void setDqflxs(Long value) {
    this.dqflxs = value;
  }

  public java.lang.Integer getBfbz() {
    return this.bfbz;
  }

  public void setBfbz(java.lang.Integer value) {
    this.bfbz = value;
  }

  public Long getBfhj() {
    return this.bfhj;
  }

  public void setBfhj(Long value) {
    this.bfhj = value;
  }

  public java.lang.Integer getBebz() {
    return this.bebz;
  }

  public void setBebz(java.lang.Integer value) {
    this.bebz = value;
  }

  public Long getBehj() {
    return this.behj;
  }

  public void setBehj(Long value) {
    this.behj = value;
  }

  public Long getFl() {
    return this.fl;
  }

  public void setFl(Long value) {
    this.fl = value;
  }

  public Long getPcxehj() {
    return this.pcxehj;
  }

  public void setPcxehj(Long value) {
    this.pcxehj = value;
  }

  public Long getSxfbl() {
    return this.sxfbl;
  }

  public void setSxfbl(Long value) {
    this.sxfbl = value;
  }

  public Long getYdtfbl() {
    return this.ydtfbl;
  }

  public void setYdtfbl(Long value) {
    this.ydtfbl = value;
  }

  public Long getWpyhbl() {
    return this.wpyhbl;
  }

  public void setWpyhbl(Long value) {
    this.wpyhbl = value;
  }

  public Long getWpyhje() {
    return this.wpyhje;
  }

  public void setWpyhje(Long value) {
    this.wpyhje = value;
  }

  public java.lang.Integer getZyjjfs() {
    return this.zyjjfs;
  }

  public void setZyjjfs(java.lang.Integer value) {
    this.zyjjfs = value;
  }

  public java.lang.String getZcjg() {
    return this.zcjg;
  }

  public void setZcjg(java.lang.String value) {
    this.zcjg = value;
  }

  public java.lang.Integer getFqfkbz() {
    return this.fqfkbz;
  }

  public void setFqfkbz(java.lang.Integer value) {
    this.fqfkbz = value;
  }

  public java.util.Date getSqjfjzrq() {
    return this.sqjfjzrq;
  }

  public void setSqjfjzrq(java.util.Date value) {
    this.sqjfjzrq = value;
  }

  public java.lang.Integer getFrywbz() {
    return this.frywbz;
  }

  public void setFrywbz(java.lang.Integer value) {
    this.frywbz = value;
  }

  public java.lang.Integer getLfbz() {
    return this.lfbz;
  }

  public void setLfbz(java.lang.Integer value) {
    this.lfbz = value;
  }

  public java.lang.Integer getSbbz() {
    return this.sbbz;
  }

  public void setSbbz(java.lang.Integer value) {
    this.sbbz = value;
  }

  public java.lang.Integer getGbbz() {
    return this.gbbz;
  }

  public void setGbbz(java.lang.Integer value) {
    this.gbbz = value;
  }

  public Long getZlbl() {
    return this.zlbl;
  }

  public void setZlbl(Long value) {
    this.zlbl = value;
  }

  public Long getZlbe() {
    return this.zlbe;
  }

  public void setZlbe(Long value) {
    this.zlbe = value;
  }

  public Long getZlbf() {
    return this.zlbf;
  }

  public void setZlbf(Long value) {
    this.zlbf = value;
  }

  public Long getFbsxf() {
    return this.fbsxf;
  }

  public void setFbsxf(Long value) {
    this.fbsxf = value;
  }

  public java.lang.Integer getPgcs() {
    return this.pgcs;
  }

  public void setPgcs(java.lang.Integer value) {
    this.pgcs = value;
  }

  public java.util.Date getXcpghbrq() {
    return this.xcpghbrq;
  }

  public void setXcpghbrq(java.util.Date value) {
    this.xcpghbrq = value;
  }

  public java.lang.Integer getPglx() {
    return this.pglx;
  }

  public void setPglx(java.lang.Integer value) {
    this.pglx = value;
  }

  public java.lang.Integer getHbbz() {
    return this.hbbz;
  }

  public void setHbbz(java.lang.Integer value) {
    this.hbbz = value;
  }

  public java.lang.String getDmHbr() {
    return this.dmHbr;
  }

  public void setDmHbr(java.lang.String value) {
    this.dmHbr = value;
  }

  public java.util.Date getHbrq() {
    return this.hbrq;
  }

  public void setHbrq(java.util.Date value) {
    this.hbrq = value;
  }

  public java.lang.String getHbjg() {
    return this.hbjg;
  }

  public void setHbjg(java.lang.String value) {
    this.hbjg = value;
  }

  public java.lang.Integer getTbrlx() {
    return this.tbrlx;
  }

  public void setTbrlx(java.lang.Integer value) {
    this.tbrlx = value;
  }

  public java.lang.Integer getJmbz() {
    return this.jmbz;
  }

  public void setJmbz(java.lang.Integer value) {
    this.jmbz = value;
  }

  public java.lang.Integer getTbrs() {
    return this.tbrs;
  }

  public void setTbrs(java.lang.Integer value) {
    this.tbrs = value;
  }

  public java.lang.String getDqdm() {
    return this.dqdm;
  }

  public void setDqdm(java.lang.String value) {
    this.dqdm = value;
  }

  public java.util.Date getTbrq() {
    return this.tbrq;
  }

  public void setTbrq(java.util.Date value) {
    this.tbrq = value;
  }

  public java.util.Date getQdrq() {
    return this.qdrq;
  }

  public void setQdrq(java.util.Date value) {
    this.qdrq = value;
  }

  public java.lang.String getDlr() {
    return this.dlr;
  }

  public void setDlr(java.lang.String value) {
    this.dlr = value;
  }

  public java.lang.String getDlxyh() {
    return this.dlxyh;
  }

  public void setDlxyh(java.lang.String value) {
    this.dlxyh = value;
  }

  public java.lang.String getSfgx() {
    return this.sfgx;
  }

  public void setSfgx(java.lang.String value) {
    this.sfgx = value;
  }

  public java.lang.String getYzbm() {
    return this.yzbm;
  }

  public void setYzbm(java.lang.String value) {
    this.yzbm = value;
  }

  public java.lang.String getZxtk() {
    return this.zxtk;
  }

  public void setZxtk(java.lang.String value) {
    this.zxtk = value;
  }

  public java.lang.String getFxdj() {
    return this.fxdj;
  }

  public void setFxdj(java.lang.String value) {
    this.fxdj = value;
  }

  public Long getCbzle() {
    return this.cbzle;
  }

  public void setCbzle(Long value) {
    this.cbzle = value;
  }

  public java.lang.Integer getZbhbbz() {
    return this.zbhbbz;
  }

  public void setZbhbbz(java.lang.Integer value) {
    this.zbhbbz = value;
  }

  public java.lang.Integer getGzzetbfs() {
    return this.gzzetbfs;
  }

  public void setGzzetbfs(java.lang.Integer value) {
    this.gzzetbfs = value;
  }

  public java.lang.String getCchbdz() {
    return this.cchbdz;
  }

  public void setCchbdz(java.lang.String value) {
    this.cchbdz = value;
  }

  public java.lang.String getCchbjzny() {
    return this.cchbjzny;
  }

  public void setCchbjzny(java.lang.String value) {
    this.cchbjzny = value;
  }

  public java.util.Date getTjhbsj() {
    return this.tjhbsj;
  }

  public void setTjhbsj(java.util.Date value) {
    this.tjhbsj = value;
  }

  public java.lang.String getDqhbjb() {
    return this.dqhbjb;
  }

  public void setDqhbjb(java.lang.String value) {
    this.dqhbjb = value;
  }

  public java.lang.String getZzhbjb() {
    return this.zzhbjb;
  }

  public void setZzhbjb(java.lang.String value) {
    this.zzhbjb = value;
  }

  public Long getZxbe() {
    return this.zxbe;
  }

  public void setZxbe(Long value) {
    this.zxbe = value;
  }

  public Long getYjbfwyh() {
    return this.yjbfwyh;
  }

  public void setYjbfwyh(Long value) {
    this.yjbfwyh = value;
  }

  public java.lang.Integer getHbbzpd() {
    return this.hbbzpd;
  }

  public void setHbbzpd(java.lang.Integer value) {
    this.hbbzpd = value;
  }

  public java.lang.String getLdjg() {
    return this.ldjg;
  }

  public void setLdjg(java.lang.String value) {
    this.ldjg = value;
  }

  public java.lang.Integer getCxbdzt() {
    return this.cxbdzt;
  }

  public void setCxbdzt(java.lang.Integer value) {
    this.cxbdzt = value;
  }

  public java.lang.Integer getBdhybfsfqf() {
    return this.bdhybfsfqf;
  }

  public void setBdhybfsfqf(java.lang.Integer value) {
    this.bdhybfsfqf = value;
  }

  public java.lang.Integer getSfbs() {
    return this.sfbs;
  }

  public void setSfbs(java.lang.Integer value) {
    this.sfbs = value;
  }

  public java.util.Date getSfrq() {
    return this.sfrq;
  }

  public void setSfrq(java.util.Date value) {
    this.sfrq = value;
  }

  public java.lang.Integer getWlpyhns() {
    return this.wlpyhns;
  }

  public void setWlpyhns(java.lang.Integer value) {
    this.wlpyhns = value;
  }

  public java.lang.Integer getSffsjsy() {
    return this.sffsjsy;
  }

  public void setSffsjsy(java.lang.Integer value) {
    this.sffsjsy = value;
  }

  public java.lang.Integer getSfycxff() {
    return this.sfycxff;
  }

  public void setSfycxff(java.lang.Integer value) {
    this.sfycxff = value;
  }

  public java.lang.Integer getDwcbhysx() {
    return this.dwcbhysx;
  }

  public void setDwcbhysx(java.lang.Integer value) {
    this.dwcbhysx = value;
  }

  public java.lang.Integer getScyzhyzyqy() {
    return this.scyzhyzyqy;
  }

  public void setScyzhyzyqy(java.lang.Integer value) {
    this.scyzhyzyqy = value;
  }

  public java.lang.Integer getBdqywzcbz() {
    return this.bdqywzcbz;
  }

  public void setBdqywzcbz(java.lang.Integer value) {
    this.bdqywzcbz = value;
  }

  public Long getYcxbfssjdmpl() {
    return this.ycxbfssjdmpl;
  }

  public void setYcxbfssjdmpl(Long value) {
    this.ycxbfssjdmpl = value;
  }

  public Long getYcxzecbxdmpl() {
    return this.ycxzecbxdmpl;
  }

  public void setYcxzecbxdmpl(Long value) {
    this.ycxzecbxdmpl = value;
  }

  public Long getCeyhbl() {
    return this.ceyhbl;
  }

  public void setCeyhbl(Long value) {
    this.ceyhbl = value;
  }

  public Long getCeyhbf() {
    return this.ceyhbf;
  }

  public void setCeyhbf(Long value) {
    this.ceyhbf = value;
  }

  public Long getYchbqsxbf() {
    return this.ychbqsxbf;
  }

  public void setYchbqsxbf(Long value) {
    this.ychbqsxbf = value;
  }

  public Long getYjbf() {
    return this.yjbf;
  }

  public void setYjbf(Long value) {
    this.yjbf = value;
  }

  public Long getSjbf() {
    return this.sjbf;
  }

  public void setSjbf(Long value) {
    this.sjbf = value;
  }

  public Long getZybt() {
    return this.zybt;
  }

  public void setZybt(Long value) {
    this.zybt = value;
  }

  public java.lang.Integer getZysfxfbt() {
    return this.zysfxfbt;
  }

  public void setZysfxfbt(java.lang.Integer value) {
    this.zysfxfbt = value;
  }

  public java.lang.String getZyph() {
    return this.zyph;
  }

  public void setZyph(java.lang.String value) {
    this.zyph = value;
  }

  public java.util.Date getZybkrq() {
    return this.zybkrq;
  }

  public void setZybkrq(java.util.Date value) {
    this.zybkrq = value;
  }

  public java.util.Date getZyfbrq() {
    return this.zyfbrq;
  }

  public void setZyfbrq(java.util.Date value) {
    this.zyfbrq = value;
  }

  public Long getSbt() {
    return this.sbt;
  }

  public void setSbt(Long value) {
    this.sbt = value;
  }

  public java.lang.Integer getSsfxfbt() {
    return this.ssfxfbt;
  }

  public void setSsfxfbt(java.lang.Integer value) {
    this.ssfxfbt = value;
  }

  public java.lang.String getSph() {
    return this.sph;
  }

  public void setSph(java.lang.String value) {
    this.sph = value;
  }

  public java.util.Date getSbkrq() {
    return this.sbkrq;
  }

  public void setSbkrq(java.util.Date value) {
    this.sbkrq = value;
  }

  public java.util.Date getSfbrq() {
    return this.sfbrq;
  }

  public void setSfbrq(java.util.Date value) {
    this.sfbrq = value;
  }

  public Long getShbt() {
    return this.shbt;
  }

  public void setShbt(Long value) {
    this.shbt = value;
  }

  public java.lang.Integer getShsfxfbt() {
    return this.shsfxfbt;
  }

  public void setShsfxfbt(java.lang.Integer value) {
    this.shsfxfbt = value;
  }

  public java.lang.Integer getShph() {
    return this.shph;
  }

  public void setShph(java.lang.Integer value) {
    this.shph = value;
  }

  public java.util.Date getShbkrq() {
    return this.shbkrq;
  }

  public void setShbkrq(java.util.Date value) {
    this.shbkrq = value;
  }

  public java.util.Date getShfbrq() {
    return this.shfbrq;
  }

  public void setShfbrq(java.util.Date value) {
    this.shfbrq = value;
  }

  public Long getXbt() {
    return this.xbt;
  }

  public void setXbt(Long value) {
    this.xbt = value;
  }

  public java.lang.Integer getXsfxfbt() {
    return this.xsfxfbt;
  }

  public void setXsfxfbt(java.lang.Integer value) {
    this.xsfxfbt = value;
  }

  public java.lang.String getXph() {
    return this.xph;
  }

  public void setXph(java.lang.String value) {
    this.xph = value;
  }

  public java.util.Date getXbkrq() {
    return this.xbkrq;
  }

  public void setXbkrq(java.util.Date value) {
    this.xbkrq = value;
  }

  public java.util.Date getXfbrq() {
    return this.xfbrq;
  }

  public void setXfbrq(java.util.Date value) {
    this.xfbrq = value;
  }

  public Long getXzbt() {
    return this.xzbt;
  }

  public void setXzbt(Long value) {
    this.xzbt = value;
  }

  public java.lang.Integer getXzsfxfbt() {
    return this.xzsfxfbt;
  }

  public void setXzsfxfbt(java.lang.Integer value) {
    this.xzsfxfbt = value;
  }

  public java.lang.String getXzph() {
    return this.xzph;
  }

  public void setXzph(java.lang.String value) {
    this.xzph = value;
  }

  public java.util.Date getXzbkrq() {
    return this.xzbkrq;
  }

  public void setXzbkrq(java.util.Date value) {
    this.xzbkrq = value;
  }

  public java.util.Date getXzfbrq() {
    return this.xzfbrq;
  }

  public void setXzfbrq(java.util.Date value) {
    this.xzfbrq = value;
  }

  public Long getGzzxbfhscbf() {
    return this.gzzxbfhscbf;
  }

  public void setGzzxbfhscbf(Long value) {
    this.gzzxbfhscbf = value;
  }

  public Long getGzzxbfhscbfbhz() {
    return this.gzzxbfhscbfbhz;
  }

  public void setGzzxbfhscbfbhz(Long value) {
    this.gzzxbfhscbfbhz = value;
  }

  public java.lang.String getDatasrdep() {
    return this.datasrdep;
  }

  public void setDatasrdep(java.lang.String value) {
    this.datasrdep = value;
  }

  public java.lang.String getDatasource() {
    return this.datasource;
  }

  public void setDatasource(java.lang.String value) {
    this.datasource = value;
  }

  public java.lang.String getDatakeycontent() {
    return this.datakeycontent;
  }

  public void setDatakeycontent(java.lang.String value) {
    this.datakeycontent = value;
  }

  public java.lang.String getCreatetime() {
    return this.createtime;
  }

  public void setCreatetime(java.lang.String value) {
    this.createtime = value;
  }

  public java.util.Date getUpdatetime() {
    return this.updatetime;
  }

  public void setUpdatetime(java.util.Date value) {
    this.updatetime = value;
  }


}

