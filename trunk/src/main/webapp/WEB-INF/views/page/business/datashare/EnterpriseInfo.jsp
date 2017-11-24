<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<title>企业基本信息接口</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">企业基本信息</span>
			</div>
		</div>
		<div class="tabbale" data-component="tab">
			<div class="tab-header type-tab person-tab">
				<ul class="clearfix" style="background-color: #5191ce;">
					<li class="tab-selected"><span class="tab-item "><a
						style="font-size: 18px;">接口详情</a></span></li>
				</ul>
			</div>
			<div class="tab-content">
				<div class="tab-panel tab-panel-show"
				     style="background-color: #ffffff;">
					<div class="light-info-ffles mt10 center"></div>
					<table class="table-horizontal" cellpadding="0" cellspacing="0"
					       style="font-size: 15px; border-style: none;">
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue" width="15%"
							    style="border-style: none;">接口名称：
							</td>
							<td style="border-style: none;">企业基本信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口说明：
							</td>
							<td style="border-style: none;">企业基本信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口地址：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/enterpriseInfo.htm</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">请求方式：
							</td>
							<td style="border-style: none;">Http Get/Post</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">编码格式：
							</td>
							<td style="border-style: none;">UTF-8（所有参数均使用此格式）</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">响应方式：
							</td>
							<td style="border-style: none;">Json</td>
						</tr>
						<tr>
							<td class="right bg-blue"
							    style="border-style: none;">请求示范：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/enterpriseInfo.htm?appkey=7520d721086111e7985b008cfaeb3d74&sign=124f7efbdab4e18bd2ebd97aeef40fa9&requestTime=1489729457800&uniscId=91330104341916223P&companyName=杭州某某有限公司®isterNo=33010101010&entType=Edata={"appKey":"xxxx","sign":"xxxx","requestTime":"20170725111355","tyxydm":"91330000755918469E","zzjgdm":"xxxx","djzch":"3304811104905"}
							</td>
						</tr>
					</table>
					<div class="light-info mt10 center pos-rel">请求参数说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">字段名称</th>
							<th width="20%">字段编码</th>
							<th>描述</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>统一社会信用代码</td>
							<td>uniscId</td>
							<td>统一社会信用代码</td>
						</tr>
						
						<tr>
							<td>注册号</td>
							<td>registerNo</td>
							<td>注册号</td>
						</tr>
						<tr>
							<td>企业类型</td>
							<td>entType</td>
							<td>企业类型 E企业，P个体</td>
						</tr>
						<tr>
							<td>应用APP_KEY</td>
							<td>appKey</td>
							<td>应用APP_KEY，一个应用对应一个固定不变的字符串</td>
						</tr>
						<tr>
							<td>请求签名</td>
							<td>sign</td>
							<td>请求签名，格式：APP_KEY+请求秘钥+时间戳（以long类型的字符串），经过MD5加密后生成的串(字母小写)</td>
						</tr>
						<tr>
							<td>请求时间</td>
							<td>requestTime</td>
							<td>请求时间，是以long类型的字符串</td>
						</tr>
						</tbody>
					</table>
					<div class="light-info mt10 center pos-rel"
					     tyle="background-color: #ffffff;"></div>
					<table class="table-horizontal" cellpadding="0" cellspacing="0"
					       style="font-size: 15px;">
						<tr>
							<td class="right bg-blue" width="15%"
							">返回示范：</td>
							<td>{ 
    "code": "00", 
    "msg": "成功",  
	"dataCount": 1,
    "datas": [ 
        { 
            "companyName": "企业名称",
            "uniscId"："统一社会信用代码",
            "operatingStatus "："经营状态",
            "legalPerson "："法定代表人",
            "legalPersonPaperType "："法定代表人证件类型",
            "legalPersonPaperNo"："法定代表人证件号码”,
            "shareholderInfo"："股东信息",
            "operatingDateFromTo"："经营起止日期",
            "companyAddr"："住所"，
			"companyType"："企业大类"，
			"tradeCode"：	"行业代码"，
			"registerAmount"："注册资本(资金数额)"，
			"currency"："币种"，
			"opScope"："经营范围"，
			"appDate"："核准日期（登记、吊销、注销日期）"，
			"estDate"："成立日期"，
			"regOrg"："登记机关"，
			"country"："国籍"，
			"positionName"："职务（中文名称）"，
			"formation"："组成形式"
        }, 
    ]
}
							</td>
						</tr>
					</table>
					<div class="light-info mt10 center pos-rel">返回参数说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">字段名称</th>
							<th width="20%">字段编码</th>
							<th>描述</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>企业名称</td>
							<td>companyName</td>
							<td>企业名称</td>
						</tr>
						<tr>
							<td>统一社会信用代码证</td>
							<td>uniscId</td>
							<td>统一社会信用代码证</td>
						</tr>
						<tr>
							<td>经营状态</td>
							<td>operatingStatus</td>
							<td>经营状态</td>
						</tr>
						<tr>
							<td>法定代表人</td>
							<td>legalPerson</td>
							<td>法定代表人</td>
						</tr>
						<tr>
							<td>法人代表证件类型</td>
							<td>legalPersonPaperTyp</td>
							<td>法人代表证件类型</td>
						</tr>
						<tr>
							<td>法人代表证件号码</td>
							<td>legalPersonPaperNo</td>
							<td>法人代表证件号码</td>
						</tr>
						<tr>
							<td>股东信息</td>
							<td>shareholderInfo</td>
							<td>股东信息</td>
						</tr>
						<tr>
							<td>经营起止日期</td>
							<td>operatingDateFromTo</td>
							<td>经营起止日期</td>
						</tr>
						<tr>
							<td>住所</td>
							<td>companyAddr</td>
							<td>住所</td>
						</tr>
						<tr>
							<td>企业大类</td>
							<td>companyType</td>
							<td>企业大类</td>
						</tr>
						</tbody>
					</table>

				</div>
			</div>
		</div>
	</div>
</div>
<script src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
<script src="/js/component/tab.js"></script>
</body>
</html>
