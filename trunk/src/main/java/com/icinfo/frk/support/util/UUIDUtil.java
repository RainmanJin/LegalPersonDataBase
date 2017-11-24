package com.icinfo.frk.support.util;

import java.util.UUID;

public class UUIDUtil {
	
	/**
	 * 获取uuid
	 * 
	 * @author zhuyong
	 * @return
	 */
	public static String getUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}
}
