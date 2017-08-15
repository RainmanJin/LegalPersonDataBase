<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>生产经营查询</title>
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


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">行政强制信息查询</div>
		<form id="xzqz_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">企业名称/单位名称/人员名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
						<label class="item-name col-3">强制执行文号：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="xzqzZxwh"
								       placeholder="输入强制执行文号查询"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="xzqz_search" value="查询" class="btn mr20">
				<input type="reset" id="xzqz_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="xzqz_tab" class="">
					<div class="table-out">
						<table id="xzqz_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>企业/单位/人员名称</th>
								<th>临时措施时间</th>
								<th>解除临时措施时间</th>
								<th>强制执行文号</th>
								<th>强制执行内容</th>
								<th>强制执行时间</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">监督抽查信息查询</div>
		<form id="jdcc_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">被抽查单位：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="bccdw" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
						<label class="item-name col-3">抽查测绘项目名称：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="ccchxmmc"
								       placeholder="输入抽查测绘项目名称查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="jdcc_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="jdcc_tab" class="">
					<div class="table-out">
						<table id="jdcc_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>被抽查单位</th>
								<th>抽查测绘项目名称</th>
								<th>检验报告日期</th>
								<th>数据来源部门</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">监督抽查不合格记录查询</div>
		<form id="bhgjl_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					<div class="col-6">
						<label class="item-name col-5">抽查不合格企业名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="cpscdwwybs"
								       placeholder="可输入企业名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
						<label class="item-name col-3">被抽查食品名称：</label>
						<div class="col-7">
							<div class="ipt-box col-12">
								<input type="text" class="ipt-txt" name="bccspmc"
								       placeholder="可输入食品名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
				</div>
				<div class="form-item clearfix">
					<div class="col-6">
						<label class="item-name col-5">被抽查药品名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="bccypmc"
								       placeholder="可输入药品名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="bhgjl_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="bhgjl_tab" class="">
					<div class="table-out">
						<table id="bhgjl_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>抽查不合格企业名称</th>
								<th>被抽查食品名称</th>
								<th>被抽查药品名称</th>
								<th>检验结论</th>
								<th>抽查日期</th>
								<th>抽查任务下达单位</th>
								<th>不合格测绘项目名称</th>
								<th>不合格记录检验报告日期</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">窃电记录查询</div>
		<form id="qdjl_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">用电户名：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="ydhm" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					
					<div class="col-6">
						<label class="item-name col-3">窃电量(度)：</label>
						<div class="col-6">
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt" id="qdl_start" name="qdlStart" />
							</div>
							<span class="col-05 item-line">~</span>
							<div class="ipt-box col-575">
								<input type="text" class="ipt-txt" id="qdl_end" name="qdlEnd" />
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="qdjl_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="qdjl_tab" class="">
					<div class="table-out">
						<table id="qdjl_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>用电户名</th>
								<th>用电地址</th>
								<th>窃电量(度)</th>
								<th>窃电时段</th>
								<th>窃电总额(度)</th>
								<th>数据来源部门</th>

							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>



<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">行政处罚信息查询</div>
		<form id="xzcf_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">企业名称/单位名称/人员名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
						<div class="col-6">
							<label class="item-name col-3">处罚日期：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="xzcf_time_start" name="xzcfTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="xzcf_time_end" name="xzcfTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
					</div>
			</div>
			<div class="center mt10">
				<input type="button" id="xzcf_search" value="查询" class="btn mr20">
				<input type="reset" id="xzcf_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="xzcf_tab" class="">
					<div class="table-out">
						<table id="xzcf_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>企业名称/单位名称/人员名称</th>
								<th>执法部门名称</th>
								<th>案件名称</th>
								<th>被处罚对象类别</th>
								<th>处罚日期</th>
								<th>撤销处罚日期</th>
								<th>撤销处罚的原因说明</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">重点监管信息查询</div>
		<form id="zdjg_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">企业名称/单位名称/人员名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					
					<div class="col-6">
							<label class="item-name col-3">列入日期：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="zdjg_time_start" name="zdjgTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="zdjg_time_end" name="zdjgTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="zdjg_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="zdjg_tab" class="">
					<div class="table-out">
						<table id="zdjg_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th>序号</th>
								<th>企业/单位/人员名称</th>
								<th>列入重点监管原因</th>
								<th>监管内容</th>
								<th>列入时间</th>
								<th>监管机关</th>
								<th>撤销时间</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">监测监控信息查询</div>
		<form id="jcjk_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
							<label class="item-name col-3">监测日期：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="jcjk_time_start" name="jcjkTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="jcjk_time_end" name="jcjkTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="jcjk_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="jcjk_tab" class="">
					<div class="table-out">
						<table id="jcjk_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>站点名称</th>
								<th>监测时间</th>
								<th>监测指标</th>
								<th>监测结果</th>
								<th>达标情况</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">事故信息查询</div>
		<form id="sgxx_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
							<label class="item-name col-3">事故发生时间：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="sgxx_time_start" name="sgxxTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="sgxx_time_end" name="sgxxTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="sgxx_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="sgxx_tab" class="">
					<div class="table-out">
						<table id="sgxx_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>事故发生地点</th>
								<th>事故类型</th>
								<th>事故原因</th>
								<th>事故发生时间</th>
								<th>死亡人数</th>
								<th>重伤人数</th>
								<th>财产损失(万元)</th>
								<th>事故简要情况</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">隐患记录查询</div>
		<form id="yhjl_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
							<label class="item-name col-3">认定时间：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="yhjl_time_start" name="yhjlTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate()"
										readonly="readonly" id="yhjl_time_end" name="yhjlTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="yhjl_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="yhjl_tab" class="">
					<div class="table-out">
						<table id="yhjl_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>认定时间</th>
								<th>认定依据</th>
								<th>认定机构</th>
								<th>销案时间</th>
								<th>存在重大安全隐患内容</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">机构年检信息查询</div>
		<form id="jgnj_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					
						
					<div class="col-6">
							<label class="item-name col-3">年检年度：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="jgnj_time" name="jgnjTime" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="jgnj_time_end" name="jgnjTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
					
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="jgnj_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="jgnj_tab" class="">
					<div class="table-out">
						<table id="jgnj_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>年检年度</th>
								<th>年检（年度报告）</th>
								<th>评估情况</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">企业年报信息查询</div>
		<form id="qynb_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">企业名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="qymc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
							<label class="item-name col-3">年报年度：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="qynb_time" name="qynbTime" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="qynb_time_end" name="qynbTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="qynb_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="qynb_tab" class="">
					<div class="table-out">
						<table id="qynb_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>企业名称</th>
								<th>年报年度</th>
								<th>年度报告日期</th>
								<th>年度报告状态</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">劳动保障书面审查查询</div>
		<form id="ldbz_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">当事法人名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dsfrmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
						<div class="col-6">
							<label class="item-name col-3">书面审查年度：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="ldbz_time" name="ldbzTime" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="ldbz_time_end" name="ldbzTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="ldbz_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="ldbz_tab" class="">
					<div class="table-out">
						<table id="ldbz_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>当事法人名称</th>
								<th>书面审查年度</th>
								<th>评定等级</th>
								<th>数据来源部门</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">无线电台（站）年检信息查询</div>
		<form id="wxdnj_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
					<div class="col-6">
							<label class="item-name col-3">年检年度：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="wxt_time" name="wxtTime" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="wxt_time_end" name="wxtTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="wxdnj_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="wxdnj_tab" class="">
					<div class="table-out">
						<table id="wxdnj_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>数据来源部门</th>
								<th>无线电台（站）年检年度</th>
								<th>年检结果</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>



<div class="tabbale iframe-wrap" data-component="tab" style="padding-right:0">
	<div class="form-panel">
		<div class="title">分类监管信息查询</div>
		<form id="fljg_form" class="form-box mb5">
			<div class="form-list pdr8">
				<div class="form-item clearfix">
					
					<div class="col-6">
						<label class="item-name col-5">单位名称：</label>
						<div class="col-7">
							<div class="ipt-box col-11">
								<input type="text" class="ipt-txt" name="dwmc" placeholder="可输入名称关键词查询(支持模糊查询)"/>
							</div>
						</div>
					</div>
				
					<div class="col-6">
							<label class="item-name col-3">评价年度：</label>
							<div class="col-6">
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="fljg_time_start" name="fljgTimeStart" value=""
										 />
								</div>
								<span class="item-line col-05">-</span>
								<div class="ipt-box col-575">
									<input type="text" class="ipt-txt laydate-icon"
										style="cursor: pointer;" onclick="laydate({format: 'YYYY',istime: false})"
										readonly="readonly" id="fljg_time_end" name="fljgTimeEnd" value=""
										 />
								</div>
							</div>
						</div>
				</div>
			</div>
			<div class="center mt10">
				<input type="button" id="fljg_search" value="查询" class="btn mr20">
				<input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
			</div>
		</form>
		<div class="tab-content mb20 mt10">
			<div class="tab-panel tab-panel-show">
				<div id="fljg_tab" class="">
					<div class="table-out">
						<table id="fljg_table" border="0" cellspacing="0" cellpadding="0"
						       class="table-row nowrap" width="100%">
							<thead style="white-space:nowarp;">
							<tr>
								<th width="5%">序号</th>
								<th>单位名称</th>
								<th>评价依据</th>
								<th>评价机关</th>
								<th>评价年度</th>
								<th>评价结果</th>
								<th>评价内容</th>
							</tr>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="/js/search/LawEnforceSearch/lawenforcesearch.js"></script>
</body>
</html>
