<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title> 评价信息查询</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="stylesheet" href="/css/system.css">
	<link rel="stylesheet" href="/css/vendor/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="/js/lib/jquerymultiselect/jquery.multiselect.css">
	<link rel="stylesheet" href="/js/lib/layer/skin/layer.css">
	<script src="/js/lib/require.js"></script>
	<script src="/js/config.js"></script>
	
	<link rel="stylesheet" href="/css/style.css">
	<script type="text/javascript" src="/js/lib/jquery/jquery-1.12.3.min.js"></script>
	<style type="text/css">
		.basemsg-tab{width: 830px;}
		.basemsg-tab a{width: 180px;margin-top: 10px;}
		.form-panel{margin-right: 0px;}
	</style>
	<script type="text/javascript">
	$(document).ready(function(){
		$('.tabbale:gt(0)').hide();
	});
	</script>
	
	
</head>
<body style="background-color: #f4f4f4">


<div class="base-msg-search">
	<div class="basemsg-tab">
		<a class="current mytab" href="javascript:;">严重违法失信(黑名单)</a>
		<a class="mytab" href="javascript:;">异常经营名录</a>
		<a class="mytab"  href="javascript:;">窃电信息</a>
	</div>
</div>


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">严重违法失信(黑名单)</div>
		<form id="yzwfsxHmd_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-6">
						<label class="item-name col-5">黑名单名称：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="hmdmc"
								       placeholder="可输入黑名单名称（支持模糊查询）"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="yzwfsxHmd_search" value="查询" class="btn mr20">
				<input type="reset" id="yzwfsxHmd_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="form-panel pd15">
			<table id="yzwfsxHmd_table" class="table-row nowrap" width="100%">
				<thead>
				<tr>
					<th style="padding: 0 20px;" width="7%">序号</th>
					<th>黑名单名称</th>
					<th>进入农业会展企业黑名单原因</th>
					<th>列入严重违法失信企业名单原因</th>
					<th>列入黑名单日期</th>
					<th>作出决定机关(列入黑名单)</th>
				</tr>
				</thead>
			</table>
		</div>
	</div>
</div>


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">异常经营名录</div>
		<form id="ycjyml_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-6">
						<label class="item-name col-5">列入经营异常名录原因：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="lrjyycmlyy"
								       placeholder="可输入列入经营异常名录原因（支持模糊查询）"/>
							</div>
						</div>
					</div>
<!-- 					<div class="col-6"> -->
<!-- 						<label class="item-name col-5">身份证件号码：</label> -->
<!-- 						<div class="col-7"> -->
<!-- 							<div class="ipt-box col-11"> -->
<!-- 								<input type="text" id="ajdsrxx_zjhm" class="ipt-txt" name="zjhm" placeholder="可输入身份证件号码"/> -->
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 					</div> -->
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="ycjyml_search" value="查询" class="btn mr20">
				<input type="reset" id="ycjyml_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="form-panel pd15">
			<table id="ycjyml_table" class="table-row nowrap" width="100%">
				<thead>
				<tr>
					<th style="padding: 0 20px;" width="7%">序号</th>
					<th>列入经营异常名录原因</th>
					<th>列入经营异常名录日期</th>
					<th>作出决定机关(列入异常名录)</th>
					<th>移出经营异常名录原因</th>
					<th>移出经营异常名录日期</th>
					<th>作出决定机关(移出异常名录)</th>
				</tr>
				</thead>
			</table>
		</div>
	</div>
</div>


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">窃电信息</div>
		<form id="" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-6">
						<label class="item-name col-5">用电户名：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name=""
								       placeholder="可输入用电户名（支持模糊查询）"/>
							</div>
						</div>
					</div>
					<div class="col-6">
						<label class="item-name col-5">用电户号：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input id="dwwlx_zjhm" type="text" class="ipt-txt" name="" placeholder="可输入用电户号"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="" value="查询" class="btn mr20">
				<input type="reset" id="" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="form-panel pd15">
			<table id="dwwlx_table" class="table-row nowrap" width="100%">
				<thead>
				<tr>
					<th style="padding: 0 20px;" width="7%">序号</th>
					<th>用电户号</th>
					<th>用电户名</th>
					<th>用电地址</th>
					<th>窃电量</th>
					<th>窃电时段</th>
					<th>窃电总额</th>
				</tr>
				</thead>
			</table>
		</div>
	</div>
</div>

<script src="/js/search/CommentSearch/commentSearch.js"></script>
</body>
</html>
