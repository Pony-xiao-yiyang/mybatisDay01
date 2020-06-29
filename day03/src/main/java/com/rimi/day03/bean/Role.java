package com.rimi.day03.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author luc
 * @Date 2020/6/29
 */

@Data
public class Role {

    private Integer id;

    private String roleName;

    private String roleSymbol;

    private Date insertTime;

    private Date lastModifiedTime;
}
