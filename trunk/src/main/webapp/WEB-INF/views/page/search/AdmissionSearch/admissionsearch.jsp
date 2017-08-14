<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>许可与资质查询</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="renderer" content="webkit">
	<meta charset="utf-8">
	<link rel="stylesheet" href="/css/system.css">
	<link rel="stylesheet" href="/css/vendor/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="/js/lib/jquerymultiselect/jquery.multiselect.css">
	<link rel="stylesheet" href="/js/lib/layer/skin/layer.css">
	<script src="/js/lib/require.js"></script>
	<script src="/js/config.js"></script>
</head>
<body style="background-color: #f4f4f4">
<!-------------------------------------------------------------->
<div class="tabbale iframe-wrap" data-component="tab">
	<div class="form-panel">
		<div class="title">行政许可信息</div>
		<form id="search_form1" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="item-name col-5">行政许可内容：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AdmissionContent" value=""
								       placeholder="请输入许可内容(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-5">行政许可核发机关名称：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="DeptName" value=""
								       placeholder="请输入机关名称(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">核发日期：</label>
						<div class="col-6">
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_Start" name="Grant_Date_Start" value=""/>
							</div>
							<span class="item-line col-05">-</span>
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_End" name="Grant_Date_End" value=""/>
							</div>
						</div>
					</div>
				</div>
				<div class="center">
					<input type="button" id="search1" value="查询" class="btn mr20">
					<input type="reset" id="reset1" value="重置" class="btn mr20">
				</div>
			</div>

		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div class="">
					<div class="table-out">
						<table id="search_table1" class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>法人名称</th>
								<th>行政许可文（证）编号</th>
								<th>行政许可内容</th>
								<th>行政许可核发机关名称</th>
								<th>行政许可核发日期</th>
								<th>许可证状态</th>
								<th>行政许可有效期自</th>
								<th>行政许可有效期至</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<!-------------------------------------------------------------->
<div class="tabbale iframe-wrap" data-component="tab">
	<div class="form-panel">
		<div class="title">行政备案信息</div>
		<form id="search_form2" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="item-name col-5">备案名称：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="BackupName" value=""
								       placeholder="请输入备案名称(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">备案内容：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="BackupContent" value=""
								       placeholder="请输入备案内容(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">核发日期：</label>
						<div class="col-6">
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_Start1" name="Grant_Date_Start1"
								       value=""/>
							</div>
							<span class="item-line col-05">-</span>
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_End1" name="Grant_Date_End1" value=""/>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="center">
				<input type="button" id="search2" value="查询" class="btn mr20">
				<input type="reset" id="reset2" value="重置" class="btn mr20">
			</div>
		</form>

		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div class="">
					<div class="table-out">
						<table id="search_table2" class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>法人名称</th>
								<th>备案名称</th>
								<th>备案内容</th>
								<th>认缴出资额(万元)</th>
								<th>备案核发日期</th>
								<th>备案有效期自</th>
								<th>备案有效期至</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<!-------------------------------------------------------------->
<div class="tabbale iframe-wrap" data-component="tab">
	<div class="form-panel">
		<div class="title">资质信息</div>
		<form id="search_form3" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="item-name col-5">资质类别：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="GrandCate" value="" placeholder="请输入资质类别">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">资质证书名称：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="GrandName" value=""
								       placeholder="请输入证书名称(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-4">资质证书颁发机关：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="GrandDept" value=""
								       placeholder="请输入机关名称(支持模糊查询)">
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="center">
				<input type="button" id="search3" value="查询" class="btn mr20">
				<input type="reset" id="reset3" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div class="">
					<div class="table-out">
						<table id="search_table3" class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>法人名称</th>
								<th>资质类别</th>
								<th>资质证书名称</th>
								<th>资质等级名称</th>
								<th>资质证书颁发机关</th>
								<th>资质证书颁发日期</th>
								<th>资质证书状态</th>
								<th>资质有效期自</th>
								<th>资质有效期至</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<!-------------------------------------------------------------->
<div class="tabbale iframe-wrap" data-component="tab">
	<div class="form-panel">
		<div class="title">荣誉信息</div>
		<form id="search_form4" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="item-name col-5">荣誉名称：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AwardName" value=""
								       placeholder="请输入荣誉名称(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">荣誉类别：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AwardCate" value="" placeholder="请输入荣誉类别">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">荣誉奖励对象：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AwardTo" value=""
								       placeholder="请输入奖励对象(支持模糊查询)">
							</div>
						</div>
					</div>
				</div>
				<div class="form-item clearfix">
					<div class="col-4">
						<label class="item-name col-5">荣誉认定日期：</label>
						<div class="col-6">
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_Start2" name="Grant_Date_Start2"
								       value=""/>
							</div>
							<span class="item-line col-05">-</span>
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt laydate-icon" style="cursor: pointer;"
								       onclick="laydate()"
								       readonly="readonly" id="Grant_Date_End2" name="Grant_Date_End2" value=""
								/>
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">荣誉颁发机构：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AwardDept" value=""
								       placeholder="请输入颁发机构(支持模糊查询)">
							</div>
						</div>
					</div>
					<div class="col-4">
						<label class="item-name col-3">荣誉内容：</label>
						<div class="col-6">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="AwardContent" value=""
								       placeholder="请输入荣誉内容(支持模糊查询)">
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center">
				<input type="button" id="search4" value="查询" class="btn mr20">
				<input type="reset" id="reset4" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div class="">
					<div class="table-out">
						<table id="search_table4" class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>法人名称</th>
								<th>荣誉类别</th>
								<th>荣誉名称</th>
								<th>荣誉奖励对象</th>
								<th>荣誉认定日期</th>
								<th>荣誉证书有效期自</th>
								<th>荣誉证书有效期至</th>
								<th>荣誉颁发机构</th>
								<th>荣誉颁发年度</th>
								<th>荣誉内容</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<script src="<c:url value='/js/search/AdmissionSearch/admissionsearch.js'/>"></script>
</body>
</html>




