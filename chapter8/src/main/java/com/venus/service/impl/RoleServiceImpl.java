package com.venus.service.impl;

import com.venus.dao.RoleDAO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.venus.po.RoleBean;
import com.venus.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by destiny on 2018/3/25.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDAO roleDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insertRole(RoleBean role) {
        return roleDAO.insertRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer updateRole(RoleBean role) {
        return roleDAO.updateRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer deleteRole(Integer id) {
        return roleDAO.deleteRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public RoleBean getRole(Integer id) {
        return roleDAO.getRole(id);
    }

    @Override
    public List<RoleBean> findRoles(String roleName, int start, int limit) {
        return roleDAO.findRoles(roleName, new RowBounds(start, limit));
    }
}
