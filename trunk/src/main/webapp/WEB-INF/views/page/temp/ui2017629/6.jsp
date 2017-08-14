<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<title></title>
	<link rel="stylesheet" href="/css/style.css">
</head>
<body class="pd20">
<h3 class="relnet-hd">关系网络<input type="button" value="企业信息查询" class="info-look btn"></h3>
<div class="relnet-serch">
	<form class="form-box clearfix">
		<div class="col-5">
			<div class="col-5">
				<label class="item-name col-12"><input type="checkbox" class="mr5">法定代表人</label>
			</div>

			<div class="col-7">
				<label class="item-name col-5"><input type="checkbox" class="mr5">选择证照</label>
				<div class="col-7">
					<div class="ipt-box ">
						<select name="type" class="" id="type">
							<option value="jsgh">请选择持股比例</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="col-7">
			<div class="col-6">
				<label class="item-name col-5"><input type="checkbox" class="mr5">高管关系</label>
				<div class="col-6">
					<div class="ipt-box ">
						<select name="type" class="">
							<option value="jsgh">请选择职务</option>
						</select>
					</div>
				</div>
			</div>

			<div class="col-5">
				<label class="item-name col-5 left"><input type="checkbox" class="mr5">配偶关系</label>
				<label class="item-name col-5 left"><input type="checkbox" class="mr5">配偶关系</label>
				<div class="col-2">
					<button class="btn btn-xs2" type="button">查询</button>
				</div>
			</div>

		</div>

	</form>
	<form class="form-box clearfix">
		<div class="col-12 center">
			<label class="item-name">企业关系配对查询</label><!-
			-->
			<div class="look-company">
				<div class="ipt-box">
					<input type="text" class="ipt-txt">
				</div>
			</div>
			<!-
			-->
			<button class="btn btn-xs2 ml10" type="button">开始匹配</button>
		</div>

	</form>
</div>
<div class="relnet-cont">
	<div class="rn-sidebar">
		<h4>分析概要</h4>
		<dl>
			<dt>企业关系概述：</dt>
			<dd>法定代表人：陈健</dd>
			<dd> 法人股东：4个</dd>
			<dd>自然人股东：0个</dd>
			<dd>高管：0个</dd>
			<dd>担保：0个</dd>
		</dl>
	</div>
	<img src="/img/faren-pic.jpg" alt="">
</div>
</body>
</html>
