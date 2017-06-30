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
<body  style="background-color: #f4f4f4;">
    <div class="iframe-wrap bg-white">
        <div class="pd20">
            <h3 class="subject-title">1、请求地址(POST)</h3>
            <div class="request-address mb20">
                http://xxx.xxx.x.xx/share/doSearchEntCorp?signature=[Signature]&timestamp=[TimeStamp]
            </div>

            <h3 class="subject-title">2、请求说明</h3>
            <div class="request-address mb5">
                data={"entname":"汇信科技","tyxydm":"91330000755918469E" }
            </div>

            <table id="" class="table-row nowrap mb20" width="100%">
                <thead>
                <tr>
                    <th>字段（中文）</th>
                    <th>字段名</th>
                    <th>数据类型</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                </tbody>
            </table>

            <h3 class="subject-title">3、返回说明</h3>
            <h4 class="subtitle-title-success">成功时返回：</h4>
            <div class="request-address mb5">
                { "status":0, "total":2, "data":[ {"entname":"汇信科技","tyxydm":"91330000755918469E", "frfl": "1", "fddbr": "马云", "fr_zjlx": "身份证", "fr_zjhm":"33100", "djjg": "西湖分局", "djrq": "2014-07-01", "cxzt": "1" }, {"entname":"汇信科技2","tyxydm":"91330000755918469E", "frfl": "1", "fddbr": "马云", "fr_zjlx": "身份证", "fr_zjhm":"33100", "djjg": "西湖分局", "djrq": "2014-07-01", "cxzt": "1" }] }
            </div>

            <table id="" class="table-row nowrap mb5" width="100%">
                <thead>
                <tr>
                    <th>字段（中文）</th>
                    <th>字段名</th>
                    <th>数据类型</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                </tbody>
            </table>

            <h4 class="subtitle-title-fail">失败时返回：</h4>
            <div class="request-address mb5">
                {"status":-1,"message":"查询失败及原因"}
            </div>

            <table id="" class="table-row nowrap" width="100%">
                <thead>
                <tr>
                    <th>字段</th>
                    <th>是否必须</th>
                    <th>说明</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
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
