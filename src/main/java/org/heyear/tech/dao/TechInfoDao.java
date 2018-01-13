package org.heyear.tech.dao;

import org.heyear.framework.jdbc.impl.BaseDao;
import org.heyear.tech.entity.TechInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
@Repository
public class TechInfoDao extends BaseDao<TechInfo>{


    public List<TechInfo> getList() {
        String sql = "select * From t_tech_info";
        return jdbcOperations.query(sql, rowMapper());
    }

}
