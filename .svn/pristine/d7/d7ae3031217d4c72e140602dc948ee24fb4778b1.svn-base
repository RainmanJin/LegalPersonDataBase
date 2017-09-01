package com.icinfo.frk.common.utils;

import java.util.Date;

import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
* @author hzboom-sw
* @date 2017年8月31日
* 类说明
*/
public class DateConverter extends DateTimeConverter {
	
  public DateConverter() {  
    }  
  
    public DateConverter(Object defaultValue) {  
        super(defaultValue);  
    }  

	@Override
	protected Class getDefaultType() {
		// TODO Auto-generated method stub
		return Date.class;
	}
	 @SuppressWarnings("rawtypes")  
	 @Override  
    protected Object convertToType(Class arg0, Object arg1) throws Exception {  
        if (arg1 == null) {  
            return null;  
        }  
        String value = arg1.toString().trim();  
        if (value.length() == 0) {  
            return null;  
        }  
        return super.convertToType(arg0, arg1);  
    }  

}
