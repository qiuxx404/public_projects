<%--
  Created by IntelliJ IDEA.
  User: qiuxx
  Date: 2017/12/29
  Time: 16:24
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
    <title>注册</title>
</head>
<body>
<form action="#" method="post">
    <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info">
                <h2>注&nbsp;&nbsp;&nbsp;&nbsp;册</h2>
            </div>
            <br>
            <div class="col-lg-10 wid">
                <input id="usernameId" type="text" class="form-control" name="username" placeholder="请输入账户名" required autofocus/>
            </div>
            <br>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input id="passwordId" type="password" class="form-control" name="password" placeholder="请输入密码" required autofocus/>
            </div>
            <br>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input id="repasswordId" type="password" class="form-control" name="repassword" placeholder="请输入再次输入密码" required autofocus/>
            </div>
            <br>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input id="emailId" type="text" class="form-control" name="email" placeholder="请输入邮箱地址" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <c:if test="${errorInfo != null}">
                    <p class="myerrortip">${errorInfo}</p>
                </c:if>
            </div>
            <br>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input id="commitId" type="button" class="btn btn-dark col-lg-12" value="注册"></input>
            </div>
        </div>
    </div>
</form>
</body>
</html>
