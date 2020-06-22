package com.dayu.server.mbg.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.open_id
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.skey
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String skey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.create_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.last_visit_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private Date lastVisitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.session_key
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String sessionKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.city
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.province
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.country
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.avatar_url
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.gender
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_user.nick_name
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table d_user
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.open_id
     *
     * @return the value of d_user.open_id
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.open_id
     *
     * @param openId the value for d_user.open_id
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.skey
     *
     * @return the value of d_user.skey
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getSkey() {
        return skey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.skey
     *
     * @param skey the value for d_user.skey
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setSkey(String skey) {
        this.skey = skey == null ? null : skey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.create_time
     *
     * @return the value of d_user.create_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.create_time
     *
     * @param createTime the value for d_user.create_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.last_visit_time
     *
     * @return the value of d_user.last_visit_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.last_visit_time
     *
     * @param lastVisitTime the value for d_user.last_visit_time
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.session_key
     *
     * @return the value of d_user.session_key
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.session_key
     *
     * @param sessionKey the value for d_user.session_key
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.city
     *
     * @return the value of d_user.city
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.city
     *
     * @param city the value for d_user.city
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.province
     *
     * @return the value of d_user.province
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.province
     *
     * @param province the value for d_user.province
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.country
     *
     * @return the value of d_user.country
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.country
     *
     * @param country the value for d_user.country
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.avatar_url
     *
     * @return the value of d_user.avatar_url
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.avatar_url
     *
     * @param avatarUrl the value for d_user.avatar_url
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.gender
     *
     * @return the value of d_user.gender
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.gender
     *
     * @param gender the value for d_user.gender
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_user.nick_name
     *
     * @return the value of d_user.nick_name
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_user.nick_name
     *
     * @param nickName the value for d_user.nick_name
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_user
     *
     * @mbg.generated Tue Jun 16 13:40:29 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", openId=").append(openId);
        sb.append(", skey=").append(skey);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastVisitTime=").append(lastVisitTime);
        sb.append(", sessionKey=").append(sessionKey);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", country=").append(country);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", gender=").append(gender);
        sb.append(", nickName=").append(nickName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}