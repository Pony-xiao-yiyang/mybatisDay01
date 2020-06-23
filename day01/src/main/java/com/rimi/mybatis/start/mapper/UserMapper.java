package com.rimi.mybatis.start.mapper;

import com.rimi.mybatis.start.bean.User;

import java.util.List;

/**
 *  UserMapper和sql进行绑定
 *      1. 将接口绑定到命名空间
 *          namespace指向接口的全限定名
 *      2.  方法名绑定到mapper xml的sql id
 *      3.  返回值类型  绑定到 sql的 resultType
 * @Author luc
 * @Date 2020/6/23
 */
public interface UserMapper {

    /**
     *  查询所有的用户
     * @return
     */
    List<User> findAll();
}
