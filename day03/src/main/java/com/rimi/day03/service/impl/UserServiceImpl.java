package com.rimi.day03.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rimi.day03.bean.User;
import com.rimi.day03.mapper.UserMapper;
import com.rimi.day03.service.UserService;
import com.rimi.day03.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/28
 */
public class UserServiceImpl implements UserService {

    UserMapper userMapper = null;

    public UserServiceImpl()  {
        SqlSession sqlSession = SqlSessionUtil.openSession();

        userMapper  = sqlSession.getMapper(UserMapper.class);
    }

    @Override
    public List<User> search(String keyword) {
        return userMapper.findUserByUsernameLike(keyword);
    }

    @Override
    public List<User> findAll() {

        PageHelper.startPage(-4,5);
//        Page<User> pages = (Page<User>) userMapper.findAll();

        List<User> users = userMapper.findAll();
        PageInfo<User> pages = PageInfo.of(users);


        for(User user: users) {
            System.out.println(user);
        }

        System.out.println(pages);

        return null;
    }
}
