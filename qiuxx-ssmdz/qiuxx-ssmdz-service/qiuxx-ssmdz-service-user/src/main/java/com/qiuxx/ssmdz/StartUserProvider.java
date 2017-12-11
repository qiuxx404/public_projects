package com.qiuxx.ssmdz;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 启动dubbo服务
 * @Author: qiuxx
 * @Date: 10:50 2017/12/7
 */
public class StartUserProvider {
    private static Logger logger = LoggerFactory.getLogger(StartUserProvider.class);
    public static void main(String args[]){
        logger.info(">>>>>>>>>>>>>>>>>   userCRUDService正在启动  >>>>>>>>>>>>>>>>>>>>>>");
        new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-context.xml"});
        logger.info(">>>>>>>>>>>>>>>>>   userCRUDService启动完成  >>>>>>>>>>>>>>>>>>>>>>");
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
