package com.rimi.mybatis.mapper;

import com.rimi.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/24
 */
public interface UserMapper {

    /**
     *  根据用户名和密码查询用户
     * @param username  用户名
     * @param password  密码
     * @return  返回u查到的user对象
     *      如果只有一个user对象，mybatus默认调用selectone，必须保证查询结果只有一条
     *
     *
     *
     */
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     *  查询所有用户
     * @return
     */
    List<User> findAll();
}
