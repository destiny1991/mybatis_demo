package org.venus.po;

import org.apache.ibatis.type.Alias;
import org.venus.common.ToString;

/**
 * Created by destiny on 2018/2/21.
 */
@Alias(value = "Role")
public class Role extends ToString {
    private static final long serialVersionUID = -7264244904820348669L;

    private Long id;

    private String roleName;

    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
