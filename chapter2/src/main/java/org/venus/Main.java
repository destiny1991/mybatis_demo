package org.venus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.venus.mapper.RoleMapper;
import org.venus.po.Role;
import org.venus.utils.SqlSessionFactoryUtil;

/**
 * Created by destiny on 2018/2/21.
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(role.toString());
            sqlSession.commit();
        } catch (Throwable e) {
            log.error(e.getMessage());
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
