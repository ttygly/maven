package com.itheima.ssh01.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.ssh01.dao.UserDAO;
import com.itheima.ssh01.domain.User;

/**
 * ClassName:UserDAOImpl <br/>
 * Function: <br/>
 * Date: 2018年3月9日 上午9:04:36 <br/>
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

    @Override
    public User findUserById(Integer id) {

        return getHibernateTemplate().get(User.class, id);
    }

}
