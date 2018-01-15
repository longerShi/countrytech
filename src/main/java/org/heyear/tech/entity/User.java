package org.heyear.tech.entity;

import org.heyear.framework.entity.BaseEntity;

/**
 * @Auther shiwenlong
 * @Date 2018/1/15
 * @Desc
 */
public class User extends BaseEntity {

    private String userName;
    private String nickName;
    private String phone;
    private String password;
    private String headImg;
    private String role;
    private Integer sex;
    private String openid;
    private String comeFrom;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }
}
