package com.qiuxx.websocket.controller;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 11:32 2017/12/29
 */
/*
    @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务端，
    注解的值将被用于监听用户连接的终端访问URL地址，客户端可以通过这个URL来连接到WebSocket服务端
 */
@ServerEndpoint("/websocket")
public class WebSocketDemo {
    //静态变量，用来记录当前在线连接数，应该把它设计成当前线程安全的
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现与当以客户端通信的话
    // ，可以使用Map存放，其中Key可以为用户标识
    private static CopyOnWriteArraySet<WebSocketDemo> webSocketDemos = new CopyOnWriteArraySet<WebSocketDemo>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    /**
     * 连接建立成功调用的方法
     * @param session 可选的参数。session为某个客户端的连接会话，需要通过它给客户端发送数据
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSocketDemos.add(this);   //加入set中
        addOnlineCount();           //在线数加1
//        System.out.print("有新连接插入！当前在线人数为 " + getOnlineCount());
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketDemos.remove(this);    //从set中删除
        subOnlineCount();                   //在线数减1
//        System.out.println("有一连接关闭！当前在线人数为 "+ getOnlineCount());
    }

    @OnMessage
    public void onMessage(String message, Session session) {
//        System.out.println("来自客户端的消息：" + message);
        //群发消息
        for (WebSocketDemo item : webSocketDemos) {
            try {
                item.sendMessage(session.getId() + " : " + message);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    /**
     * 发生错误时调用
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    private void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    private static synchronized void subOnlineCount() {
        WebSocketDemo.onlineCount--;
    }

    private static synchronized void addOnlineCount() {
        WebSocketDemo.onlineCount++;
    }

    public static synchronized  int getOnlineCount() {
        return onlineCount;
    }
}
