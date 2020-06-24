package com.rimi.mybatis.service.impl;

import com.rimi.mybatis.bean.User;
import com.rimi.mybatis.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author luc
 * @Date 2020/6/24
 */
public class UserServiceImplTest {

    @Test
    public void login() {

        UserService userService = new UserServiceImpl();

        User user = userService.login("luc", "123");

        System.out.println(user);
    }
}