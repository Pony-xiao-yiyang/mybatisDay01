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

//        只对下一次查询的分页有效
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

    @Override
    public List<User> findAllOnlyRole() {
/**
 *      mybatis 缓存
 *          每一个sqlSesson自带一个一级缓存（默认开启）
 *          当用户进行查询时，先查询当前sqlSession缓存中是否已经存在数据了
 *                  如果有，直接从一级缓存中获取
 *                  如果没有，新建查询，更新缓存，返回用户
 *
 *              注意：不同的sqlSession 一级缓存相互独立
 */
        SqlSession sqlSession = SqlSessionUtil.openSession();

        userMapper  = sqlSession.getMapper(UserMapper.class);
        List<User> userOnlyRole = userMapper.findUserOnlyRole();
        System.out.println("==========================================");
        System.out.println(userOnlyRole);

        SqlSession sqlSession2 = SqlSessionUtil.openSession();

        userMapper  = sqlSession2.getMapper(UserMapper.class);
        userOnlyRole = userMapper.findUserOnlyRole();
        System.out.println("==========================================");
        System.out.println(userOnlyRole);
        System.out.println("==========================================");
        return userOnlyRole;
    }
}
