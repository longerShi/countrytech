package org.heyear.tech.entity;

import org.heyear.framework.entity.BaseEntity;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
public class TechInfo extends BaseEntity{

    private String userId;
    private String techName;
    private String address;
    private String techType;
    private Double longitude;
    private Double latitude;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
