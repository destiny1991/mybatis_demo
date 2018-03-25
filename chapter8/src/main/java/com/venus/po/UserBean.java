package com.venus.po;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by destiny on 2018/3/22.
 */
@Alias(value = "user")
public class UserBean {
    private static final long serialVersionUID = 6634059819628525846L;

    private Integer id;
    private String userName;
    private Date birthday;
    private String sex;
    private String mobile;
    private String email;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
