package org.heyear.tech.service;

import org.heyear.tech.bean.TechUser;
import org.heyear.tech.dao.UserDao;
import org.heyear.tech.entity.User;
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

    public void createUser(User user) {
        user.setUserName(user.getPhone());
        userDao.create(user);
    }

    public User getByUsernamePassword(String userName, String password) {
        return userDao.getByUsernamePassword(userName, password);
    }

    public List<TechUser> getTechUserList() {
        return userDao.getTechUserList();
    }

    public TechUser getTechUser(String techUserId) {
        return userDao.getTechUser(techUserId);
    }

}
