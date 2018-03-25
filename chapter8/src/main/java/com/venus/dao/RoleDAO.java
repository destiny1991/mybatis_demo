package com.venus.dao;

import org.apache.ibatis.session.RowBounds;
import com.venus.po.RoleBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by destiny on 2018/3/22.
 */
@Repository
public interface RoleDAO {

    Integer insertRole(RoleBean role);

    Integer updateRole(RoleBean role);

    Integer deleteRole(Integer id);

    RoleBean getRole(Integer id);

    List<RoleBean> findRoles(String roleName, RowBounds rowBounds);
}
