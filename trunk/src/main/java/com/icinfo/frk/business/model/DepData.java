package com.icinfo.frk.business.model;

import java.math.BigDecimal;

/**
 * Created by Guanzhou Song on 2017/6/25.
 */
public class DepData {

  //部门名称
  public String DepName;

  //部门交换数据量
  public BigDecimal ExchangeNum;

  //数据交换匹配度
  public BigDecimal MatchingNum;

  //交换累计条数
  public Integer Sum;


  public BigDecimal getExchangeNum() {
    return ExchangeNum;
  }

  public void setExchangeNum(BigDecimal ExchangeNum) {
    this.ExchangeNum = ExchangeNum;
  }

  public BigDecimal getMatchingNum() {
    return MatchingNum;
  }

  public void setMatchingNum(BigDecimal MatchingNum) {
    this.MatchingNum = MatchingNum;
  }

  public String getDepName() {
    return DepName;
  }

  public void setDepName(String DepName) {
    this.DepName = DepName;
  }

  public Integer getSum() {
    return Sum;
  }

  public void setSum(Integer Sum) {
    this.Sum = Sum;
  }
}
