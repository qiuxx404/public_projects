<%--
  Created by IntelliJ IDEA.
  User: qiuxx
  Date: 2017/12/28
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../js/jquery-3.2.1.min.js" type="text/javascript"></script>
<link href="../css/bootstrap.min.css" rel="stylesheet"/>
<link href="../css/style.css" rel="stylesheet"/>
<head>
    <title>登录</title>
</head>
<body>
<form action="login.php" method="post">
    <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info">
                <h3>请登录</h3>
            </div>
            <br>
            <div class="col-lg-10">
                <input type="text" class="form-control" name="username" placeholder="请输入账户名" required autofocus/>
            </div>
            <br>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="password" class="form-control" name="password" placeholder="请输入密码" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-12 mycheckbox checkbox">
                <input type="checkbox" name="rememberFlage" class="col-lg-1">记住密码</input>
            </div>
            <div class="col-lg-10"></div>
                <div class="col-lg-10">
                    <c:if test="${errorInfo != null}">
                        <p class="myerrortip">${errorInfo}</p>
                    </c:if>
                </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="button" class="btn btn-dark col-lg-12" value="登录"></input>
            </div>
        </div>
    </div>
</form>
</body>
</html>
