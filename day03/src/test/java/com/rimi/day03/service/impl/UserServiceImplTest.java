package com.rimi.day03.service.impl;

import com.rimi.day03.bean.User;
import com.rimi.day03.service.UserService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author luc
 * @Date 2020/6/28
 */
public class UserServiceImplTest {

    @Test
    public void search() {

        UserService userService = new UserServiceImpl();

        List<User> users = userService.search("lu");

        System.out.println(users);
    }

    @Test
    public void findAll() {
        UserService userService = new UserServiceImpl();

        List<User> users = userService.findAll();

        System.out.println(users);
    }
}