package com.rimi.day03.mapper;

import com.rimi.day03.bean.Role;

import java.util.List;

/**
 * @Author luc
 * @Date 2020/6/29
 */
public interface RoleMapper {

    /**
     *  根据传入的userId，寻找对应的角色列表
     * @param id
     * @return
     */
    List<Role> findRoleByUserId(Integer userId);
}
