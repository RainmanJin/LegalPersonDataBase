/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.DtBmsjtj;

/**
 * 描述:  dt_bm_sjtj 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年07月12日
 */
public class DtBmsjtjDto extends DtBmsjtj {

  /**
   *
   */
  private static final long serialVersionUID = 1L;
  private String cyl;

  public String getcyl() {
    return cyl;
  }

  public void setCyl(String cyl) {
    this.cyl = cyl;
  }
}