package org.heyear.tech.service;

import org.heyear.tech.bean.TechUser;
import org.heyear.tech.dao.UserDao;
import org.heyear.tech.entity.TechInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public List<TechUser> getTechUserList() {
        return userDao.getTechUserList();
    }
}
