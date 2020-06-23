package com.rimi.mybatis.start.bean;

import java.util.Date;

/**
 *  对应数据库中用户的实体表， 和数据表字段名一一对应，多个单词推荐由下划线转驼峰
 * @Author luc
 * @Date 2020/6/10
 */
public class User {
    //亮亮
///




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

    public User() {
    }

    public User(Integer id, String username, String password, String nickname, Date insertTime, Date lastModifiedTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.insertTime = insertTime;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", insertTime=" + insertTime +
                ", lastModifiedTime=" + lastModifiedTime +
                ", headerImage='" + headerImage + '\'' +
                '}';
    }
}
