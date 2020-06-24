package com.rimi.mybatis.service.impl;

import com.rimi.mybatis.bean.User;
import com.rimi.mybatis.service.UserService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void addUser() {

        UserService userService = new UserServiceImpl();

        User user = User.builder()
                .username("xiaohong")
                .password("123")
                .nickname("小红")
                .build();

        System.out.println(user);
        boolean result = userService.addUser(user);
        System.out.println(user);
        System.out.println(result);
    }


    @Test
    public void deleteUserById() {

        UserService userService = new UserServiceImpl();

        boolean result = userService.deleteUserById(2);

        System.out.println(result);
    }

    @Test
    public void updateUserHeaderImage() {

        UserService userService = new UserServiceImpl();

        boolean result = userService.updateUserHeaderImage(9, "/images/header.jpg");

        System.out.println(result);
    }

    @Test
    public void findUserByUsernameOrNickname() {

        User user = User.builder()
                .username("")
                .nickname("小明")
                .build();

        UserService userService = new UserServiceImpl();
        List<User> users = userService.findUserByUsernameOrNickname(user);
        System.out.println(users);
    }

    @Test
    public void batchDelete() {

        List<String> ids = new ArrayList<>();
        ids.add("8");
        ids.add("10");

        UserService userService = new UserServiceImpl();

        boolean result = userService.batchDelete(ids);

        System.out.println(result);
    }
}