<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<title>企业注（吊）销信息接口</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">企业注（吊）销信息</span>
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
							<td style="border-style: none;">企业注（吊）销信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口说明：
							</td>
							<td style="border-style: none;">企业注（吊）销信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口地址：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/001003050/dataSharing/companyRevokeInfo.htm</td>
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
							<td style="border-style: none;">http://59.202.58.68/gateway/api/001003050/dataSharing/companyRevokeInfo.htm?requestTime=1499170561939&NSRMC=衢州市鲁宾方进出口有限公司&sign=2d9e65f46ce07dfd7404236c8ff15912&appKey=ada72850-2b2e-11e7-985b-008cfaeb3d74
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
							<td>纳税人名称</td>
							<td>NSRMC</td>
							<td>纳税人名称</td>
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
	"code":"00",
	"msg":"成功",
	"datas":[
		{
			"nSRSBH":"91330802MA28F6065K",
			"sHXYDM":"91330802MA28F6065K",
			"zXRQ":"20161202",
			"zXYY":"依法解散",
			"nSRMC":"衢州市鲁宾方进出口有限公司",
			"dJXH":"10113308020000002150",
			"tong_time":"2017-04-06 14:51:53.0"
		}
	],
	"dataCount":1
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
							<td>纳税人名称</td>
							<td>NSRMC</td>
							<td>纳税人名称</td>
						</tr>
						<tr>
							<td>注吊销日期</td>
							<td>ZXRQ</td>
							<td>注吊销日期</td>
						</tr>
						<tr>
							<td>注吊销原因</td>
							<td>ZXYY</td>
							<td>注吊销原因</td>
						</tr>
						<tr>
							<td>统一社会信用代码</td>
							<td>SHXYDM</td>
							<td>统一社会信用代码</td>
						</tr>
						<tr>
							<td>国税税务登记证号</td>
							<td>NSRSBH</td>
							<td>国税税务登记证号</td>
						</tr>
						<tr>
							<td>登记序号</td>
							<td>DJXH</td>
							<td>登记序号</td>
						</tr>
						<tr>
							<td>归集时间</td>
							<td>tong_time</td>
							<td>归集时间</td>
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
