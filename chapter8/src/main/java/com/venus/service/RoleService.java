package com.venus.service;

import com.venus.po.RoleBean;

import java.util.List;

/**
 * Created by destiny on 2018/3/25.
 */
public interface RoleService {

    Integer insertRole(RoleBean role);

    Integer updateRole(RoleBean role);

    Integer deleteRole(Integer id);

    RoleBean getRole(Integer id);

    List<RoleBean> findRoles(String roleName, int start, int limit);

}
