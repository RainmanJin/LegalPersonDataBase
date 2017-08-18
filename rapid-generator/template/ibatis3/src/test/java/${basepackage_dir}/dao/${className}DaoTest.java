<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

<#include "/java_imports.include">

import ${basepackage}.model.${className};
import ${basepackage}.dao.${className}Dao;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;





@Repository("test${className}Dao")
public class ${className}DaoTest {

    @Autowired
    private ${className}Dao ${classNameLower}Dao;
    
    /**
     * 添加该数据信息
     * @return
     */
    boolean add${className}(){
        Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
		<#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}","${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
       
        //保存每页显示的条数
        params.put("pageSize", 10);
        //保存起始行号
        params.put("startRow", 0);
        List<${className}> list = ${classNameLower}Dao.find${className}ByPage(params);
        if(list!=null&&list.size()!=0){
            ${classNameLower}Dao.delete${className}(list.get(0).get<#list table.columns as column><#if column.pk >${column.columnName}</#if></#list>());
        }
        ${className} ${classNameLower} = new ${className}();
		<#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		${classNameLower}.set${column.columnName}("${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		${classNameLower}.set${column.columnName}(0);
		</#if>
		<#if column.javaType=='java.util.Date'>
		${classNameLower}.set${column.columnName}(new Date());
		</#if>
		</#list>
        return ${classNameLower}Dao.add${className}(${classNameLower});
    }

    /**
     * 修改该数据信息
     * @return
     */
    boolean update${className}(){
        Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
        <#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}", "${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
        //保存每页显示的条数
        params.put("pageSize", 10);
        //保存起始行号
        params.put("startRow", 0);
        List<${className}> list = ${classNameLower}Dao.find${className}ByPage(params);
        if(list!=null&&list.size()!=0){
            ${className} ${classNameLower} = list.get(0);
            return ${classNameLower}Dao.update${className}(${classNameLower});
        }else{
            return false;
        }
    }
    /**
     * 根据id删除该数据信息
     * @return
     */
    boolean delete${className}(){
         Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
        <#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}", "${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
        //保存每页显示的条数
        params.put("pageSize", 10);
        //保存起始行号
        params.put("startRow", 0);
        List<${className}> list = ${classNameLower}Dao.find${className}ByPage(params);
        if(list!=null&&list.size()!=0){
            ${className} ${classNameLower} = list.get(0);
            return ${classNameLower}Dao.delete${className}(${classNameLower}.get<#list table.columns as column><#if column.pk >${column.columnName}</#if></#list>());
        }else{
            return false;
        }
    }

    /**
     * 根据查询条件查询当前数据的总条数
     * @return
     */
    boolean find${className}CountBy${className}(){
        Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
        <#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}", "${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
        long count = ${classNameLower}Dao.find${className}CountBy${className}(null);
        if(count>0){
           return true;
        }else{
            return false;
        }
    }
    
    /**
     * 根据查询条件进行分页查询当前页的数据
     * @return
     */
    boolean find${className}ByPage(){
        Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
        <#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}", "${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
        //保存每页显示的条数
        params.put("pageSize", 10);
        //保存起始行号
        params.put("startRow", 0);
        List<${className}> list = ${classNameLower}Dao.find${className}ByPage(params);
        if(list!=null&&list.size()!=0){
            return true;
        }else{
            return false;
        }
    }
     /**
     * 根据查询条件进行分页查询当前页的数据
     * @return
     */
    boolean find${className}List(){
        Map<String,Object> params = new HashMap<String, Object>();
        //根据实际的业务情况，确定需要保存的参数个数
        <#list table.columns as column>
        <#if column.javaType=='java.lang.String'>
		params.put("${column.columnNameLower}", "${column.columnNameLower}".substring(0,1));
		</#if>
        <#if column.javaType=='Integer'>
		params.put("${column.columnNameLower}", 0);
		</#if>
		</#list>
        List<${className}> list = ${classNameLower}Dao.find${className}List(params);
        if(list!=null&&list.size()!=0){
            return true;
        }else{
            return false;
        }
    }
	
	<#list table.columns as column>
	<#if column.unique >
	boolean get${className}By${column.columnName}() {
		${className} ${classNameLower} = ${classNameLower}Dao.get${className}By${column.columnName}("${column.columnNameLower}".substring(0,1));
		if(${classNameLower} != null){
			return true;
		}else{
			return false;
		}
	}	
	</#if>
	</#list>

    @Test
    public void appTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/portal-beans.xml");
        ${className}DaoTest test = (${className}DaoTest) ctx.getBean("test${className}Dao");
        assertTrue(test.add${className}()&&test.update${className}()&&test.find${className}CountBy${className}()&&test.find${className}ByPage()<#list table.columns as column><#if column.unique >&&test.get${className}By${column.columnName}()</#if></#list>&&test.find${className}List()&&test.delete${className}());
    }
}

