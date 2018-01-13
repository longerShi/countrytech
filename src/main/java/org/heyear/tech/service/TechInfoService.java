package org.heyear.tech.service;

import org.heyear.tech.dao.TechInfoDao;
import org.heyear.tech.entity.TechInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther shiwenlong
 * @Date 2018/1/13
 */
@Service
public class TechInfoService {

    @Autowired
    TechInfoDao techInfoDao;


    public List<TechInfo> getList() {
        return techInfoDao.getList();
    }
}
