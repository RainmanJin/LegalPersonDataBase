package com.icinfo.frk.support.util;

import org.apache.commons.lang3.StringUtils;

public class EntNameUtil {
	
	/**
	 * 描述：获取企业名称的短名称
	 *
	 * @author zhuyong
	 * @date 2015-11-20
	 * @param entName
	 * @return
	 * @throws Exception
	 */
	public static String getShortName(String entName) throws Exception{
		if(StringUtils.isBlank(entName)){
			return "";
		}
		if(entName.equals("有限售条件流通股")||entName.equals("无限售条件流通股")){
			return entName;
		}
		entName = entName.replace("浙江", "").
				replace("有限责任公司", "")
				.replace("有限公司", "")
				.replace("公司", "")
				.replace("专业合作社", "")
				.replace("浙江省", "")
				.replace("杭州市", "")
				.replace("宁波市", "")
				.replace("温州市", "")
				.replace("嘉兴市", "")
				.replace("湖州市", "")
				.replace("绍兴市", "")
				.replace("金华市", "")
				.replace("衢州市", "")
				.replace("舟山市", "")
				.replace("台州市", "")
				.replace("丽水市", "")
				.replace("浙江", "")
				.replace("杭州", "")
				.replace("宁波", "")
				.replace("温州", "")
				.replace("嘉兴", "")
				.replace("湖州", "")
				.replace("绍兴", "")
				.replace("金华", "")
				.replace("衢州", "")
				.replace("舟山", "")
				.replace("台州", "")
				.replace("丽水", "")
				.replace("桐庐县", "")
				.replace("淳安县", "")
				.replace("萧山", "")
				.replace("建德县", "")
				.replace("富阳区", "")
				.replace("余杭区", "")
				.replace("临安县", "")
				.replace("西湖区", "")
				.replace("海曙区", "")
				.replace("江北区", "")
				.replace("北仑区", "")
				.replace("镇海区", "")
				.replace("大榭", "")
				.replace("象山县", "")
				.replace("宁海县", "")
				.replace("鄞州区", "")
				.replace("东钱湖旅游度假区", "")
				.replace("余姚市", "")
				.replace("慈溪市", "")
				.replace("奉化市", "")
				.replace("市辖区", "")
				.replace("鹿城区", "")
				.replace("龙湾分局", "")
				.replace("瓯海分局", "")
				.replace("洞头县", "")
				.replace("永嘉县", "")
				.replace("平阳县", "")
				.replace("苍南县", "")
				.replace("文成县", "")
				.replace("泰顺县", "")
				.replace("瑞安市", "")
				.replace("乐清市", "")
				.replace("嘉善县", "")
				.replace("海盐县", "")
				.replace("海宁市", "")
				.replace("平湖市", "")
				.replace("桐乡市", "")
				.replace("吴兴区", "")
				.replace("南浔区", "")
				.replace("菱湖区", "")
				.replace("吴兴区", "")
				.replace("德清县", "")
				.replace("长兴县", "")
				.replace("安吉县", "")
				.replace("越城区", "")
				.replace("柯桥区", "")
				.replace("新昌县", "")
				.replace("诸暨市", "")
				.replace("上虞区", "")
				.replace("嵊州市", "")
				.replace("武义县", "")
				.replace("浦江县", "")
				.replace("磐安县", "")
				.replace("兰溪市", "")
				.replace("义乌市", "")
				.replace("东阳市", "")
				.replace("永康市", "")
				.replace("柯城区", "")
				.replace("衢江区", "")
				.replace("常山县", "")
				.replace("开化县", "")
				.replace("龙游县", "")
				.replace("江山市", "")
				.replace("普陀山", "")
				.replace("普陀", "")
				.replace("定海", "")
				.replace("岱山县", "")
				.replace("嵊泗县", "")
				.replace("椒江区", "")
				.replace("黄岩区", "")
				.replace("路桥区", "")
				.replace("玉环县", "")
				.replace("三门县", "")
				.replace("天台县", "")
				.replace("仙居县", "")
				.replace("温岭市", "")
				.replace("临海市", "")
				.replace("莲都区", "")
				.replace("龙泉市", "")
				.replace("青田县", "")
				.replace("云和县", "")
				.replace("庆元县", "")
				.replace("缙云县", "")
				.replace("遂昌县", "")
				.replace("松阳县", "")
				.replace("景宁畲族自治县", "");

		if(entName.length()>4){
			entName = entName.substring(0,4);
		}
		return entName;

	}
	

}
