package com.CampusMall.Pojo;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.tu_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private Long tuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_password
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_email
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_phone
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private Long userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_address
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private String userAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_gender
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private Boolean userGender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_forbid
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private Boolean userForbid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_createtime
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    private Date userCreatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.tu_id
     *
     * @return the value of t_user.tu_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public Long getTuId() {
        return tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.tu_id
     *
     * @param tuId the value for t_user.tu_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_password
     *
     * @return the value of t_user.user_password
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_password
     *
     * @param userPassword the value for t_user.user_password
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_email
     *
     * @return the value of t_user.user_email
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_email
     *
     * @param userEmail the value for t_user.user_email
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_phone
     *
     * @return the value of t_user.user_phone
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public Long getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_phone
     *
     * @param userPhone the value for t_user.user_phone
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_address
     *
     * @return the value of t_user.user_address
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_address
     *
     * @param userAddress the value for t_user.user_address
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_gender
     *
     * @return the value of t_user.user_gender
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public Boolean getUserGender() {
        return userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_gender
     *
     * @param userGender the value for t_user.user_gender
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserGender(Boolean userGender) {
        this.userGender = userGender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_forbid
     *
     * @return the value of t_user.user_forbid
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public Boolean getUserForbid() {
        return userForbid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_forbid
     *
     * @param userForbid the value for t_user.user_forbid
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserForbid(Boolean userForbid) {
        this.userForbid = userForbid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_createtime
     *
     * @return the value of t_user.user_createtime
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public Date getUserCreatetime() {
        return userCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_createtime
     *
     * @param userCreatetime the value for t_user.user_createtime
     *
     * @mbggenerated Fri May 26 14:11:52 CST 2023
     */
    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }
}