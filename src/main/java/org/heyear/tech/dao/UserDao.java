package org.heyear.tech.dao;

import org.heyear.framework.jdbc.JdbcHelper;
import org.heyear.framework.jdbc.impl.BaseDao;
import org.heyear.framework.util.CryptUtils;
import org.heyear.tech.bean.TechUser;
import org.heyear.tech.entity.TechInfo;
import org.heyear.tech.entity.User;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Repository;

import java.time.chrono.JapaneseDate;
import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
@Repository
public class UserDao extends BaseDao<User>{

    public User getByUsernamePassword(String userName, String password) {
        password = CryptUtils.md5(password);
        String sql = "select * From t_user where user_name = ? and password = ?";
        try {
            return jdbcOperations.queryForObject(sql, rowMapper(), userName, password);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    public List<TechUser> getTechUserList() {
        String sql = "select t2.id,t1.head_img,t2.tech_name,t2.tech_type,t2.address,t1.phone From t_user t1 " +
                "INNER JOIN t_tech_info t2 on t1.id = t2.user_id";
        return jdbcOperations.query(sql, JdbcHelper.getRowMapper(TechUser.class));
    }

    public TechUser getTechUser(String techUserId) {
        String sql = "select t2.id, t1.head_img,t2.tech_name,t2.tech_type, t2.address,t1.phone From t_user t1 " +
                "INNER JOIN t_tech_info t2 on t1.id = t2.user_id where t2.id = ?";
        try {
            return jdbcOperations.queryForObject(sql, JdbcHelper.getRowMapper(TechUser.class), techUserId);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

}
