package com.venus.service.impl;

import com.venus.dao.UserDAO;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.venus.po.UserBean;
import com.venus.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by destiny on 2018/3/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insertUser(UserBean user) {
        return userDAO.insertUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer updateUser(UserBean user) {
        return userDAO.updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer deleteUser(Integer id) {
        return userDAO.deleteUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public UserBean getUser(Integer id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<UserBean> findUsers(String userName, int start, int limit) {
        return userDAO.findUsers(userName, new RowBounds(start, limit));
    }
}
