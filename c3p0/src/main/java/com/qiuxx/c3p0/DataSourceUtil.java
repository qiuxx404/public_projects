package com.qiuxx.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * c3p0连接池工具类
 */
public class DataSourceUtil {
    private static final String username = "root";
    private static final String password = "qiuxx404";
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/demo_test";
    private static final int maxPoolSize = 20;  //连接池最大连接数
    private static final int minPoolSize = 10;  //连接池最小连接数
    private static final int initialPoolSize = 10; //连接池初始的连接数
   // private static final int maxStatements = 100; //连接池的缓存Statement的最大数
    private static  Connection conn;
    private static ComboPooledDataSource dataSources;

    static {
        try{
            dataSources = new ComboPooledDataSource();
            dataSources.setDriverClass(driverName);
            dataSources.setJdbcUrl(url);
            dataSources.setUser(username);
            dataSources.setPassword(password);
            dataSources.setMaxPoolSize(maxPoolSize);
            dataSources.setMinPoolSize(minPoolSize);
            dataSources.setInitialPoolSize(initialPoolSize);
            //dataSources.setMaxStatements(maxStatements);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public DataSourceUtil(){}

    public DataSourceUtil(String JdbcUrl){
        dataSources.setJdbcUrl(JdbcUrl);
    }

    public static Connection getConnection(){
        try {
            conn = dataSources.getConnection();
        } catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static void realeaseResource(ResultSet rs, PreparedStatement ps, Connection conn){
        try{
            if (null != rs){
                rs.close();
            }
            if (null != ps){
                ps.close();
            }
            if (null != conn){
                conn.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
