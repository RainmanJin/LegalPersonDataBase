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
				http://59.202.58.68/gateway/api/getCadjjbxx.htm</div>

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

			<h3 class="subject-title">3、返回说明</h3>
			<h4 class="subtitle-title-success">成功时返回：</h4>
			<div class="request-address mb5">
			{ "code":"00", "msg":"成功",
				"description":"xxx", "data" : [ { "frwybs" : "91330681307582121Y",
				"tyxydm" : "91330681307582121Y", "zzjgdm" : null, "frfl" : "16",
				"frflxl" : "1600", "frmc" : "浙江盈翔机械科技有限公司", "fddbr" : "黄磊", "frZjlx"
				: null, "frZjhm" : null, "djjg" : "330681", "zgjg" : null, "djrq" :
				"2014-05-29", "cxzt" : "1", "cyrs" : null, "djzlx" : null, "djzch" :
				"330681000242199", "ywfw" :
				"从事机械技术的研究开发；制造销售：矿山机械、环保工程用机械、数控车床、液压和气压动力机械、电脑绣花机及配件、建筑工程用机械、五金、机械配件、汽车配件、摩托车配件、阀门、空调、热水器、水泵、油泵；从事货物及技术的进出口业务",
				"qyJy" : null, "zczb" : 1000.000000, "bmBz" : "156", "jfly" : null,
				"jgsyxz" : null, "shzzlx" : null, "qyLx" : null, "qyLxdl" : null,
				"hyml" : null, "hydm" : "7320", "hzrq" : "2017-06-23", "jyqsrq" :
				"2014-05-29", "jyjzrq" : "2034-05-28", "jggss" : null, "jgsws" :
				null, "gtZcxs" : null, "bzCz" : null, "zjjb" : null, "zjpb" : null,
				"mzbmNs" : null, "jb" : null, "bzZfzg" : null, "jyjgBxlx" : null,
				"whjgDj" : null, "dh" : null, "yx" : null, "cz" : null, "frmcJc" :
				null, "frmcEn" : null } ,{ .... }] }
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
						<td>frwybs</td>
						<td>法人唯一标识</td>
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
						<td>frfl</td>
						<td>法人分类</td>
						<td></td>
					</tr>
					<tr>
						<td>frflxl</td>
						<td>法人分类小类</td>
						<td></td>
					</tr>
					<tr>
						<td>frmc</td>
						<td>法人名称/字号</td>
						<td></td>
					</tr>
					<tr>
						<td>fddbr</td>
						<td>法定代表人/负责人</td>
						<td></td>
					</tr>
					<tr>
						<td>frZjlx</td>
						<td>法定代表人/负责人身份证件类型</td>
						<td></td>
					</tr>
					<tr>
						<td>frZjhm</td>
						<td>法定代表人/负责人身份证件号码</td>
						<td></td>
					</tr>
					<tr>
						<td>djjg</td>
						<td>登记机关</td>
						<td></td>
					</tr>
					<tr>
						<td>zgjg</td>
						<td>业务主管机关</td>
						<td></td>
					</tr>
					<tr>
						<td>djrq</td>
						<td>登记日期</td>
						<td>格式: yyyy-MM-dd</td>
					</tr>
					<tr>
						<td>cxzt</td>
						<td>存续状态</td>
						<td></td>
					</tr>
					<tr>
						<td>cyrs</td>
						<td>从业人数</td>
						<td>数字</td>
					</tr>
					<tr>
						<td>djzlx</td>
						<td>登记注册证类型</td>
						<td></td>
					</tr>
					<tr>
						<td>djzch</td>
						<td>登记注册号</td>
						<td></td>
					</tr>
					<tr>
						<td>ywfw</td>
						<td>宗旨和业务范围</td>
						<td></td>
					</tr>
					<tr>
						<td>qyJy</td>
						<td>兼营</td>
						<td></td>
					</tr>
					<tr>
						<td>zczb</td>
						<td>注册资本/开办资金</td>
						<td>数字</td>
					</tr>
					<tr>
						<td>bmBz</td>
						<td>币种代码</td>
						<td></td>
					</tr>
					<tr>
						<td>jfly</td>
						<td>经费来源</td>
						<td></td>
					</tr>
					<tr>
						<td>jgsyxz</td>
						<td>机关事业性质</td>
						<td></td>
					</tr>
					<tr>
						<td>shzzlx</td>
						<td>社会组织类型</td>
						<td></td>
					</tr>
					<tr>
						<td>qyLx</td>
						<td>市场主体类型编码</td>
						<td></td>
					</tr>
					<tr>
						<td>qyLxdl</td>
						<td>市场主体类型大类</td>
						<td></td>
					</tr>
					<tr>
						<td>hyml</td>
						<td>行业门类</td>
						<td></td>
					</tr>
					<tr>
						<td>hydm</td>
						<td>行业代码</td>
						<td></td>
					</tr>
					<tr>
						<td>hzrq</td>
						<td>核准日期</td>
						<td>格式: yyyy-MM-dd</td>
					</tr>
					<tr>
						<td>jyqsrq</td>
						<td>经营(营业)起始日期</td>
						<td>格式: yyyy-MM-dd</td>
					</tr>
					<tr>
						<td>jyjzrq</td>
						<td>经营(营业)截止日期</td>
						<td>格式: yyyy-MM-dd</td>
					</tr>
					<tr>
						<td>jggss</td>
						<td>属地监管工商所</td>
						<td></td>
					</tr>
					<tr>
						<td>jgsws</td>
						<td>属地监管税务部门</td>
						<td></td>
					</tr>
					<tr>
						<td>gtZcxs</td>
						<td>个体工商户组成形式</td>
						<td></td>
					</tr>
					<tr>
						<td>bzCz</td>
						<td>是否城镇</td>
						<td></td>
					</tr>
					<tr>
						<td>zjjb</td>
						<td>宗教教别</td>
						<td></td>
					</tr>
					<tr>
						<td>zjpb</td>
						<td>宗教派别</td>
						<td></td>
					</tr>
					<tr>
						<td>mzbmNs</td>
						<td>民宗部门内设机构</td>
						<td></td>
					</tr>
					<tr>
						<td>jb</td>
						<td>行政机构级别</td>
						<td></td>
					</tr>
					<tr>
						<td>bzZfzg</td>
						<td>是否具备行政执法主体资格</td>
						<td>数字</td>
					</tr>
					<tr>
						<td>jyjgBxlx</td>
						<td>教育机构办学类型</td>
						<td></td>
					</tr>
					<tr>
						<td>whjgDj</td>
						<td>文化机构评估定级情况</td>
						<td></td>
					</tr>
					<tr>
						<td>dh</td>
						<td>联系电话</td>
						<td></td>
					</tr>
					<tr>
						<td>yx</td>
						<td>电子邮箱</td>
						<td></td>
					</tr>
					<tr>
						<td>cz</td>
						<td>联系传真</td>
						<td></td>
					</tr>
					<tr>
						<td>frmcJc</td>
						<td>单位名称（简称）</td>
						<td></td>
					</tr>
					<tr>
						<td>frmcEn</td>
						<td>法人名称（英文）</td>
						<td></td>
					</tr>
				</tbody>
			</table>

			<h4 class="subtitle-title-fail">失败时返回：</h4>
			<div class="request-address mb5">
			{ "code":"96", "msg":"失败",
				"description":"xxx", "data":""}
				</div>

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
	<div></div>
</body>
</html>
