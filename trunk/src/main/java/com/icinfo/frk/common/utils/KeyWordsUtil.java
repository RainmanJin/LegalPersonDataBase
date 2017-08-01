package com.icinfo.frk.common.utils;

import java.util.HashMap;
import java.util.Map;

public class KeyWordsUtil {

	
	public static Map<String,String> toSplit(String str){
		HashMap<String, String> map = new HashMap<String,String>();
		if (null == str || "".equals(str))
			return map;
		if(str.contains("+")){
			String[] dataStr = str.split("\\+");
			for(String string : dataStr){
				if(string.length()>0 && string.length()<10){
					map.put("name", string);
				}
				if(string.length()>10 && string.length()<20){
					map.put("cerNo", string);
				}
			}
		}
		if(str.length()>0 && str.length()<10){
			map.put("name", str);
		}
		if(str.length()>10 && str.length()<20){
			map.put("cerNo", str);
		}
		return map;
	}
	
	public static void main(String[] args) {
		//String str = "胡建平";
		//String str ="321023198904143036";
		String str = "胡建平+321023198904143036";
		Map<String, String> split = toSplit(str);
		System.out.println("name=="+split.get("name")+";");
		System.out.println("cerNo=="+split.get("cerNo")+"====");
		
		
			
	}
}
