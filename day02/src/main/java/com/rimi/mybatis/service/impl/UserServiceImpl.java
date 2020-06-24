package com.rimi.mybatis.service.impl;

import com.rimi.mybatis.bean.User;
import com.rimi.mybatis.mapper.UserMapper;
import com.rimi.mybatis.service.UserService;
import com.rimi.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

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
        User user = User.builder()
                .username(username)
                .password(password)
                .build();
        return userMapper.findUserByUsernameAndPassword(user);
    }

    @Override
    public boolean addUser(User user) {

        user.setInsertTime(new Date());
        user.setLastModifiedTime(new Date());
        int row = userMapper.addUser(user);

        return row == 1;
    }

    @Override
    public boolean deleteUserById(Integer id) {

        User user = User.builder()
                .id(id)
                .build();

        int row = userMapper.deleteUserById(user);

        return row == 1;
    }

    @Override
    public boolean updateUserHeaderImage(Integer id, String image) {
        User user = User.builder()
                .id(id)
                .headerImage(image)
                .build();
        int row = userMapper.updateUser(user);
        return row == 1;
    }

    @Override
    public List<User> findUserByUsernameOrNickname(User user) {
        return userMapper.findUserByUsernameOrNickname(user);
    }

    @Override
    public boolean batchDelete(List<String> ids) {
        int row = userMapper.batchDeleteByIds(ids);

        return row == ids.size();
    }
}
