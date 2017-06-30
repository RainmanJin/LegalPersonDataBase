<%--
  Created by IntelliJ IDEA.
  User: dxh
  Date: 2017/6/29
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body style="background-color: #f4f4f4">
<div class="iframe-wrap">
    <div class="form-panel mb10">
        <form id="search_form" class="form-box clearfix">

            <div class="form-list">
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">法人名称：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">统一社会信用代码：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="" >
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-4 item-name text-right">登记状态：</label>
                        <div class="col-6">
                            <div class="ipt-box">
                                <select id="" name="">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">法人类型：</label>
                        <div class="col-6">
                            <div class="ipt-box">
                                <select id="" name="">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">来源部门：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="" >
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-4 item-name text-right">建立日期：</label>
                        <div class="col-6">
                            <div class="ipt-box col-575">
                                <input type="text" readonly="readonly" name="" class="ipt-txt" id="">
                            </div>
                            <span class="col-05 item-line">-</span>
                            <div class="ipt-box col-575">
                                <input type="text" readonly="readonly" name="" class="ipt-txt clx" id="">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right">法定代表人：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="">
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-6 item-name text-right">行业：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="" >
                        </div>
                    </div>
                    <div class="col-4">
                        <label class="col-4 item-name text-right">注册资本：</label>
                        <div class="col-6">
                            <input type="text" name="" id="" class="form-control"
                                   value="" >
                        </div>
                    </div>
                </div>
                <div class="hx-searchForm-but center">
                    <input type="button" value="查询" class="btn mr20" id="search">
                    <input type="reset" value="重置" class="btn" id="reset">
                </div>
            </div>
        </form>
    </div>

    <div class="form-panel pd15">
        <table id="" class="table-row nowrap" width="100%">
            <thead>
            <tr>
                <th>序号</th>
                <th>登记状态</th>
                <th>统一社会信用代码</th>
                <th>法人名称</th>
                <th>法定代表人</th>
                <th>成立日期</th>
                <th>注册资本（万元）</th>
                <th>企业类型</th>
                <th>行业</th>
                <th>住所</th>
                <th>来源部门</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
