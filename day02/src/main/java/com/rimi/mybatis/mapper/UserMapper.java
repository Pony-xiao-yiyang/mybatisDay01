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
//    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);


    User findUserByUsernameAndPassword(User user);


    /**
     *  查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     *  添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     *  删除用户
     * @param id
     * @return
     */
    int deleteUserById(User user);

    /**
     *  修改用户，注意，修改用户一定有id
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     *  根据用户名或者昵称寻找用户
     * @param user
     * @return
     */
    List<User> findUserByUsernameOrNickname(User user);


    /**
     *  进行批量删除
     * @param ids
     * @return
     */
    int batchDeleteByIds(List<String> ids);
}
