<%--
  Created by IntelliJ IDEA.
  User: qiuxx
  Date: 2017/12/28
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<html>
<head>
    <title>admin</title>
</head>
<body>

    <p>标题：${title}</p>
    <p>消息：${message}</p>

    <p>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <p>
                welcome : ${pageContext.request.userPrincipal.name}
                <a href="<c:url value='/login'/> ">Logout</a>
            </p>
        </c:if>
    </p>

</body>
</html>
