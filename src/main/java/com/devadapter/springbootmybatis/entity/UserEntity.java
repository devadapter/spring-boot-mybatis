package com.devadapter.springbootmybatis.entity;

import com.devadapter.springbootmybatis.enums.UserSexEnum;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author : zhangjie
 * @date : 2019/3/21
 */
public class UserEntity implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private UserSexEnum userSex;
    private String nickName;

    public UserEntity() {
    }

    public UserEntity(String userName, String passWord, UserSexEnum userSex) {
        this.userName = userName;
        this.password = passWord;
        this.userSex = userSex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserEntity.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("userName='" + userName + "'")
                .add("password='" + password + "'")
                .add("userSex=" + userSex)
                .add("nickName='" + nickName + "'")
                .toString();
    }
}
