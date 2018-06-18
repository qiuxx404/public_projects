package com.qiuxx.java.base.jdbc;

import java.sql.*;

/**
 * @Description: jdbc连接数据库实例
 * @Author: qiuxx
 * @Date: 20:10 2018/6/3
 */
public class ConnectionInstance {

    /**
     * 1、实例化驱动
     * 2、建立数据库连接
     * 3、将数据发送到数据库中去
     * 4、执行语句（select语句）
     * 5、关闭
     */
    public static void main(String[] args){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn =  null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_test","","");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM USER ");
            while (rs.next()){
                System.out.println(rs.getString("username"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if (rs != null){
                    rs.close();
                    rs = null;
                }
                if (stmt != null){
                    stmt.close();
                    stmt = null;
                }
                if (conn != null){
                    conn.close();
                    conn = null;
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
