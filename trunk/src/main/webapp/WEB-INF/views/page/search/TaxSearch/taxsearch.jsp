<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>纳税，社保与缴费查询</title>
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
<body>
<div class="iframe-wrap">
    <div class="form-panel mb10">
        <form id="search_form" class="form-box clearfix">
            <div class="form-list">
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="col-6 item-name text-right" >法人名称：</label>
                        <div class="col-5">
                            <input type="text" name="Name" id="Name" class="form-control"
                                    placeholder="请输入法人名称">
                        </div>
                    </div>
                      <div class="col-6">
                        <label class="col-2 item-name text-right">统一信用代码：</label>
                        <div class="col-5"><input type="text" name="UnitedID" id="UnitedID" class="form-control"
                                   placeholder="请输入统一信用代码">
                            </div>
                        </div>
                    </div>
                    
                </div>
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="col-6 item-name text-right">纳税人识别号：</label>
                        <div class="col-5">
                            <input type="text" name="TaxID" id="TaxID" class="form-control"
                                   placeholder="请输入纳税人识别号">
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="col-2 item-name text-right">公积金参保人数：</label>
                        <div class="col-5">
                            <div class="ipt-box col-575">
                                <input type="text" name="NumMin" class="ipt-txt" id="Nummin">
                            </div>
                            <span class="col-05 item-line">~</span>
                            <div class="ipt-box col-575">
                                <input type="text" name="NumMax" class="ipt-txt clx" id="NumMax">
                            </div>
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
                		<th>经营范围</th>
                		<th>存续状态</th>
					</tr>
				</thead>
			</table>
		</div>
		</div>
<script src="/js/search/TaxSearch/taxsearch.js"></script>
</body>
</html>
