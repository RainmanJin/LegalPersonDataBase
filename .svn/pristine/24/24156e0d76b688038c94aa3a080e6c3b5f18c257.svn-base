<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<title>股权出质信息接口</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">股权出质信息</span>
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
							<td style="border-style: none;">股权出质信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口说明：
							</td>
							<td style="border-style: none;">股权出质信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口地址：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/pledgedEquityInfo.htm</td>
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
							<td style="border-style: none;">http://59.202.58.68/gateway/api/pledgedEquityInfo.htm?requestTime=1494486101282&cardId=110000013910002&sign=059a4ed7a1b31acbdf585391d71fb47b&name=民生养老股份有限公司&appKey=7520d721086111e7985b008cfaeb3d74
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
						<tr>
							<td>出质人</td>
							<td>name</td>
							<td>出质人</td>
						</tr>
						
						<tr>
							<td>证件号码</td>
							<td>cardId</td>
							<td>证件号码</td>
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
            "pRIPID": "33020000000778023302",
            "eQUITYNO": "0443",
            "iMPAM": "17000.000000",
            "iMPORG": "中国民生银行股份有限公司宁波分行",
            "pLEDGOR": "民生养老股份有限公司",
            "iMPORGBLICNO": "330214000007472",
            "pLEDBLICNO": "110000013910002",
            "tYPE": "K",
            "iMPORGID": "330200000007780213302",
            "eQUPLEDATE": "2014-07-09"
        }
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
							<td>股权所在公司主体身份代码</td>
							<td>PRIPID</td>
							<td>股权所在公司主体身份代码</td>
						</tr>
						<tr>
							<td>股权出质信息ID</td>
							<td>IMPORGID</td>
							<td>股权出质信息ID</td>
						</tr>
						<tr>
							<td>登记编号</td>
							<td>EQUITYNO</td>
							<td>登记编号</td>
						</tr>
						<tr>
							<td>出质人</td>
							<td>PLEDGOR</td>
							<td>出质人</td>
						</tr>
						<tr>
							<td>证件号码</td>
							<td>PLEDBLICNO</td>
							<td>证件号码</td>
						</tr>
						<tr>
							<td>出质股权数额</td>
							<td>IMPAM</td>
							<td>出质股权数额</td>
						</tr>
						<tr>
							<td>质权人</td>
							<td>IMPORG</td>
							<td>质权人</td>
						</tr>
						<tr>
							<td>质权人证件号</td>
							<td>IMPORGBLICNO</td>
							<td>质权人证件号</td>
						</tr>
						<tr>
							<td>股权出质设立登记日期</td>
							<td>EQUPLEDATE</td>
							<td>股权出质设立登记日期</td>
						</tr>
						<tr>
							<td>状态</td>
							<td>TYPE</td>
							<td>状态</td>
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
