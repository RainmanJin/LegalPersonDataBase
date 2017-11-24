<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
	<title>股东（或发起人）或投资人信息(自然人)信息接口</title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">股东（或发起人）或投资人信息(自然人)信息</span>
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
							<td style="border-style: none;">股东（或发起人）或投资人信息(自然人)信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口说明：
							</td>
							<td style="border-style: none;">股东（或发起人）或投资人信息(自然人)信息</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口地址：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/naturalInfo.htm</td>
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
							<td style="border-style: none;">http://59.202.58.68/gateway/api/naturalInfo.htm?appkey=7520d721086111e7985b008cfaeb3d74&sign=124f7efbdab4e18bd2ebd97aeef40fa9&requestTime=1489729457800&cardId=330921196609224026
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
							<td>身份证件号码</td>
							<td>cardId</td>
							<td>身份证件号码</td>
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
            "invid": "3301039941914513126160113301",
            "pripid": "33010399419145136160113301",
            "subconprop": "20.0000",
            "cerno": "330103790206045",
            "certype": "1",
            "lisubconam": "10.000000",
            "country": ““
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
							<td>身份证件号码</td>
							<td>CERNO</td>
							<td>身份证件号码</td>
						</tr>
						<tr>
							<td>身份证件名称</td>
							<td>CERTYPE</td>
							<td>身份证件名称</td>
						</tr>
						<tr>
							<td>投资人身份标识(主键）</td>
							<td>INVID</td>
							<td>投资人身份标识(主键）</td>
						</tr>
						<tr>
							<td>认缴出资额</td>
							<td>LISUBCONAM</td>
							<td>认缴出资额</td>
						</tr>
						<tr>
							<td>内部序号</td>
							<td>PRIPID</td>
							<td>内部序号</td>
						</tr>
						<tr>
							<td>认缴出资比例</td>
							<td>SUBCONPROP</td>
							<td>认缴出资比例</td>
						</tr>
						<tr>
							<td>国别(地区)</td>
							<td>COUNTRY</td>
							<td>国别(地区)</td>
						</tr>
						<tr>
							<td>数据归集日期</td>
							<td>tong_time</td>
							<td>数据归集日期</td>
						</tr>
						<tr>
							<td>企业名称</td>
							<td>ENTNAME</td>
							<td>企业名称</td>
						</tr>
						<tr>
							<td>统一社会信用代码</td>
							<td>UNISCID</td>
							<td>统一社会信用代码</td>
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
