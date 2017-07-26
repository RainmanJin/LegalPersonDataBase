<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>生产经营查询</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">

<link rel="stylesheet"
	href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
<link rel="stylesheet" href="/css/style.css">
<script src="/js/lib/laydate/laydate.js" type="text/javascript"
	charset="utf-8"></script>
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
</head>
<body style="background-color: #f4f4f4">
<div class="iframe-wrap">
    <div class="form-panel mb10">
        <form id="search_form" class="form-box clearfix">
            <div class="form-list">
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right" >法人名称：</label>
                        <div class="col-6">
                            <input type="text" name="Name" id="Name" class="form-control"
                                   value="${Name}" placeholder="请输入法人名称">
                        </div>
                    </div>
                      <div class="col-4">
                        <label class="col-6 item-name text-right">统一信用代码：</label>
                        <div class="col-6"><input type="text" name="UnitedID" id="UnitedID" class="form-control"
                                   value="${UnitedID}" placeholder="请输入统一信用代码">
                            </div>
                        </div>
                        <div class="col-4">
                        <label class="col-5 item-name text-right">经营范围：</label>
                        <div class="col-6"><input type="text" name="Range" id="Range" class="form-control"
                                   value="${Range}" placeholder="请输入经营范围">
                            </div>
                        </div>
                    </div>
                    
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">委托加工药品通用名：</label>
                        <div class="col-6">
                            <input type="text" name="MediName" id="MediName" class="form-control"
                                   value="${MediName}" placeholder="请输入委托加工药品通用名">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">医疗器械制造生产许可/备案编号：</label>
                        <div class="col-6">
                            <input type="text" name="MediPrmiID" id="MediPrmiID" class="form-control"
                                   value="${MediPrmiID}" placeholder="请输入编号">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-5 item-name text-right">委托印刷书（刊）名：</label>
                        <div class="col-6">
                            <input type="text" name="PrintName" id="PrintName" class="form-control"
                                   value="${PrintName}" placeholder="请输入委托印刷书（刊）名">
                        </div>
                    </div>
                </div>
                
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">交通建设项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="TransName" id="TransName" class="form-control"
                                   value="${TransName}" placeholder="请输入交通建设项目名称">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">重大产业项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="ImportName" id="ImportName" class="form-control"
                                   value="${ImportName}" placeholder="请输入重大产业项目名称">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-5 item-name text-right">企业投资项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="InvestName" id="InvestName" class="form-control"
                                   value="${InvestName}" placeholder="请输入企业投资项目名称">
                        </div>
                    </div>
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">社会发展项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="DevName" id="DevName" class="form-control"
                                   value="${DevName}" placeholder="请输入社会发展项目名称">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">中央投资项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="GovInvestName" id="GovInvestName" class="form-control"
                                   value="${GovInvestName}" placeholder="请输入中央投资项目名称">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-5 item-name text-right">科技成果名称：</label>
                        <div class="col-6">
                            <input type="text" name="SciProName" id="SciProName" class="form-control"
                                   value="${SciProName}" placeholder="请输入科技成果名称">
                        </div>
                    </div>
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">慈善捐赠项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="CharityName" id="CharityName" class="form-control"
                                   value="${CharityName}" placeholder="请输入慈善捐赠项目名称">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">股票代码：</label>
                        <div class="col-6">
                            <input type="text" name="StockID" id="StockID" class="form-control"
                                   value="${StockID}" placeholder="请输入股票代码">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-5 item-name text-right">承建项目名称：</label>
                        <div class="col-6">
                            <input type="text" name="ConstrucName" id="ConstrucName" class="form-control"
                                   value="${ConstrucName}" placeholder="请输入承建项目名称">
                        </div>
                    </div>
                </div>
                <div class="hx-searchForm-but center">
                    <input type="button" value="查询" class="btn mr20" id="search" >
                    <input type="reset" value="重置" class="btn" id="reset">
                </div>
        </form>
            </div>
            
                        <div class="form-panel pd15">
			<table id="search_table" class="table-row nowrap" width="100%">
				<thead>
					<tr>
					<th>序号</th>
						<th>法人名称</th>
                <th>统一社会信用代码</th>
                <th>法定代表人</th>
                <th>成立日期</th>
                <th>行业</th>
                <th>存续状态</th>
					</tr>
				</thead>
			</table>
		</div>
		</div>
<jsp:include page="../../common/common.jsp"/>
<script src="/js/search/ProduceSearch/producesearch.js"></script>
</body>
</html>
