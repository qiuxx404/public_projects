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

import java.util.List;

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
        if (StringUtils.isBlank(dto.getUserName()) || StringUtils.isBlank(dto.getUserAddress()) ||
                StringUtils.isBlank(dto.getUserTelephone()) || StringUtils.isBlank(dto.getUserEmail()) ||
                StringUtils.isBlank(dto.getUserDescription())){
            return new ResultVo(false,null,"insertUser","user信息不完全");
        }
        if (null != userCRUDService.getUserByName(dto)){
            return new ResultVo(false,null,"insertUser","userName已经存在");
        }
        Long usId = userCRUDService.insertUser(dto);
        ResultVo vo = new ResultVo();
        if (null != usId){
            vo.setResult(true);
        }else{
            vo.setMsg("保存失败");
        }
        return vo;
    }

    /**
     * 更新用户信息--根据用户名
     */
    @RequestMapping(value = "/110", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo updateUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName()) || StringUtils.isBlank(dto.getUserAddress()) ||
                StringUtils.isBlank(dto.getUserTelephone()) || StringUtils.isBlank(dto.getUserEmail()) ||
                StringUtils.isBlank(dto.getUserDescription())){
            return new ResultVo(false,null,"updateUserByName","user信息不完全");
        }
        Integer num = userCRUDService.updateUserByName(dto);
        ResultVo vo = new ResultVo();
        if (0 == num){
            vo.setMsg("更新失败");
        }else{
            vo.setResult(true);
        }
        return vo;
    }

    /**
     * 删除用户信息--根据用户名
     */
    @RequestMapping(value = "/120", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo deleteUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName())){
            return new ResultVo(false,null,"deleteUserByName","userName不能为空");
        }
        Integer num = userCRUDService.deleteUserByName(dto);
        ResultVo vo = new ResultVo();
        if (0 == num){
            vo.setMsg("删除失败");
        }else{
            vo.setResult(true);
        }
        return vo;
    }

    /**
     * 查询用户信息--根据用户名
     */
    @RequestMapping(value = "/130", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo getUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName())){
            return new ResultVo(false,null,"getUserByName","userName不能为空");
        }
        UserVo user = userCRUDService.getUserByName(dto);
        ResultVo vo = new ResultVo();
        if (null != user){
            vo.setResult(true);
            vo.setData(user);
        }
        return vo;
    }

    /**
     * 查询用户信息--根据用户名
     */
    @RequestMapping(value = "/140", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo getUserList(){
        List<UserVo> list = userCRUDService.getUserList();
        ResultVo vo = new ResultVo();
        if (null != list){
            vo.setResult(true);
            vo.setData(list);
        }
        return vo;
    }
}
