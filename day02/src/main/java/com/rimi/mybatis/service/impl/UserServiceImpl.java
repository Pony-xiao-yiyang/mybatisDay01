package com.rimi.mybatis.service.impl;

import com.rimi.mybatis.bean.User;
import com.rimi.mybatis.mapper.UserMapper;
import com.rimi.mybatis.service.UserService;
import com.rimi.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author luc
 * @Date 2020/6/24
 */
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    /**
     *  创建userMapper,每一new Service，一定会创建usermapper
     */
    public UserServiceImpl() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Override
    public User login(String username, String password) {
        return userMapper.findUserByUsernameAndPassword(username,password);
    }
}
