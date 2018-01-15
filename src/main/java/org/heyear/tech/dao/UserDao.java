package org.heyear.tech.dao;

import org.heyear.framework.jdbc.JdbcHelper;
import org.heyear.framework.jdbc.impl.BaseDao;
import org.heyear.tech.bean.TechUser;
import org.heyear.tech.entity.TechInfo;
import org.heyear.tech.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
@Repository
public class UserDao extends BaseDao<User>{


    public List<TechUser> getTechUserList() {
        String sql = "select t1.id,t1.head_img,t2.tech_name,t2.tech_type,t2.address,t1.phone From t_user t1 " +
                "INNER JOIN t_tech_info t2 on t1.id = t2.user_id";
        return jdbcOperations.query(sql, JdbcHelper.getRowMapper(TechUser.class));
    }

}
