package com.venus.po;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by destiny on 2018/3/21.
 */
@Alias(value = "role")
public class RoleBean {
    private static final long serialVersionUID = 2671576219233123958L;

    private Integer id;
    private String roleName;
    private Date createDate;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
