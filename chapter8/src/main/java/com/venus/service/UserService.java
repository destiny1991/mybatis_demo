package com.venus.service;

import com.venus.po.UserBean;

import java.util.List;

/**
 * Created by destiny on 2018/3/25.
 */
public interface UserService {

    Integer insertUser(UserBean user);

    Integer updateUser(UserBean user);

    Integer deleteUser(Integer id);

    UserBean getUser(Integer id);

    List<UserBean> findUsers(String userName, int start, int limit);
}
