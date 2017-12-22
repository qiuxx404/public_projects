package com.qiuxx.ssm.dao;

import com.qiuxx.ssm.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 13:09 2017/12/21
 */
@Repository
public interface UserDao {

    List<User> getUserList();
}
