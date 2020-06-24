package com.rimi.mybatis.service;

import com.rimi.mybatis.bean.User;

/**
 * @Author luc
 * @Date 2020/6/24
 */
public interface UserService {

    User login(String username,String password);
}
