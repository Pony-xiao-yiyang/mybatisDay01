package com.rimi.day03.mapper;

import com.rimi.day03.bean.User;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/28
 */
public interface UserMapper {

    /**
     *  模糊查询
     * @param keywords  模糊查询的关键字
     * @return  模糊查询列表
     */
    List<User> findUserByUsernameLike(String keywords);

    List<User> findAll();
}
