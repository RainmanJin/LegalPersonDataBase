package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.CgGcZytzxmValid;

public class CgGcZytzxmValidDto extends CgGcZytzxmValid {

  private static final long serialVersionUID = 1L;
  //开始时间
  private String startNo;
  //结束时间
  private String endNo;

  public String getStartNo() {
    return startNo;
  }

  public void setStartNo(String startNo) {
    this.startNo = startNo;
  }

  public String getEndNo() {
    return endNo;
  }

  public void setEndNo(String endNo) {
    this.endNo = endNo;
  }

}
