package ${basepackage}.model;

<#include "/macro.include"/>
<#include "/java_imports.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>



/**
 * ${table.remarks}
 * @author Guanzhou Song
 */
(name="frk.")
public class ${className}  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	<#list table.columns as column>
	//${column.remarks}
	private ${column.javaType} ${column.columnNameLower};
	</#list>
	//columns END


<@generateJavaColumns/>

}

<#macro generateJavaColumns>
	<#list table.columns as column>

	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}

	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>
