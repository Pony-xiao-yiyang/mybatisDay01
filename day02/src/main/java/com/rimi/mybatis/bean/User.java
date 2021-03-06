package com.rimi.mybatis.bean;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 *  对应数据库中用户的实体表， 和数据表字段名一一对应，多个单词推荐由下划线转驼峰
 * @Author luc
 * @Date 2020/6/10
 */

// get方法
//@Getter
// set方法
//@Setter
// tostring方法
//@ToString
// 无参数构造方法
//@NoArgsConstructor
// 所有参数的构造
//@AllArgsConstructor
// 构建器
//@Builder

@Data
@Builder
public class User {

    /**
     *  用户id
     */
    private Integer id;

    /**
     *  用户名
     */
    private String username;

    /**
     *  密码
     */
    private String password;

    /**
     *  昵称
     */
    private String nickname;

    /**
     *  插入时间
     */
    private Date insertTime;

    /**
     *  最后的修改时间
     */
    private Date lastModifiedTime;

    /**
     *  头像
     */
    private String headerImage;

}
