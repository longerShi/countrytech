package org.heyear.tech.entity;

import org.heyear.framework.entity.BaseEntity;

/**
 * @Auther shiwenlong
 * @Date 2018/1/15
 * @Desc
 */
public class Order extends BaseEntity{

    private String userId;
    private String userTechId;
    private String address;
    private String contactPhone;
    private String orderDesc;
    private Float score;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserTechId() {
        return userTechId;
    }

    public void setUserTechId(String userTechId) {
        this.userTechId = userTechId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
