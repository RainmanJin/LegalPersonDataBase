<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="iframe-wrap bg-white">
	<div class="pd15">
		<div class="reg-caption">
			<div class="title clearfix">
				<span class="name fl mr5">成员单位信息查询</span>
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
							<td style="border-style: none;">成员单位信息查询</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口说明：
							</td>
							<td style="border-style: none;">根据统一社会信用代码或组织机构代码或登记注册号查询成员单位信息，查询参数至少传1个。</td>
						</tr>
						<tr style="border-bottom: solid 1px #ccc;">
							<td class="right bg-blue"
							    style="border-style: none;">接口地址：
							</td>
							<td style="border-style: none;">http://59.202.58.68/gateway/api/getCacycyxx.htm</td>
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
							    style="border-style: none;" width="15%">请求示范：
							</td>
							<td style="border-style: none;">
								data={"appKey":"xxxx","sign":"xxxx","requestTime":"20170725111355","tyxydm":"91330000755918469E","zzjgdm":"xxxx","djzch":"3304811104905"}
							</td>
						</tr>
					</table>
					<div class="light-info mt10 center pos-rel">请求参数说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">字段名</th>
							<th width="20%">含义</th>
							<th>说明</th>
							<th>参数可空</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>appKey</td>
							<td>应用APP_KEY</td>
							<td>一个应用对应一个固定不变的字符串，需要部门申请</td>
							<td>否</td>
						</tr>
						<tr>
							<td>sign</td>
							<td>请求签名</td>
							<td>格式：APP_KEY + 请求秘钥+时间戳 经过MD5加密生成的串</td>
							<td>否</td>
						</tr>
						<tr>
							<td>requestTime</td>
							<td>请求时间</td>
							<td>long类型的字符串</td>
							<td>否</td>
						</tr>
						<tr>
							<td>tyxydm</td>
							<td>统一社会信用代码</td>
							<td>tyxydm、zzjgdm、djzch查询参数至少填其一</td>
							<td>是</td>
						</tr>
						<tr>
							<td>zzjgdm</td>
							<td>组织机构代码</td>
							<td>tyxydm、zzjgdm、djzch查询参数至少填其一</td>
							<td>是</td>
						</tr>
						<tr>
							<td>djzch</td>
							<td>登记注册号</td>
							<td>tyxydm、zzjgdm、djzch查询参数至少填其一</td>
							<td>是</td>
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
							<td>{ "code":"00", "msg":"成功", "description":"xxx", "data"
								: [ { "frwybs" : "91330212780440364P", "dwmc" : "宁波高专建设咨询有限公司",
								"tyxydm" : null, "zzjgdm" : null, "xm" : "周金云", "zjlx" : "身份",
								"zjhm" : "330224196907187519", "hjdz" : null, "zs" : null,
								"szbm" : "职员", "rzrq" : null, "lzrq" : null, "lzyy" : null,
								"dh" : null, "yddh" : "13396688732", "dzyx" : null, "zgzbh" :
								null, "zgzmc" : null, "zgzbfrq" : null, "zgzbfbm" : null,
								"zgzzxrq" : null, "zgzzxbm" : null }, { .... }] }
							</td>
						</tr>
					</table>
					<div class="light-info mt10 center pos-rel">返回参数说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">字段名</th>
							<th width="20%">含义</th>
							<th>说明</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>frwybs</td>
							<td>法人唯一标识</td>
							<td></td>
						</tr>
						<tr>
							<td>dwmc</td>
							<td>单位名称</td>
							<td></td>
						</tr>
						<tr>
							<td>tyxydm</td>
							<td>统一社会信用代码</td>
							<td></td>
						</tr>
						<tr>
							<td>zzjgdm</td>
							<td>组织机构代码</td>
							<td></td>
						</tr>
						<tr>
							<td>xm</td>
							<td>姓名</td>
							<td></td>
						</tr>
						<tr>
							<td>zjlx</td>
							<td>身份证件类型</td>
							<td></td>
						</tr>
						<tr>
							<td>zjhm</td>
							<td>身份证件号码</td>
							<td></td>
						</tr>
						<tr>
							<td>hjdz</td>
							<td>户籍地址</td>
							<td></td>
						</tr>
						<tr>
							<td>zs</td>
							<td>住所</td>
							<td></td>
						</tr>
						<tr>
							<td>szbm</td>
							<td>所在部门</td>
							<td></td>
						</tr>
						<tr>
							<td>rzrq</td>
							<td>任职起始日期</td>
							<td>格式: yyyy-MM-dd</td>
						</tr>
						<tr>
							<td>lzrq</td>
							<td>离职日期</td>
							<td>格式: yyyy-MM-dd</td>
						</tr>
						<tr>
							<td>lzyy</td>
							<td>离职原因</td>
							<td></td>
						</tr>
						<tr>
							<td>dh</td>
							<td>固定电话</td>
							<td></td>
						</tr>
						<tr>
							<td>yddh</td>
							<td>移动电话</td>
							<td></td>
						</tr>
						<tr>
							<td>dzyx</td>
							<td>电子信箱</td>
							<td></td>
						</tr>
						<tr>
							<td>zgzbh</td>
							<td>资格证书编号</td>
							<td></td>
						</tr>
						<tr>
							<td>zgzmc</td>
							<td>资格证书名称</td>
							<td></td>
						</tr>
						<tr>
							<td>zgzbfrq</td>
							<td>资格证书颁发日期</td>
							<td>格式: yyyy-MM-dd</td>
						</tr>
						<tr>
							<td>zgzbfbm</td>
							<td>资格证书颁发部门</td>
							<td></td>
						</tr>
						<tr>
							<td>zgzzxrq</td>
							<td>资格证书注销日期</td>
							<td>格式: yyyy-MM-dd</td>
						</tr>
						<tr>
							<td>zgzzxbm</td>
							<td>资格证书注销原因</td>
							<td></td>
						</tr>
						</tbody>
					</table>
					<div class="light-info mt10 center pos-rel"
					     tyle="background-color: #ffffff;"></div>
					<table class="table-horizontal" cellpadding="0" cellspacing="0"
					       style="font-size: 15px;">
						<tr>
							<td class="right bg-blue" width="15%">失败示范：</td>
							<td>{ "code":"96", "msg":"失败", "description":"xxx",
								"data":""}
							</td>
						</tr>
					</table>
					<div class="light-info mt10 center pos-rel">失败参数说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">字段名</th>
							<th width="20%">含义</th>
							<th>说明</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>code</td>
							<td>操作结果状态编码</td>
							<td>见通用编码及含义表</td>
						</tr>
						<tr>
							<td>msg</td>
							<td>操作结果</td>
							<td>见通用编码及含义表</td>
						</tr>
						<tr>
							<td>description</td>
							<td>描述</td>
							<td>操作结果具体描述信息，如数据验证不通过的具体错误字段信息</td>
						</tr>
						<tr>
							<td>data</td>
							<td>数据返回结果</td>
							<td>成功有data数据，失败无data数据</td>
						</tr>
						</tbody>
					</table>
					<div class="light-info mt10 center pos-rel">编码说明：</div>
					<table class="table-row nowrap" width="100%" cellpadding="0"
					       cellspacing="0" border="0">
						<thead>
						<tr>
							<th width="15%">编码</th>
							<th width="20%">含义</th>
							<th>描述</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>00</td>
							<td>成功</td>
							<td></td>
						</tr>
						<tr>
							<td>96</td>
							<td>数据错误</td>
							<td></td>
						</tr>
						<tr>
							<td>97</td>
							<td>参数缺失</td>
							<td></td>
						</tr>
						<tr>
							<td>98</td>
							<td>参数类型错误</td>
							<td></td>
						</tr>
						<tr>
							<td>99</td>
							<td>失败</td>
							<td>可能系统异常引起等</td>
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
