<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${ctx}/static/dp/css/style.css">
</head>

<body>
    <!-- 头部模块 -->
    <header>
        <h1><span>数据可视化页面设计</span></h1>
        <p><span>Data visualization page design</span></p>
    </header>

    <div class="main">
        <!-- top5 -->
        <div class="top5">
            <div class="top5-title">
                <span>品牌销售TOP5</span>
            </div>
            <div class="top5-content">
                <ul>
                    <li>
                        <div class="cicle"></div>
                        <div class="li-content">
                            <span>××品牌</span>
                            <span>15862</span>
                            <span>82%</span>
                            <span><img src="${ctx}/static/dp/images/up.png" alt=""></span>
                        </div>
                    </li>
                    <li>
                        <div class="cicle"></div>
                        <div class="li-content">
                            <span>××品牌</span>
                            <span>15862</span>
                            <span>82%</span>
                            <span><img src="${ctx}/static/dp/images/up.png" alt=""></span>
                        </div>
                    </li>
                    <li>
                        <div class="cicle"></div>
                        <div class="li-content">
                            <span>××品牌</span>
                            <span>15862</span>
                            <span>82%</span>
                            <span><img src="${ctx}/static/dp/images/up.png" alt=""></span>
                        </div>
                    </li>
                    <li>
                        <div class="cicle"></div>
                        <div class="li-content">
                            <span>××品牌</span>
                            <span>15862</span>
                            <span>82%</span>
                            <span><img src="${ctx}/static/dp/images/up.png" alt=""></span>
                        </div>
                    </li>
                    <li>
                        <div class="cicle"></div>
                        <div class="li-content">
                            <span>××品牌</span>
                            <span>15862</span>
                            <span>82%</span>
                            <span><img src="${ctx}/static/dp/images/down.png" alt=""></span>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="top5-title">
                <span>大类销售分析</span>
            </div>
        </div>
        <!-- 销售总额 -->
        <div class="total">
            <div class="data1">
                <span>年销售</span>
                <p>5684710411</p>
            </div>
            <div class="data2">
                <span>月销售</span>
                <p>1457104</p>
            </div>
            <div class="data3">
                <span>周销售</span>
                <p>564710</p>
            </div>
            <div class="data4">
                <span>日销售</span>
                <p>14504</p>
            </div>
            <canvas class="rain"></canvas>
            <canvas class="dashed"></canvas>
            <div class="sphere">
                <div class="sphere-bg"></div>
                <div class="sum">
                    <span>销售总额</span>
                    <p>568971401</p>
                </div>
            </div>
            <div class="cicle3"></div>
            <div class="cicle4"></div>
            <div class="cicle5"></div>
            <div class="cicle6"></div>
            <div class="cicle7"></div>
            <div class="cicle8">
                <span>89%</span>
                <p>同比</p>
            </div>
            <div class="cicle9">
                <span>89%</span>
                <p>完成率</p>
            </div>
            <div class="cicle10">
                <span>89%</span>
                <p>售罄率</p>
            </div>
            <div class="cicle11">
                <span>89%</span>
                <p>折扣率</p>
            </div>
        </div>
        <!-- 会销分析 -->
        <div class="analyse">
            <div class="analyse-title">
                <span>会销情况分析</span>
            </div>
            <ul>
                <li>
                    <img src="${ctx}/static/dp/images/s1.png" alt="">
                    <h5>会销目标</h5><br>
                    <span>Marketing Target</span><br>
                    <em>￥4,374,266</em>
                </li>
                <li>
                    <img src="${ctx}/static/dp/images/s3.png" alt="">
                    <h5>会销目标</h5><br>
                    <span>Marketing Target</span><br>
                    <em>￥4,374,266</em>
                </li>
                <li>
                    <img src="${ctx}/static/dp/images/s2.png" alt="">
                    <h5>会销目标</h5><br>
                    <span>Marketing Target</span><br>
                    <em>￥4,374,266</em>
                </li>
            </ul>
            <div class="execution">
                <div class="title">完成情况</div>
                <div class="cicle1"></div>
                <div class="cicle2"></div>
                <div class="waterChart1">
                    <div class="chart-title">会销完成率</div>
                    <div class="chart1"></div>
                </div>
                <div class="waterChart2">
                    <div class="chart-title">会销占比</div>
                    <div class="chart2"></div>
                </div>
            </div>
        </div>
        <!-- 鞋服配销售分析 -->
        <div class="sale">
            <ul>
                <li>
                    <div class="showImg">
                        <img src="${ctx}/static/dp/images/shoe.png" alt="">
                    </div>
                    <div class="data">
                        <span>鞋类</span>
                        <span>52563</span>
                    </div>
                    <div class="shoeChart"></div>
                </li>
                <li>
                    <div class="showImg">
                        <img src="${ctx}/static/dp/images/clothes.png" alt="">
                    </div>
                    <div class="data">
                        <span>服装</span>
                        <span>32563</span>
                    </div>
                    <div class="clothesChart"></div>
                </li>
                <li>
                    <div class="showImg">
                        <img src="${ctx}/static/dp/images/mz.png" alt="">
                    </div>
                    <div class="data">
                        <span>配饰</span>
                        <span>12563</span>
                    </div>
                    <div class="mzChart"></div>
                </li>
            </ul>
        </div>
        <!-- 折线图 -->
        <div class="lineChart">

        </div>
    </div>

    <!-- 底部模块 -->
    <div class="bottom">
        <h5><span>数据状况</span></h5>
        <p>Data Status</p>
    </div>
</body>
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="https://www.jq22.com/jquery/echarts-4.2.1.min.js"></script>
<script src="${ctx}/static/dp/node_modules/echarts-liquidfill/dist/echarts-liquidfill.min.js"></script>
<script src="${ctx}/static/dp/js/main.js"></script>

</html>