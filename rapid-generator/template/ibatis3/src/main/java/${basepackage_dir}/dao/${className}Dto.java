<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.Dto;

<#include "/java_imports.include">

import ${basepackage}.model.${className};


public class ${className}Dto extends ${className}{
	private String enfrwybs;

	public String getEnfrwybs() {
    if(super.getFrwybs()!=null)
      return AESEUtil.encodeCorpid(super.getFrwybs());
    else return null;
  }

  public void setEnfrwybs(String enfrwybs) {
    this.enfrwybs = enfrwybs;
  }
}
