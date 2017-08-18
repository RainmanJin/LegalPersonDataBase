<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao.impl;

<#include "/java_imports.include">

import ${basepackage}.model.${className};
import ${basepackage}.dao.${className}Dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Repository
public class ${className}DaoImpl implements ${className}Dao{

	private static final Logger logger = LoggerFactory.getLogger(${className}DaoImpl.class);
	
	/**
     * 数据SQL
     */
    private final String INSERT = "${className}.insert";
    private final String UPDATE = "${className}.update";
    private final String DELETE = "${className}.delete";
    private final String FIND_PAGE_COUNT = "${className}.findPageCount";
    private final String FIND_PAGE = "${className}.findPage";
	private final String FIND_LIST = "${className}.findList";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    public boolean add${className}(${className} ${classNameLower}) {
        return sqlSessionTemplate.insert(INSERT, ${classNameLower})==1?true:false;
    }


    public boolean update${className}(${className} ${classNameLower}) {
        return sqlSessionTemplate.update(UPDATE, ${classNameLower})==1?true:false;
    }


    public boolean delete${className}(String ${classNameLower}Id) {
        return sqlSessionTemplate.delete(DELETE, ${classNameLower}Id)==1?true:false;
    }

  
    public long find${className}CountBy${className}(${className} ${classNameLower}) {
        return (Long)sqlSessionTemplate.selectOne(FIND_PAGE_COUNT, ${classNameLower});
    }
    

    public List<${className}> find${className}ByPage(Map<String,Object> params) {
        return sqlSessionTemplate.selectList(FIND_PAGE, params);
    }

	public List<${className}> find${className}List(Map<String,Object> params) {
        return sqlSessionTemplate.selectList(FIND_LIST, params);
    }

	<#list table.columns as column>
	<#if column.unique >
	public ${className} get${className}By${column.columnName}(${column.javaType} ${column.columnName ? uncap_first}) {
		return (${className})sqlSessionTemplate.selectOne("${className}.get${className}By${column.columnName}",${column.columnName ? uncap_first});
	}	
	
	</#if>
	</#list>

}
