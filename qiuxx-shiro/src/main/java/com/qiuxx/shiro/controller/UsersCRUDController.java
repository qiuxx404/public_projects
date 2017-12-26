package com.qiuxx.shiro.controller;


import com.alibaba.dubbo.common.utils.StringUtils;
import com.qiuxx.shiro.beans.users.UserDto;
import com.qiuxx.shiro.beans.users.UserVo;
import com.qiuxx.shiro.common.ResultVo;
import com.qiuxx.shiro.service.UsersCRUDService;
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
 * @Description: user增删改查，超级管理员admin可以执行所有操作，   //qiuxx
 *                  staff员工只允许查看user表，                  //zhangsan
 *                  charge主管允许select，update，insert          //lisi
 * @Author: qiuxx
 * @Date: 10:16 2017/12/7
 */
@RequestMapping(value = "/qiuxx/users")
@Controller
public class UsersCRUDController {
    @Autowired
    private UsersCRUDService usersCRUDService;

    private Logger logger = LoggerFactory.getLogger(UsersCRUDController.class);
    /**
     * 保存用户信息
     */
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo insertUser(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName()) || StringUtils.isBlank(dto.getUserAddress()) ||
                StringUtils.isBlank(dto.getUserTelephone()) || StringUtils.isBlank(dto.getUserEmail()) ||
                StringUtils.isBlank(dto.getUserDescription())){
            return new ResultVo(false,null,"insertUser","user信息不完全");
        }
        if (null != usersCRUDService.getUserByName(dto)){
            return new ResultVo(false,null,"insertUser","userName已经存在");
        }
        Long usId = usersCRUDService.insertUser(dto);
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
    @RequestMapping(value = "/updateUserByName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo updateUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName()) || StringUtils.isBlank(dto.getUserAddress()) ||
                StringUtils.isBlank(dto.getUserTelephone()) || StringUtils.isBlank(dto.getUserEmail()) ||
                StringUtils.isBlank(dto.getUserDescription())){
            return new ResultVo(false,null,"updateUserByName","user信息不完全");
        }
        Integer num = usersCRUDService.updateUserByName(dto);
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
    @RequestMapping(value = "/deleteUserByName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo deleteUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName())){
            return new ResultVo(false,null,"deleteUserByName","userName不能为空");
        }
        Integer num = usersCRUDService.deleteUserByName(dto);
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
    @RequestMapping(value = "/getUserByName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo getUserByName(@RequestBody UserDto dto){
        if (StringUtils.isBlank(dto.getUserName())){
            return new ResultVo(false,null,"getUserByName","userName不能为空");
        }
        UserVo user = usersCRUDService.getUserByName(dto);
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
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo getUserList(){
        List<UserVo> list = usersCRUDService.getUserList();
        ResultVo vo = new ResultVo();
        if (null != list){
            vo.setResult(true);
            vo.setData(list);
        }
        return vo;
    }
}

