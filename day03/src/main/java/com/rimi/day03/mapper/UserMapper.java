package com.rimi.day03.mapper;

import com.rimi.day03.bean.User;

import java.util.List;

/**
 * @description:
 * @author:
 * @time: 2020/6/28 9:43
 */
public interface UserMapper {
    /**
     * 模糊查询
     * @param keywords 模糊查询的关键字
     * @return
     */
    List<User> findUsernameLike(String keywords);
}
