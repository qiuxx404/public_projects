<%--
  Created by IntelliJ IDEA.
  User: hspcadmin
  Date: 2017/12/20
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<p>这是登录页面</p>
<form action="${pageContext.request.contextPath}/login">

        <input type="text" name="shiroUserName"/> <br>
        <input type="password" name="shiroUserPassword"/><br>
        <input type="submit" value="登录"/>

</form>
</body>
</html>
