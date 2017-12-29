<%--
  Created by IntelliJ IDEA.
  User: qiuxx
  Date: 2017/12/29
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
<head>
    <title>来聊天啊</title>
</head>
<body>
Welcome
<div id="welcome"></div>
<div id="message"></div>
<br/><input id="text" type="text"/>
<button onclick="send()">发送消息</button>
<hr/>
<button onclick="clearRecord()">清除记录</button>
&nbsp;&nbsp;&nbsp;&nbsp
<button onclick="closeWebSocket()">关闭WebSocket连接</button>
<hr/>
</body>

<script type="text/javascript">
    var websocket = null;
    //判断当前浏览器是否支持WebSocket
    if ('WebSocket' in window) {
        websocket = new WebSocket("ws://116.196.89.56:8080/qiuxx-websocket/websocket");
    }
    else {
        alert('当前浏览器 Not support websocket')
    }

    //连接发生错误的回调方法
    websocket.onerror = function () {
        setMessageInnerHTML("WebSocket连接发生错误");
    };

    //连接成功建立的回调方法
    websocket.onopen = function () {
        setMessageInnerHTML("WebSocket连接成功");
    }

    //接收到消息的回调方法
    websocket.onmessage = function (event) {
        setMessageInnerHTML(event.data);
    }

    //连接关闭的回调方法
    websocket.onclose = function () {
        setMessageInnerHTML("WebSocket连接关闭");
    }

    //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        closeWebSocket();
    }

    //将消息显示在网页上
    function setMessageInnerHTML(innerHTML) {
        document.getElementById('message').innerHTML += innerHTML + '<br/>';
    }

    //关闭WebSocket连接
    function closeWebSocket() {
        websocket.close();
    }

    //发送消息
    function send() {
        var message = document.getElementById('text').value;
        document.getElementById('text').value = " ";
        websocket.send(message);
    }

    //清除消息记录
    function clearRecord() {
        document.getElementById("message").innerHTML = "";
    }

    //enter事件
    document.onkeydown = function (e) {
        var theEvent = window.event || e;
        var code = theEvent.keyCode || theEvent.which;
        if (code == 13) {
            send();
        }
    }
</script>
</html>
