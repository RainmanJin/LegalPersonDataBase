<%--
  Created by IntelliJ IDEA.
  User: dxh
  Date: 2017/6/29
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">
<title></title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body style="background-color: #f4f4f4;">
	<div class="iframe-wrap bg-white">
		<div class="pd20">
			<h3 class="subject-title">1、请求地址(POST)</h3>
			<div class="request-address mb20">
				http://59.202.58.68/gateway/api/getCacycyxx.htm</div>

			<h3 class="subject-title">2、请求说明</h3>
			<div class="request-address mb5">
				data={"appKey":"xxxx","sign":"xxxx","requestTime":"20170725111355","tyxydm":"91330000755918469E","zzjgdm":"xxxx","djzch":"3304811104905"}
			</div>

			<table id="" class="table-row nowrap mb20" width="100%">
				<thead>
					<tr>
						<th>字段名</th>
						<th>含义</th>
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
						<td>tyxydm、frdwmc、zzjgdm查询参数至少填其一</td>
						<td>是</td>
					</tr>
					<tr>
						<td>frdwmc</td>
						<td>法人单位名称</td>
						<td>支持模糊匹配</td>
						<td>是</td>
					</tr>
					<tr>
						<td>zzjgdm</td>
						<td>组织机构代码</td>
						<td>tyxydm、frdwmc、zzjgdm查询参数至少填其一</td>
						<td>是</td>
					</tr>
				</tbody>
			</table>

			<h3 class="subject-title">3、返回说明</h3>
			<h4 class="subtitle-title-success">成功时返回：</h4>
			<div class="request-address mb5">
			{ "code":"00", "msg":"成功",
				"description":"xxx", "data": [ { "qydwmc": "宁波欧斯特金属科技有限公司",
				"tyxydm": "913302033168690875", "zzjgdm": "", "hzjg": "330203",
				"hzsj": "2016-08-29", "fddbr": "夏伟君", "frlx": "企业法人", "zcdz":
				"宁波市海曙区机场路1000号2号楼216室", "zt": "正常" }, { .... }] }
				</div>

			<table id="" class="table-row nowrap mb5" width="100%">
				<thead>
					<tr>
						<th>字段名</th>
						<th>含义</th>
						<th>说明</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>qydwmc</td>
						<td>企业单位名称</td>
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
						<td>hzjg</td>
						<td>核准机构</td>
						<td></td>
					</tr>
					<tr>
						<td>hzsj</td>
						<td>核准时间</td>
						<td></td>
					</tr>
					<tr>
						<td>fddbr</td>
						<td>法定代表人</td>
						<td></td>
					</tr>
					<tr>
						<td>frlx</td>
						<td>法人类型</td>
						<td></td>
					</tr>
					<tr>
						<td>zcdz</td>
						<td>注册地址</td>
						<td></td>
					</tr>
					<tr>
						<td>zt</td>
						<td>状态</td>
						<td></td>
					</tr>
				</tbody>
			</table>

			<h4 class="subtitle-title-fail">失败时返回：</h4>
			<div class="request-address mb5">{ "code":"96", "msg":"失败",
				"description":"xxx", "data":""}</div>

			<table id="" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th>字段名</th>
						<th>含义</th>
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

			<h4 class="subject-title" align="center">通用编码及含义</h4>
			<table id="" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th>编码</th>
						<th>含义</th>
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
</body>
</html>
