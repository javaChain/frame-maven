<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>    
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${ctx}/img/favicon.ico" type="image/x-icon">
    <link href="${ctx}/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${ctx}/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${ctx}/css/animate.min.css" rel="stylesheet">
    <link href="${ctx}/css/style.min.css?v=4.0.0" rel="stylesheet">
    <!-- Sweet Alert -->
    <link href="${ctx}/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <base target="_blank">
    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">H+</h1>

            </div>
            <h3>欢迎使用 H+</h3>

            <form class="m-t" role="form" action="index.html">
                <div class="form-group">
                    <input type="text" id="username" class="form-control" placeholder="用户名" required="required">
                </div>
                <div class="form-group">
                    <input type="password" id="password" class="form-control" placeholder="密码" required="required">
                </div>
                <button type="button" onclick="login()" class="btn btn-primary block full-width m-b">登 录</button>


                <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p>

            </form>
        </div>
    </div>
    <script src="${ctx}/js/jquery.min.js?v=2.1.4"></script>
    <script src="${ctx}/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="${ctx}/js/plugins/sweetalert/sweetalert.min.js"></script>
    <script src="${ctx}/resources/js/login.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>