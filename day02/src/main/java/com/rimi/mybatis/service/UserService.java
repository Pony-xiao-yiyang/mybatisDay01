package com.rimi.mybatis.service;

import com.rimi.mybatis.bean.User;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/24
 */
public interface UserService {

    User login(String username,String password);

    boolean addUser(User user);

    boolean deleteUserById(Integer id);


    boolean updateUserHeaderImage(Integer id, String image);

    List<User> findUserByUsernameOrNickname(User user);

    boolean batchDelete(List<String> ids);
}
