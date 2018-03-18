package com.qiuxx.common.web.quartz;

import com.qiuxx.common.web.dao.BrushAccessDao;
import com.qiuxx.common.web.entity.CfgEnumDict;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;


/**
 * @Description: 刷访问量定时任务
 * @Author: qiuxx
 * @Date: 15:10 2018/3/18
 */
@Component
public class BrushAccessTask {

    private static final Logger logger = LoggerFactory.getLogger(BrushAccessTask.class);

    @Autowired
    BrushAccessDao brushAccessDao;

    @Scheduled(cron="0/21 * *  * * ? ")   //每20秒执行一次
    //@Scheduled(cron="0 */20 * * * ?")   //每20分钟执行一次
    public void brushAccess(){
        Set<CfgEnumDict> set = brushAccessDao.getWebUrlList();
        if (set != null && set.size()>0){
            List<Long> list = new ArrayList<Long>();
            sendGet(set,list);
            if (list.size()>0){
                brushAccessDao.updateStatisticsNumList(list); //批量更新博客请求数
            }
        }
    }

    /**
     * 20分钟最多240篇
     */
    public void sendGet(Set<CfgEnumDict> set,List<Long> list){
        CloseableHttpClient httpClients = HttpClients.createDefault();
        Random random = new Random(1*500); //0-0.5秒
        for (CfgEnumDict cfgEnumDict : set){
            HttpGet httpGet = new HttpGet(cfgEnumDict.getEnumValue());
            try {
                if (random.nextInt()%2 == 0){ //偶数
                    httpClients.execute(httpGet);
                    //brushAccessDao.updateStatisticsNum(cfgEnumDict.getEnumId());//单个更新
                    list.add(cfgEnumDict.getEnumId());
                }
            } catch (IOException e) {
                logger.error("【BrushAccessTask--brushAccess】请求url地址异常 =>{}",e);
            }
            try {
                Thread.sleep(random.nextInt()+1);
            } catch (InterruptedException e) {
                logger.error("【BrushAccessTask--brushAccess】Thread.sleep异常 =>{}",e);
            }
        }
        try {
            httpClients.close();
        } catch (IOException e) {
            logger.error("【BrushAccessTask--brushAccess】httpClients关闭异常 =>{}",e);
        }
    }

   /* public static void main(String[] args){
        //生成0－2之间的随机数，包括2
        Random rand = new Random();
        int randNum1 = rand.nextInt(3);
        System.out.println("randNum1 = "+randNum1);
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //生成5－26之间的随机数，包括26
        int randNum2 = rand.nextInt(22)+5;
        System.out.println("randNum2 = "+randNum2);
    }*/

}
