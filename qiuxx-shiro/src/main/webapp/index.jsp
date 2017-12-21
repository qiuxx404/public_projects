<html>
<body>
<h2>Hello World!</h2>
</body>
<p>游客登录</p>
<form action="/qiuxx-shiro/tourist" method="post">
    <input type="text" name="shiroUserName" value="qiuxx"/><br>
    <input type="password" name="shiroUserPassword" value="123456"/><br>
    <input type="submit" value="登录"/>
</form>
<p>管理员登录</p>
<form action="/qiuxx-shiro/admin" method="post">
    <input type="text" name="shiroUserName" value="qiuxx"/><br>
    <input type="password" name="shiroUserPassword" value="123456"/><br>
    <input type="submit" value="登录"/>
</form>
</html>
