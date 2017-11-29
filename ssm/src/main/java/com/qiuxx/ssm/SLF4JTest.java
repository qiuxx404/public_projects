package com.qiuxx.ssm;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 14:57 2017/11/28
 */
@Controller
public class SLF4JTest {
    private static final Logger logger = LoggerFactory.getLogger(SLF4JTest.class);

    @RequestMapping("/test/testSLF4JTest")
    public String testSLF4JTest(){
        String username = "张三";
        String age = "20";
        String telephone = "1241241424";
        //System.out.println(username+":::"+age+":::"+telephone);
        logger.info("当前用户信息：{}，{}，{}",username,age,telephone);
        return "success";
    }
}
