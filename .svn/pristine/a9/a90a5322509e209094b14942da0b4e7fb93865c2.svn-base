package com.icinfo.frk.common.utils;

import org.apache.commons.lang3.StringUtils;

public class DataConcealUtil {

	public static int SIZE = 5;
	public static String SYMBOL = "*";
	public static String toConcealA(String str){
		if (null == str || "".equals(str))
			return str;
		int l = str.length();
		StringBuffer sb = new StringBuffer(l);
		if(l>=10){
			sb.append(str.substring(0, l-8));
			for(int i =0;i<8;i++){
				sb.append(SYMBOL);
			}
		}
		return sb.toString();
	}
	public static String toConceal(String str) {
		if (null == str || "".equals(str))
			return str;
		int l = str.length();
		int a = l / 2;
		int b = a - 1;
		int c = l % 2;
		StringBuffer sb = new StringBuffer(l);
		if (l <= 2) {
			if (c == 1)
				return SYMBOL;
			sb.append(SYMBOL);
			sb.append(str.charAt(l - 1));
		} else {
			if (b <= 0) {
				sb.append(str.substring(0, 1));
				sb.append(SYMBOL);
				sb.append(str.substring(l - 1, l));
			} else if (b >= SIZE / 2 && SIZE + 1 != l) {
				int e = (l - SIZE) / 2;
				sb.append(str.substring(0, e));
				for (int i = 0; i < SIZE; i++)
					sb.append(SYMBOL);
				if ((c == 0 && SIZE % 2 == 0) || (c != 0 && SIZE % 2 != 0))
					sb.append(str.substring(l - e, l));
				else
					sb.append(str.substring(l - (e + 1), l));
			} else {
				int d = l - 2;
				sb.append(str.substring(0, 1));
				for (int i = 0; i < d; i++)
					sb.append(SYMBOL);
				sb.append(str.substring(l - 1, l));
			}
		}
		return sb.toString();
	}
	public static String toConcealX(String str) {
		if (null == str || "".equals(str))
			return str;
		int l = str.length();
		int index =0;
		int index1 =0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		StringBuffer sb = new StringBuffer(l);
		String conceal = "";
		if(str.contains("路")){
			index = StringUtils.indexOf(str,"路");
		}
		if(str.contains("弄")){
			index1 = StringUtils.indexOf(str, "弄");
		}
		if(str.contains("号")){
			index2 = StringUtils.indexOf(str,"号");
		}
		if(str.contains("层")){
			index3 = StringUtils.indexOf(str,"层");
		}
		if(str.contains("室")){
			index4 = StringUtils.indexOf(str, "室");
		}
		if(index != 0 && index2 != 0 || index != 0 && index1 != 0){
			sb.append(str.substring(0, index+1));
			if(index1 != 0){
				for(int i=0;i<(index1-index-1);i++){
					sb.append(SYMBOL);
				}
				sb.append(str.charAt(index1));
			}
			if(index2 != 0){
				if(index1 != 0){
					for(int i=0;i<(index2-index1-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index2));
				}else{
					for(int i=0;i<(index2-index-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index2));
				}
			}
			if(index3 != 0){
				if(index2 !=0){
					for(int i=0;i<(index3-index2-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index3));
				}else if(index2 ==0 && index1 != 0){
					for(int i=0;i<(index3-index1-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index3));
				}else if(index2 ==0 && index1 == 0 && index != 0){
					for(int i=0;i<(index3-index-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index3));
				}
			}
			if(index4 != 0){
				if(index3 != 0){
					for(int i=0;i<(index4-index3-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index4));
				}else if(index3 == 0 &&index2 !=0){
					for(int i=0;i<(index4-index2-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index4));
				}else if(index2 ==0 && index1 != 0){
					for(int i=0;i<(index4-index1-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index4));
				}else if(index2 ==0 && index1 == 0 && index != 0){
					for(int i=0;i<(index4-index-1);i++){
						sb.append(SYMBOL);
					}
					sb.append(str.charAt(index4));
				}
			}
			conceal = sb.toString();
		}else{
			if(l>11){
				int b = 3;
				int a = 0;
				int c = 0;
				while(true){			
					c = SIZE+b;
					if(l>c){
						sb.append(str.substring(a, b));
						for(int i=0;i<SIZE;i++){
							sb.append(SYMBOL);
						}
						a=c;
						b =a+3;						
					}else{
						if(a<l){
							sb.append(str.substring(a, l));
						}
						conceal = sb.toString();
						break;
					}
				}
				
			}else{
				conceal = toConceal(str);
			}
		}
		
		
		
		
		return conceal;
	}

	public static void main(String[] args) {
		//String str = "菊太路1221弄26号1层101室";
		String str ="321023198904143036";
		//String str = "高晓";
		//String str = "11111111111111111111111111111111111";
		//String conceal = toConceal(str);
		//String str = "上海市孙桥镇中科路 111555室事发路口1111";
		String conceal = toConcealA(str);
		System.out.println(conceal);
	}
}
