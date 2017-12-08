package com.qiuxx.ssmdz.controller;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.qiuxx.ssmdz.api.beans.common.ResultVo;
import com.qiuxx.ssmdz.api.beans.user.UserDto;
import com.qiuxx.ssmdz.api.beans.user.UserVo;
import com.qiuxx.ssmdz.api.rest.user.UserCRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: user增删改查Controller
 * @Author: qiuxx
 * @Date: 10:16 2017/12/7
 */
@RequestMapping(value = "/qiuxx/100000")
@Controller
public class UserCRUDController {
    @Autowired
    private UserCRUDService userCRUDService;

    private Logger logger = LoggerFactory.getLogger(UserCRUDController.class);
    /**
     * 保存用户信息
     */
    @RequestMapping(value = "/100", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo insertUser(@RequestBody UserDto dto){
        System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
        logger.info("【insertUser】+入参"+ dto.toString());
        if (StringUtils.isBlank(dto.getUserName()) || StringUtils.isBlank(dto.getUserAddress()) ||
                StringUtils.isBlank(dto.getUserTelephone()) || StringUtils.isBlank(dto.getUserEmail()) ||
                StringUtils.isBlank(dto.getUserDescription())){
            return new ResultVo(false,null,"insertUser","user信息不完全");
        }
        Long usId = userCRUDService.insertUser(dto);
        ResultVo vo = new ResultVo();
        if (null != usId){
            vo.setResult(true);
            vo.setData("保存 成功");
        }else{
            vo.setResult(false);
            vo.setMsg("保存失败");
        }
        return vo;
    }

    @RequestMapping(value = "/200")
    @ResponseBody
    public UserVo getTest(@RequestBody UserDto dto){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>." +
                dto.toString()+
                ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        UserVo vo = new UserVo();
        vo.setUserName("张三");
        return vo;
    }



    @RequestMapping(value = "/300")
    @ResponseBody
    public UserVo test(){
        UserVo vo = new UserVo();
        vo.setUserName("张三");
        return vo;
    }
}
