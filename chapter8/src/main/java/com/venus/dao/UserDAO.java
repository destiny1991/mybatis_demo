package com.venus.dao;

import org.apache.ibatis.session.RowBounds;
import com.venus.po.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by destiny on 2018/3/22.
 */
@Repository
public interface UserDAO {

    Integer insertUser(UserBean user);

    Integer updateUser(UserBean user);

    Integer deleteUser(Integer id);

    UserBean getUser(Integer id);

    List<UserBean> findUsers(String userName, RowBounds rowBounds);

}
