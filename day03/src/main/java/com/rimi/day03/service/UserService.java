package com.rimi.day03.service;

import com.rimi.day03.bean.User;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/28
 */
public interface UserService {

    List<User> search(String keyword);

    List<User> findAll();
}
